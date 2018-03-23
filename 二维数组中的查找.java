public class Solution {
    public boolean Find(int target, int [][] array) {
        int row = array.length-1;
        int col = 0;
        while((row>=0)&&(col<array[0].length)){
            if(target<array[row][col]){
                row--;
            }else if(target>array[row][col]){
                col++;
            }else{
                return true;
            }
        }
        return false;
    }
}