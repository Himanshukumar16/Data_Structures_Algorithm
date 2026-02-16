package Binary_Search_Easy_Medium_Hard;

public class KokoEatingBananas {
    public void kokoEatingBananas(int[] piles, int h) {
        int max = maximumInArray(piles);
        int time;
        for (int i = 1; i <= max; i++) {
            time = totalHour(piles, i);
            if (time <= h) {
                System.out.println(i);
                break;
            }
        }
    }

    public int maximumInArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }

    public int totalHour(int[] arr, int hour) {
        int totalHour = 0;
        for (int a : arr) {
            totalHour += (int) Math.ceil((double) a / hour);
        }
        return totalHour;
    }
}