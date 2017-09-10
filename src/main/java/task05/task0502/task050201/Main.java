package task05.task0502.task050201;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        final String[] menuList = {"Main menu:" +
                "\n[1]-Parse for default DIR and default OUTPUT file",
                "\n[2]-Parse for specif. DIR and default OUTPUT file",
                "\n[3]-Parse for specif. DIR and specif. OUTPUT file",
                "\n[0]-Exit"
        };
        final String strPath = "resources\\_dir_for_Task0502";
        File src = new File(strPath);
        File dst = new File("resources\\results.txt");
        if (dst.exists()) {
            dst.delete();
        }

        Menu mainMenu = new Menu(menuList);

        while (true) {
            int choice = mainMenu.userChoice();
            switch (choice) {
                case 1:
                    System.out.printf("DIR (default): %s\t output file(default): %s", src, dst);
                    new Thread(new DirParser(src, dst)).start();
                    break;
                case 2:
                    src = getDir();
                    System.out.printf("DIR: %s\t output file(default): %s", src, dst);
                    new Thread(new DirParser(src, dst)).start();
                    break;
                case 3:
                    src = getDir();
                    dst = getFile();
                    System.out.printf("DIR: %s\t output file(default): %s", src, dst);
                    new Thread(new DirParser(src, dst)).start();
                    break;
                case 0:
                    System.out.println("-- Exit from the program --");
                    System.exit(0);
            }
        }
    }

    public static File getDir() {
        File srcDir;
        while (true) {
            srcDir = new File(InputText.inputString("Please input DIR:"));
            if (srcDir.exists()) {
                return srcDir;
            } else {
                System.out.println(srcDir + " directory doesn't exist. Please try again...");
                continue;
            }
        }
    }

    public static File getFile() {
        File dstFile;
        while (true) {
            dstFile = new File(InputText.inputString("Please input OUTPUT file:"));
            if (!dstFile.exists()) {
                return dstFile;
            } else {
                System.out.println(dstFile + " file already exist. Please delete it before writing.");
                continue;
            }
        }
    }
}
