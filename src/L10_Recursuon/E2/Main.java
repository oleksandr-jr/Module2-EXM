package L10_Recursuon.E2;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(factorial(10));
        long checkPointTime = System.nanoTime();
        System.out.println(checkPointTime - startTime);
    }

    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }

    static int factorialLoop(int number){
        int fact= 1;
        for(int i=1; i<=number; i++){
            fact=fact*i;
        }

        return fact;
    }
}
