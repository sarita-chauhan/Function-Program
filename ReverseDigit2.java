public class ReverseDigit2 {
    int CheckReversDigit(int val){
    int rem;
    int sum=0;
    while(val>0){
        rem=val%10;
        sum=sum*10+rem;
        val=val/10;
    }
    return sum;
}
    public static void main(String[] args) {
        ReverseDigit2 s=new ReverseDigit2();
        int val= s.CheckReversDigit(123);
        System.out.println(val);
    }
}
