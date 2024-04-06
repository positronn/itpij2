public class Binary {
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int power = 1;
        while (power <= n/2)
        {
            power *= 2;
        }
        // now power is the largest power of 2 <= n
        while (power > 0)
        {
            // cast out powers of 2 in decreasing order
            if (n < power) {
                System.out.print(0);
            }
            else {
                System.out.print(1);
                n -= power;
            }
            power /= 2;
        }
        System.out.println();
    }
}
