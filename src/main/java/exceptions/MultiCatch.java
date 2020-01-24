package exceptions;

class MultiCatch
{
    static int c[] = { 1 };
    public static void main(String args[])
    {
        try {
            int a = args.length;
            System.out.println("a = " + String.valueOf(a));
            int b = 23 / a;
            c[4] = 33;
            int [] v;
            v = new int[2];
            v[1] = 2;
            v[2] = 100;
            v[3] = 200;
        }  catch (ArithmeticException e) {
            System.out.println("ArithmeticException : " +
                    e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "ArrayIndexOutOfBoundsException : "
                            + e.getMessage());
        }
    }
}