import java.util.Scanner;
public class Calculater2 {
    int addnumber (int a,int b){
        return a+b;
    }
    int subnumber (int a,int b){
        return a-b;
    }
    int divnumber (int a,int b){
        return a/b;
    }
    int multinumber (int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Divisiton\nChoose Option");
        int choice=sc.nextInt();

        System.out.println("Please Enter First Number:");
        int first=sc.nextInt();
        
        System.out.println("Please Enter Second Number:");
        int Second=sc.nextInt();
        
        Calculater2 calc=new Calculater2();
        switch(choice){
            case 1:
                System.out.println(calc.addnumber(first,Second));
                break;
            case 2:
                System.out.println(calc.subnumber(first,Second));
                break;
            case 3:System.out.println(calc.multinumber(first,Second));
                break;
            case 4:System.out.println(calc.divnumber(first,Second));
                break;
        }
    }

    
}
