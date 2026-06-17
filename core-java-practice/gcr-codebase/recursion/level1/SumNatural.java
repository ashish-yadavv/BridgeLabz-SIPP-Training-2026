public class Problem3SumNatural {
    static int sumNatural(int n) {
        if (n <= 0) return 0;
        return n + sumNatural(n - 1);
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println(sumNatural(N));
    }
}
