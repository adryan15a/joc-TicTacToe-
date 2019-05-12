public class BotPlayer implements Playeble {

    private String name;

    public BotPlayer(String name){
        this.name = name;
    }

    public int[] getCoord() {
        return new int[0];
    }

    public Symbol getSymbol() {
        return null;
    }

    public void setSymbol(Symbol s) {

    }
}
