package JDBC.Table;

public class TableHeader {
    public static <T> void print(int ColLength,T Col1Name, T Col2Name, T Col3Name, T Col4Name , T Col5Name){
        int c = ColLength;
        print(c, Col1Name, c, Col2Name, c, Col3Name, c, Col4Name, c, Col5Name);
    }

    public static <T> void print(int c1,T Col1Name){
        String s1 = Col1Name.toString();

        for(int i=1;i<=c1*3;i++){

            if(i<=c1){
                if(i == 1 || i == c1) System.out.print("+");
                else System.out.print("-");
            }
            else if(i>c1 && i<=c1*2){
                if(i==c1+1) System.out.println();
                if(i==c1+1 || i == c1*2) System.out.print("|");
                else if(i==c1+2 || i>s1.length()+c1+2 && i<c1*2) System.out.print(" ");
                else if (i==c1+3) System.out.print(s1);
            }
            else{
                if(i==c1*2+1) System.out.println();
                if(i == c1*2+1 || i == c1*3) System.out.print("+");
                else System.out.print("-");
            }
        }
    }

    public static <T> void print(int c1,T Col1Name , int c2,T Col2Name ){
        String s1 = Col1Name.toString();
        String s2 = Col2Name.toString();
        int c12 = c1+c2;

        for(int i=1;i<=c12*3;i++){
            if(i<=c12){
                if(i == 1 || i == c1 || i == c12) System.out.print("+");
                else System.out.print("-");
            }
            else if(i>c12 && i<=c12*2){
                if(i==c12+1) System.out.println();
                if(i==c12+1 || i == c1+c12 || i == c12*2) System.out.print("|");
                else if(i==c12+2 || i>s1.length()+c12+2 && i<c1+c12) System.out.print(" ");
                else if(i==c1+c12+1 || i>s2.length()+c1+c12+1 && i<c12*2) System.out.print(" ");
                else if (i==c12+3) System.out.print(s1);
                else if (i==c1+c12+2) System.out.print(s2);
            }
            else{
                if(i == c12*2+1) System.out.println();
                if(i == c12*2+1 || i == c1+c12*2|| i == c12*3) System.out.print("+");
                else System.out.print("-");
            }
        }
    }

    public static <T> void print(int c1,T Col1Name , int c2,T Col2Name , int c3,T Col3Name ){
        String s1 = Col1Name.toString();
        String s2 = Col2Name.toString();
        String s3 = Col3Name.toString();
        int c12 = c1+c2;
        int c123 = c1+c2+c3;

        for(int i=1;i<=c123*3;i++){
            if(i<=c123){
                if(i == 1 || i == c1 || i == c12 || i == c123) System.out.print("+");
                else System.out.print("-");
            }
            else if(i>c123 && i<=c123*2){
                if(i==c123+1) System.out.println();
                if(i==c123+1 || i == c1+c123 || i == c12+c123 || i == c123*2) System.out.print("|");
                else if(i==c123+2 || i>s1.length()+c123+2 && i<c1+c123) System.out.print(" ");
                else if(i==c1+c123+1 || i>s2.length()+c1+c123+1 && i<c12+c123) System.out.print(" ");
                else if(i==c12+c123+1 || i>s3.length()+c12+c123+1 && i<c123*2) System.out.print(" ");
                else if (i==c123+3) System.out.print(s1);
                else if (i==c1+c123+2) System.out.print(s2);
                else if (i==c12+c123+2) System.out.print(s3);
            }
            else{
                if(i==c123*2+1) System.out.println();
                if(i == c123*2+1 || i == c1+c123*2|| i == c12+c123*2 || i == c123*3) System.out.print("+");
                else System.out.print("-");
            }
        }
    }

