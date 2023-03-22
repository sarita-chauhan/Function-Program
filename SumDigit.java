public class SumDigit {
    int CheckSumDigit   (int val){
        int sum=0;
        int rem=0;
            while(val>0){
                rem=val%10;
                sum=sum+rem;
                val=val/10;
            }
            return sum;   
            }
            public static void main(String[] args) {
                SumDigit s=new SumDigit();
                int val= s.CheckSumDigit (9909);
                System.out.println(val);
            }
        }                   
