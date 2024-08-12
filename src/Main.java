public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LinearSearch linearSearch = new LinearSearch();
        int[] arr = {1,2,4,5,6,6,8,9};
        String[] stringArr = { "hello", "hi", "welcome"};

        int index = linearSearch.linearSearch_idx(arr , 4);
        int string_idx = linearSearch.linearSearch_idx(stringArr, "hi");
        char firstNonOccurrence = linearSearch.firstNonOccurrenceOfString("krishna Nayak");
        int i = linearSearch.firstOccurrenceOfIntger(arr);
        int max = linearSearch.maxNumberInArray(arr);
        System.out.println(index);
        System.out.println(string_idx);
        System.out.println(i);
        System.out.println(max);
        System.out.println(firstNonOccurrence);
    }
}