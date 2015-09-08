@FunctionalInterface
interface MyFunc<T> {

    int func(T[] values, T val);

} // end MyFunc interface

class Foo {

    static <T> int count(T[] values, T val) {
    
        int counter = 0;
    
        for (T v : values) {
            
            if (v.equals(val)) {
                ++counter;
            }       
            
        }
        
        return counter;
        
    } // end count method  

} // end MyClass class

class GenericMethodReferenceDemo {

    static <T> int operation(MyFunc<T> f, T[] values, T val) {
        return f.func(values, val);
    } // end operation method

    public static void main(String[] args) {
    
        Integer[] integers = {2, 5, 4, 4, 3, 6, 4};
        
        int result = operation(Foo::<Integer>count, integers, 4);
        
        System.out.printf("The number 4 appears %d times\n", result);
    
    } // end main method

} // end GenericMethodReferenceDemo class
