public class Armstrong {
    int count_digit(int val){
      int  count=0;
        while(val>0){
            val=val/10;
            count++;
        }
        return count;
    }
    int checkArmstrong(int val){
        int count =count_digit(val);
        int n=val;
       int sum=0;
        while(val>0){
            int rem=val%10;
            sum=sum+(int)Math.pow((double)rem,(double)count);
            val=val/10;
        }
        if(n==sum){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Armstrong a=new Armstrong();
        int val =a.checkArmstrong(1371);
        if(val==1){
            System.out.println("Arm Strong Number");
        }
        else{
            System.out.println(" Not Arm Strong Number");
        }
    }
}