    public static <T> void print(int c1,T Col1Name , int c2,T Col2Name , int c3,T Col3Name , int c4,T Col4Name){
        String s1 = Col1Name.toString();
        String s2 = Col2Name.toString();
        String s3 = Col3Name.toString();
        String s4 = Col4Name.toString();

        int c12 = c1+c2;
        int c123 = c1+c2+c3;
        int c1234 = c1+c2+c3+c4;

        for(int i=1;i<=c1234*3;i++){
            if(i<=c1234){
                if(i == 1 || i == c1 || i == c12 || i == c123 || i == c1234) System.out.print("+");
                else System.out.print("-");
            }
            else if(i>c1234 && i<=c1234*2){
                if(i==c1234+1) System.out.println();
                if(i==c1234+1 || i == c1+c1234 || i == c12+c1234 || i == c123 + c1234|| i == c1234*2) System.out.print("|");
                else if(i==c1234+2 || i>s1.length()+c1234+2 && i<c1+c1234) System.out.print(" ");
                else if(i==c1+c1234+1 || i>s2.length()+c1+c1234+1 && i<c12+c1234) System.out.print(" ");
                else if(i==c12+c1234+1 || i>s3.length()+c12+c1234+1 && i<c123+c1234) System.out.print(" ");
                else if(i==c123+c1234+1 || i>s4.length()+c123+c1234+1 && i<c1234*2) System.out.print(" ");
                else if (i==c1234+3) System.out.print(s1);
                else if (i==c1+c1234+2) System.out.print(s2);
                else if (i==c12+c1234+2) System.out.print(s3);
                else if (i==c123+c1234+2) System.out.print(s4);
            }
            else{
                if(i==c1234*2+1) System.out.println();
                if(i == c1234*2+1 || i == c1+c1234*2|| i == c12+c1234*2 || i == c123+c1234*2 || i == c1234*3) System.out.print("+");
                else System.out.print("-");
            }
        }
    }

