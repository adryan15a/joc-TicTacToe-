import java.util.Scanner;

public class HumanPlayer implements Playeble {

    @Override
    public String toString() {
        return nume + " " + s;
    }

    private String nume;
    private Scanner sc;
    private Symbol s;

    public HumanPlayer(String nume, Scanner sc){
        this.nume = nume;
        this.sc = sc;
    }

    public int[] getCoord(){
        int row = sc.nextInt();
        int col = sc.nextInt();
        return new int[]{row,col};
    }

    public Symbol getSymbol() {
        return s;
    }

    public void setSymbol(Symbol s) {
        this.s = s;
    }
}
