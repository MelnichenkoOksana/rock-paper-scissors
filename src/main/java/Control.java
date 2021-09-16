import java.util.HashSet;

public class Control {

    public boolean checkingOdd(String[] a) {
        boolean flag = true;
        if (a.length % 2 == 0) {
            flag = false;
            System.out.println("You have entered even "+a.length+" of parametrs, " +
                    "the amount of the parameters must be odd (e.g. 3,5,7, etc.");
        }
        return flag;
    }
    public boolean checkingUniqueness (String[] a) {
        boolean flag = true;
        HashSet<String> hashSet = new HashSet<>();
        for (String elem:
             a) {
            hashSet.add(elem);
        }
        if (a.length != hashSet.size()) {
            flag = false;
            System.out.println("All parameter values must be unique");
        }
        return flag;
    }
    public boolean checkingForEmptiness(String[] a) {
        boolean flag = true;
        if (a.length <3) {
            flag = false;
            System.out.println("Enter at least three parameters to start the game");
        }
        return flag;
    }

}
