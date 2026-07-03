    public class mat_transpose{
    public static void main(String[] args){

        int [] [] mat1 = { 
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        int mat1row= mat1.length;
    int mat1col= mat1[0].length;

    int[][] mat3 = new int[mat1col][mat1row];

    for(int i =0; i<mat1row; i++){
        for(int j=0; j<mat1col; j++){
            mat3[j][i]= mat1[i][j];
        }
    }
    for(int i =0; i<mat3.length; i++){
        for(int j=0; j<mat3[0].length; j++){
            System.out.print(mat3 [i][j] + " ");
        }
System.out.println();
    }
}
    }