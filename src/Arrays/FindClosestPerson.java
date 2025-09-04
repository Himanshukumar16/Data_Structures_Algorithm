package Arrays;

public class FindClosestPerson {
    public void findClosestPerson(int x, int y, int z) {

        int dis1 = Math.abs(x - z);
        int dis2 = Math.abs(y - z);

        if(dis1 < dis2) System.out.println(1);
        else if(dis1 > dis2) System.out.println(2);
        else System.out.println(0);

    }
}
