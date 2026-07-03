public class mat_multiplication{
public static void main(String[] args){

    int [] [] mat1 = { 
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12}
    };

    int [][] mat2 ={
        {8,15},
        {16,16},
        {16,28},
        {4,52}
    } ;

    int mat1row= mat1.length;
   int mat1col= mat1[0].length;
   int mat2row= mat2.length;
  int  mat2col= mat2[0].length;

    int[][] mat3 = new int[mat1row][mat2col];

    for(int i =0; i<mat3.length; i++){
        for(int j=0; j<mat3[0].length; j++){
            int sum=0;
            for(int k=0; k<mat2row; k++){
                sum+=(mat1[i][k] * mat2[k][j]);
            }
            mat3[i][j]=sum;
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