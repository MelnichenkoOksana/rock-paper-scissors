import com.github.freva.asciitable.AsciiTable;
//import AsciiTable.java;

public class Main {
    public static void main(String[] args) {

        String array[] = {"камень", "бумага", "ножницы"};
        Rules rules = new Rules();
        String[][] a = rules.fillingTable(array);

        System.out.println(AsciiTable.getTable(a));
    }

}
