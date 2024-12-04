package Properties.Queue;

public class QueueMain {

    public static void main(String[] args) {
        CustomQueue queue=new CustomQueue(5);
        queue.insert(5);
        queue.insert(35);
        queue.insert(32);
        queue.insert(12);
        queue.display();

    }
}
