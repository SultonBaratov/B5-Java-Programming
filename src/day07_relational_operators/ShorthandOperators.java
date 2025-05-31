package day07_relational_operators;

public class ShorthandOperators {
    public static void main(String[] args) {
        int a = 10;   // declare and (first assigned value)initialized variable called 'a'
        a = 20;       // re-assigned variable 'a' into a new value
        a++;          // re-assigned by POST Increment (increasing value by 1) => a = a(20) + 1 = a = 21
        ++a;          // re-assigned by Pre Increment (increasing value by 1) => a = a(21) + 1 = a = 22
        a = a + 1;    // re-assigned by increasing value by 1 => a = a(22) + 1 = a = 23

        a = a + 10;   // re-assigned by adding/increasing by 10 ==> a = a(23) + 10 = a = 33
        System.out.println(a);
        a += 10;      // re-assigned by shorthand operator adding 10 ==> a = a(33) + 10 = a = 43

        a = 100 + 10; // this cannot be converted to be used as SHORTHAND operator because SHORTHAND operator is when you add/minus/multi/division a value to intself
        System.out.println(a);

        int b = 10;
        b *= 2;       // re-assigned by using SHORTHAND operator multiplaying itself by 2
        // b = b * 2
        System.out.println(b);
        System.out.println();

        int c = 20;
        c -= 5;
        // d = d / 2
        System.out.println(c);
        System.out.println();

        int d = 5;
        d /= 2;
        // d = d / 2
        System.out.println(d);
        System.out.println();



    }
}
