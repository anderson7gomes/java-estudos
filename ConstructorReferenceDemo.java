@FunctionalInterface
interface MyFunc {

    Foo func();

} // end MyFunc interface

@FunctionalInterface
interface MyFunc2<T> {

    Bar<T> func(T value);

} // end MyFunc2 interface

class Foo {

    int val;

    Foo() {
        val = 7;
    } // end Foo constructor

} // end Foo class

class Bar<T> {

    T val;
    
    Bar(T val) {
        this.val = val;
    } // end Bar constructor -- T

} // end Bar class

class ConstructorReferenceDemo {

    public static void main(String[] args) {
    
        MyFunc f = Foo::new;
        
        Foo foo = f.func();
    
        System.out.printf("Value of foo.val: %d\n", foo.val);
        
        MyFunc2<Integer> f2 = Bar::new;
    
        Bar<Integer> bar = f2.func(4);
        
        System.out.printf("Value of bar.val: %d\n", bar.val);
    
    } // end main method

} // end ConstructorReferenceDemo class
