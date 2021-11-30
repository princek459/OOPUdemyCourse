
    /*
    Rule 1:
    Java performs automatic promotion when it can't find a matching method
    Arguments promoted in this particular way.
    char => int => long => float => double
    byte => short => int => long => float => double

     */

public class AutomaticPromotiomRule {

    public void m1(int a){
        System.out.println("Integer argument");
    }

    public void m1(float f){
        System.out.println("Float argument");
    }

    public static void main(String[] args) {

        AutomaticPromotiomRule apr = new AutomaticPromotiomRule();
        apr.m1(10);
        apr.m1(10f);

//        IQ
        apr.m1('a');

//        apr.m1(10.5);
    }
}
