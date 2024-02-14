package org.example;

public class TicTacToeChecker {

    public static int solve(int[][] nums) {

        int first = nums[0][0];
        int second = nums[0][1];
        int third = nums[0][2];

        int topLeft = nums[0][0];
        int bottomLeft = nums[2][0];
        int topRight = nums[0][2];
        int bottomRight = nums[2][2];

        int middle = nums[1][1];

        boolean hasEmptySpace = false;

        if (topLeft == middle && middle == bottomRight && topLeft != 0) {
            return middle;
        }

        if (topRight == middle && middle == bottomLeft && topRight != 0) {
            return middle;
        }

        if (first == second && second == third && first != 0) {
            return first;
        }

        if (first == 0 || second == 0 || third == 0) {
            hasEmptySpace = true;
        }

        for (int i = 1; i < nums.length; i++) {

            if (nums[i][0] == nums[i][1] && nums[i][1] == nums[i][2] && nums[i][0] != 0){

                return nums[i][0];

            }

            for (int j = 0; j < nums[i].length; j++) {

                if (nums[i][j] == 0){
                    hasEmptySpace = true;
                }


                if (j == 0) {
                    if (first != 0) {
                        if (nums[i][j] != first) {
                            System.out.println("Nums i j is " + nums[i][j]);
                            System.out.println("First is " + first);

                            first = 0;
                        }
                    }

                }

                if (j == 1) {
                    if (second != 0) {
                        if (nums[i][j] != second) {
                            System.out.println("Nums i j is " + nums[i][j]);
                            System.out.println("Second is " + second);

                            second = 0;
                        }
                    }

                }

                if (j == 2) {
                    if (third != 0) {
                        if (nums[i][j] != third) {
                            System.out.println("Nums i j is " + nums[i][j]);
                            System.out.println("Third is " + third);

                            third = 0;
                        }
                    }

                }
            }
        }


        if (first != 0) {
            return first;
        }
        if (second != 0) {
            return second;
        }
        if (third != 0) {
            return third;
        }

        if (hasEmptySpace) {
            return -1;
        } else {
            return 0;
        }
    }

}