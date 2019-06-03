public class DMSList {
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode h) {
            item = i;
            next = h;
        }
        public int max() {
            return Math.max(item,next.max());
        }
    }

    private IntNode sentinel;
    public DMSList() {
        sentinel = new IntNode((-1000,))
    }
}
