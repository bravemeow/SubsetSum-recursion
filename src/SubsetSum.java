import java.util.LinkedList;

/**
 * Subset Sum Problem: finding all subsets that sum to the target sum.
 */
public class SubsetSum {
    // instance variables
    int[] array = new int[]{1,2,3,4,5,6,7};
    int targetSum = 9;
    LinkedList<Integer> list = new LinkedList<>();
    LinkedList<LinkedList<Integer>> subsets = new LinkedList<>();

    public SubsetSum() {
        findSubsets(array, 0, targetSum, list);
        System.out.println("Subsets: "+subsets);
        System.out.println("Count of subsets: "+subsets.size());
    }

    private void findSubsets(int[] array, int index, int targetSum, LinkedList<Integer> currentList) {
        // Base-Case: found the subset; targetSum = 0
        if (targetSum == 0){
            subsets.add(new LinkedList<>(currentList)); // add the subset found.
            return;
        }
        // if index is out of bound or targetSub is negative, then return.
        if (index >= array.length || targetSum < 0){
            return;
        }
        int currentValue = array[index];
        if (array[index] > targetSum) {
            return;
        }

        currentList.add(currentValue);  // store data in temp linkedList
        findSubsets(array, index+1, targetSum-currentValue, currentList);

        currentList.removeLast();   // pop-out and skip current value, then just move to next index.
        findSubsets(array, index+1, targetSum, currentList);
    }

    public static void main(String[] args) {
        SubsetSum ss = new SubsetSum();
    }
}
