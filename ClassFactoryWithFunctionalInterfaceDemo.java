@FunctionalInterface
interface FactoryFunc<R, T> {

    R func(T value);

} // end FactoryFunc interface

class Foo<T> {

    T val;
    
    Foo(T val) {
        this.val = val;
    } // end Foo constructor -- T

} // end Foo class

class Bar {

    String val;
    
    Bar(String val) {
        this.val = val;
    } // end Bar constructor -- String

} // end Bar class

class ClassFactoryWithFunctionalInterfaceDemo {

    public static void main(String[] args) {
    
        Foo<Integer> foo = objectFactory(Foo<Integer>::new, 7);
        
        System.out.printf("Value of foo.val: %s\n", String.valueOf(foo.val));
        
        Bar bar = ClassFactoryWithFunctionalInterfaceDemo.
                <Bar, String>objectFactory(Bar::new, "Anderson");
        
        System.out.printf("Value of bar.val: %s\n", bar.val);
    
    } // end main method

    static <R, T> R objectFactory(FactoryFunc<R, T> f, T value) {
        return f.func(value);
    } // end objectFactory method

} // end ClassFactoryWithFunctionalInterfaceDemo class
