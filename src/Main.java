public class Main {
    public static void main(String[] args) {
        boolean results = hasEqualSum(2,8,5);
        System.out.println(results);
    }
    public static boolean hasEqualSum(int num1,int num2,int num3){
        int check= num1 + num2;
        if(check ==num3) {
            return true;
        }
        return false;
    }
}