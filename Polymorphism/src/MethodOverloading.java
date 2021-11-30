public class MethodOverloading {

//    Early binding/ Compile time polymorphism
    /*
    Methods can be overloaded in 3 ways
    1. Numbers of parameters
    2. Datatypes of the parameters
    3. Order of the parameters
     */


    public void method1(){
        System.out.println("No Arguments");
    }

    public void method1(int i){
        System.out.println("Integer arguments: " + i);
    }

    public void method1(int i, float j){
        System.out.println("Integer arguments: " + i);
    }

    public void method1(float j, int i){
        System.out.println("Integer arguments: " + i);
    }


    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        mO.method1();
        mO.method1(5);
    }
}
