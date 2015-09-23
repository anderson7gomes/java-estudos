class BooleanMethodsDemo {

    public static void main(String[] args) {
    
        Boolean b1 = new Boolean("TrUe");
        print(b1);
        
        Boolean b2 = new Boolean(false);
        Boolean b3 = new Boolean("true");
        
        print(Boolean.logicalAnd(b2, b3));
        print(Boolean.logicalOr(b2.booleanValue(), b3));
        print(Boolean.logicalXor(b2, b3.booleanValue()));
    
    } // end main method

    static void print(Boolean b) {
    
        System.out.println(b);
    
    } // end print method

} // end BooleanMethodsDemo class
