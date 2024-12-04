package Properties.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayList() {
        this.data=new int[DEFAULT_SIZE];


    }

    private boolean isFull()
    {
        return size==data.length;
    }

    private void resize()
    {
        int[] temp=new int[data.length*2];

        // copy this current items in the new array
        for(int i=0;i<data.length;i++)
        {
            temp[i]=data[i];
        }
        data=temp;
    }

    public void add(int num)
    {
        if(isFull())
        {
            resize();
        }
    }

    public int get(int index)
    {
        return data[index];
    }

    public int size()
    {
        return size();
    }

    public void set(int index,int value)
    {
         data[index]=value;
    }

    public int remove()
    {
        int removed=data[--size];
        return removed;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
       // ArrayList list=new ArrayList();
//        list.add(34);
//        list.remove(0);
//        list.get(0);
//        list.set(1,342);
//        list.isEmpty();
//        list.clear();


        CustomArrayList list=new CustomArrayList();
        list.add(5);
        list.add(3);
        list.add(6);

        System.out.println(list);
    }
}
