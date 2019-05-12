import java.util.Random;

public class Referee {

    private Playeble pX;
    private Playeble pO;
    private Playboard board;

    public Referee(Playboard board, Playeble a, Playeble b){
        this.board = board;
        Random r = new Random();
        if(r.nextBoolean()){
            this.pX = a;
            a.setSymbol(Symbol.X);
            this.pO = b;
            b.setSymbol(Symbol.O);
        } else {
            this.pX = b;
            b.setSymbol(Symbol.X);
            this.pO = a;
            a.setSymbol(Symbol.O);
        }

    }



    public void start(){
        int contor = 0;


        //1
        Playeble currentPlayer = pX;
        System.out.println(board);
        System.out.println(pX + " Este la mutare!");
        int [] coord = currentPlayer.getCoord();
        if (board.isEmpty(coord)){
            board.fill(coord,currentPlayer.getSymbol());
        }
        contor++;

        //2
        Playeble currentPlayer2 = pO;
        System.out.println(board);
        System.out.println(pO + " Este la mutare!");
        int [] coord2 = currentPlayer2.getCoord();
        if (board.isEmpty(coord2)){
            board.fill(coord2,currentPlayer2.getSymbol());
        }
        contor++;

        //3
        System.out.println(board);
        System.out.println(pX + " Este la mutare!");
        int [] coord3 = currentPlayer.getCoord();
        if (board.isEmpty(coord3)){
            board.fill(coord3,currentPlayer.getSymbol());
        }
        contor++;

        //4
        System.out.println(board);
        System.out.println(pO + " Este la mutare!");
        int [] coord4 = currentPlayer2.getCoord();
        if (board.isEmpty(coord4)){
            board.fill(coord4,currentPlayer2.getSymbol());
        }
        contor++;
        if (board.getWinner()== Symbol.X)
            System.out.println("the winner is x");


        //5
        System.out.println(board);
        System.out.println(pX + " Este la mutare!");
        int [] coord5 = currentPlayer.getCoord();
        if (board.isEmpty(coord5)){
            board.fill(coord5,currentPlayer.getSymbol());
        }
        contor++;
        if (board.getWinner()== Symbol.X)
            System.out.println("the winner is x");



        //6
        System.out.println(board);
        System.out.println(pO + " Este la mutare!");
        int [] coord6 = currentPlayer2.getCoord();
        if (board.isEmpty(coord6)){
            board.fill(coord6,currentPlayer2.getSymbol());
        }
        contor++;
        if (board.getWinner()== Symbol.X)
            System.out.println("the winner is x");
        if (board.getWinner()== Symbol.O)
            System.out.println("the winner is o");


        //7
        System.out.println(board);
        System.out.println(pX + " Este la mutare!");
        int [] coord7 = currentPlayer.getCoord();
        if (board.isEmpty(coord7)){
            board.fill(coord7,currentPlayer.getSymbol());
        }
        contor++;
        if (board.getWinner()== Symbol.X)
            System.out.println("the winner is x");
        if (board.getWinner()== Symbol.O)
            System.out.println("the winner is o");


        //8
        System.out.println(board);
        System.out.println(pO + " Este la mutare!");
        int [] coord8 = currentPlayer2.getCoord();
        if (board.isEmpty(coord8)){
            board.fill(coord8,currentPlayer2.getSymbol());
        }
        contor++;
        if (board.getWinner()== Symbol.X)
            System.out.println("the winner is x");
        if (board.getWinner()== Symbol.O)
            System.out.println("the winner is o");


        //9
        System.out.println(board);
        System.out.println(pX + " Este la mutare!");
        int [] coord9 = currentPlayer.getCoord();
        if (board.isEmpty(coord9)){
            board.fill(coord9,currentPlayer.getSymbol());
        }

        if (board.getWinner()== Symbol.X)
            System.out.println("the winner is x");
        if (board.getWinner()== Symbol.O)
            System.out.println("the winner is o");
        if (board.getWinner()== Symbol.I)
            System.out.println("we have a drow!");
    }







}