    public static <T> void print(int c1,T Col1Name , int c2,T Col2Name , int c3,T Col3Name , int c4,T Col4Name , int c5,T Col5Name){
        String s1 = Col1Name.toString();
        String s2 = Col2Name.toString();
        String s3 = Col3Name.toString();
        String s4 = Col4Name.toString();
        String s5 = Col5Name.toString();

        int c12 = c1+c2;
        int c123 = c1+c2+c3;
        int c1234 = c1+c2+c3+c4;
        int c12345 = c1+c2+c3+c4+c5;

        for(int i=1;i<=c12345*3;i++){
            if(i<=c12345){
                if(i == 1 || i == c1 || i == c12 || i == c123 || i == c12345) System.out.print("+");
                else System.out.print("-");
            }
            else if(i>c12345 && i<=c12345*2){
                if(i==c12345+1) System.out.println();
                if(i==c12345+1 || i == c1+c12345 || i == c12+c12345 || i == c123 + c12345|| i == c1234+c12345 || i == c12345*2) System.out.print("|");
                else if(i==c12345+2 || i>s1.length()+c12345+2 && i<c1+c12345) System.out.print(" ");
                else if(i==c1+c12345+1 || i>s2.length()+c1+c12345+1 && i<c12+c12345) System.out.print(" ");
                else if(i==c12+c12345+1 || i>s3.length()+c12+c12345+1 && i<c123+c12345) System.out.print(" ");
                else if(i==c123+c12345+1 || i>s4.length()+c123+c12345+1 && i<c1234+c12345) System.out.print(" ");
                else if(i==c1234+c12345+1 || i>s5.length()+c1234+c12345+1 && i<c12345*2) System.out.print(" ");
                else if (i==c12345+3) System.out.print(s1);
                else if (i==c1+c12345+2) System.out.print(s2);
                else if (i==c12+c12345+2) System.out.print(s3);
                else if (i==c123+c12345+2) System.out.print(s4);
                else if (i==c1234+c12345+2) System.out.print(s5);
            }
            else{
                if(i==c12345*2+1) System.out.println();
                if(i == c12345*2+1 || i == c1+c12345*2|| i == c12+c12345*2 || i == c123+c12345*2 || i == c1234+c12345 ||i == c12345*3) System.out.print("+");
                else System.out.print("-");
            }
        }
    }
    public static <T> void print(int c1, T Col1Name, int c2, T Col2Name, int c3, T Col3Name, int c4, T Col4Name, int c5, T Col5Name, int c6, T Col6Name) {
        String s1 = Col1Name.toString();
        String s2 = Col2Name.toString();
        String s3 = Col3Name.toString();
        String s4 = Col4Name.toString();
        String s5 = Col5Name.toString();
        String s6 = Col6Name.toString();

        int c12 = c1 + c2;
        int c123 = c12 + c3;
        int c1234 = c123 + c4;
        int c12345 = c1234 + c5;
        int c123456 = c12345 + c6;

        for (int i = 1; i <= c123456 * 3; i++) {
            if (i <= c123456) {
                if (i == 1 || i == c1 || i == c12 || i == c123 || i == c1234 || i == c12345 || i == c123456) System.out.print("+");
                else System.out.print("-");
            } else if (i > c123456 && i <= c123456 * 2) {
                if (i == c123456 + 1) System.out.println();
                if (i == c123456 + 1 || i == c1 + c123456 || i == c12 + c123456 || i == c123 + c123456 || i == c1234 + c123456 || i == c12345 + c123456 || i == c123456 * 2)
                    System.out.print("|");
                else if (i == c123456 + 2 || i > s1.length() + c123456 + 2 && i < c1 + c123456) System.out.print(" ");
                else if (i == c1 + c123456 + 1 || i > s2.length() + c1 + c123456 + 1 && i < c12 + c123456) System.out.print(" ");
                else if (i == c12 + c123456 + 1 || i > s3.length() + c12 + c123456 + 1 && i < c123 + c123456) System.out.print(" ");
                else if (i == c123 + c123456 + 1 || i > s4.length() + c123 + c123456 + 1 && i < c1234 + c123456) System.out.print(" ");
                else if (i == c1234 + c123456 + 1 || i > s5.length() + c1234 + c123456 + 1 && i < c12345 + c123456) System.out.print(" ");
                else if (i == c12345 + c123456 + 1 || i > s6.length() + c12345 + c123456 + 1 && i < c123456 * 2) System.out.print(" ");
                else if (i == c123456 + 3) System.out.print(s1);
                else if (i == c1 + c123456 + 2) System.out.print(s2);
                else if (i == c12 + c123456 + 2) System.out.print(s3);
                else if (i == c123 + c123456 + 2) System.out.print(s4);
                else if (i == c1234 + c123456 + 2) System.out.print(s5);
                else if (i == c12345 + c123456 + 2) System.out.print(s6);
            } else {
                if (i == c123456 * 2 + 1) System.out.println();
                if (i == c123456 * 2 + 1 || i == c1 + c123456 * 2 || i == c12 + c123456 * 2 || i == c123 + c123456 * 2 || i == c1234 + c123456 * 2 || i == c12345 + c123456 * 2 || i == c123456 * 3)
                    System.out.print("+");
                else System.out.print("-");
            }
        }
    }

