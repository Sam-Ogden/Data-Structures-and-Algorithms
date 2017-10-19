public class SearchTest {
    
    public static void main(String[] args) {
        Search s = new Search();

        if(binarySearchTest(s)) print("BinarySearch     OK");
        else                    print("BinarySearch    FAIL");
        if(linearSearchTest(s)) print("linearSearch     OK");
        else                    print("linearSearch    FAIL");
    }

    private static boolean binarySearchTest(Search s) {
        int[] test = {2,4,5,8,10,12,121};
        int index = s.binarySearch(test, 12);
        if(index == 5) return true;
        return false;
    }

    private static boolean linearSearchTest(Search s) {
        int[] test = {111,2,4,5,8,1,10,12,121,0};
        int index = s.linearSearch(test, 5);
        if(index == 3) return true;
        return false;
    }

    private static void print(Object a) {
        System.out.println(a);
    }
}