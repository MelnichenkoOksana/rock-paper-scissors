import java.util.Scanner;

public class Play {
    public static void play(String[] array) {
        Control.MainControl(array);

        ComputerTurn newTurn = new ComputerTurn();

        String kay = newTurn.bytesToHex(newTurn.createKey());
        int computerNum = newTurn.numberSelection(array.length);
        String hmac = newTurn.bytesToHex(newTurn.calcHmacSha256(newTurn.createKey(), computerNum));

        Rules rules = new Rules();
        String[][] rulesTable = rules.fillingTable(array);

        System.out.println(hmac);

        Play.printMenu(array);
        String playerNum = playerSelection();

        playerInputValidation (playerNum,computerNum, rulesTable, array);
        System.out.println("HMAC key: "+ kay);



    }


    public  static  void  playerInputValidation (String s,int computerNum, String[][]rulesTable, String [] array){
        boolean flag = true;
        while (flag) {
            if (s.equals("?")){
                Rules.printTable(rulesTable);
                Play.printMenu(array);  // дублирование?
                s= playerSelection();
            } else if (s.equals("0")) {
                System.exit(0);
                flag = false;
            } else if ((1<=Integer.parseInt(s))&&(Integer.parseInt(s)<= array.length)) {
                Play.printMoves(array, Integer.parseInt(s), computerNum);
                Play.selectionWinner(rulesTable, Integer.parseInt(s), computerNum);
                flag = false;
            } else {
                Play.printMenu(array);  // дублирование??
                s= playerSelection();
            }

        }
    }

 public  static void printMoves (String[] array, int playerNum, int computerNum){
     System.out.println("Your move: "+ array[playerNum-1]);
     System.out.println("Computer move:" + array[computerNum-1]);
 }

    public static String playerSelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your move: ");
        String number = scanner.nextLine();
        System.out.println();
        return number;
    }

    public static void printMenu(String[] array) {
        for (int i = 1; i <= array.length; i++) {
            System.out.print(i + " - ");
            System.out.println(array[i - 1]);
        }

        System.out.println("0 - exit\n" +
                "? - help\n");
    }

    public static void selectionWinner(String[][] rulesTable, int playerNum, int computerNum) {

        if (rulesTable[computerNum][playerNum] == "WIN") {
            System.out.println("Congratulations! You won!");
        }
        if (rulesTable[computerNum][playerNum] == "LOSE") {
            System.out.println("Bad luck. The computer won.");
        } else {
            System.out.println("This time it's a draw");
        }
    }
}
