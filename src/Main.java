public class Main {
    public static void main(String[] args) {
       StackTowWay stackTowWay = new StackTowWay();
        stackTowWay.addFirst(3);
        stackTowWay.addLast(5);
        stackTowWay.addLast(6);
        System.out.println(stackTowWay);
        stackTowWay.removeLast();
        stackTowWay.removeFirst();
        System.out.println(stackTowWay);



    }
}
