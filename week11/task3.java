public class task3 {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];


        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = (int)(Math.random() * 20);
            }
        }


        System.out.println(matrix[0][0]);
    }
}