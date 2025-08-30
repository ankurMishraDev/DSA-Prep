package Arrays.assignmentProblems;

public class matrixDiagonal {
    public static void main(String[] args) {
        int[][] mat = {{7, 3, 1, 9}, {3, 4, 6, 9}, {6, 9, 6, 6}, {9, 5, 8, 5}};
        int i=0, j, k, l, sum = 0;
//        if(mat.length%2==0){
//        for (i = 0, k = mat.length-1; i < mat.length && k >= 0; i++, k--) {
//            for (j = 0, l = mat.length-1 ; j < mat.length && l >= 0; j++, l--) {
//                if (i == j) {
//                    sum = sum + mat[i][j];
//                }
//                if (i == l) {
//                    sum = sum + mat[k][l];
//                }
//            }
//        }
//    }else {
//            for (i = 0, k = mat.length-1; i < mat.length && k >= 0; i++, k--) {
//                for (j = 0, l = mat.length-1 ; j < mat.length && l >= 0; j++, l--) {
//                    if (i == j) {
//                        sum = sum + mat[i][j];
//                    }
//                    if (i == l) {
//                        sum = sum + mat[k][l];
//                    }
//                    if(i==j&&i==l){
//                        sum = sum - mat[k][l];
//                    }
//                }
//            }
//        }
        while (i < mat.length)
        {
            sum += mat[i][i];
            mat[i][i++] = 0;
        }
        i = 0;
        while (i < mat.length)
            sum += mat[i][mat.length - 1 - i++];
        System.out.println(sum);
    }
}
