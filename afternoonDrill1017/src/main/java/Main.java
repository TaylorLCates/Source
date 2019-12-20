import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\bootc\\Documents\\Drill.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        List<String> list = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        Scanner sc = new Scanner(file);
        String strLine = "";
        StringBuilder sb = new StringBuilder();

        while (strLine != null) {
            strLine = bufferedReader.readLine();
            sb.append(strLine);
            sb.append(System.lineSeparator());
            strLine = bufferedReader.readLine();
            if (strLine == null) break;
            list.add(strLine);
        }

        System.out.println(Arrays.toString(list.toArray()));
        bufferedReader.close();

        String[] items = list.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

        int[] results = new int

//        while (sc.hasNextLine())
//            System.out.println(sc.nextLine());
    }

}

