public class Search {
    
    /*  
        Takes a sorted integer array and number to find and 
        returns index of number in array or -1 if not present. 
    */
    public int binarySearch(int[] numbers, int find) {
        int high = numbers.length-1;
        int low = 0;
        int med = 0;
        while(low != high) {
            med = (high + low)/2;             //calculate new middle
            if(numbers[med] == find) return med;
            if(numbers[med] > find) high = med;     //only search left half of array as mid is to large
            else low = med;                         //only search right half of array as mid is to small
        }
        return -1;
    }

    /*  
        Takes an integer array and number to find and 
        returns index of number in array or -1 if not present. 
    */
    public int linearSearch(int[] numbers, int find) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == find) return i;
        }
        return -1;
    }
}