package test;

import java.util.*;
import java.text.*;

public class B9 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng newline sau số lượng

        String youngestPerson = "";
        String oldestPerson = "";
        Date youngestDate = null;
        Date oldestDate = null;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String name = parts[0];
            String birthDateStr = parts[1];

            Date birthDate = dateFormat.parse(birthDateStr);

            if (youngestDate == null || birthDate.after(youngestDate)) {
                youngestDate = birthDate;
                youngestPerson = name;
            }
            if (oldestDate == null || birthDate.before(oldestDate)) {
                oldestDate = birthDate;
                oldestPerson = name;
            }
        }

        System.out.println(youngestPerson);
        System.out.println(oldestPerson);
    }
}

