import stdio

public class WeightUnionFind{
	private int[] root;
	private int[] sizeofSubtree;
	private int count;

	public WeightUnionFind(int N){
		count = N;
		root = new int[N];
		sizeofSubtree = new int[N];

		for (int i=0; i<N; i++){
			root[i] = i;
			sizeofSubtree[i] = 1;
		}
	}

	public int findRoot(int m){
		while( m != root[m])
			m = root[m];
		return m;
	}

	public boolean ifConnected(int m, int n){
		return (findRoot(m) == findRoot(n));
	}

	public void union(int m, int n){
		int rootM = findRoot(m);
		int rootN = findRoot(n);

		if(rootM == rootN)
			return;

		if(sizeofSubtree(m) < sizeofSubtree(n)){
			rootM = rootN;
			sizeofSubtree(m) += sizeofSubtree(n);
		}
		else{
			rootN = rootM;
			sizeofSubtree(n) += sizeofSubtree(m);
		}
		count--;
	}

	public static void main(String[] args){
	}
