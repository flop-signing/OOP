package Properties.LinkedList;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    public CircularLinkedList()
    {
        head=null;
        tail=null;
    }

    public void insertValue(int value)
    {
        Node node=new Node(value);

        if(head==null)
        {
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    public void display()
    {
        Node node=head;
        if(head !=null)
        {
            do{
                System.out.print(node.val+" -> ");
                node=node.next;
            }while(node!=head);
        }
        System.out.println("HEAD");
    }

    public void delete(int value)
    {
        Node node=head;

        if(node.val==value)
        {
            head=head.next;
            tail.next=head;

            return;
        }

        do{
            Node n=node.next;
            if(n.val==value)
            {
                node.next=n.next;
                break;
            }
            node=node.next;

        }while (node!=head);
    }

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

    }
}
