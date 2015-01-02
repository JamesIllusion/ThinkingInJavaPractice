package algorithm_interview;

public class Stack{

//    constructor without size is not available
    private Stack(){  }
    
    int top;
    
//    constructor with size
    public Stack(int size){
        Object[] stack = new Object[size];
        this.top = stack.length-1;
    }
    
    public void push(Stack stk, Object obj){
        if(stk.top<0)
            throw Exeception;
        
        stk.top--;
        stk[top] = obj;
    }
    
    public Object pop(Stack stk){
        if(stk.top>=stk.length)
            throw exeception;
            
        return stk[top--];
    }
    
    public boolean isEmpty(Stack stk){
        if(stk.top>=stk.length)
            return true;
        else
            return false;
    }
}
        
