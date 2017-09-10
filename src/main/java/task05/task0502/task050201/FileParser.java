package task05.task0502.task050201;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileParser {
    File srcFile;
    File dstFile;

    public FileParser(File srcFile, File dstFile) {
        this.srcFile = srcFile;
        this.dstFile = dstFile;
        writeToFile(parseFile());
    }

    private int parseFile() {
        int sum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(srcFile))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                sum = sum + countPattern(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sum;
    }

    private void writeToFile(int sum) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(dstFile, true))) {
            bw.write("file: '" + srcFile.getName() + "'; statement 'for' qty = " + sum + "\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int countPattern(String str) {
        int sum = 0;
        Pattern pattern = Pattern.compile("\\bfor\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            sum++;
        }
        return sum;
    }
}
