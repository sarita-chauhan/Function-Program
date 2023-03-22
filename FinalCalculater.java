import java.util.Scanner;
public class FinalCalculater {
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
        System.out.println("Please Enter First Number");
        int first=sc.nextInt();
        while(true){
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Divisiton\n5. Exit\nChoose Option");
            int choice=sc.nextInt();

            if(choice==5){
                System.exit(1);
            }

            System.out.println("Please Enter another Number:");
            int Second=sc.nextInt();

            FinalCalculater calc=new FinalCalculater();
            
            switch(choice){
                case 1:
                    first=calc.addnumber(first,Second);
                    System.out.println(first);
                    break;
                case 2:
                    first=calc.subnumber(first,Second);
                    System.out.println(first);
                    break;
                case 3:
                    first=calc.multinumber(first,Second);
                    System.out.println(first);
                    break;
                case 4:
                    first=calc.divnumber(first,Second);
                    System.out.println(first);
                    break;
            }
        }
        
    }
}
