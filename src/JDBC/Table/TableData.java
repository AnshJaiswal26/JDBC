package JDBC.Table;


public class TableData {

    public static <T> void print(int c1,T val1){
        String s1 = val1.toString();

        for(int i=1;i<=c1;i++){
            if(i==1) System.out.println();
            if(i==1 || i == c1) System.out.print("|");
            else if(i==2 || i>s1.length()+2 && i<c1) System.out.print(" ");
            else if (i==3) System.out.print(s1);
        }
    }

    public static <T> void print(int c1,T val1, int c2, T val2 ){
        String s1 = val1.toString();
        String s2 = val2.toString();

        for(int i=1;i<=(c1+c2)*2;i++){
            if(i==1) System.out.println();
            if(i==1 || i == c1 || i==(c1+c2)) System.out.print("|");
            else if(i==2 || i>s1.length()+2 && i<c1) System.out.print(" ");
            else if(i==c1+1 || i>s2.length()+c1+1 && i<(c1+c2)) System.out.print(" ");
            else if (i==3) System.out.print(s1);
            else if(i==c1+2) System.out.print(s2);
        }
    }

    public static <T> void print(int c1,T val1, int c2, T val2, int c3, T val3){
        String s1 = val1.toString();
        String s2 = val2.toString();
        String s3 = val3.toString();
        int c12 = c1+c2;
        int c123 = c1+c2+c3;

        for(int i=1;i<=(c123);i++){
            if(i==1) System.out.println();
            if(i==1 || i == c1 || i == c12 || i==(c123)) System.out.print("|");
            else if(i==2 || i>s1.length()+2 && i<c1) System.out.print(" ");
            else if(i==c1+1 || i>s2.length()+c1+1 && i<c12) System.out.print(" ");
            else if(i==c12+1 || i>s3.length()+c12+1 && i<(c123)) System.out.print(" ");
            else if (i==3) System.out.print(s1);
            else if(i==c1+2) System.out.print(s2);
            else if(i==c12+2) System.out.print(s3);
        }
    }

    public static <T> void print(int c1, T val1, int c2, T val2, int c3, T val3, int c4, T val4){
        String s1 = val1.toString();
        String s2 = val2.toString();
        String s3 = val3.toString();
        String s4 = val4.toString();
        int c12 = c1+c2;
        int c123 = c1+c2+c3;
        int c1234 = c1+c2+c3+c4;

        for(int i=1;i<=(c1234);i++){
            if(i==1) System.out.println();
            if(i==1 || i == c1 || i == c12 || i == c123 || i==(c1234)) System.out.print("|");
            else if(i==2 || i>s1.length()+2 && i<c1) System.out.print(" ");
            else if(i==c1+1 || i>s2.length()+c1+1 && i<c12) System.out.print(" ");
            else if(i==c12+1 || i>s3.length()+c12+1 && i<c123) System.out.print(" ");
            else if(i==c123+1 || i>s4.length()+c123+1 && i<(c1234)) System.out.print(" ");
            else if(i==3) System.out.print(s1);
            else if(i==c1+2) System.out.print(s2);
            else if(i==c12+2) System.out.print(s3);
            else if(i==c123+2) System.out.print(s4);
        }
    }

    public static <T> void print(int c1, T val1, int c2, T val2, int c3, T val3, int c4, T val4, int c5, T val5){
        String s1 = val1.toString();
        String s2 = val2.toString();
        String s3 = val3.toString();
        String s4 = val4.toString();
        String s5 = val5.toString();
        int c12 = c1+c2;
        int c123 = c1+c2+c3;
        int c1234 = c1+c2+c3+c4;
        int c12345 = c1+c2+c3+c4+c5;

        for(int i=1;i<=(c12345);i++){
            if(i==1) System.out.println();
            if(i==1 || i == c1 || i == c12 || i == c123 || i == c1234 || i == (c12345)) System.out.print("|");
            else if(i==2 || i>s1.length()+2 && i<c1) System.out.print(" ");
            else if(i==c1+1 || i>s2.length()+c1+1 && i<c12) System.out.print(" ");
            else if(i==c12+1 || i>s3.length()+c12+1 && i<c123) System.out.print(" ");
            else if(i==c123+1 || i>s4.length()+c123+1 && i<c1234) System.out.print(" ");
            else if(i==c1234+1 || i>s5.length()+c1234+1 && i<c12345) System.out.print(" ");
            else if(i==3) System.out.print(s1);
            else if(i==c1+2) System.out.print(s2);
            else if(i==c12+2) System.out.print(s3);
            else if(i==c123+2) System.out.print(s4);
            else if(i==c1234+2) System.out.print(s5);
        }
    }

