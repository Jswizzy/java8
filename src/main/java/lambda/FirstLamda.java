package lambda;

import java.io.File;
import java.io.FileFilter;
import java.nio.file.Paths;

public class FirstLamda {

    public static void main(String[] args) {
        FileFilter fileFilter = (file) -> file.getName().endsWith(".java");


        File dir = Paths.get(".", "src", "main", "java").toFile();

        File[] files = dir.listFiles(fileFilter);

        for (File f : files) {
            System.out.println(f);
        }
    }
}
