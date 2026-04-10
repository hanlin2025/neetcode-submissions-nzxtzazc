class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean valid = true;

        Map<Integer, Set<Character>> column = new HashMap<>();
        Set<Character> first3x3 = new HashSet<>();
        Set<Character> second3x3 = new HashSet<>();
        Set<Character> third3x3 = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            
            // reset from 3th row and 6th row
            if (i == 3 || i == 6) {
                first3x3.clear();
                second3x3.clear();
                third3x3.clear();
            }

            Set<Character> row = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                // 1. check row repeat
                if (row.contains(board[i][j])) {    // 1.1 repeated
                    valid = false;
                    break;
                } else {                            // 1.2 no-repeated
                    row.add(board[i][j]);
                }

                // 2. check column repeat
                if (column.containsKey(j) && column.get(j).contains(board[i][j])) {  // 2.1 column repeated
                    valid = false;
                    break;
                } else {
                    if (column.containsKey(j)) {       // 2.2 column has row i
                        column.get(j).add(board[i][j]);
                    } else {                        // 2.3 column not has row i
                        HashSet<Character> columnSet = new HashSet<>();
                        columnSet.add(board[i][j]);
                        column.put(j, columnSet);
                    }
                }

                // 3. check first3x3 repeat
                if (first3x3.contains(board[i][j]) && 
                    j >= 0 && j < 3) {    // 3.1 repeated
                    valid = false;
                    break;
                } else {                            // 3.2 no-repeated
                    if (j >= 0 && j < 3) {
                        first3x3.add(board[i][j]);
                    }
                }

                // 4. check second3x3 repeat
                if (second3x3.contains(board[i][j]) && 
                    j >= 3 && j < 6) {    // 4.1 repeated
                    valid = false;
                    break;
                } else {                            // 4.2 no-repeated
                    if (j >= 3 && j < 6) {
                        second3x3.add(board[i][j]);
                    }
                }

                // 5. check third3x3 repeat
                if (third3x3.contains(board[i][j]) && 
                    j >= 6 && j < 9) {    // 5.1 repeated
                    valid = false;
                    break;
                } else {                            // 5.2 no-repeated
                    if (j >= 6 && j < 9) {
                        third3x3.add(board[i][j]);
                    }
                }
            }

            // if repeat, stop
            if (!valid) {
                break;
            }
        }

        return valid;
    }
}
