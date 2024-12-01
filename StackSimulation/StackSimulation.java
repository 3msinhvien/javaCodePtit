package StackSimulation;

import java.util.Scanner;
import java.util.Stack;

public class StackSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Process> stack = new Stack<>();

        // Nhập thời gian chu kỳ CPU cho 5 tiến trình
        for (int i = 1; i <= 5; i++) {
            System.out.print("Nhập thời gian chu kỳ CPU cho Tiến trình " + i + ": ");
            int cpuCycle = scanner.nextInt();
            stack.push(new Process("Tiến trình " + i, cpuCycle));
        }

        // Hiển thị trạng thái stack ban đầu
        System.out.println("\nStack ban đầu: " + stack);

        // Lấy các tiến trình ra khỏi stack và mô phỏng hoạt động
        while (!stack.isEmpty()) {
            Process currentProcess = stack.pop();
            System.out.println("Đang xử lý " + currentProcess.getName() +
                    " với chu kỳ CPU: " + currentProcess.getCpuCycle());

            // Mô phỏng thực thi tiến trình
            executeProcess(currentProcess);
        }

        System.out.println("Tất cả các tiến trình đã hoàn thành.");
        scanner.close();
    }

    private static void executeProcess(Process process) {
        // Mô phỏng việc thực thi bằng cách chờ (sleep)
        try {
            Thread.sleep(process.getCpuCycle() * 100); // Mỗi chu kỳ CPU tương đương 100ms
            System.out.println(process.getName() + " đã được xử lý thành công.");
        } catch (InterruptedException e) {
            System.err.println("Quá trình thực thi bị gián đoạn cho " + process.getName());
        }
    }
}
