package Homework;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Objects;

enum SortEnum {ASC, DESC}

public class TaskFourth {

    public static boolean isSorted(SortEnum se, int[] arr) {
        if (Objects.isNull(se) || Objects.isNull(arr) || arr.length == 0) {
            throw new UnsupportedOperationException("Wrong input");
        }

        if (arr.length == 1) {
            return true;
        }

        if (se == SortEnum.ASC) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    return false;
                }
            }
            return true;
        }

        if (se == SortEnum.DESC) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i - 1]) {
                    return false;
                }
            }
            return true;
        }

        throw new UnsupportedOperationException("Unsupported sort type");
    }
        public static void main (String[] args) {
            SortEnum se = SortEnum.DESC;
            int[] arr = {9, 8, 7, 6, };
            System.out.println(isSorted(se, arr));

            se = SortEnum.ASC;
            arr = new int[]{1,2};
            System.out.println(isSorted(se, arr));
        }
    }


