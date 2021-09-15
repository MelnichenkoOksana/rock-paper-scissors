import java.util.HashSet;

public class Control {
    public boolean checkingOdd(String[] a) {
        boolean flag = true;
        if (a.length % 2 == 0) {
            flag = false;
            System.out.println("Enter an odd number of parameters");
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
