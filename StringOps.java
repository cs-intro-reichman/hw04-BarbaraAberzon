import java.util.Arrays;

public class StringOps {
    public static void main(String[] args) {
        //tseter 
        String word = "MMMM" ;
        char letter = 'M';
        System.out.println(Arrays.toString(allIndexOf(word, letter)));


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
        //
        return true;
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
