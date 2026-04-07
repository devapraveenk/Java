package Problem;

public class BasicProblems {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isPrime(19));

    }
    private static boolean isArmstrong(int n){
        int sum = 0;
        int checkNum = n;
        while(n > 0){
            int val = n % 10;
            sum += val * val * val;
            n /= 10;
        }
        return sum == checkNum;
    }
    private static boolean isPrime(int n){
        if(n <= 1) return false;

        int u = 2;
        while(u * u <= n){
            if(n % u == 0) return false;
            u++;
        }
        return u * u > n;
    }
}
