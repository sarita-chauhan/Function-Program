public class Polindrone {
    
    int reverse (int val){
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
        int x=121;
        Polindrone s=new Polindrone();

        int res=s.reverse(x);
        if(x==res){
            System.out.println("Polindrone");
        }
        else{
            System.out.println("not Polindrone");
        }
    }
}
