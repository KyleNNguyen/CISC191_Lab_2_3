package edu.sdccd.CISC191;

/**
 * CISC191 2.3 Multidimensional Arrays - Junior
 * @author Andrew Huang
 */


public class ArrayLab {
    /**
     * @param args command line parameters
     */
    public static void main(String[] args) {
        int[][] spreadsheet = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Max: " + max(spreadsheet));
        System.out.println("Sum of row 0: " + rowSum(spreadsheet, 0));
        System.out.println("Sum of col 0: " + columnSum(spreadsheet, 0));
        int[] rowSums = allRowSums(spreadsheet);
        for (int row = 0; row < rowSums.length; row++) {
            System.out.println("Sum of row " + row + ": " + rowSums[row]);
        }

    }

    /**
     * finds the greatest number
     * in the 2d array
     * @param a 2D array
     * @return the maximum value in
     * the 2d parameter array a
     */
    public static int max(int[][] a) {
        //set initial max value to the first
        //value in array
        int max = a[0][0];
        //go thru each index and compare to
    // see if the value is greater than
    //previous
        for(int[] row: a) {
            for(int cell: row) {
                if(cell > max)
                    max = cell;
            }
        }
        return max;
    }


    /**
     * adds up all the numbers in a row
     * @param a 2D array
     * @param x row index
     * @return the sum of the elements in Row x of a
     */
    public static int rowSum(int[][] a, int x) {
        int sumRows = 0;
        //check if x is in the bounds of a
        if(x<a.length){
            //add each value in that row
           for(int i=0; i<a[x].length; i++){
               sumRows+= a[x][i];
                }
            }
        return sumRows;
    }

    /**
     * @param a 2D array
     * @param x column index
     * @return the sum of the elements in Column x of a (careful with rows of different lengths!)
     */
    public static int columnSum(int[][] a, int x) {
        int sumCols = 0;
        //go thru each row and see if x is in bounds
        for (int[] row : a) {
            if (x < row.length) {
                //add all values in that colum
                sumCols += row[x];
            }
        }
        return sumCols;
    }

    /**
     * @param a 2D array
     * @return calculates the row sum for every row and returns each of the values in an array. Index i of the return array contains the sum of elements in row i.
     */
    public static int[] allRowSums(int[][] a) {
        return new int[]{0};
    }
}