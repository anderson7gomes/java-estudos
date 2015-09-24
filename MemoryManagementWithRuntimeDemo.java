class MemoryManagementWithRuntimeDemo {
	
	public static void main(String[] args) {
		
		Runtime runtime = Runtime.getRuntime();

		long totalMemory = runtime.totalMemory();
		long freeMemory = runtime.freeMemory();

		System.out.println("total memory: " + 
				totalMemory);

		System.out.println("free memory before instantiates objects: " + 
				freeMemory);

		Foo[] fooObjects = new Foo[999];

		for (int i = 0; i < fooObjects.length; i++) {
			fooObjects[i] = new Foo(i, i, i);
		}
		 
	    try {
	    	Thread.sleep(2000);
	    } catch (InterruptedException e) {
	    	e.printStackTrace();
	    }  

		freeMemory = runtime.freeMemory();

		System.out.println("free memory after instantiates objects: " + 
				freeMemory);

		System.out.println("total memory allocated: " + 
				(totalMemory - freeMemory));
				
		for (int i = 0; i < fooObjects.length; i++) {
			fooObjects[i] = null;
		}				

		runtime.gc();

		freeMemory = runtime.freeMemory();

		System.out.println("free memory after call gc() method: " + 
				freeMemory);

	} // end main method

	private static class Foo {
		
		int var1;
		int var2;
		int var3;

		public Foo(int v1, int v2, int v3) {
			
			var1 = v1;
			var2 = v2;
			var3 = v3;

		} // end Foo constructor -- int, int, int

	} // end Foo inner class

} // end MemoryManagementWithRuntimeDemo class