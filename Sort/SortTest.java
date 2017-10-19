import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {

        Sort s = new Sort();
        if(mergeSortTest(s)) print("mergeSort   OK");
        else print("mergeSort FAIL");

    }

    private static boolean mergeSortTest(Sort s) {
        int[] test = {9,8,7,65,2,1,5,0,-1};
        int[] answer = s.mergeSort(test);

        System.out.println(Arrays.toString(answer));

        for(int i = 0; i < answer.length; i++) {
            if(i == answer.length-1) return true;
            else if(answer[i] < answer[i+1]) continue;
            return false;            
        }
        return false;        
    }

    private static void print(Object a) {
        System.out.println(a);
    }
}