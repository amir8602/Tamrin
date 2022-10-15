package ir.digipay;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Map<String, Long> stringLongMap = null;

        try {
             stringLongMap =
                    Files.lines(Paths.get("ParaFile/test.txt"))
                            .parallel().map(s -> s.split("[.]|[ ]|[?]|[!]|[\"]|[,]|\\n|[:]|[+]")).
                            flatMap(Arrays::stream).
                            collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
            System.out.println(stringLongMap.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }



        File file = new File("ParaFile/final.txt");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
            bufferedWriter.append(stringLongMap.toString());
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
