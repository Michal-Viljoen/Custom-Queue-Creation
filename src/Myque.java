public class Myque {

        private MyQueNode front;
        private MyQueNode rear;

        public Myque(){
            front = null;
            rear = null;
        }

        public boolean isEmpty(){
            return (front==null && rear==null);
        }

        public void enque (int value){
            MyQueNode temp = new MyQueNode();
            temp.setData(value);
            temp.setNext(null);
            if (front == null) {
                front = temp;
            } else {
                rear.setNext(temp);
            }
            rear = temp;
        }

        public int deque (){
            int returnValue = front.getData();
            if (front == rear){ //only one item in queue
                rear = rear.getNext(); //set rear to null
            }
            front = front.getNext(); //set front to null
            return returnValue;
        }

        public void display(){
            MyQueNode p = front;
            while (p != null){
                System.out.print(p.getData() + " ");
                p = p.getNext();
            }
            System.out.println("");
        }
    }