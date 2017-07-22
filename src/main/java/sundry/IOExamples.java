package sundry;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class IOExamples {


    public static void main(String[] args) {


        // java 7
        try (BufferedReader reader =
                        new BufferedReader(new FileReader(
                                new File("src/main/resources/peopleDates.txt")))) {

            reader.lines()
                    .filter(line -> line.contains("1991"))
                    .findFirst()
                    .ifPresent(System.out::println);

        } catch (IOException ioe) {
            //handle
            System.err.println(ioe.getMessage());
        }

        // java 8
        Path path = Paths.get("src", "main");

        try (Stream<Path> stream = Files.walk(path, 2)){

            stream
                    .filter(p -> p.toFile().isDirectory())
                    .forEach(System.out::println);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
