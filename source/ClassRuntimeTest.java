class ClassRuntimeTest {
	
    public static void main (String[] args) {
		
        Runtime rt = Runtime.getRuntime();
	
	    System.out.println("Memória total antes do loop criador de objetos " 
	            + rt.totalMemory());
	    
	    System.out.println("Memória livre antes do loop criador de objetos " 
	            + rt.freeMemory());
	
        for (long i = 1; i <= 100000000000L; i++) {

	        ClassRuntimeTest test = new ClassRuntimeTest();
            test = null;

	    }
	    
	    System.out.println("Memória total antes da chamada ao método gc() " 
	            + rt.totalMemory());
	    
	    System.out.println("Memória livre antes da chamada ao método gc() " 
	            + rt.freeMemory());   
		
	    rt.gc();
	
	    System.out.println("Memória total após a chamada ao método gc() " 
	            + rt.totalMemory());
	            
	    System.out.println("Memória livre após a chamada ao método gc() " 
	            + rt.freeMemory());        
	
    }
	
} // fim da classe ClassRuntimeTest
