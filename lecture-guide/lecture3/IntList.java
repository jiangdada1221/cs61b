// B level 1
public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if(rest == null){
      return 1;
    }
    return 1 + rest.size();
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		int sum = 1;
    IntList p = this;
    while(p.rest != null){
      sum = sum+1;
      p = p.rest;
    }
    return sum;
	}

	/** Returns the ith value in this list.*/
	public int get(int i) {
		if(i ==1){
      return first;
    }
    return rest.get(i -1);
	}

	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);

		System.out.println(L.iterativeSize());
    System.out.println(L.get(2));
    System.out.println(L.size());
	}
}
