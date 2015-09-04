class GenSuperclass<T> {

    private T ob1;
    
    GenSuperclass(T ob1) {
        this.ob1 = ob1;
    } // end GenSuperclass constructor -- T
    
    T getOb1() {
        return ob1;
    } // end getOb1 method

} // end GenSuperclass class

class GenSubclass<T> extends GenSuperclass<T> {

    private T ob2;
    
    GenSubclass(T ob1, T ob2) {
    
        super(ob1);
        
        this.ob2 = ob2;
    
    } // end GenSubclass constructor -- T, T

    T getOb2() {
        return ob2;
    } // end getOb2 method
    
    @Override
    T getOb1() {
        return super.getOb1();
    } // end getOb1 method

} // end GenSubclass class

class GenSubclass2<T extends Double> extends GenSuperclass<Double> {

    GenSubclass2(T ob) {
        super(ob);
    } // end GenSubclass constructor -- T
    
    @Override
    Double getOb1() {
        return super.getOb1();
    } // end getOb1 method

} // end GenSubclass2 class

class CastingGenericsDemo {

    public static void main(String[] args) {
    
        GenSubclass<String> genSubStr1 = new GenSubclass<>("Hello", "World");
        
        GenSuperclass<String> genSupStr = genSubStr1;
        
        System.out.println(genSupStr.getOb1());
        
        GenSubclass<String> genSubStr2 = (GenSubclass<String>) genSupStr;
        
        System.out.println(genSubStr2.getOb2());
        
        GenSubclass<?> genSub = (GenSubclass<?>) genSupStr;
        
        System.out.println(genSub.getOb2());
        
        GenSubclass2<Double> genSubDoub = new GenSubclass2<Double>(4.5);
        
        System.out.println(genSubDoub.getOb1());
    
    } // end main method

} // end CastingGenericsDemo class
