@FunctionalInterface
interface UnaryOperator<T> {
    
    T apply(T ob);   
    
} // end UnaryOperator interface

@FunctionalInterface
interface BinaryOperator<T> {

    T apply(T ob1, T ob2);

} // end BinaryOperator interface

@FunctionalInterface
interface Function<T, R> {

    R apply(T ob);

} // end Function interface

@FunctionalInterface
interface Predicate<T> {

    boolean test(T ob);

} // end Predicate interface

@FunctionalInterface
interface Consumer<T> {

    void accept(T ob);

} // end Consumer interface

@FunctionalInterface
interface Supplier<T> {

    T get();

} // end Supplier interface

class Foo {

    int value;
    
    Foo(int value) {
        this.value = value;
    } // end Foo constructor -- int

    int getValue() {
        return value;
    } // end getValue method    

} // end Foo class

class Operations {

    static Foo foo = new Foo(1);

    static boolean isEven(int number) {
        return number % 2 == 0;
    } // end isEven method
    
    static String joinStrings(String str1, String str2) {
        return str1 + str2;
    } // end joinStrings method
    
    static String upperCase(String str) {
        return str.toUpperCase();
    } // end upperCase method
    
    static void multiplieFooValue(int value) {
        foo.value *= value;
    } // end duplicateFooValue method
    
    static int getFooValue() {
        return foo.value;
    } // end getFooValue method
    
    static Integer parseToInt(String numberAsString) {
        return Integer.parseInt(numberAsString);
    } // end parseToInt method

} // end Operations class

class ImplementedBuiltInFunctionalInterfaces {

    public static void main(String[] args) {
    
        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        
        System.out.printf("isEven.test(6): %b\n", isEven.test(6));
        
        BinaryOperator<String> appendTwoStrings = Operations::joinStrings;
        
        System.out.printf(
                "appendTwoStrings.apply(\"Anderson\", \"Gomes\"): %s\n", 
                appendTwoStrings.apply("Anderson", "Gomes"));
                
        Consumer<Integer> multiplie = Operations::multiplieFooValue;
        multiplie.accept(4);
        multiplie.accept(2);
        
        Supplier<Integer> getFooValue = Operations::getFooValue;
        
        System.out.printf("getFooValue.get(): %d\n", getFooValue.get());    
        
        UnaryOperator<String> upperCase = Operations::upperCase;
        
        System.out.printf("upperCase.apply(\"Anderson\"): %s\n", 
                upperCase.apply("Anderson"));    
                
        Function<String, Integer> parseToInt = (str) -> Integer.parseInt(str);
        
        System.out.printf("parseToInt.apply(\"42\"): %d\n", 
                parseToInt.apply("42"));        
    
    } // end main method

} // end ImplementedBuiltInFunctionalInterfaces class
