public class Main {

    public static void main(String[] args) {

        Myque que = new Myque();
        que.enque(3);
        que.enque(5);
        //System.out.println(que.deque());
        que.enque(8);
        que.enque(9);
        que.enque(10);
        que.enque(11);
        que.enque(15);
        que.enque(16);


        que.display();

        //while (!que.isEmpty()) {
          //  System.out.println(que.deque());
        //}
    }
}
