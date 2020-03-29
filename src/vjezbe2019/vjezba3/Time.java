package vjezbe2019.vjezba3;

public class Time {

    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toString(){
        String hours = this.hour < 10 ? '0' + Integer.toString(this.hour) : Integer.toString(this.hour);
        String minutes = this.minute < 10 ? '0' + Integer.toString(this.minute) : Integer.toString(this.minute);
        String seconds = this.second < 10 ? '0' + Integer.toString(this.second) : Integer.toString(this.second);
        return hours + ":" + minutes + ":" + seconds;
    }

    public void addHours(int hours){
        this.hour += hours;
        if( this.hour >= 24){
            this.hour = this.hour % 24;
        }
    }

    public void addMinutes(int minute){
        this.minute += minute;
        if(this.minute >= 60){
            this.addHours(1);
            this.minute = this.minute % 60;
        }
    }

    public void addSeconds(int second){
        this.second += second;
        if(this.second >= 60){
            this.addMinutes(1);
            this.second = this.second % 60;
        }
    }

    public static void main(String[] args) {

        Time time = new Time(2, 45, 30);
        System.out.println(time.toString());
        time.addHours(25);
        System.out.println(time.toString());
        time.addMinutes(50);
        System.out.println(time.toString());
        time.addSeconds(60);
        System.out.println(time.toString());
        time.addMinutes(23);
        System.out.println(time.toString());
        time.addSeconds(30);
        System.out.println(time.toString());
    }

}
