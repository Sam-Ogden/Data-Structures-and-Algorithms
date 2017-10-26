/*
    Returns the max value you can get with weight limit W.
    input: n items with weight Wi and value Vi.
*/
public class Knapsack {
    static int[] values = new int[] {894, 260, 392, 281, 27};
    static int[] weights = new int[] {8, 6, 4, 0, 21};
    static int W = 30;
    
    public static void main(String[] args) {
      System.out.println(knapsack(values.length - 1, W));
    }
    
    private static int knapsack(int i, int W) {
        //no more items to check or no more weight
        if (i < 0 || W == 0) {
            return 0;
        }
        //weight of current item to big for left over weight
        //return the next item down with left over weight
        if (weights[i] > W) {
            return knapsack(i-1, W);
        } else {
            /*  
                Take max of: the next item back with left over weight (exclude curr item) or 
                the previous one back with weight - current items weight (include curr item)
            */
            return Math.max(knapsack(i-1, W), knapsack(i-1, W - weights[i]) + values[i]);
        }
    }
}
