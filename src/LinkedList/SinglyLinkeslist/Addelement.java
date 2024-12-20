package LinkedList.SinglyLinkeslist;

public class Addelement <T>{

        // Adding element to linked list at Begining
        public Node<T> addAtStart(Node<T>head,T data)
        {
            Node<T> newNode = new Node<>(data);
            newNode.next = head;
            head=newNode;
            return head;
        }
        // Adding element at Last in Linked List
        public Node<T> addAtLast(Node<T>head, T data)
        {
            Node<T>newNode = new Node<>(data);
            if(head==null)
            {
                return newNode;
            }
            Node<T>current = head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
            return head;
        }
        public Node<T> addAtPos(Node<T>head,int pos,T value) {
            if (pos < 1) {
                System.out.println("Invalid Position");
                return head;
            }
            if (pos == 1) {
                Node<T> newNode = new Node(value);
                newNode.next=head;
                head=newNode;
                return head;
            }
            Node prev = head;
            int count = 1;
            while(count<pos-1 && prev !=null)
            {
                prev=prev.next;
                count++;
            }
            if(prev==null)
            {
                System.out.println("Invalid Position!");
                return head;
            }
            Node<T> temp = new Node(value);
            temp.next=prev.next;
            prev.next=temp;
            return head;
        }


    }

