class CharacterMethodsDemo {

    public static void main(String[] args) {
    
        Character[] chars = {'a', 'B', 'r', '?', 'T', ',', '_'};
        
        for (Character c : chars) {
        
            char character = c.charValue();
        
            if (Character.isDigit(character)) {
                printIs(c, "digit");
            }
            
            if (Character.isJavaIdentifierPart(character)) {
                printIs(c, "java identifier part");
            }
            
            if (Character.isJavaIdentifierStart(character)) {
                printIs(c, "java identifier start");
            }
            
            if (Character.isLetter(character)) {
                printIs(c, "letter");
            }
        
        } 
        
    } // end main method
    
    static void printIs(char character, String isType) {
    
        System.out.printf("%c is %s\n", character, isType);
    
    } // end printIs method

} // end CharacterMethodsDemo class
