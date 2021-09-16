import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String array[] = {"камень", "бумага", "ножницы"};

//        Rules rules = new Rules();
//        String[][] a = rules.fillingTable(array);
//
//        System.out.println(AsciiTable.getTable(a));
        ComputerTurn computerTurn = new ComputerTurn();
        String key = computerTurn.bytesToHex(computerTurn.createKey());
        System.out.println("key:" + key);

        int number = computerTurn.numberSelection(array.length);
        System.out.println("number: " + number + " : " + array[number - 1]);

        String hmac = computerTurn.bytesToHex(computerTurn.calcHmacSha256(computerTurn.createKey(), number));
        System.out.println("HMAC: " + hmac);
    }

}
