class Solution {
    private int n;
    public boolean checkValidGrid(int[][] grid) {

        if(grid[0][0] != 0 ){
            return false;
        }
        n = grid.length;
        return helper(grid , 0 , 0 , 1);
    }

    private int[][] dir = {{2,1} , {2,-1} ,{-2,1} , {-2,-1} ,{1,2} ,{-1,2},{-1,-2},{1,-2}};

    private boolean helper(int[][] grid , int i , int j , int cell){

        for (int [] d : dir){
            int newI = i + d[0] , newJ = j + d[1] ;
            if(newI >=0 && newI <n && newJ >=0 && newJ<n && grid[newI][newJ] == cell){
                return helper(grid ,newI , newJ , cell+1);
            }
        }
        return cell == n*n;
    }
}