    public static <T> void print(int c1, T val1, int c2, T val2, int c3, T val3, int c4, T val4, int c5, T val5, int c6, T val6){
        String s1 = val1.toString();
        String s2 = val2.toString();
        String s3 = val3.toString();
        String s4 = val4.toString();
        String s5 = val5.toString();
        String s6 = val6.toString();
        int c12 = c1+c2;
        int c123 = c1+c2+c3;
        int c1234 = c1+c2+c3+c4;
        int c12345 = c1+c2+c3+c4+c5;
        int c123456 = c1+c2+c3+c4+c5+c6;

        for(int i=1;i<=(c123456);i++){
            if(i==1) System.out.println();
            if(i==1 || i == c1 || i == c12 || i == c123 || i == c1234 || i == c12345 || i == c123456) System.out.print("|");
            else if(i==2 || i>s1.length()+2 && i<c1) System.out.print(" ");
            else if(i==c1+1 || i>s2.length()+c1+1 && i<c12) System.out.print(" ");
            else if(i==c12+1 || i>s3.length()+c12+1 && i<c123) System.out.print(" ");
            else if(i==c123+1 || i>s4.length()+c123+1 && i<c1234) System.out.print(" ");
            else if(i==c1234+1 || i>s5.length()+c1234+1 && i<c12345) System.out.print(" ");
            else if(i==c12345+1 || i>s6.length()+c12345+1 && i<c123456) System.out.print(" ");
            else if(i==3) System.out.print(s1);
            else if(i==c1+2) System.out.print(s2);
            else if(i==c12+2) System.out.print(s3);
            else if(i==c123+2) System.out.print(s4);
            else if(i==c1234+2) System.out.print(s5);
            else if(i==c12345+2) System.out.print(s6);
        }
    }

    public static <T> void print(int c1, T val1, int c2, T val2, int c3, T val3, int c4, T val4, int c5, T val5, int c6, T val6, int c7, T val7){
        String s1 = val1.toString();
        String s2 = val2.toString();
        String s3 = val3.toString();
        String s4 = val4.toString();
        String s5 = val5.toString();
        String s6 = val6.toString();
        String s7 = val7.toString();
        int c12 = c1+c2;
        int c123 = c1+c2+c3;
        int c1234 = c1+c2+c3+c4;
        int c12345 = c1+c2+c3+c4+c5;
        int c123456 = c1+c2+c3+c4+c5+c6;
        int c1234567 = c1+c2+c3+c4+c5+c6+c7;

        for(int i=1;i<=(c1234567);i++){
            if(i==1) System.out.println();
            if(i==1 || i == c1 || i == c12 || i == c123 || i == c1234 || i == c12345 || i == c123456 || i == c1234567) System.out.print("|");
            else if(i==2 || i>s1.length()+2 && i<c1) System.out.print(" ");
            else if(i==c1+1 || i>s2.length()+c1+1 && i<c12) System.out.print(" ");
            else if(i==c12+1 || i>s3.length()+c12+1 && i<c123) System.out.print(" ");
            else if(i==c123+1 || i>s4.length()+c123+1 && i<c1234) System.out.print(" ");
            else if(i==c1234+1 || i>s5.length()+c1234+1 && i<c12345) System.out.print(" ");
            else if(i==c12345+1 || i>s6.length()+c12345+1 && i<c123456) System.out.print(" ");
            else if(i==c123456+1 || i>s7.length()+c123456+1 && i<c1234567) System.out.print(" ");
            else if(i==3) System.out.print(s1);
            else if(i==c1+2) System.out.print(s2);
            else if(i==c12+2) System.out.print(s3);
            else if(i==c123+2) System.out.print(s4);
            else if(i==c1234+2) System.out.print(s5);
            else if(i==c12345+2) System.out.print(s6);
            else if(i==c123456+2) System.out.print(s7);
        }
    }

