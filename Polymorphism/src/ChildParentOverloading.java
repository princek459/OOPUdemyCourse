
    /*
    Rule 7:
    In OverLoading, method resolution
    always takes care by compiler
    based on reference type
     */

    class A{

    }

    class B extends A {

    }

public class ChildParentOverloading {

//        Child Parent Overloading
        public void k1(A a) {
            System.out.println("Parent");
        }
        public void k1(B a) {
            System.out.println("Child");
        }

    public static void main(String[] args) {
        ChildParentOverloading cpo = new ChildParentOverloading();

        A a = new A();
        cpo.k1(a);

        B b = new B();
        cpo.k1(b);

        A ab = new B();
        cpo.k1(ab);

    }

}
