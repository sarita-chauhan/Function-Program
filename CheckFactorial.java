public class Factorial {
    int checkfactorial (int N){
    int fact=1;
    for(int i=1; i<=N; i++){
        fact=fact*i;
    }
    return fact;
}
    public static void main(String[] args) {
        Factorial s=new Factorial();
        int N=s.checkfactorial(5);
        System.out.println(N);
    }
}
