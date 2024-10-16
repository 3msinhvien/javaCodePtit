package TH2;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class UnusedVariablesFinder {

    public static void main(String[] args) {
        try {
            // Read the C++ code from the input file
            File file = new File("CODE.cpp");
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder cppCode = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                cppCode.append(line).append("\n");
            }
            br.close();

            // Find declared variables using a regular expression
            Pattern varDeclPattern = Pattern.compile("(int|float|double|char)\\s+([a-zA-Z_][a-zA-Z0-9_]*)");
            Matcher matcher = varDeclPattern.matcher(cppCode);

            Set<String> declaredVariables = new HashSet<>();
            while (matcher.find()) {
                declaredVariables.add(matcher.group(2));
            }

            // Check which variables are used
            Set<String> usedVariables = new HashSet<>();
            for (String var : declaredVariables) {
                if (cppCode.toString().contains(var)) {
                    usedVariables.add(var);
                }
            }

            // Find and print unused variables
            declaredVariables.removeAll(usedVariables);
            System.out.println("Unused Variables:");
            for (String unusedVar : declaredVariables) {
                System.out.println(unusedVar);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
