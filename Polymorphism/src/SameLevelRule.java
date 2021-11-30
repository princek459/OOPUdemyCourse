/*

    Java performs automatic promotion when it can't find a matching method

    Rule 4: Arguments promoted in this particular way.
    char => int => long => float => double
    byte => short => int => long => float => double

    Rule 5: While resolving overloading, methods compiler will always give
    precedence for the child type argument, then it will
    check for parent type argument

    Rule 6: While resolving overloading methods, if 2 parameters
    are at the same level then there will be compile time error

     */

public class SameLevelRule {


    public void g1(String string){
        System.out.println("String Version");
    }
    public void g1(StringBuffer stringBuffer){
        System.out.println("String Version");
    }

    public static void main(String[] args) {
        SameLevelRule slr = new SameLevelRule();
        slr.g1("nName");
        slr.g1(new StringBuffer("NameSB"));

//        Same level so error
//        slr.g1(null);
    }
}
