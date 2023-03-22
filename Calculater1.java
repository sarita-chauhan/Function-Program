public class Calculater1 {
    int addnumber (int a,int b){
        return a+b;
    }
    int subnumber (int a,int b){
        return a-b;
    }
    int divnumber (int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        Calculater1 d=new Calculater1();
        int a=5, b=3;
        int out=d.addnumber(a, b);
        System.out.println(out);
        out=d.subnumber(a, b);
        System.out.println(out);
        out=d.divnumber(a, b);
        System.out.println(out);

    }

    
}
