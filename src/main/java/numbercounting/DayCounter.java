package numbercounting;

public class DayCounter {

    public static int getTotal(Integer num) {
        int total = 0;
        switch (num) {
            case 12: total += 31;
            case 11: total += 30;
            case 10: total += 31;
            case 9: total += 30;
            case 8: total += 31;
            case 7: total += 31;
            case 6: total += 30;
            case 5: total += 31;
            case 4: total += 30;
            case 3: total += 31;
            case 2: total += 28;
            case 1: total += 31;
        }

        return total;
    }
}