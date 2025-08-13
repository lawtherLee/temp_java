// 计算二维数组中每行元素的总和，并找出总和最大的那一行及其对应的最大总和
public class TableTester {
    public static void main(String[] args) {
        int[][] myTable = {{23, 45, 65, 34, 21, 67, 78}, {46, 14, 18, 46, 98, 63, 88}, {98, 81, 64, 90, 21, 14, 23}, {54, 43, 55, 76, 22, 43, 33}};
        int sum, max, maxRow = Integer.MIN_VALUE;
        max = Integer.MIN_VALUE;

        for (int row = 0; row < myTable.length; row++) {
            sum = 0;
            for (int col = 0; col < 7; col++) {
                sum += myTable[row][col];
                if (sum > max) {
                    max = sum;
                    maxRow = row;
                }
            }

        }
        System.out.println("Row " + maxRow + " has the MAX sum of " + max);
    }
}
