package practice;

import util.ArrayUtils;

public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        char[] words = word.toCharArray();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean found = searchChar(i, j, words, 0, board);
                if (found) return true;
            }
        }
        return false;

    }

    public static boolean searchChar(int i, int j, char[] word, int current, char[][] board) {
        if (current == word.length)
            return true;

        if (i < 0 || j < 0 || i > board.length - 1 || j > board[0].length - 1 || board[i][j] == '#')
            return false;


        if (board[i][j] == word[current]) {
            board[i][j] = '#';
            return searchChar(i + 1, j, word, current + 1, board) ||
                    searchChar(i, j + 1, word, current + 1, board) ||
                    searchChar(i - 1, j, word, current + 1, board) ||
                    searchChar(i, j - 1, word, current + 1, board);
        }

        return false;
    }

    public static void main(String[] args) {
        char[][] board = ArrayUtils.parse2DCharArray("[['a','b'],['c','d']]");
        String word = "bacd";
        System.out.println(exist(board, word));
    }
}
