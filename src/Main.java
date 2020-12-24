import Util.Data.Random;

public class Main {
    public static final String EXAMPLE_TEST = "This is my small example "
            + "string which I'm going to " + "use for pattern matching.";

    public static void main(String[] args) {
//        System.out.println(getPhoneNumber(new int[]{ 8, 1, 9, 6, 0, 2, 8, 8, 9, 4 }));
//        System.out.println("829".matches("[829]{3}"));
        System.out.println(getPrimeNumber(1000));
    }

    public static String getPhoneNumber(int[] arr) {
        String phoneNumber = "";
        boolean validSorted = false;

        while(!validSorted) {
            if(String.valueOf(arr[0]+arr[1]+arr[2]).matches("")) {

            }
        }

        for(int num : arr)
            phoneNumber += num;

        phoneNumber = phoneNumber.replaceAll("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");

        return phoneNumber;
    }

    public static String getPrimeNumber(int top) {
        String primes = "";

        for(int i = 2; i <= top; i++) {
            if(isPrime(i))
                primes += i+", ";
        }

        return primes;
    }

    public static boolean isPrime(int num) {
        boolean prime = true;

        for(int i = 2; i <= (num/2); i++) {
            if((num%i) ==  0)
                return false;
        }

        return prime;
    }
}
