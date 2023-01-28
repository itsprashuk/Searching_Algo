class Linearsearch{

    void disp()
    {
        int key=40;
        int arr[]={10,20,30,40,50};

        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("element present at index no:"+i);
            }
        }
    }
    public static void main(String args[])
    {
       Linearsearch obj=new Linearsearch();
        obj.disp();
    }
}

