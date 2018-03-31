package com.collections;

/**
 * Created by dashsan on 3/21/2017.
 */
public class Time2 implements Comparable<Time2>{
    private int hour;
    private int minute;
    private int seconds;

    public Time2(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public String toString() {
        String endString = "AM";
        int formatHour = this.hour;
        StringBuffer buffer = new StringBuffer();
        if ( ( hour >= 12 ) && (( minute != 0 ) || ( seconds != 0))  ){
            formatHour = hour - 12;
            endString = "PM";
        }
        else if ( hour == 12 && minute == 0 && seconds == 0){
            endString = "PM";
        }
        buffer.append(formatHour + ":" + minute + ":" + seconds + " " + endString);
        return buffer.toString();
    }


    @Override
    public int compareTo(Time2 o) {
        int hourDifference = this.hour - o.getHour();
        if ( hourDifference != 0 )
            return hourDifference;
        int minuteDifference = this.minute - o.getMinute();
        int secondDifference = this.getSeconds() - o.getSeconds();
        if ( minuteDifference != 0 )
            return  minuteDifference;
        if ( secondDifference != 0)
            return secondDifference;
        return 0;
    }
}
