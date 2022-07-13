public class prob24 {
    static <T> int searchArr(T[] eleList, T sEle) {
        for (int i = 0; i < eleList.length; i++) {
            T ele = eleList[i];
            if (ele.equals(sEle))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] ilist = { 1, 2, 3, 4 };
        int index = searchArr(ilist, 2);
        System.out.println("Index of 2 is: " + index);
    }
}
