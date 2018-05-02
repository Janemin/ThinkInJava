package net.mindview.util;

/**
 * Created by Jane on 2018/5/1.
 */
public class Range {
    private Range() {
    }

    public static int[] range(int end) {
        int[] arr = new int[Math.abs(end)];
        boolean isAsc = end > 0;

        if(isAsc) {
            for (int i = 0; i < end; i++) {
                arr[i] = i;
            }
        }else {
            for (int i = 0; i < end; i++) {
                arr[i] = -i;
            }
        }
        return arr;
    }

    public static int[] range(int start, int end) {
        int length = Math.abs(end - start);
        boolean isAsc = start < end;
        int[] arr = new int[length];
        if (isAsc) {
            for (int i = 0; i < length; i++) {
                arr[i] = start++;
            }
        }else {
            for (int i = 0; i < length; i++) {
                arr[i] = start--;
            }
        }
        return arr;
    }

    public static int[] range(int start, int end, int step) {
        if(step == 0){
            return new int[0];
        }
        step = Math.abs(step);
        int length = (int)Math.ceil(Math.abs((end - start)*1.0/step));
        boolean isAsc = start < end;
        int[] arr = new int[length];
        if(isAsc) {
            for (int i = 0; i < length; i++) {
                arr[i] = start;
                start += step;
            }
        }else {
            for (int i = 0; i < length; i++) {
                arr[i] = start;
                start -= step;
            }
        }
        return arr;
    }
}
