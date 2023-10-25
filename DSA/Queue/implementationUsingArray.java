package chauhan.DSA.Queue;

public class implementationUsingArray {
    static class circularQueue {
        static int[] arr;
        static int size;
        static int front;
        static int rear;

        circularQueue(int n) {
            size = n;
            front = rear = -1;
            arr = new int[size];
        }

        static boolean isEmpty() {
            return front==-1;
        }

        static boolean isFull() {
            return ((rear+1)%size==front);
        }

        static void add(int data) {
            if(isFull()) {
                System.out.println("queue is full");
                return;
            }

            //if array is empty i.e 1st data is being entered
            if(front==-1) {
                front = 0;
            }

            rear = (rear+1)%size;
            arr[rear] = data;
        }

        static int remove() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }

            int result = arr[front];
            //if value to be removed is the only value present in the queue
            if(front==rear) {
                front = rear = -1;
            } else {
                front = (front+1)%size;
            }

            return result;
        }

        static int peek() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }

            return arr[front];
        }

        public static void main(String[] args) {
            circularQueue queue = new circularQueue(3);
            queue.add(1);
            queue.add(2);
            queue.add(3);
            System.out.println(queue.remove());
            queue.add(4);
            System.out.println(queue.remove());
            queue.add(5);
            while(!queue.isEmpty()) {
                System.out.println(queue.remove());
            }
        }
    }
}
