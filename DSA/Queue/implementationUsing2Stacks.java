package chauhan.DSA.Queue;

import java.util.*;

public class implementationUsing2Stacks {

    static class queueA {  //case 1 i.e. push -> O(n), peek -> O(1), pop -> O(1)
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        static boolean isEmpty() {
            return s1.isEmpty();
        }

        static void add(int data) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        static int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.pop();
        }

        static int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.peek();
        }

        public static void main(String[] args) {
            queueA q = new queueA();
            System.out.println(q.remove());
            q.add(1);
            q.add(2);
            q.add(3);

            while(!s1.isEmpty()) {
                System.out.println(s1.peek());
                q.remove();
            }
        }
    }

    static class queueB {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        static boolean isEmpty() {
            return s1.isEmpty();
        }

        static void add(int data) {
            s1.push(data);
        }

        static int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            int top = s2.pop();

            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }

            return top;
        }

        static int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            int top = s2.peek();

            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }

            return top;
        }

        public static void main(String[] args) {
            queueB q = new queueB();
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
