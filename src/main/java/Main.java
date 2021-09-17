import com.github.freva.asciitable.AsciiTable;

import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String array[] = {"11", "22", "33"};

        Play play = new Play();
        play.play(array);

//            проверка правил
//        Rules rules = new Rules();
//        String[][] a = rules.fillingTable(array);
//
//        System.out.println(AsciiTable.getTable(a));

        // проверка для хода компьютера
//        ComputerTurn computerTurn = new ComputerTurn();
//        String key = computerTurn.bytesToHex(computerTurn.createKey());
//        System.out.println("key:" + key);
//
//        int number = computerTurn.numberSelection(array.length);
//        System.out.println("number: " + number + " : " + array[number - 1]);
//
//        String hmac = computerTurn.bytesToHex(computerTurn.calcHmacSha256(computerTurn.createKey(), number));
//        System.out.println("HMAC: " + hmac);
    }

}
