public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if (rest == null) {
			return 1;
		}
		return 1 + this.rest.size();
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		IntList p = this;
		int totalSize = 0;
		while (p != null) {
			totalSize += 1;
			p = p.rest;
		}
		return totalSize;
	}

	/** Returns the ith item of this IntList. */
	public int get(int i) {
		if (i == 0) {
			return first;
		}
		return rest.get(i - 1);
	}
	public void addAdjacent(){   // intlist
		IntList p = this;
		int refer = 0;
		while( p.size()>=2 ){
			if(p.first == p.rest.first){
				p.first = 2*p.first;
				p.rest = p.rest.rest;
				refer = 1;
			}
			p = p.rest;
			if(p == null){
				break;
			}
		}
		if(refer == 1){
			p = this;
			p.addAdjacent();
		}

	}
	public static void main(String[] args) {
		IntList L = new IntList(3, null);
		L = new IntList(2, L);
		L = new IntList(2, L);
		L = new IntList(4,L);
		L.addAdjacent();   // it should mutate L to 8->3
		System.out.println(L.get(0));
		System.out.println(L.get(1));

	}
}
