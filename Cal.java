public class Cal {
    double add(double FirstNo, double SecondNo) {
        return FirstNo + SecondNo;
    }

    //Addition if the given input is  strings
    public int add(String FirstNo, String SecondNo) {
        try {
            int a = Integer.parseInt(FirstNo);
            int b = Integer.parseInt(SecondNo);
            return a + b;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Error");
        }
    }

    int add(int FirstNo, int SecondNo) {

        return FirstNo + SecondNo;

    }

    public int addOverFlow(int First, int Second) throws ArithmeticException {

        long ans = (long) First + (long) Second;
        if (ans > Integer.MAX_VALUE) {
            throw new ArithmeticException("OVER FLOW");

        }
        return (int) ans;
    }

    public int multiOverFlow(int First, int Second) throws ArithmeticException {

        long ans = (long) First * (long) Second;
        if (ans > Integer.MAX_VALUE) {
            throw new ArithmeticException("OVER FLOW");

        }
        return (int) ans;
    }

    int Sub(int FirstNo, int SecondNo) {
        return (int) (FirstNo - SecondNo);
    }

    double sub(double FirstNo, double SecondNo) {
        return FirstNo - SecondNo;
    }


    public double division(double a, double b) {
        try {
            return (double) (double) a / (double) b;
        } catch (Exception e) {
            return -999;
        }
    }

    public double division(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return (double) (double) a / (double) b;
    }

    public double multi(double a, double b) {
        return (double) a * b;
    }

    public int multi(int a, int b) {
        return (int) a * b;
    }

    public static void main(String[] args) {

        Cal cal = new Cal();
        //System.out.println(cal.Div(13,0));
        //System.out.println(cal.Multiplication(10000000, 10000000));
    }
}