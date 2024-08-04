import java.util.*;

public class ArrayListProgram {
    public void duplicate(List<Integer> list) {
        int[] arr = new int[100];
        for (Integer i : list) {
            arr[i] = arr[i] + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public List<Integer> removeDuplicate(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>();
        for (int a : arr) {
            if (!newArr.contains(a)) {
                newArr.add(a);
            }
        }
        return newArr;
    }

    public List<Integer> intersection(List<Integer> l1, List<Integer> l2) {
        List<Integer> intersectionList = new ArrayList<>();

        for (int i : l1) {
            if (l2.contains(i)) {
                intersectionList.add(i);
            }
        }

        return removeDuplicate(intersectionList);
    }

    public List<Integer> union(List<Integer> l1, List<Integer> l2) {
        List<Integer> unionList = new ArrayList<>();

        unionList.addAll(l1);
        unionList.addAll(l2);

        return removeDuplicate(unionList);
    }

    public List<Integer> reverse(List<Integer> l1) {
        List<Integer> revrseList = new ArrayList<>();
        int size = l1.size();
        for (int i = size - 1; i >= 0; i--) {
            revrseList.add(l1.get(i));
        }
        return revrseList;
    }

    public boolean palindrome(List<Integer> l1) {
        List<Integer> reverse = reverse(l1);

        for (int i = 0; i < l1.size(); i++) {
            if (!Objects.equals(l1.get(i), reverse.get(i))) return false;
        }
        return true;
    }

    public void sortArrayList(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < (list.size() - 1 - i); j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Integer temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        System.out.println(list);
    }

    public static void rotate(List<Integer> list, int k) {
        if (list == null || list.isEmpty() || k <= 0) {
            return;
        }

        int size = list.size();
        k = k % size;


        Collections.reverse(list);

        Collections.reverse(list.subList(0, k));

        Collections.reverse(list.subList(k, size));
    }

    public static void main(String[] args) {
        ArrayListProgram list = new ArrayListProgram();
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 5, 6, 4, 3, 5, 6, 7, 3, 4, 3, 5, 8, 0, 7, 6, 1, 2, 5));
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 5, 1, 9));

        list.duplicate(arr);
        List<Integer> removeArr = list.removeDuplicate(arr);
        List<Integer> intersection = list.intersection(arr, arr2);
        List<Integer> union = list.union(arr, arr2);
        List<Integer> reverse = list.reverse(arr);
        System.out.println(removeArr);
        System.out.println(intersection);
        System.out.println(union);
        System.out.println(reverse);
        list.sortArrayList(arr2);


    }
}
