package JDBC.Table;

public class TableLiner {
    public static <T> void print(int c1){
        System.out.println();
        for(int i=1;i<=c1;i++){
            if(i == 1 || i == c1) System.out.print("+");
            else System.out.print("-");
        }
    }
    public static <T> void print(int c1 ,int c2) {
        System.out.println();
        for (int i = 1; i <= (c1 + c2); i++) {
            if (i == 1 || i == c1 || i == c1+c2) System.out.print("+");
            else System.out.print("-");
        }
    }
    public static <T> void print(int c1, int c2,int c3) {
        int c12 = c1 + c2;
        int c123 = c1 + c2 + c3;

        System.out.println();
        for (int i = 1; i <= (c123) ; i++) {
            if (i == 1 || i == c1 || i == c12 || i == c123) System.out.print("+");
            else System.out.print("-");
        }
    }

    public static <T> void print(int c1, int c2,int c3,int c4) {
        int c12 = c1 + c2;
        int c123 = c1 + c2 + c3;
        int c1234 = c1 + c2 + c3 + c4;

        System.out.println();
        for (int i = 1; i <= (c1234) ; i++) {
            if (i == 1 || i == c1 || i == c12 || i == c123 || i == c1234) System.out.print("+");
            else System.out.print("-");
        }
    }

    public static <T> void print(int c1, int c2,int c3,int c4,int c5) {
        int c12 = c1 + c2;
        int c123 = c1 + c2 + c3;
        int c1234 = c1 + c2 + c3 + c4;
        int c12345 = c1 + c2 + c3 + c4 + c5;

        System.out.println();
        for (int i = 1; i <= (c12345) ; i++) {
            if (i == 1 || i == c1 || i == c12 || i == c123 || i == c1234 || i == c12345) System.out.print("+");
            else System.out.print("-");
        }
    }

    public static <T> void print(int c1, int c2,int c3,int c4,int c5, int c6) {
        int c12 = c1 + c2;
        int c123 = c1 + c2 + c3;
        int c1234 = c1 + c2 + c3 + c4;
        int c12345 = c1 + c2 + c3 + c4 + c5;
        int c123456 = c1 + c2 + c3 + c4 + c5 + c6;

        System.out.println();
        for (int i = 1; i <= (c123456) ; i++) {
            if (i == 1 || i == c1 || i == c12 || i == c123 || i == c1234 || i == c12345 || i == c123456) System.out.print("+");
            else System.out.print("-");
        }
    }

    public static <T> void print(int c1, int c2,int c3,int c4,int c5, int c6, int c7) {
        int c12 = c1 + c2;
        int c123 = c1 + c2 + c3;
        int c1234 = c1 + c2 + c3 + c4;
        int c12345 = c1 + c2 + c3 + c4 + c5;
        int c123456 = c1 + c2 + c3 + c4 + c5 + c6;
        int c1234567 = c1 + c2 + c3 + c4 + c5 + c6 + c7;

        System.out.println();
        for (int i = 1; i <= (c1234567) ; i++) {
            if (i == 1 || i == c1 || i == c12 || i == c123 || i == c1234 || i == c12345 || i == c123456 || i == c1234567) System.out.print("+");
            else System.out.print("-");
        }
    }

    public static <T> void print(int c1, int c2,int c3,int c4,int c5, int c6, int c7, int c8) {
        int c12 = c1 + c2;
        int c123 = c1 + c2 + c3;
        int c1234 = c1 + c2 + c3 + c4;
        int c12345 = c1 + c2 + c3 + c4 + c5;
        int c123456 = c1 + c2 + c3 + c4 + c5 + c6;
        int c1234567 = c1 + c2 + c3 + c4 + c5 + c6 + c7;
        int c12345678 = c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8;

        System.out.println();
        for (int i = 1; i <= (c12345678) ; i++) {
            if (i == 1 || i == c1 || i == c12 || i == c123 || i == c1234 || i == c12345 || i == c123456 || i == c1234567 || i == c12345678) System.out.print("+");
            else System.out.print("-");
        }
    }

    public static <T> void print(int c1, int c2,int c3,int c4,int c5, int c6, int c7, int c8, int c9) {
        int c12 = c1 + c2;
        int c123 = c1 + c2 + c3;
        int c1234 = c1 + c2 + c3 + c4;
        int c12345 = c1 + c2 + c3 + c4 + c5;
        int c123456 = c1 + c2 + c3 + c4 + c5 + c6;
        int c1234567 = c1 + c2 + c3 + c4 + c5 + c6 + c7;
        int c12345678 = c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8;
        int c123456789 = c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9;

        System.out.println();
        for (int i = 1; i <= (c123456789) ; i++) {
            if (i == 1 || i == c1 || i == c12 || i == c123 || i == c1234 || i == c12345 || i == c123456 || i == c1234567 || i == c12345678 || i == c123456789) System.out.print("+");
            else System.out.print("-");
        }
    }

    public static <T> void print(int c1, int c2,int c3,int c4,int c5, int c6, int c7, int c8, int c9, int c10) {
        int c12 = c1 + c2;
        int c123 = c1 + c2 + c3;
        int c1234 = c1 + c2 + c3 + c4;
        int c12345 = c1 + c2 + c3 + c4 + c5;
        int c123456 = c1 + c2 + c3 + c4 + c5 + c6;
        int c1234567 = c1 + c2 + c3 + c4 + c5 + c6 + c7;
        int c12345678 = c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8;
        int c123456789 = c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9;
        int c12345678910 = c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10;

        System.out.println();
        for (int i = 1; i <= (c12345678910) ; i++) {
            if (i == 1 || i == c1 || i == c12 || i == c123 || i == c1234 || i == c12345 || i == c123456 || i == c1234567 || i == c12345678 || i == c123456789 || i == c12345678910) System.out.print("+");
            else System.out.print("-");
        }
    }

}