    public static <T> void print(int c1, T Col1Name, int c2, T Col2Name, int c3, T Col3Name, int c4, T Col4Name, int c5, T Col5Name, int c6, T Col6Name, int c7, T Col7Name) {
        String s1 = Col1Name.toString();
        String s2 = Col2Name.toString();
        String s3 = Col3Name.toString();
        String s4 = Col4Name.toString();
        String s5 = Col5Name.toString();
        String s6 = Col6Name.toString();
        String s7 = Col7Name.toString();

        int c12 = c1 + c2;
        int c123 = c12 + c3;
        int c1234 = c123 + c4;
        int c12345 = c1234 + c5;
        int c123456 = c12345 + c6;
        int c1234567 = c123456 + c7;

        for (int i = 1; i <= c1234567 * 3; i++) {
            if (i <= c1234567) {
                if (i == 1 || i == c1 || i == c12 || i == c123 || i == c1234 || i == c12345 || i == c123456 || i == c1234567) System.out.print("+");
                else System.out.print("-");
            } else if (i > c1234567 && i <= c1234567 * 2) {
                if (i == c1234567 + 1) System.out.println();
                if (i == c1234567 + 1 || i == c1 + c1234567 || i == c12 + c1234567 || i == c123 + c1234567 || i == c1234 + c1234567 || i == c12345 + c1234567 || i == c123456 + c1234567 || i == c1234567 * 2)
                    System.out.print("|");
                else if (i == c1234567 + 2 || i > s1.length() + c1234567 + 2 && i < c1 + c1234567) System.out.print(" ");
                else if (i == c1 + c1234567 + 1 || i > s2.length() + c1 + c1234567 + 1 && i < c12 + c1234567) System.out.print(" ");
                else if (i == c12 + c1234567 + 1 || i > s3.length() + c12 + c1234567 + 1 && i < c123 + c1234567) System.out.print(" ");
                else if (i == c123 + c1234567 + 1 || i > s4.length() + c123 + c1234567 + 1 && i < c1234 + c1234567) System.out.print(" ");
                else if (i == c1234 + c1234567 + 1 || i > s5.length() + c1234 + c1234567 + 1 && i < c12345 + c1234567) System.out.print(" ");
                else if (i == c12345 + c1234567 + 1 || i > s6.length() + c12345 + c1234567 + 1 && i < c123456 + c1234567) System.out.print(" ");
                else if (i == c123456 + c1234567 + 1 || i > s7.length() + c123456 + c1234567 + 1 && i < c1234567 * 2) System.out.print(" ");
                else if (i == c1234567 + 3) System.out.print(s1);
                else if (i == c1 + c1234567 + 2) System.out.print(s2);
                else if (i == c12 + c1234567 + 2) System.out.print(s3);
                else if (i == c123 + c1234567 + 2) System.out.print(s4);
                else if (i == c1234 + c1234567 + 2) System.out.print(s5);
                else if (i == c12345 + c1234567 + 2) System.out.print(s6);
                else if (i == c123456 + c1234567 + 2) System.out.print(s7);
            } else {
                if (i == c1234567 * 2 + 1) System.out.println();
                if (i == c1234567 * 2 + 1 || i == c1 + c1234567 * 2 || i == c12 + c1234567 * 2 || i == c123 + c1234567 * 2 || i == c1234 + c1234567 * 2 || i == c12345 + c1234567 * 2 || i == c123456 + c1234567 * 2 || i == c1234567 * 3)
                    System.out.print("+");
                else System.out.print("-");
            }
        }
    }

