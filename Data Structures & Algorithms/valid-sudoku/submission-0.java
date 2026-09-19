class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows=new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                if(board[row][col]=='.') continue;
                char value=board[row][col];

                int box=(row/3)*3+(col/3);
                if(rows[row].contains(value) || cols[col].contains(value) || boxes[box].contains(value)) return false;
                rows[row].add(value);
            cols[col].add(value);
            boxes[box].add(value);
            }
            
        }
        

        return true;
        
    }
}
