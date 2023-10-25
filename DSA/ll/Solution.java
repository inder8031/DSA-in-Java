package chauhan.DSA.ll;

import java.util.* ;
import java.io.*;

    public class Solution {
        public static Node addNode(Node head) {
            // Write your code here.
            if(head==null) {
                return null;
            }

            if(head.next==null && head.data==9) {
                Node one = new Node(1);
                head.data = 0;
                one.next = head;
                return one;
            }

            Node temp = head;
            while(temp.next!=null) {
                if(temp.next.data==9) {
                    Node start = temp;
                    while(temp.next!=null && temp.next.data==9) {
                        temp = temp.next;
                    }

                    if(temp.next==null && temp.data==9) {

                        if(start==head && start.data==9) {
                            Node one = new Node(1);
                            one.next = start;
                            head = one;
                        } else{
                            start.data = start.data+1;
                            start = start.next;
                        }

                        while(start!=null) {
                            start.data = 0;
                            start = start.next;
                        }
                        return head;
                    }
                }

                if(temp.next!=null) {
                    temp = temp.next;
                }
            }

            temp.data = temp.data+1;
            return head;
        }

        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(0);
            head.next.next = new Node(9);

            Node result = addNode(head);

            while(result!=null) {
                System.out.print(result.data+" -> ");
                result = result.next;
            }

            System.out.println("null");
        }
    }

class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


