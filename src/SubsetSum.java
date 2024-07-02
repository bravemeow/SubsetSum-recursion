import java.util.LinkedList;

public class SubsetSum {
    // instance variables

    int[] array = new int[]{1,2,3,4,5,6,7};
    int targetSum = 9;
    LinkedList<Integer> list = new LinkedList<>();
    public SubsetSum() {
        // TODO:
        if(isSum(array, 0, targetSum)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }

    public boolean isSum(int[] array, int index, int targetSum) {
        // base-case: found the subset; targetSum = 0
        if (targetSum == 0){
            return true;
        }
        // base-case2: when array is empty or targetSum < 0
        if (array.length == 0 || targetSum < 0) {
            return false;
        }
        if ( index >= array.length) {
            return false;
        }


        return false;
        // TODO: implement the logic to find subset sum.
    }

    public static void main(String[] args) {
        SubsetSum ss = new SubsetSum();
    }
}
