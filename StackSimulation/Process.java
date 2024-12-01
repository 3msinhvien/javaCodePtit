package StackSimulation;

public class Process {
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
