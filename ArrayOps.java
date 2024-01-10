public class ArrayOps {
    public static void main(String[] args) {
        //findMissingInt Test
        int[] arr = { 1 , 3 , 4 , 0} ;
        System.out.println(findMissingInt(arr));

        // //secondMaxValue Test 
        // int[] arr1 = { 6 , 2 , 4 ,2 , 10} ; 
        // System.out.println(secondMaxValue(arr1));

    }
    
    public static int findMissingInt (int [] array) {
        int missing = 0 ;
        int [] newArray = new int[ array.length +1 ] ; // create new array for compare

        for ( int i = 0 ; i < array.length ; i++){
            newArray [i] = i ; 
        }
        
        for ( int i = 0 ; i < newArray.length ; i ++){
            boolean is_found = false ;
            for ( int j = 0 ; j < array.length ; j++){
            if ( newArray[i] == array[j]){
                is_found = true ;  
            }
        }
            if (is_found == false){
                missing = newArray[i] ;
                break ;
            }
        }
        return missing;
    }

        
    public static int secondMaxValue(int [] array) {
        int max = 0 ; 
        int counter = 0 ;
        //check first max
         for (int i = 0 ; i < array.length ; i++) {
            if (array[i] > max ){
            max = array[i] ; 
            counter = i ; 
         }
        }
         
        //create new array without first max value 
        int [] newArray = new int[ array.length ] ; 
        for ( int i = 0 ; i < array.length ; i++){
            if ( i != counter ){
            newArray [i] = array [i] ; 
            }
            else {
                 newArray [i] = 0 ;
            }
        }

        //check seconde max
        max = 0 ; 
         for (int i = 0 ; i < newArray.length ; i++) {
            if (newArray[i] > max ){
            max = newArray[i] ;  
         }
        }
        
        return max;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean sameNumbers = true ;
        boolean found = false;

        //if first array longest 
        if (array1.length > array2.length){
            for (int i = 0 ; i < array1.length ; i ++){

                for (int j = 0 ; j < array2.length ; j++){
                    found = false ;
                    if (array1 [i] == array2[j]){
                        found = true ;
                        break ; 
                    }
                }

                if (!found){
                sameNumbers = false ;
                break ; 
                }
                
            }
        }
        

        //if seconde array longest 
        else {
            for (int i = 0 ; i < array2.length ; i ++){
                found = false ; 
                for (int j = 0 ; j < array1.length ; j++){
                    if (array2 [i] == array1[j]){
                        found = true ;
                        break ; 
                    }
            }

            if (!found){
                sameNumbers = false ;
                break ;
                }

            }
        }

        return sameNumbers;
    }

    public static boolean isSorted(int [] array) {
       boolean sortedMax = true ;
       boolean sortedMin = true ;
       boolean ans = false ;

        for ( int i = 0 ; i < array.length-1 ; i++){
            if ( array[i+1] < array[i]) {
               sortedMax = false ;
               break ;   
            } 
        }

        for ( int i = 0 ; i < array.length-1 ; i++){
            if ( array[i+1] > array[i]) {
               sortedMin = false ; 
               break ; 
            } 
        }

        if (sortedMin || sortedMax) {
            ans = true ;
        }

        return ans;
    }

}
