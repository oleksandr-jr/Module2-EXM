package L8_StatickBlock.classloader;

public class ClassLoaderDemo {
    public static void main(String[] args) throws ClassNotFoundException {
//        Class.forName("L8_StatickBlock.Constructor.Parent");
        Class<?> clazz = ClassLoaderDemo.class;

        showDetails(clazz);
    }

    private static void showDetails(Class<?> clazz){
        String className = clazz.getName();
        Package packageName = clazz.getPackage();
        ClassLoader classLoader = clazz.getClassLoader();

        System.out.printf("loader: %s%n" +
                          "Class: %s%n" +
                          "Package %s%n", classLoader, className, packageName);
    }
}
