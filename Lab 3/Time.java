

public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(){
        hours=7;
        minutes=13;
        seconds=30;
    }
    public Time(int hr , int min , int sec){
        hours=hr;
        minutes=min;
        seconds=sec;
    }
    public void setHours(int hours){
        if (hours>24){
            System.out.println("Invalid hour!!!!");
        }

    }
    public void setMin(int minutes){
        if (minutes>60){
            System.out.println("Invalid minutes!!!");
        }
    }
    public void setSec(int seconds){
        if (seconds>60){
            System.out.println("Invalid seconds");
        }
    }
    public void display(){
        System.out.println(hours +" : " + minutes + " : " + seconds);
    }
}