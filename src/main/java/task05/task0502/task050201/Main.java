package task05.task0502.task050201;

import java.io.File;

public class Main {
    public static void main(String args[]) {

        getList("c:\\");

    }

    private static void getList(String s) {
        File f = new File(s);
        File[] fl = f.listFiles();
        for (int i = 0; i < fl.length; i++) {
            if (fl[i].isDirectory() && !fl[i].isHidden()) {
                System.out.println(fl[i].getAbsolutePath());
                getList(fl[i].getAbsolutePath());
            } else {
                System.out.println(fl[i].getName());
            }
        }
    }

}
