package modelInteface;

public class MyClass extends SuperClass implements MyInterface{


    @Override
    public void myMethod() {
        System.out.println("Hello from interface");
    }

    @Override
    public void myMethod1() {

    }

    void myMethodFromSuperClass(){
        System.out.println("Hello from myClass");
    }
}