    public static <T> void print(int c1, T Col1Name, int c2, T Col2Name, int c3, T Col3Name, int c4, T Col4Name,
                                 int c5, T Col5Name, int c6, T Col6Name, int c7, T Col7Name, int c8, T Col8Name) {
        String s1 = Col1Name.toString();
        String s2 = Col2Name.toString();
        String s3 = Col3Name.toString();
        String s4 = Col4Name.toString();
        String s5 = Col5Name.toString();
        String s6 = Col6Name.toString();
        String s7 = Col7Name.toString();
        String s8 = Col8Name.toString();

        int c12 = c1 + c2;
        int c123 = c12 + c3;
        int c1234 = c123 + c4;
        int c12345 = c1234 + c5;
        int c123456 = c12345 + c6;
        int c1234567 = c123456 + c7;
        int c12345678 = c1234567 + c8;

        for (int i = 1; i <= c12345678 * 3; i++) {
            if (i <= c12345678) {
                if (i == 1 || i == c1 || i == c12 || i == c123 || i == c1234 || i == c12345 || i == c123456 ||
                        i == c1234567 || i == c12345678)
                    System.out.print("+");
                else
                    System.out.print("-");
            } else if (i > c12345678 && i <= c12345678 * 2) {
                if (i == c12345678 + 1) System.out.println();
                if (i == c12345678 + 1 || i == c1 + c12345678 || i == c12 + c12345678 || i == c123 + c12345678 ||
                        i == c1234 + c12345678 || i == c12345 + c12345678 || i == c123456 + c12345678 || i == c1234567 + c12345678 ||
                        i == c12345678 * 2)
                    System.out.print("|");
                else if (i == c12345678 + 2 || i > s1.length() + c12345678 + 2 && i < c1 + c12345678)
                    System.out.print(" ");
                else if (i == c1 + c12345678 + 1 || i > s2.length() + c1 + c12345678 + 1 && i < c12 + c12345678)
                    System.out.print(" ");
                else if (i == c12 + c12345678 + 1 || i > s3.length() + c12 + c12345678 + 1 && i < c123 + c12345678)
                    System.out.print(" ");
                else if (i == c123 + c12345678 + 1 || i > s4.length() + c123 + c12345678 + 1 && i < c1234 + c12345678)
                    System.out.print(" ");
                else if (i == c1234 + c12345678 + 1 || i > s5.length() + c1234 + c12345678 + 1 && i < c12345 + c12345678)
                    System.out.print(" ");
                else if (i == c12345 + c12345678 + 1 || i > s6.length() + c12345 + c12345678 + 1 && i < c123456 + c12345678)
                    System.out.print(" ");
                else if (i == c123456 + c12345678 + 1 || i > s7.length() + c123456 + c12345678 + 1 && i < c1234567 + c12345678)
                    System.out.print(" ");
                else if (i == c1234567 + c12345678 + 1 || i > s8.length() + c1234567 + c12345678 + 1 && i < c12345678 * 2)
                    System.out.print(" ");
                else if (i == c12345678 + 3) System.out.print(s1);
                else if (i == c1 + c12345678 + 2) System.out.print(s2);
                else if (i == c12 + c12345678 + 2) System.out.print(s3);
                else if (i == c123 + c12345678 + 2) System.out.print(s4);
                else if (i == c1234 + c12345678 + 2) System.out.print(s5);
                else if (i == c12345 + c12345678 + 2) System.out.print(s6);
                else if (i == c123456 + c12345678 + 2) System.out.print(s7);
                else if (i == c1234567 + c12345678 + 2) System.out.print(s8);
            } else {
                if (i == c12345678 * 2 + 1) System.out.println();
                if (i == c12345678 * 2 + 1 || i == c1 + c12345678 * 2 || i == c12 + c12345678 * 2 ||
                        i == c123 + c12345678 * 2 || i == c1234 + c12345678 * 2 || i == c12345 + c12345678 * 2 ||
                        i == c123456 + c12345678 * 2 || i == c1234567 + c12345678 * 2 || i == c12345678 * 3)
                    System.out.print("+");
                else
                    System.out.print("-");
            }
        }
    }

