package recursion;

public class RecursionMain {
    public static void main(String[] args) {
//        System.out.println(factorial(10));
        System.out.println(recursiveFactorial(10));
    }
    public static int factorial(int num){
        if(num==0) return 1;
        int numFact =1;
        while(num > 1){
            numFact *= num;
            num--;
        }
        return numFact;
    }
    public static int recursiveFactorial(int num){
        if(num == 0) return 1;
        return num * recursiveFactorial(num -1);
    }
}
