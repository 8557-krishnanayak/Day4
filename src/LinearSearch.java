import java.util.ArrayList;

public class LinearSearch {

    public int linearSearch_idx(int[] array, int target) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (array[i] == target) return i;
        }

        return -1;
    }

    public int linearSearch_idx(String[] array, String target) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (target.equals(array[i])) return i;
        }
        return -1;
    }

    public int firstOccurrenceOfIntger(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean unique = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    unique = false;
                    break;
                }
            }
            if (!unique) return i;
        }
        return -1;
    }


    public int countOccurrenceOfString(String str, char target) {
        int size = str.length();
        int count = 0;
        String searchElement = String.valueOf(target);
        for (int i = 0; i < size; i++) {
            String character = String.valueOf(str.charAt(i));
            if (character.equals(searchElement)) {
                count++;
            }
        }
        return count;
    }

    public int maxNumberInArray(int[] array) {
        int max = Integer.MIN_VALUE;
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public ArrayList<Integer> countOccurrenceOfInt(int[] array, int target) {
        ArrayList<Integer> idx = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) idx.add(i);
        }
        return idx;
    }

    public char firstNonOccurrenceOfString(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    unique = false;
                    break;
                }
            }
            if (unique) return str.charAt(i);
        }
        return ' ';
    }
}
