 public class mat_elem_sum{
    public static void main (String[] args){

        int [] [] mat1 = { 
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        int mat1row= mat1.length;
    int mat1col= mat1[0].length;
    
    int sum=0;
    
    for(int i =0; i<mat1row; i++){
        for(int j=0; j<mat1col; j++){
            sum+=mat1[i][j];
        }
    }
    System.out.println(sum);
    }
 }
 
            