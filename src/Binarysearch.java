
public class Binarysearch {
    void disp()
    {
        int arr[]={2,3,4,5,6,7,8,9,10};
       int li=0;
       int hi=arr.length-1;
       int mi=li+hi/2;
       int key=8;

       while(li<=hi)
       {
           if(arr[mi]==key)
           {
               System.out.println("element:"+mi);
               break;
           }
           else if(arr[mi]<key)
           {
               li=mi+1;
           }
           else{
               hi=mi-1;
           }
           mi=(li+hi)/2;
       }

       if(li>hi){
           System.out.println("not found");
       }


    }
    public static void main(String args[]){
        Binarysearch obj=new Binarysearch();
        obj.disp();
    }
}
