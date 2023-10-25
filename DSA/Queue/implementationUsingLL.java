package chauhan.DSA.Queue;

public class implementationUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class queue {
        static Node head = null;
        static Node tail = null;

        static boolean isEmpty() {
            return head==null && tail==null;
        }

        static void add(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        static int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = head.data;
            if(head==tail) {
                head = tail = null;
            } else{
                head = head.next;
            }

            return front;
        }

        static int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return head.data;
        }

        public static void main(String[] args) {
            queue q = new queue();
            q.add(1);
            q.add(2);
            q.add(3);

            while(!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
}
