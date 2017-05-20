package hackerrank;


import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String inputValue = input.nextLine();
        String[] values = inputValue.split(":");
        int hourint = Integer.parseInt(values[0]);

        String minute = values[1];
        String sec = values[2].substring(0, 2);
        sec = sec.length()==1?"0"+sec:sec;

        String amPm = values[2].substring(2);
        String time = "";

        if (amPm.equals("PM")) {
            if(hourint == 12){
                time = "00" + ":" + minute + ":" + sec;
            } else {
                time = (hourint + 12) + ":" + minute + ":" + sec;
            }
        } else {
            if(hourint<12) {
                time = "0"+hourint + ":" + minute + ":" + sec;
            }else if(hourint == 12){
                time = "00" + ":" + minute + ":" + sec;
            } else {
                time = hourint + ":" + minute + ":" + sec;
            }
        }

        System.out.println(time);

    }
}