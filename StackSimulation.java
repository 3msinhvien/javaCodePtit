import java.util.Stack;

class Process {
    private String name;
    private int cpuCycle;

    public Process(String name, int cpuCycle) {
        this.name = name;
        this.cpuCycle = cpuCycle;
    }

    public String getName() {
        return name;
    }

    public int getCpuCycle() {
        return cpuCycle;
    }

    @Override
    public String toString() {
        return "Tiến trình{name='" + name + "', chu kỳ CPU=" + cpuCycle + "}";
    }
}

public class StackSimulation {
    public static void main(String[] args) {
        // Tạo stack để lưu trữ các tiến trình
        Stack<Process> stack = new Stack<>();

        // Thêm 5 tiến trình vào stack
        stack.push(new Process("Tiến trình 1", 10));
        stack.push(new Process("Tiến trình 2", 15));
        stack.push(new Process("Tiến trình 3", 20));
        stack.push(new Process("Tiến trình 4", 25));
        stack.push(new Process("Tiến trình 5", 30));

        // Hiển thị trạng thái stack ban đầu
        System.out.println("Stack ban đầu: " + stack);

        // Lấy các tiến trình ra khỏi stack và mô phỏng hoạt động
        while (!stack.isEmpty()) {
            Process currentProcess = stack.pop();
            System.out.println("Đang xử lý " + currentProcess.getName() +
                    " với chu kỳ CPU: " + currentProcess.getCpuCycle());

            // Mô phỏng thực thi tiến trình
            executeProcess(currentProcess);
        }

        System.out.println("Tất cả các tiến trình đã hoàn thành.");
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
