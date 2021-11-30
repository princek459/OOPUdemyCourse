    /*
    Rule 2:
    Java performs automatic promotion when it can't find a matching method
    Arguments promoted in this particular way.
    char => int => long => float => double
    byte => short => int => long => float => double

    Rule 3:
    While resolving overloading, methods compiler will always give
    precedence for the child type argument, then it will
    check for parent type argument
     */

public class ChildParentOverloadingRule {

    public void b1(String str) {
        System.out.println("String version");
    }

    public void b1(Object object) {
        System.out.println("Object version");
    }

    public static void main(String[] args) {
        ChildParentOverloadingRule cpor = new ChildParentOverloadingRule();
        cpor.b1(new Object());
        cpor.b1("String");
        cpor.b1(null);
    }
}
