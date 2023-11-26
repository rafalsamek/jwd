package mysandbox.tools;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayHelper {
    @SuppressWarnings("unchecked")
    public static <T> T[] merge(T[]... inputArrays) {
        if(inputArrays.length < 2) {
            throw new IllegalArgumentException("inputArrays must contain at least 2 arrays");
        }

        for(int i = 0; i < inputArrays.length; i++) {
            if(inputArrays[i] == null) {
                throw new IllegalArgumentException("inputArrays[" + i + "] is null");
            }
        }

        int totalLength = 0;

        for(T[] array : inputArrays) {
            totalLength += array.length;
        }

        T[] result = (T[]) Array.newInstance(inputArrays[0].getClass().getComponentType(), totalLength);

        int offset = 0;

        for(T[] array : inputArrays) {
            System.arraycopy(array, 0, result, offset, array.length);

            offset += array.length;
        }

        return result;
    }

    public static void main(String[] args) {
        Integer[] odds = {1,3,5,7};
        Integer[] evens = {2,4,6,8};

        Integer[] result = ArrayHelper.merge(odds, evens);

        System.out.println(Arrays.toString(result));
    }
}
