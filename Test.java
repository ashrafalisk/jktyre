class Test{
    public static void main(String[]args){
        int x= 10,  first = 0, second=1;

        int count=0;
        System.out.println( x + " for fibonci selected number");
        for(int i=0;i<=x; ++i){
         count++;
         System.out.print( first +  " , ");
         int next=first+second;
         first=second;
         second=next;
        }
        System.out.println("count" + count);
    }
}