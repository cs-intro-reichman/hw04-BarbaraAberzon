import java.util.Arrays;

public class StringOps {
    public static void main(String[] args) {
        //tseter 
        String word = "HELLO world" ;
        System.out.println(camelCase(word));

    }

    public static String capVowelsLowRest (String string) { 
        String endString = "" ; 
        String vowels = "aeiouAEIOU" ;
        char c ;
        for ( int i = 0 ; i < string.length() ; i++){
                c = string.charAt(i) ;

			if ( vowels.indexOf(c) == -1 &&  c <= 'Z' && c > 'A' ){
                c = (char)(c+32);
            }
            
            else if (vowels.indexOf(c) != -1 && c <= 'z' && c >= 'a' ){
                c = (char)(c-32);
            }
         
           endString = endString + c ;
		}
        return endString;
    }

    public static String camelCase (String string) {
        String modString = ""; 
        String finalString = "";
        char c ; 

        for (int i = 0 ; i < string.length() ; i ++){
            c = string.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c+32);
            }
          modString = modString + c ;
        }

        while (modString.charAt(0) == 32 || string.charAt(modString.length()-1) == 32 ) {
            if (modString.charAt(0)== 32) {
                modString = modString.substring(1) ; 
            }
            if (modString.charAt(modString.length() -1 ) == 32 ){
                modString = modString.substring(0, modString.length() -1);
            }
        }

        for (int i = 0 ; i < modString.length() ; i ++ ){
            if (modString.charAt(i) == 32){
                if (modString.charAt(i+1) >= 'a' && modString.charAt(i+1) <= 'z'){
                    finalString = finalString + (char)(modString.charAt(i+1) -32) ;
                    i ++ ; 
                }
            }
            else if (modString.charAt(i) >= 'a' && modString.charAt(i) <= 'z'){
                finalString = finalString +modString.charAt(i); 
            }
        }

        return finalString;
    }

    public static int[] allIndexOf (String string, char chr) {
    int appears = 0 ;

    //check how much time the letter appears
    for (int i = 0 ; i < string.length() ; i++){
        if (string.charAt(i) == chr){
            appears++ ; 
         }
        }

    //create new array
    int [] newArray = new int[ appears ] ; 
    int currentIndex = 0;

   for (int i = 0 ; i < string.length() ; i ++){
            if (string.charAt(i) == chr){
            newArray [currentIndex] = i ; 
            currentIndex++ ; 
        } 
    }
    

        return newArray;
    }
}
