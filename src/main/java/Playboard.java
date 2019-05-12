public class Playboard {


    private Symbol[][] matrix;


    @Override
    public String toString() {
        String txt = "";
        for (int row = 0; row <3; row++) {
            for (int col = 0; col <3; col++){
                txt = txt + matrix[row][col] + "  ";
            }
            txt = txt + "\n";
        }
        return txt;
    }

    public Playboard() {
        this.matrix = new Symbol[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                matrix[row][col] = Symbol.I;
            }
        }
    }

    public boolean isEmpty(int[] coord) {
        int row = coord[0];
        int col = coord[1];
        return matrix[row][col] == Symbol.I;
    }

    public void fill(int[] coord, Symbol symbol) {
        int row = coord[0];
        int col = coord[1];
        matrix[row][col] = symbol;
    }

    public Symbol getWinner(){
        Symbol s = Symbol.I;
        for (int i = 0; i <3; i++) {
            if ((matrix[i][0] == matrix[i][1]) && (matrix[i][1] == matrix[i][2])) {
                s = matrix[i][0];
            }
        }
            for (int j = 0; j <3; j++) {
                if ((matrix[j][0]==matrix[j][1])&&(matrix[j][1]==matrix[j][2])){
                    s=matrix[j][0];
                }

            }if ((matrix[0][0]==matrix[1][1])&&(matrix[1][1]==matrix[2][2])){
                s=matrix[0][0];
            }
            if ((matrix[0][2]==matrix[1][1])&&(matrix[1][1]==matrix[2][0])){
                s=matrix[0][2];
            }
        return s;
    }
}
