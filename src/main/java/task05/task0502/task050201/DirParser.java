package task05.task0502.task050201;

import java.io.File;

public class DirParser implements Runnable {

    private final File src;
    private final File dst;
    private String EXTENSION = ".c";
//    private String EXTENSION = ".java";

    public DirParser(File src, File dst) {
        this.src = src;
        this.dst = dst;
    }

    @Override
    public void run() {
//        System.out.printf("[info]:\t%s --> '%s'\n", Thread.currentThread().getName(), src.getAbsolutePath());
        parseDir();
    }

    public void parseDir() {
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                new Thread(new DirParser(file, dst)).start();
            } else {
                if (file.getName().endsWith(EXTENSION)) {
                    new FileParser(file, dst);
                }
            }
        }
    }
}
