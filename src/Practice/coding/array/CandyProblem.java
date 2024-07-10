package Practice.coding.array;

public class CandyProblem {
    public static void main(String[] args) {
        System.out.println(countWays(4));
    }

    static int getMaxCandies(int amount) {
        int totalCandy = amount / 2;

        return totalCandy + getCandyFromWrapper(totalCandy, 4);
    }

    static int getCandyFromWrapper(int wrapper, int wrapperRequired) {
        int newCandy;
        if (wrapper < wrapperRequired) {
            return 0;
        } else {
            newCandy = wrapper / wrapperRequired;
            return newCandy + getCandyFromWrapper(newCandy + wrapper % wrapperRequired, wrapperRequired);
        }
    }

    //
    static int countWays(int s) {
        if (s <= 1) {
            return 1;
        } else
            return countWays(s - 1) + countWays(s - 2);
    }
}

