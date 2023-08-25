package TABA.question3;

import java.io.*;

/**
 * @author Xiangnan Liu
 * @date 2023-08-25 19:20
 */
public class ManageCustomers {
    public static void operate() {
        String sourceFilePath = "src/question3/Customers.txt";
        StringBuilder irishCustomers = new StringBuilder();
        StringBuilder missingCountryCustomers = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
            String line;

            while ((line = reader.readLine()) != null) {
                // Requirement A
                System.out.println(line);
                String[] arr = line.split(",");
                if ("Ireland".equals(arr[3])) {
                    irishCustomers.append(line).append("\n");
                }
                if (arr[3].isEmpty() || arr[3].isBlank()) {
                    missingCountryCustomers.append(line).append("\n");
                }


                //list.add(new Customer(Long.parseLong(arr[0]), arr[1], arr[2], arr[3], arr[4]));
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String irishCustomersPath = "src/question3/Irish_customers.txt";
        String missingCountryPath = "src/question3/MissingCountry.txt";

        try {
            writeToFile(irishCustomers.toString(), irishCustomersPath);
            writeToFile(missingCountryCustomers.toString(), missingCountryPath);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public static void writeToFile(String content, String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }

    public static void main(String[] args) {
        operate();

        String str = "9,Jo-ann,Ragles,,jragles8@spiegel.de";
        String[] arr = str.split(",");
        System.out.println(arr[3]);
    }
}
