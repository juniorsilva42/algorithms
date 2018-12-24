// Jr Silva 20/12/2018
// Algortimo de Euclides para encontrar o maior denominador comum entre dos números

package others;

public class GCD {

    public static void main(String[] args) {

        System.out.printf("GDC(10, 5) = %d\nGCD(10, 2) = %d\n", gcd(10, 5), gcd(10, 2));

        int[] arr = { 10, 5 };
        System.out.println(gcd(arr));
    }

    public static int gcd (int x, int y) {
        if (x == 0)
            return y;

        while (y != 0) {
            if (x > y)
                x -= y;
            else
                y -= x;
        }

        return x;
    }

    public static int gcd (int[] arrangement) {
        int res = arrangement[0];

        for (int i = 1; i < arrangement.length; i++)
            res = gcd(res, arrangement[i]);

        return res;
    }
}
