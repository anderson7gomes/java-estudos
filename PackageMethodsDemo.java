class PackageMethodsDemo {

	public static void main(String[] args) {
	
		Package[] pkgs = Package.getPackages();
		
		for (Package p : pkgs) {
		
			System.out.printf("%s\n%s\n%s\n%s\n\n", p.getName(), 
					p.getImplementationTitle(), p.getImplementationVendor(),
					p.getImplementationVersion());
		
		}
	
	} // end main method

} // end PackageMethodsDemo class
