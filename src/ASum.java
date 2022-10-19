

public class ASum {
//    public static long findNb(long m) {
//        // your code
//    }
//findNb(1071225) --> 45
//findNb(91716553919377) --> -1
    // -1 if there is no such n
    public static void findNb(long m) {
        long n = 45;
        long i = 0;
        long sum = 0;
        do {
            //i++;
            n--;
            sum-=Math.pow(n,3);;
            System.out.println(sum);

        }
        while(sum < m);
        System.out.println(n);

    }
}