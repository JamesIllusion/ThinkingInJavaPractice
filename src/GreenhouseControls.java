
public class GreenhouseControls extends Controller{
	private boolean lightOn = false;
	private boolean waterOn = false;
	private String thermoStat = "Day";
	
	private class LightOn extends Event{
		public LightOn(long eventTime){
			super(eventTime);
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			lightOn = true;
		}

		@Override
		public String description() {
			// TODO Auto-generated method stub
			return "Turning light on";
		}
	}

	private class LightOff extends Event{

		public LightOff(long eventTime) {
			super(eventTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			lightOn = false;
		}

		@Override
		public String description() {
			// TODO Auto-generated method stub
			return "Turning light off";
		}
	}
	
	private class WaterOn extends Event{

		public WaterOn(long eventTime) {
			super(eventTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			waterOn = true;
		}

		@Override
		public String description() {
			// TODO Auto-generated method stub
			return "Turning water on";
		}
	}
	
	private class WaterOff extends Event{

		public WaterOff(long eventTime) {
			super(eventTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			waterOn = false;
		}

		@Override
		public String description() {
			// TODO Auto-generated method stub
			return "Turning water off";
		}
	}
	
	private class ThermostatNight extends Event{

		public ThermostatNight(long eventTime) {
			super(eventTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			thermoStat = "Night";
		}

		@Override
		public String description() {
			// TODO Auto-generated method stub
			return "Thermo setting is on night setting";
		}
	}
	
	private class ThermostatDay extends Event{

		public ThermostatDay(long eventTime) {
			super(eventTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			thermoStat = "Day";
			
		}

		@Override
		public String description() {
			// TODO Auto-generated method stub
			return "Thermo setting is on day setting";
		}
	}
	
	private int rings;
	private class Bell extends Event{

		public Bell(long eventTime) {
			super(eventTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			System.out.println("Ding!");
			
			if (--rings > 0)
				addEvent(new Bell(System.currentTimeMillis() + 2000));
		}

		@Override
		public String description() {
			// TODO Auto-generated method stub
			return "Ring bell";
		}
	}
	
	private class Restart extends Event{

		public Restart(long eventTime) {
			super(eventTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
//			System.out.println("Greenhouse restarts!");
			
			long tm = System.currentTimeMillis();
			
			rings = 5;
			
			addEvent(new ThermostatNight(tm));
			addEvent(new LightOn(tm+1000));
			addEvent(new LightOff(tm+2000));
			addEvent(new WaterOn(tm+3000));
			addEvent(new WaterOff(tm+8000));
			addEvent(new Bell(tm+9000));
			addEvent(new ThermostatDay(tm+10000));
			
			addEvent(new Restart(tm+20000));
		}

		@Override
		public String description() {
			// TODO Auto-generated method stub
			return "Greenhouse restarts!";
		}
		
	}
	
	public static void main(String[] args){
		GreenhouseControls gc = new GreenhouseControls();
		
		long tm = System.currentTimeMillis();
		
		gc.addEvent(gc.new Restart(tm));
		gc.run();
	}
}