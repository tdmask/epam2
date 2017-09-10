package task05.task0502.task050201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InputText {

    public static String inputString(String message) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(message);
        String str = null;
        try {
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
