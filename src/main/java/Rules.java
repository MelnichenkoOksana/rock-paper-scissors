import com.github.freva.asciitable.AsciiTable;

public class Rules {

   private String ruleTable[][];

    public Rules() {
    }

    public String[][] fillingTable(String[] array) {
        ruleTable = new String[array.length + 1][array.length + 1];
        ruleTable [0][0]="\\User\n PC\\\n";
        for (int i = 1; i < array.length + 1; i++) {
            ruleTable[0][i] = ruleTable[i][0] = array[i - 1];
            ruleTable[i][i] = "DRAW";
            for (int j = 1; j < array.length + 1; j++) {
                if ((i > j) && (i <= (j + array.length / 2)) || ((i < j) && (i < (j - array.length / 2)))) {
                    ruleTable[i][j] = "LOSE";
                } else if (i != j) {
                    ruleTable[i][j] = "WIN";
                }
            }
        }
        return ruleTable;
    }

    public static void printTable(String[][] a) {
        System.out.println(AsciiTable.getTable(a));
    }

}

