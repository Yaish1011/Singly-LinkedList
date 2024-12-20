package LinkedList.SinglyLinkeslist;

public class Main<T> {
    public static void main(String[] args) {


        Addelement<Integer> sll = new Addelement<>();


        Node<Integer> head = null;
        head = sll.addAtStart(head,1);
        head = sll.addAtLast(head,2);
        head = sll.addAtPos(head,2,3);
        head= sll.addAtStart(head, 4);
        head = sll.addAtLast(head, 5);

        Print<Integer> pl = new Print<>();
        pl.printList(head);
        System.out.println();

        DeleteElement<Integer> dl = new DeleteElement<>();
        head=dl.deleteFirstNode(head);
        head= dl.deleteElementLast(head);
        System.out.println("Elements after deleting From Linked List");
        pl.printList(head);
        System.out.println();




    }
}