    public static <T> void print(int c1, T Col1Name, int c2, T Col2Name, int c3, T Col3Name, int c4, T Col4Name,
                                 int c5, T Col5Name, int c6, T Col6Name, int c7, T Col7Name, int c8, T Col8Name,
                                 int c9, T Col9Name) {
        String s1 = Col1Name.toString();
        String s2 = Col2Name.toString();
        String s3 = Col3Name.toString();
        String s4 = Col4Name.toString();
        String s5 = Col5Name.toString();
        String s6 = Col6Name.toString();
        String s7 = Col7Name.toString();
        String s8 = Col8Name.toString();
        String s9 = Col9Name.toString();

        int c12 = c1 + c2;
        int c123 = c12 + c3;
        int c1234 = c123 + c4;
        int c12345 = c1234 + c5;
        int c123456 = c12345 + c6;
        int c1234567 = c123456 + c7;
        int c12345678 = c1234567 + c8;
        int c123456789 = c12345678 + c9;

        for (int i = 1; i <= c123456789 * 3; i++) {
            if (i <= c123456789) {
                if (i == 1 || i == c1 || i == c12 || i == c123 || i == c1234 || i == c12345 || i == c123456 ||
                        i == c1234567 || i == c12345678 || i == c123456789)
                    System.out.print("+");
                else
                    System.out.print("-");
            } else if (i > c123456789 && i <= c123456789 * 2) {
                if (i == c123456789 + 1) System.out.println();
                if (i == c123456789 + 1 || i == c1 + c123456789 || i == c12 + c123456789 || i == c123 + c123456789 ||
                        i == c1234 + c123456789 || i == c12345 + c123456789 || i == c123456 + c123456789 || i == c1234567 + c123456789 ||
                        i == c12345678 + c123456789 || i == c123456789 * 2)
                    System.out.print("|");
                else if (i == c123456789 + 2 || i > s1.length() + c123456789 + 2 && i < c1 + c123456789) System.out.print(" ");
                else if (i == c1 + c123456789 + 1 || i > s2.length() + c1 + c123456789 + 1 && i < c12 + c123456789) System.out.print(" ");
                else if (i == c12 + c123456789 + 1 || i > s3.length() + c12 + c123456789 + 1 && i < c123 + c123456789) System.out.print(" ");
                else if (i == c123 + c123456789 + 1 || i > s4.length() + c123 + c123456789 + 1 && i < c1234 + c123456789) System.out.print(" ");
                else if (i == c1234 + c123456789 + 1 || i > s5.length() + c1234 + c123456789 + 1 && i < c12345 + c123456789) System.out.print(" ");
                else if (i == c12345 + c123456789 + 1 || i > s6.length() + c12345 + c123456789 + 1 && i < c123456 + c123456789) System.out.print(" ");
                else if (i == c123456 + c123456789 + 1 || i > s7.length() + c123456 + c123456789 + 1 && i < c1234567 + c123456789) System.out.print(" ");
                else if (i == c1234567 + c123456789 + 1 || i > s8.length() + c1234567 + c123456789 + 1 && i < c12345678 + c123456789) System.out.print(" ");
                else if (i == c12345678 + c123456789 + 1 || i > s9.length() + c12345678 + c123456789 + 1 && i < c123456789 * 2) System.out.print(" ");
                else if (i == c123456789 + 3) System.out.print(s1);
                else if (i == c1 + c123456789 + 2) System.out.print(s2);
                else if (i == c12 + c123456789 + 2) System.out.print(s3);
                else if (i == c123 + c123456789 + 2) System.out.print(s4);
                else if (i == c1234 + c123456789 + 2) System.out.print(s5);
                else if (i == c12345 + c123456789 + 2) System.out.print(s6);
                else if (i == c123456 + c123456789 + 2) System.out.print(s7);
                else if (i == c1234567 + c123456789 + 2) System.out.print(s8);
                else if (i == c12345678 + c123456789 + 2) System.out.print(s9);
            } else {
                if (i == c123456789 * 2 + 1) System.out.println();
                if (i == c123456789 * 2 + 1 || i == c1 + c123456789 * 2 || i == c12 + c123456789 * 2 ||
                        i == c123 + c123456789 * 2 || i == c1234 + c123456789 * 2 || i == c12345 + c123456789 * 2 ||
                        i == c123456 + c123456789 * 2 || i == c1234567 + c123456789 * 2 ||
                        i == c12345678 + c123456789 * 2 || i == c123456789 * 3)
                    System.out.print("+");
                else
                    System.out.print("-");
            }
        }
    }

