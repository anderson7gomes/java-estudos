class ClassMethodsDemo {

    public static void main(String[] args) {
    
        Foo foo = new Foo();
        Bar bar = new Bar();
        
        Class<?> classObj;
        
        classObj = foo.getClass();
        System.out.println("foo is a object of " + classObj.getSimpleName());
        
        classObj = bar.getClass();
        System.out.println("bar is a object of " + classObj.getSimpleName());
        
        System.out.printf("Bar is %sa interface\n", (classObj.isInterface()) 
                                                    ? "" : "not ");
                           
        classObj = Foobar.class;
                                                    
        System.out.printf("Foobar is %sa interface\n", (classObj.isInterface()) 
                                                       ? "" : "not ");
                                                       
        classObj = Bar.class.getSuperclass();
        
        System.out.printf("%s is superclass of class Bar\n", 
                classObj.getSimpleName());                                                                                           
    
    } // end main method

} // end ClassMethodsDemo class

class Foo {} // end Foo class

class Bar extends Foo implements Foobar {} // end Bar class

interface Foobar {} // end Foobar interface
