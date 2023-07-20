package L10_Recursuon.E3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //printAllFiles(new File("/Users/OleksandrJR/Documents/JavaRushProjects/Module2-EXM"));
        printAllFiles2(Path.of("/Users/OleksandrJR/Documents/JavaRushProjects/Module2-EXM"));
    }

    public static void printAllFiles(File dir) {
        for (File file : dir.listFiles()) {
            if (file.isDirectory())
                printAllFiles(file);
            else
                System.out.println(file.getAbsolutePath());
        }
    }

    public static void printAllFiles2(Path path){
        try (Stream<Path> paths = Files.walk(path)) {
            paths
                    .filter(Files::isRegularFile)
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
