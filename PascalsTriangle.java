class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> pascalRows = new ArrayList<>();
        
        for(int i = 0; i< numRows; i++){
            List<Integer> pasRow = new ArrayList<>();
            
            if(i == 0 ){
                pasRow.add(1);
                pascalRows.add(pasRow);
            }
            else if(i==1){
                pasRow.add(1);
                pasRow.add(1);
                
                 pascalRows.add(pasRow);
            }
            else{
                 pasRow.add(1);
                List<Integer> prevRow = pascalRows.get(i-1);
                int size = prevRow.size();
                
                for(int j=0; j<size-1; j++){
                    pasRow.add(prevRow.get(j) + prevRow.get(j+1));
                   
                }
                pasRow.add(1);
                 pascalRows.add(pasRow);
            }
            
        }
        
        return pascalRows;
    }
}
