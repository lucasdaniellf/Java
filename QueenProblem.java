public class QueenProblem {
    
    private int[][] tabuleiro(int n) {
        return new int[n][n];
    }

    private static boolean isSafe(int[][] tabuleiro, int i, int j, int n){

        int sumRow = 0;
        for(var col : tabuleiro[i]) {
            sumRow += col;
            if(sumRow > 1) return false;
        }

        int sumCol = 0;
        for (var row : tabuleiro){
            sumCol += row[j];
            if (sumCol > 1) return false;
        }

        int sumDiagEsquerda = 0;
        for(int x = i, y = j; x >= 0 && y >= 0; x--, y-- ) {
            sumDiagEsquerda += tabuleiro[x][y];
            if (sumDiagEsquerda > 1) return false;
        }
        
        int sumDiagDireita = 0;
        for(int x = i, y = j; x >= 0 && y <= n-1; x--, y++ ) {
            sumDiagDireita += tabuleiro[x][y];
            if (sumDiagDireita > 1) return false;
        }

        return true;
    }

    public static void mostrarTabuleiro(int[][] tabuleiro){
        for(int[] i : tabuleiro) {
            for(int j : i) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    public static boolean solveNQueen(int tabuleiro[][], int row, int col, int n)
    {
        tabuleiro[row][col] = 1;
        mostrarTabuleiro(tabuleiro);
        System.out.println("");

        if (isSafe(tabuleiro, row, col, n)){      
            if(row == n - 1) {
                return true;
            } 
            if (solveNQueen(tabuleiro, row+1, 0, n))
            {
                return true;
            }  
        }
        tabuleiro[row][col] = 0;

        if(col == n - 1) {
            return false;
        } else {
            if(solveNQueen(tabuleiro, row, col + 1, n))
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        QueenProblem q = new QueenProblem();
        var tabuleiro = q.tabuleiro(8);
    
        solveNQueen(tabuleiro, 0, 0, 8);
    }
}
