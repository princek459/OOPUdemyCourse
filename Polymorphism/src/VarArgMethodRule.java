    /*
    If you don't know the number of
    parameters in a method you can
    create a var-arg method
    Syntax:
    access-modifier return-type method-name(datatype..){
    }

    Rule 8:
    var-arg method will be the least priority.
    eg if no other method matched then
    only var-arg method will be

     */


public class VarArgMethodRule {

//    Var arg example
//    public void m1(int... i) {
//        System.out.println("Var arg method");
//    }

    public void m1(int i) {
        System.out.println("Not!! Var arg method");
    }
    public void m1(int i, int j) {
        System.out.println("Not!! Var arg method with 2 args");
    }
//    Overloading
    public void m1(int... i) {
        System.out.println("Var arg method");
    }

    public static void main(String[] args) {
        VarArgMethodRule vam = new VarArgMethodRule();
        vam.m1(10);
        vam.m1(10, 10);

        vam.m1();
    }



}
