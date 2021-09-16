import com.github.freva.asciitable.AsciiTable;

public class Rules {

    private String[] keys;
    private String ruleTable[][];

    public Rules() {
    }

    public String[][] fillingTable(String[] keys) {
        ruleTable = new String[keys.length + 1][keys.length + 1];
        for (int i = 1; i < keys.length + 1; i++) {
            ruleTable[0][i] = ruleTable[i][0] = keys[i - 1];
            ruleTable[i][i] = "DRAW";
            for (int j = 1; j < keys.length + 1; j++) {
                if ((i > j) && (i <= (j + keys.length / 2)) || ((i < j) && (i < (j - keys.length / 2)))) {
                    ruleTable[i][j] = "LOSE";
                } else if (i != j) {
                    ruleTable[i][j] = "WIN";
                }
            }
        }
        return ruleTable;
    }

    public void printTable(String[][] a) {
        System.out.println(AsciiTable.getTable(a));
    }

    public String[] getKeys() {
        return keys;
    }

    public void setKeys(String[] keys) {
        this.keys = keys;
    }

    public String[][] getRuleTable() {
        return ruleTable;
    }

    public void setRuleTable(String[][] ruleTable) {
        this.ruleTable = ruleTable;
    }
}

