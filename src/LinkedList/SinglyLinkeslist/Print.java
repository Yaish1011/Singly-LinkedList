package LinkedList.SinglyLinkeslist;

public class Print <T>{

        public void printList(Node<T> head)
        {
            Node<T>current = head;
            while(current != null)
            {
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
    }

