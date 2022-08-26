public class Level1 {
    public static void MatrixTurn(String[] matrix, int x, int y, int t) {
        char[][] work = new char[x][y];
        char[][] temp = new char[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                work[i][j] = matrix[i].charAt(j);
                temp[i][j] = work[i][j];
            }
        }

        int xLen = x - 1;
        int yLen = y - 1;

        for (int step = 0; step < t; step++) {
            int i;
            int j;

            for (int count = 0; count < x / 2; count++) {

                for (j = count; j < yLen - count; j++) {
                    work[count][j + 1] = temp[count][j];
                }

                for (i = count; i < xLen - count; i++) {
                    work[i + 1][j] = temp[i][j];
                }

                for (j = yLen - count; j > count; j--) {
                    work[i][j - 1] = temp[i][j];
                }

                for (i = xLen - count; i > count; i--) {
                    work[i - 1][j] = temp[i][j];
                }
            }

            for (i = 0; i < x; i++) {
                for (j = 0; j < y; j++) {
                    temp[i][j] = work[i][j];
                }
            }
        }

        for (int i = 0; i < x; i++) {
            matrix[i] = "";

            for (int j = 0; j < y; j++) {
                matrix[i] += work[i][j];
            }
        }
    }
}


