import java.util.Date;

public class StopWatch {
    private long startTime() {
        long time1 = System.currentTimeMillis();
//        long time1 = new Date().getTime();
        return time1;
    }

    private long endTime() {
        long time2 = System.currentTimeMillis();
//        long time2 = new Date().getTime();
        return time2;
    }

    public long getElapsedTime(long time1, long time2) {
        return time2 - time1;
    }

    public void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        long time1 = stopWatch.startTime();
        System.out.println(time1);

        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 100000);
        }
        stopWatch.display(array);
        int temp = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        stopWatch.display(array);

        long time2 = stopWatch.endTime();
        System.out.println(time2);
        System.out.println(stopWatch.getElapsedTime(time1, time2));
    }
}
