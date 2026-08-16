// Define two interfaces
interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

// Implement the interfaces in a class
class MyClass implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("Method1 implementation");
    }

    @Override
    public void method2() {
        System.out.println("Method2 implementation");
    }
}

class Codechef {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        
        myObject.method1(); // Calls method1() from