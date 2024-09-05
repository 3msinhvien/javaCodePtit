package J05033;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int total() {
        return hour * 3600  + minute * 60 + second;
    }
    @Override
    public String toString() {
        return (this.hour + " " + this.minute + " " + this.second ) ;
    }
}
