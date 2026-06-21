    
    //Doubling the primary diagonal values and halfing the rest values

    public class diagonalvaluesManupulation {
      public static void main(String args[]) {
       int [] [] arr1 = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
      
        }; 
       
    
        
       int row= arr1.length;
        int col= arr1[0].length;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i==j){
                    
                    arr1[i][j]*=2;
                }
                
                else{
                    
                    arr1[i][j]/=2;
                }
                
            } //inner loop
            
        } //outer loop


// printing an array

for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
        System.out.print( arr1[i][j] + " ");
       }

       System.out.println();
       }; 

      }
    }