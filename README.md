# jktyre
thise is my first repository
<br>
door close

 public class Test {
    public static void main(String[] args) {
        int [] number =new int []{1,2,3,4,6};
        int total=6;
        int expected_sum= total*((total+1)/2);
        int num_sum=0;
        for(int i:number){
            num_sum += i;
        }
        System.out.println(expected_sum - num_sum);
    }
}

