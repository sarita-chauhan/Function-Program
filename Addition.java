public class Addition {
    int addnumber (int a,int b,int d){
        return a+b+d;

    }
    public static void main(String[] args) {
        Addition c=new Addition();
        int a=3,b=4,d=4;
        int out =c.addnumber(a,b,d);
        System.out.println(out);
    }
    
    
}
