package chauhan.DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class stackUsing2Queques {

    static class stackA {  //case 2 i.e. pop -> O(n), peek -> O(n), push -> O(1)
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        static void push(int data) {
            if(!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        static int pop() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;

            if(!q1.isEmpty()) {
                while(!q1.isEmpty()) {
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            } else {
                while(!q2.isEmpty()) {
                    top = q2.remove();
                    if(q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }

            return top;
        }

        static int peek() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;

            if(!q1.isEmpty()) {
                while(!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while(!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;
        }

        public static void main(String[] args) {
            stackA s = new stackA();
            s.push(1);
            s.push(2);
            s.push(3);

            while(!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }
        }
    }

    static class stackB {  //Case 1 i.e. push -> O(n), peek -> O(1), pop -> O(1)
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        static void push(int data) {
            if(q1.isEmpty()) {
                q1.add(data);
                while(!q2.isEmpty()) {
                    q1.add(q2.remove());
                }
            } else {
                q2.add(data);
                while(!q1.isEmpty()) {
                    q2.add(q1.remove());
                }
            }
        }

        static int pop() {
            if(isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            if(!q1.isEmpty()) {
                return q1.remove();
            } else {
                return q2.remove();
            }
        }

        static int peek() {
            if(isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            if(!q1.isEmpty()) {
                return q1.peek();
            } else {
                return q2.peek();
            }
        }

        public static void main(String[] args) {
            stackB s = new stackB();
            System.out.println(s.pop());
            System.out.println(s.peek());
            s.push(1);
            System.out.println(s.peek());
            s.push(2);
            System.out.println(s.peek());
            s.push(3);
            System.out.println(s.peek());

            while(!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }

        }
    }
}
