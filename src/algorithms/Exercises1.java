package algorithms;

public class Exercises1 {

    public static void Questions() {
        var result = Math.abs(-2147483648);
        System.out.println(result);//-2147483648

        var s = Double.POSITIVE_INFINITY;
        var sd = Double.NEGATIVE_INFINITY;

       /* int x = StdIn.readInt();
        if(x < 3.1) System.out.println(x); // implicit type conversation */

        /*int p;
        System.out.println(p);// Variable 'p' might not have been initialized */

        int[] a = new int[1];
        int[] b = new int[1];
        float f = 3;

    }

    public static void Ex1_1_1() {
        var res = (0 + 15) / 2;
        System.out.println(res);

        var resDouble = 2.0e-6 * 100000000.1;
        System.out.println(resDouble);

        var resBool = true && false || true && true;
        System.out.println(resBool);
    }

    public static void Ex1_1_2() {
        var resDouble1 = (1 + 2.236) / 2;
        var resDouble2 = 1 + 2 + 3 + 4.0;
        var resBool = 4.1 >= 4;
        var resStr = 1 + 2 + "3";
    }
}
