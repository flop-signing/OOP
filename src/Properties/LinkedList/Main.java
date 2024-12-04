package Properties.LinkedList;

import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {
        SinglyLinkedLIst singlyLinkedLIst=new SinglyLinkedLIst();
        singlyLinkedLIst.insertFirst(4);
        singlyLinkedLIst.insertFirst(14);

        singlyLinkedLIst.insertFirst(5);
        singlyLinkedLIst.insertFirst(1);
        singlyLinkedLIst.insertFirst(12);
        singlyLinkedLIst.insertFirst(7);

        singlyLinkedLIst.display();
        singlyLinkedLIst.insertLast(99);
        singlyLinkedLIst.display();
        System.out.println(singlyLinkedLIst.deleteFirst());
        singlyLinkedLIst.display();

        System.out.println(singlyLinkedLIst.deleteLast());
        singlyLinkedLIst.display();


    }
}
