package Properties.Queue;


// implemented queue without head and tail. We only use tail not head. In both cases of Queue and Linked List

// in this queue insertion an element with O(1) but removing element from queue is O(n).

public class CustomQueue {

    private int[] data;
    private static final int DEFAULT_SIZE=10;

    int end=0;


    public CustomQueue()
    {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size)
    {
        this.data=new int[size];
    }

    public boolean isFull() {
        return end== data.length;
    }
    public boolean isEmpty() {
        return end==0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }

    // We actually shift the whole Array towards left. And this is the way of
    // Remove item from the queue. And as we have no pointer of first index of queue.
    // SO this is the only solution to solve this.

    public int remove()throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is Empty.");
        }
        int removed=data[0];


        // shift the array towards the left
        for(int i=1;i<data.length;i++)
        {
            data[i-1]=data[i];
        }
        end--;
        return removed;

    }

    public int front() throws Exception{

        if(isEmpty())
        {
            throw new Exception("Queue is Empty.");
        }
        return data[0];

    }

    public void display()
    {
        for (int i = 0; i <end ; i++) {
            System.out.print(data[i]+" ");
        }
    }
}