    public static <T> void print(int c1, T val1, int c2, T val2, int c3, T val3, int c4, T val4, int c5, T val5, int c6, T val6, int c7, T val7,  int c8, T val8){
        String s1 = val1.toString();
        String s2 = val2.toString();
        String s3 = val3.toString();
        String s4 = val4.toString();
        String s5 = val5.toString();
        String s6 = val6.toString();
        String s7 = val7.toString();
        String s8 = val8.toString();
        int c12 = c1+c2;
        int c123 = c1+c2+c3;
        int c1234 = c1+c2+c3+c4;
        int c12345 = c1+c2+c3+c4+c5;
        int c123456 = c1+c2+c3+c4+c5+c6;
        int c1234567 = c1+c2+c3+c4+c5+c6+c7;
        int c12345678 = c1+c2+c3+c4+c5+c6+c7+c8;

        for(int i=1;i<=(c12345678);i++){
            if(i==1) System.out.println();
            if(i==1 || i == c1 || i == c12 || i == c123 || i == c1234 || i == c12345 || i == c123456 || i == c1234567 || i == c12345678) System.out.print("|");
            else if(i==2 || i>s1.length()+2 && i<c1) System.out.print(" ");
            else if(i==c1+1 || i>s2.length()+c1+1 && i<c12) System.out.print(" ");
            else if(i==c12+1 || i>s3.length()+c12+1 && i<c123) System.out.print(" ");
            else if(i==c123+1 || i>s4.length()+c123+1 && i<c1234) System.out.print(" ");
            else if(i==c1234+1 || i>s5.length()+c1234+1 && i<c12345) System.out.print(" ");
            else if(i==c12345+1 || i>s6.length()+c12345+1 && i<c123456) System.out.print(" ");
            else if(i==c123456+1 || i>s7.length()+c123456+1 && i<c1234567) System.out.print(" ");
            else if(i==c1234567+1 || i>s8.length()+c1234567+1 && i<c12345678) System.out.print(" ");
            else if(i==3) System.out.print(s1);
            else if(i==c1+2) System.out.print(s2);
            else if(i==c12+2) System.out.print(s3);
            else if(i==c123+2) System.out.print(s4);
            else if(i==c1234+2) System.out.print(s5);
            else if(i==c12345+2) System.out.print(s6);
            else if(i==c123456+2) System.out.print(s7);
            else if(i==c1234567+2) System.out.print(s8);
        }
    }

    public static <T> void print(int c1, T val1, int c2, T val2, int c3, T val3, int c4, T val4, int c5, T val5, int c6, T val6, int c7, T val7,  int c8, T val8, int c9, T val9){
        String s1 = val1.toString();
        String s2 = val2.toString();
        String s3 = val3.toString();
        String s4 = val4.toString();
        String s5 = val5.toString();
        String s6 = val6.toString();
        String s7 = val7.toString();
        String s8 = val8.toString();
        String s9 = val9.toString();
        int c12 = c1+c2;
        int c123 = c1+c2+c3;
        int c1234 = c1+c2+c3+c4;
        int c12345 = c1+c2+c3+c4+c5;
        int c123456 = c1+c2+c3+c4+c5+c6;
        int c1234567 = c1+c2+c3+c4+c5+c6+c7;
        int c12345678 = c1+c2+c3+c4+c5+c6+c7+c8;
        int c123456789 = c12345678+c9;

        for(int i=1;i<=(c123456789);i++){
            if(i==1) System.out.println();
            if(i==1 || i == c1 || i == c12 || i == c123 || i == c1234 || i == c12345 || i == c123456 || i == c1234567 || i == c12345678 || i == c123456789) System.out.print("|");
            else if(i==2 || i>s1.length()+2 && i<c1) System.out.print(" ");
            else if(i==c1+1 || i>s2.length()+c1+1 && i<c12) System.out.print(" ");
            else if(i==c12+1 || i>s3.length()+c12+1 && i<c123) System.out.print(" ");
            else if(i==c123+1 || i>s4.length()+c123+1 && i<c1234) System.out.print(" ");
            else if(i==c1234+1 || i>s5.length()+c1234+1 && i<c12345) System.out.print(" ");
            else if(i==c12345+1 || i>s6.length()+c12345+1 && i<c123456) System.out.print(" ");
            else if(i==c123456+1 || i>s7.length()+c123456+1 && i<c1234567) System.out.print(" ");
            else if(i==c1234567+1 || i>s8.length()+c1234567+1 && i<c12345678) System.out.print(" ");
            else if(i==c12345678+1 || i>s9.length()+c12345678+1 && i<c123456789) System.out.print(" ");
            else if(i==3) System.out.print(s1);
            else if(i==c1+2) System.out.print(s2);
            else if(i==c12+2) System.out.print(s3);
            else if(i==c123+2) System.out.print(s4);
            else if(i==c1234+2) System.out.print(s5);
            else if(i==c12345+2) System.out.print(s6);
            else if(i==c123456+2) System.out.print(s7);
            else if(i==c1234567+2) System.out.print(s8);
            else if(i==c12345678+2) System.out.print(s9);
        }
    }

