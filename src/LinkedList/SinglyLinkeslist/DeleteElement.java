package LinkedList.SinglyLinkeslist;

public class DeleteElement <T>{



        public Node<T> deleteFirstNode(Node<T>head)
        {
            if(head==null)
            {
                return null;
            }
            Node<T>temp=head;
            head=head.next;
            return head;
        }

        public Node<T>deleteElementLast(Node<T> head)
        {
            if(head==null)
            {
                return null;
            }
            if(head.next==null)
            {
                head=null;
                return null;
            }
            Node<T>secondLast = head;
            while(secondLast.next.next != null)
            {
                secondLast = secondLast.next;
            }
            secondLast.next=null;
            return head;
        }
    }

