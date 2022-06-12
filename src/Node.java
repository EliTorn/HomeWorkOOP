public class Node {
     int data;
     Node next;

    @Override
    public String toString() {
        return   data + " "+next;
    }

    public Node (int data , Node next) {
        this.data =data;
        this.next = next;
    }

}
