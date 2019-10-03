
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        //printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        //printWithSmileys("Interface");
        
        
    }
    
    private static void printWithSmileys(String characterString){
        if(characterString.length() % 2 == 1){
            String oddResult = ":) " + characterString + "  :)";
            printLine(oddResult);
            System.out.println("");
            System.out.println(oddResult);
            printLine(oddResult);
        }else{
            String evenResult = ":) " + characterString + " :)";
            printLine(evenResult);
            System.out.println("");
            System.out.println(evenResult);
            printLine(evenResult);
        }
    }
    
    private static void printLine(String result){
        for(int i = 0; i < result.length() / 2; i++){
            System.out.print(":)");
        }
    }

}
