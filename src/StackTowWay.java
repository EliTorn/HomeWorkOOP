public class StackTowWay {
    private Node head, tail, prvTail;
    private int size;

    public StackTowWay() {
        this.head = null;
        this.size = 0;
    }

    public void addLast(int x) {
        Node n = new Node(x, null);
        if (head == null) {
            head = tail = n;
        } else {
            prvTail = tail;
            tail.next = n;
            tail = n;
        }
        size++;
    }

    public void addFirst(int x) {
        if (head == null) {
            Node n = new Node(x, null);
            head = tail = n;
            size++;
        } else {
            Node newNode = new Node(x, head);
            prvTail = head;
            head = newNode;
            size++;
        }
    }

    @Override
    public String toString() {
        return "Stack To Way [" +
                head + ']' +
                ", [size=" + size +
                ']';
    }

    public int size() {
        return this.size;
    }

    public void removeFirst() {

        if (head == null) return;
        else if (head == tail) {
            head = tail = null;
            size--;
        } else {
            head = head.next;
            size--;
        }
    }

    public void removeLast() {
        if (head == null){
            return;
        }
        else if (head == tail) {
            head = tail = null;
            size--;
            return;
        } else {
            tail = prvTail;
            tail.next = null;
            size--;
        }
    }


}
