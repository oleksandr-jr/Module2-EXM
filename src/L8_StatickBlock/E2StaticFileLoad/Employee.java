package L8_StatickBlock.E2StaticFileLoad;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

public class Employee {
    static double minimumWorkingHoursPerDay;

    static {
        try {
            Path filePath = Path.of("src/L8/E2StaticFileLoad/config.txt").toAbsolutePath();
//            List<String> config = Files.readAllLines(filePath, StandardCharsets.UTF_8);

            Map<String, String> map = Files.lines(filePath)
                    .map(s -> s.split("="))
                    .collect(Collectors.toMap(k -> k[0], v -> v[1]));

            minimumWorkingHoursPerDay = Double.parseDouble(map.get("minimumHours")) / 24 ;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static String myProperty;

    static {
        try (FileInputStream fileInputStream = new FileInputStream("myconfig.properties")) {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            myProperty = properties.getProperty("myKey");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
