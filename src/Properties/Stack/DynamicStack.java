package Properties.Stack;

public class DynamicStack extends CustomStack{

    public DynamicStack()
    {
        super(); // it will call the CustomStack()
    }

    public DynamicStack(int size)
    {
        super(size); // it will call the CustomStack(int size)
    }

    public boolean push(int item)
    {
        if(this.isFull())
        {

            // double the array size
            int[] temp=new int[data.length*2];

            // copy all the previous item in the new array

            for(int i=0;i<temp.length;i++)
            {
                temp[i]=data[i];
            }
            data=temp;
        }


        // at this point we know that the array is not full
        // inset item

        return super.push(item);
    }
}
