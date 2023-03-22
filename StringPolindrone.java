public class StringPolindrone {
    String checkPolindrone(String val){
        int i=0; int j=val.length()-1;
        while(i<j){
            if(val.charAt(i)!=val.charAt(j)){
                return "not polindrome";
            }
            i++;
            j--;
        }
        return "polindrome";
    }
    public static void main(String[] args) {
        StringPolindrone stringPolindrone=new StringPolindrone();
        System.out.println(stringPolindrone.checkPolindrone("MADAM"));
    }
}
