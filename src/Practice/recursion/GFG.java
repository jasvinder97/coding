package Practice.recursion;

// Java program to find Minimum
// number of jumps to reach end

public class GFG {
    public static int minJumps(int[] arr) {
        int totalJumps = 0;
        int destination = arr.length - 1;
        int coverage = 0; // far i can go
        int lastJumpIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            coverage = Math.max(coverage, arr[i]+i);
            if (i == lastJumpIndex) {
                lastJumpIndex = coverage;
                totalJumps++;
                if (coverage >= destination) {
                    return totalJumps;
                }
            }
        }
        return totalJumps;

    }

    public static void main(String[] args) {
//        int[] arr = {2, 3, 1, 1, 4};
//        System.out.println("Minimum number of jumps to reach end: " + minJumps(arr)); // Output: 2

        int[] arr2 = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println("Minimum number of jumps to reach end: " + minJumps(arr2)); // Output: 3
    }
}



