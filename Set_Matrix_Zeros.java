class Solution {
    public void setZeroes(int[][] matrix) {
        int r_size = matrix.length;
        int c_size = matrix[0].length;
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        
        for(int i=0; i<r_size; i++){
            for(int j=0; j<c_size; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        
        for(int i=0; i< r_size; i++){
            for(int j=0; j<c_size; j++){
                if(rows.contains(i) || cols.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
    
}
