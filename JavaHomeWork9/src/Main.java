import java.io.*;

public class Main {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\SanchoArs\\Desktop\\Java";

        File directory = new File(directoryPath);

        try (FileWriter writer = new FileWriter("result.txt")) {
            File[] files = directory.listFiles();

            for (File file : files) {

                if (file.isFile() && file.getName().endsWith(".txt")) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            writer.write(line + " ");
                        }
                    } catch (IOException e) {
                        System.out.println("Ошибка при чтении файла: " + file.getName());
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл result.txt");
        }
    }
}