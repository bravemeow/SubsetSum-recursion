public class SubsetSum {
    // instance variables

    int[] array = new int[]{1,2,3,4,5,6,7};
    int targetSum = 9;
    int index = 0;
    public SubsetSum() {
        // TODO:
        if(isSum(array, targetSum)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }

    public boolean isSum(int[] array, int targetSum) {
        // base-case: found the subset; targetSum = 0
        if (targetSum == 0){
            return true;
        }
        // base-case2: when array is empty or targetSum < 0
        if (array.length == 0 || targetSum < 0) {
            return false;
        }

        // TODO: implement the logic to find subset sum.
        return false;
    }

    public static void main(String[] args) {
        SubsetSum ss = new SubsetSum();
    }
}
