public class Array_union {

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int b[] = { 4, 5, 6, 7, 8, 9, 10, 11 };
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {

                System.out.println(a[i]);

                i++;
                j++;

            } else if (a[i] < b[j]) {
                System.out.println(a[i]);

                i++;
            } else {
                System.out.println(b[i]);

                j++;
            }
        }

        while (i < a.length) {
            System.out.println(a[i]);

            i++;
        }

        while (j < b.length) {
            System.out.println(b[j]);

            j++;
        }

    }
}