    public static <T> void print(int c1, T Col1Name, int c2, T Col2Name, int c3, T Col3Name, int c4, T Col4Name,
                                 int c5, T Col5Name, int c6, T Col6Name, int c7, T Col7Name, int c8, T Col8Name,
                                 int c9, T Col9Name, int c10, T Col10Name) {
        String s1 = Col1Name.toString();
        String s2 = Col2Name.toString();
        String s3 = Col3Name.toString();
        String s4 = Col4Name.toString();
        String s5 = Col5Name.toString();
        String s6 = Col6Name.toString();
        String s7 = Col7Name.toString();
        String s8 = Col8Name.toString();
        String s9 = Col9Name.toString();
        String s10 = Col10Name.toString();

        int c12 = c1 + c2;
        int c123 = c12 + c3;
        int c1234 = c123 + c4;
        int c12345 = c1234 + c5;
        int c123456 = c12345 + c6;
        int c1234567 = c123456 + c7;
        int c12345678 = c1234567 + c8;
        int c123456789 = c12345678 + c9;
        int c12345678910 = c123456789 + c10;

        for (int i = 1; i <= c12345678910 * 3; i++) {
            if (i <= c12345678910) {
                if (i == 1 || i == c1 || i == c12 || i == c123 || i == c1234 || i == c12345 || i == c123456 ||
                        i == c1234567 || i == c12345678 || i == c123456789 || i == c12345678910)
                    System.out.print("+");
                else
                    System.out.print("-");
            } else if (i > c12345678910 && i <= c12345678910 * 2) {
                if (i == c12345678910 + 1) System.out.println();
                if (i == c12345678910 + 1 || i == c1 + c12345678910 || i == c12 + c12345678910 || i == c123 + c12345678910 ||
                        i == c1234 + c12345678910 || i == c12345 + c12345678910 || i == c123456 + c12345678910 || i == c1234567 + c12345678910 ||
                        i == c12345678 + c12345678910 || i == c123456789 + c12345678910 || i == c12345678910 * 2)
                    System.out.print("|");
                else if (i == c12345678910 + 2 || i > s1.length() + c12345678910 + 2 && i < c1 + c12345678910) System.out.print(" ");
                else if (i == c1 + c12345678910 + 1 || i > s2.length() + c1 + c12345678910 + 1 && i < c12 + c12345678910) System.out.print(" ");
                else if (i == c12 + c12345678910 + 1 || i > s3.length() + c12 + c12345678910 + 1 && i < c123 + c12345678910) System.out.print(" ");
                else if (i == c123 + c12345678910 + 1 || i > s4.length() + c123 + c12345678910 + 1 && i < c1234 + c12345678910) System.out.print(" ");
                else if (i == c1234 + c12345678910 + 1 || i > s5.length() + c1234 + c12345678910 + 1 && i < c12345 + c12345678910) System.out.print(" ");
                else if (i == c12345 + c12345678910 + 1 || i > s6.length() + c12345 + c12345678910 + 1 && i < c123456 + c12345678910) System.out.print(" ");
                else if (i == c123456 + c12345678910 + 1 || i > s7.length() + c123456 + c12345678910 + 1 && i < c1234567 + c12345678910) System.out.print(" ");
                else if (i == c1234567 + c12345678910 + 1 || i > s8.length() + c1234567 + c12345678910 + 1 && i < c12345678 + c12345678910) System.out.print(" ");
                else if (i == c12345678 + c12345678910 + 1 || i > s9.length() + c12345678 + c12345678910 + 1 && i < c123456789 + c12345678910) System.out.print(" ");
                else if (i == c123456789 + c12345678910 + 1 || i > s10.length() + c123456789 + c12345678910 + 1 && i < c12345678910 * 2) System.out.print(" ");
                else if (i == c12345678910 + 3) System.out.print(s1);
                else if (i == c1 + c12345678910 + 2) System.out.print(s2);
                else if (i == c12 + c12345678910 + 2) System.out.print(s3);
                else if (i == c123 + c12345678910 + 2) System.out.print(s4);
                else if (i == c1234 + c12345678910 + 2) System.out.print(s5);
                else if (i == c12345 + c12345678910 + 2) System.out.print(s6);
                else if (i == c123456 + c12345678910 + 2) System.out.print(s7);
                else if (i == c1234567 + c12345678910 + 2) System.out.print(s8);
                else if (i == c12345678 + c12345678910 + 2) System.out.print(s9);
                else if (i == c123456789 + c12345678910 + 2) System.out.print(s10);
            } else {
                if (i == c12345678910 * 2 + 1) System.out.println();
                if (i == c12345678910 * 2 + 1 || i == c1 + c12345678910 * 2 || i == c12 + c12345678910 * 2 ||
                        i == c123 + c12345678910 * 2 || i == c1234 + c12345678910 * 2 || i == c12345 + c12345678910 * 2 ||
                        i == c123456 + c12345678910 * 2 || i == c1234567 + c12345678910 * 2 ||
                        i == c12345678 + c12345678910 * 2 || i == c123456789 + c12345678910 * 2 || i == c12345678910 * 3)
                    System.out.print("+");
                else
                    System.out.print("-");
            }
        }
    }
}