    public static <T> void print(int c1, T val1, int c2, T val2, int c3, T val3, int c4, T val4, int c5, T val5, int c6, T val6, int c7, T val7,  int c8, T val8, int c9, T val9, int c10, T val10){
        String s1 = val1.toString();
        String s2 = val2.toString();
        String s3 = val3.toString();
        String s4 = val4.toString();
        String s5 = val5.toString();
        String s6 = val6.toString();
        String s7 = val7.toString();
        String s8 = val8.toString();
        String s9 = val9.toString();
        String s10 = val10.toString();
        int c12 = c1+c2;
        int c123 = c1+c2+c3;
        int c1234 = c1+c2+c3+c4;
        int c12345 = c1+c2+c3+c4+c5;
        int c123456 = c1+c2+c3+c4+c5+c6;
        int c1234567 = c1+c2+c3+c4+c5+c6+c7;
        int c12345678 = c1+c2+c3+c4+c5+c6+c7+c8;
        int c123456789 = c12345678+c9;
        int c12345678910 = c123456789+c10;

        for(int i=1;i<=(c12345678910);i++){
            if(i==1) System.out.println();
            if(i==1 || i == c1 || i == c12 || i == c123 || i == c1234 || i == c12345 || i == c123456 || i == c1234567 || i == c12345678 || i == c123456789 || i == c12345678910) System.out.print("|");
            else if(i==2 || i>s1.length()+2 && i<c1) System.out.print(" ");
            else if(i==c1+1 || i>s2.length()+c1+1 && i<c12) System.out.print(" ");
            else if(i==c12+1 || i>s3.length()+c12+1 && i<c123) System.out.print(" ");
            else if(i==c123+1 || i>s4.length()+c123+1 && i<c1234) System.out.print(" ");
            else if(i==c1234+1 || i>s5.length()+c1234+1 && i<c12345) System.out.print(" ");
            else if(i==c12345+1 || i>s6.length()+c12345+1 && i<c123456) System.out.print(" ");
            else if(i==c123456+1 || i>s7.length()+c123456+1 && i<c1234567) System.out.print(" ");
            else if(i==c1234567+1 || i>s8.length()+c1234567+1 && i<c12345678) System.out.print(" ");
            else if(i==c12345678+1 || i>s9.length()+c12345678+1 && i<c123456789) System.out.print(" ");
            else if(i==c123456789+1 || i>s10.length()+c123456789+1 && i<c12345678910) System.out.print(" ");
            else if(i==3) System.out.print(s1);
            else if(i==c1+2) System.out.print(s2);
            else if(i==c12+2) System.out.print(s3);
            else if(i==c123+2) System.out.print(s4);
            else if(i==c1234+2) System.out.print(s5);
            else if(i==c12345+2) System.out.print(s6);
            else if(i==c123456+2) System.out.print(s7);
            else if(i==c1234567+2) System.out.print(s8);
            else if(i==c12345678+2) System.out.print(s9);
            else if(i==c123456789+2) System.out.print(s10);
        }
    }
}
