public class TekrarEdenCiftSayi {

    static boolean even(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 4, 5, 6, 7, 8, 3, 4, 5, 6, 7, 8, 23, 12, 21, 23, 32, 32, 21, 12, 23, 44, 66};
        int[] newList = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!even(newList, list[i])) {
                        newList[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value : newList) {
            if ((value != 0) && (value % 2 == 0)) {
                System.out.println(value);
            }
        }
    }
}
