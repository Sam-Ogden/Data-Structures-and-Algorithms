public class Sort {

    private int[] list;
    private int[] tmp;

    public int[] mergeSort(int[] list) {
        this.list = list;
        this.tmp = new int[list.length];
        mergeSort(0, list.length - 1);
        return list;
    }

    private void mergeSort(int low, int high) {
        if(low == high) return ; //base case, only 1 element to be sorted
        else {
            int middle = low + (high - low) / 2; // Get index middle element
            mergeSort(low, middle);         // Sort left side 
            mergeSort(middle + 1, high);    // Sort right side 
            merge(low, middle, high);       // merge the sorted left and right sides
        }
    }

    private void merge(int low, int middle, int high) {

        // put left and right into tmp array
        for (int i = low; i <= high; i++) {
            tmp[i] = list[i];
        }

        //i tracks left side, j tracks right side, k tracks original array positions
        int i = low, j = middle + 1, k = low; 
        // Check front of left and right array and put back into original array in order
        while (i <= middle && j <= high) {
            if (tmp[i] <= tmp[j]) {
                list[k] = tmp[i];
                i++;
            } else {
                list[k] = tmp[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            list[k] = tmp[i];
            k++;
            i++;
        }
    }
}