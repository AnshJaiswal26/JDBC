package JDBC.Table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.*;

public class Table {

    public static boolean Print(Connection c, String table_name, ResultSet rs) {
        List<String> col_labels = TableFunctions.findAllCol(c, table_name);

        if(col_labels.size() == 1){

            String s1 = col_labels.get(0);
            List<String> list = new ArrayList<>();
            int max = s1.length();
            try {
                while (rs.next()) {
                    String col1 = rs.getString(s1);
                    list.add(col1);
                }
                Optional<String> op = list.stream().max((x1, x2) -> x1.length() - x2.length());
                if(!op.isPresent()) return false;
                max = Math.max(op.get().length(), max);

                TableHeader.print(max, s1);
                for (int i = 0; i < list.size(); i++) {
                    TableData.print(max, list.get(i));
                }
                TableLiner.print(max);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(col_labels.size() == 2){

            String s1 = col_labels.get(0);
            String s2 = col_labels.get(1);
            List<String> list1 = new ArrayList<>();
            List<String> list2 = new ArrayList<>();
            int max1 = s1.length(), max2 = s2.length();
            try {

                while (rs.next()) {
                    String col1 = rs.getString(s1);
                    String col2 = rs.getString(s2);
                    list1.add(col1);
                    list2.add(col2);
                }
                Optional<String> op1 = list1.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op2 = list2.stream().max((x1, x2) -> x1.length() - x2.length());

                if(!op1.isPresent()) return false;

                max1 = Math.max(op1.get().length(), max1);
                max2 = Math.max(op2.get().length(), max2);

                TableHeader.print(max1, s1, max2, s2);
                for (int i = 0; i < list1.size(); i++) {
                    TableData.print(max1, list1.get(i), max2, list2.get(i));
                }
                TableLiner.print(max1, max2);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(col_labels.size() == 3){

            String s1 = col_labels.get(0);
            String s2 = col_labels.get(1);
            String s3 = col_labels.get(2);
            List<String> list1 = new ArrayList<>();
            List<String> list2 = new ArrayList<>();
            List<String> list3 = new ArrayList<>();
            int max1 = s1.length(), max2 = s2.length(), max3 = s3.length();
            try {
                while (rs.next()) {
                    String col1 = rs.getString(s1);
                    String col2 = rs.getString(s2);
                    String col3 = rs.getString(s3);
                    list1.add(col1);
                    list2.add(col2);
                    list3.add(col3);
                }
                Optional<String> op1 = list1.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op2 = list2.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op3 = list3.stream().max((x1, x2) -> x1.length() - x2.length());

                if(!op1.isPresent()) return false;

                max1 = Math.max(op1.get().length(), max1);
                max2 = Math.max(op2.get().length(), max2);
                max3 = Math.max(op3.get().length(), max3);

                TableHeader.print(max1, s1, max2, s2, max3, s3);
                for (int i = 0; i < list1.size(); i++) {
                    TableData.print(max1, list1.get(i), max2, list2.get(i), max3, list3.get(i));
                }
                TableLiner.print(max1, max2, max3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(col_labels.size() == 4){

            String s1 = col_labels.get(0);
            String s2 = col_labels.get(1);
            String s3 = col_labels.get(2);
            String s4 = col_labels.get(3);
            List<String> list1 = new ArrayList<>();
            List<String> list2 = new ArrayList<>();
            List<String> list3 = new ArrayList<>();
            List<String> list4 = new ArrayList<>();
            int max1 = s1.length(), max2 = s2.length(), max3 = s3.length(), max4 = s4.length();
            try {
                while (rs.next()) {
                    String col1 = rs.getString(s1);
                    String col2 = rs.getString(s2);
                    String col3 = rs.getString(s3);
                    String col4 = rs.getString(s4);
                    list1.add(col1);
                    list2.add(col2);
                    list3.add(col3);
                    list4.add(col4);
                }
                Optional<String> op1 = list1.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op2 = list2.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op3 = list3.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op4 = list4.stream().max((x1, x2) -> x1.length() - x2.length());

                if(!op1.isPresent()) return false;

                max1 = Math.max(op1.get().length(), max1)+4;
                max2 = Math.max(op2.get().length(), max2)+4;
                max3 = Math.max(op3.get().length(), max3)+4;
                max4 = Math.max(op4.get().length(), max4)+4;

                TableHeader.print(max1, s1, max2, s2, max3, s3, max4, s4);
                for (int i = 0; i < list1.size(); i++) {
                    TableData.print(max1, list1.get(i), max2, list2.get(i), max3, list3.get(i), max4, list4.get(i));
                }
                TableLiner.print(max1, max2, max3, max4);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(col_labels.size() == 5){

            String s1 = col_labels.get(0);
            String s2 = col_labels.get(1);
            String s3 = col_labels.get(2);
            String s4 = col_labels.get(3);
            String s5 = col_labels.get(4);
            List<String> list1 = new ArrayList<>();
            List<String> list2 = new ArrayList<>();
            List<String> list3 = new ArrayList<>();
            List<String> list4 = new ArrayList<>();
            List<String> list5 = new ArrayList<>();
            int max1 = s1.length(), max2 = s2.length(), max3 = s3.length(), max4 = s4.length(), max5 = s5.length();
            try {
                while(rs.next()) {
                    String col1 = rs.getString(s1);
                    String col2 = rs.getString(s2);
                    String col3 = rs.getString(s3);
                    String col4 = rs.getString(s4);
                    String col5 = rs.getString(s5);
                    list1.add(col1);
                    list2.add(col2);
                    list3.add(col3);
                    list4.add(col4);
                    list5.add(col5);
                }

                Optional<String> op1 = list1.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op2 = list2.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op3 = list3.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op4 = list4.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op5 = list5.stream().max((x1, x2) -> x1.length() - x2.length());

                if(!op1.isPresent()) return false;

                if(op1.isPresent()) max1 = Math.max(op1.get().length(), max1)+4;
                if(op2.isPresent()) max2 = Math.max(op2.get().length(), max2)+4;
                if(op3.isPresent()) max3 = Math.max(op3.get().length(), max3)+4;
                if(op4.isPresent()) max4 = Math.max(op4.get().length(), max4)+4;
                if(op5.isPresent()) max5 = Math.max(op5.get().length(), max5)+4;

                TableHeader.print(max1, s1, max2, s2, max3, s3, max4, s4, max5, s5);
                for (int i = 0; i < list1.size(); i++) {
                    TableData.print(max1, list1.get(i), max2, list2.get(i), max3, list3.get(i), max4, list4.get(i), max5, list5.get(i));
                }
                TableLiner.print(max1, max2, max3, max4, max5);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(col_labels.size() == 6){

            String s1 = col_labels.get(0);
            String s2 = col_labels.get(1);
            String s3 = col_labels.get(2);
            String s4 = col_labels.get(3);
            String s5 = col_labels.get(4);
            String s6 = col_labels.get(5);
            List<String> list1 = new ArrayList<>();
            List<String> list2 = new ArrayList<>();
            List<String> list3 = new ArrayList<>();
            List<String> list4 = new ArrayList<>();
            List<String> list5 = new ArrayList<>();
            List<String> list6 = new ArrayList<>();
            int max1 = s1.length(), max2 = s2.length(), max3 = s3.length(), max4 = s4.length(), max5 = s5.length(), max6 = s6.length();
            try {
                while (rs.next()) {
                    String col1 = rs.getString(s1);
                    String col2 = rs.getString(s2);
                    String col3 = rs.getString(s3);
                    String col4 = rs.getString(s4);
                    String col5 = rs.getString(s5);
                    String col6 = rs.getString(s6);
                    list1.add(col1);
                    list2.add(col2);
                    list3.add(col3);
                    list4.add(col4);
                    list5.add(col5);
                    list6.add(col6);
                }
                Optional<String> op1 = list1.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op2 = list2.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op3 = list3.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op4 = list4.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op5 = list5.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op6 = list6.stream().max((x1, x2) -> x1.length() - x2.length());
                if(!op1.isPresent()) return false;
                max1 = Math.max(op1.get().length(), max1)+4;
                max2 = Math.max(op2.get().length(), max2)+4;
                max3 = Math.max(op3.get().length(), max3)+4;
                max4 = Math.max(op4.get().length(), max4)+4;
                max5 = Math.max(op5.get().length(), max5)+4;
                max6 = Math.max(op6.get().length(), max6)+4;

                TableHeader.print(max1, s1, max2, s2, max3, s3, max4, s4, max5, s5, max6, s6);
                for (int i = 0; i < list1.size(); i++) {
                    TableData.print(max1, list1.get(i), max2, list2.get(i), max3, list3.get(i), max4, list4.get(i), max5, list5.get(i), max6, list6.get(i));
                }
                TableLiner.print(max1, max2, max3, max4, max5, max6);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(col_labels.size() == 7){

            String s1 = col_labels.get(0);
            String s2 = col_labels.get(1);
            String s3 = col_labels.get(2);
            String s4 = col_labels.get(3);
            String s5 = col_labels.get(4);
            String s6 = col_labels.get(5);
            String s7 = col_labels.get(6);
            List<String> list1 = new ArrayList<>();
            List<String> list2 = new ArrayList<>();
            List<String> list3 = new ArrayList<>();
            List<String> list4 = new ArrayList<>();
            List<String> list5 = new ArrayList<>();
            List<String> list6 = new ArrayList<>();
            List<String> list7 = new ArrayList<>();
            int max1 = s1.length(), max2 = s2.length(), max3 = s3.length(), max4 = s4.length(), max5 = s5.length(), max6 = s6.length(), max7 = s7.length();
            try {
                while (rs.next()) {
                    String col1 = rs.getString(s1);
                    String col2 = rs.getString(s2);
                    String col3 = rs.getString(s3);
                    String col4 = rs.getString(s4);
                    String col5 = rs.getString(s5);
                    String col6 = rs.getString(s6);
                    String col7 = rs.getString(s7);
                    list1.add(col1);
                    list2.add(col2);
                    list3.add(col3);
                    list4.add(col4);
                    list5.add(col5);
                    list6.add(col6);
                    list7.add(col7);
                }
                Optional<String> op1 = list1.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op2 = list2.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op3 = list3.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op4 = list4.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op5 = list5.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op6 = list6.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op7 = list7.stream().max((x1, x2) -> x1.length() - x2.length());
                if(!op1.isPresent()) return false;
                max1 = Math.max(op1.get().length(), max1)+4;
                max2 = Math.max(op2.get().length(), max2)+4;
                max3 = Math.max(op3.get().length(), max3)+4;
                max4 = Math.max(op4.get().length(), max4)+4;
                max5 = Math.max(op5.get().length(), max5)+4;
                max6 = Math.max(op6.get().length(), max6)+4;
                max7 = Math.max(op7.get().length(), max7)+4;

                TableHeader.print(max1, s1, max2, s2, max3, s3, max4, s4, max5, s5, max6, s6, max7, s7);
                for (int i = 0; i < list1.size(); i++) {
                    TableData.print(max1, list1.get(i), max2, list2.get(i), max3, list3.get(i), max4, list4.get(i), max5, list5.get(i), max6, list6.get(i), max7, list7.get(i));
                }
                TableLiner.print(max1, max2, max3, max4, max5, max6, max7);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(col_labels.size() == 8){

            String s1 = col_labels.get(0);
            String s2 = col_labels.get(1);
            String s3 = col_labels.get(2);
            String s4 = col_labels.get(3);
            String s5 = col_labels.get(4);
            String s6 = col_labels.get(5);
            String s7 = col_labels.get(6);
            String s8 = col_labels.get(7);
            List<String> list1 = new ArrayList<>();
            List<String> list2 = new ArrayList<>();
            List<String> list3 = new ArrayList<>();
            List<String> list4 = new ArrayList<>();
            List<String> list5 = new ArrayList<>();
            List<String> list6 = new ArrayList<>();
            List<String> list7 = new ArrayList<>();
            List<String> list8 = new ArrayList<>();
            int max1 = s1.length(), max2 = s2.length(), max3 = s3.length(), max4 = s4.length(), max5 = s5.length(), max6 = s6.length(), max7 = s7.length(), max8 = s8.length();
            try {
                while (rs.next()) {
                    String col1 = rs.getString(s1);
                    String col2 = rs.getString(s2);
                    String col3 = rs.getString(s3);
                    String col4 = rs.getString(s4);
                    String col5 = rs.getString(s5);
                    String col6 = rs.getString(s6);
                    String col7 = rs.getString(s7);
                    String col8 = rs.getString(s8);
                    list1.add(col1);
                    list2.add(col2);
                    list3.add(col3);
                    list4.add(col4);
                    list5.add(col5);
                    list6.add(col6);
                    list7.add(col7);
                    list8.add(col8);
                }
                Optional<String> op1 = list1.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op2 = list2.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op3 = list3.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op4 = list4.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op5 = list5.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op6 = list6.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op7 = list7.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op8 = list8.stream().max((x1, x2) -> x1.length() - x2.length());
                if(!op1.isPresent()) return false;
                max1 = Math.max(op1.get().length(), max1)+4;
                max2 = Math.max(op2.get().length(), max2)+4;
                max3 = Math.max(op3.get().length(), max3)+4;
                max4 = Math.max(op4.get().length(), max4)+4;
                max5 = Math.max(op5.get().length(), max5)+4;
                max6 = Math.max(op6.get().length(), max6)+4;
                max7 = Math.max(op7.get().length(), max7)+4;
                max8 = Math.max(op8.get().length(), max8)+4;

                TableHeader.print(max1, s1, max2, s2, max3, s3, max4, s4, max5, s5, max6, s6, max7, s7, max8, s8);
                for (int i = 0; i < list1.size(); i++) {
                    TableData.print(max1, list1.get(i), max2, list2.get(i), max3, list3.get(i), max4, list4.get(i), max5, list5.get(i), max6, list6.get(i), max7, list7.get(i), max8, list8.get(i));
                }
                TableLiner.print(max1, max2, max3, max4, max5, max6, max7, max8);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(col_labels.size() == 9){

            String s1 = col_labels.get(0);
            String s2 = col_labels.get(1);
            String s3 = col_labels.get(2);
            String s4 = col_labels.get(3);
            String s5 = col_labels.get(4);
            String s6 = col_labels.get(5);
            String s7 = col_labels.get(6);
            String s8 = col_labels.get(7);
            String s9 = col_labels.get(8);
            List<String> list1 = new ArrayList<>();
            List<String> list2 = new ArrayList<>();
            List<String> list3 = new ArrayList<>();
            List<String> list4 = new ArrayList<>();
            List<String> list5 = new ArrayList<>();
            List<String> list6 = new ArrayList<>();
            List<String> list7 = new ArrayList<>();
            List<String> list8 = new ArrayList<>();
            List<String> list9 = new ArrayList<>();
            int max1 = s1.length(), max2 = s2.length(), max3 = s3.length(), max4 = s4.length(), max5 = s5.length(), max6 = s6.length(), max7 = s7.length(), max8 = s8.length(),  max9 = s9.length();
            try {
                while (rs.next()) {
                    String col1 = rs.getString(s1);
                    String col2 = rs.getString(s2);
                    String col3 = rs.getString(s3);
                    String col4 = rs.getString(s4);
                    String col5 = rs.getString(s5);
                    String col6 = rs.getString(s6);
                    String col7 = rs.getString(s7);
                    String col8 = rs.getString(s8);
                    String col9 = rs.getString(s9);
                    list1.add(col1);
                    list2.add(col2);
                    list3.add(col3);
                    list4.add(col4);
                    list5.add(col5);
                    list6.add(col6);
                    list7.add(col7);
                    list8.add(col8);
                    list9.add(col9);
                }
                Optional<String> op1 = list1.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op2 = list2.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op3 = list3.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op4 = list4.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op5 = list5.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op6 = list6.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op7 = list7.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op8 = list8.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op9 = list9.stream().max((x1, x2) -> x1.length() - x2.length());
                if(!op1.isPresent()) return false;
                max1 = Math.max(op1.get().length(), max1)+4;
                max2 = Math.max(op2.get().length(), max2)+4;
                max3 = Math.max(op3.get().length(), max3)+4;
                max4 = Math.max(op4.get().length(), max4)+4;
                max5 = Math.max(op5.get().length(), max5)+4;
                max6 = Math.max(op6.get().length(), max6)+4;
                max7 = Math.max(op7.get().length(), max7)+4;
                max8 = Math.max(op8.get().length(), max8)+4;
                max9 = Math.max(op9.get().length(), max9)+4;

                TableHeader.print(max1, s1, max2, s2, max3, s3, max4, s4, max5, s5, max6, s6, max7, s7, max8, s8, max9, s9);
                for (int i = 0; i < list1.size(); i++) {
                    TableData.print(max1, list1.get(i), max2, list2.get(i), max3, list3.get(i), max4, list4.get(i), max5, list5.get(i), max6, list6.get(i), max7, list7.get(i), max8, list8.get(i), max9, list9.get(i));
                }
                TableLiner.print(max1, max2, max3, max4, max5, max6, max7, max8, max9);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(col_labels.size() == 10){

            String s1 = col_labels.get(0);
            String s2 = col_labels.get(1);
            String s3 = col_labels.get(2);
            String s4 = col_labels.get(3);
            String s5 = col_labels.get(4);
            String s6 = col_labels.get(5);
            String s7 = col_labels.get(6);
            String s8 = col_labels.get(7);
            String s9 = col_labels.get(8);
            String s10 = col_labels.get(9);
            List<String> list1 = new ArrayList<>();
            List<String> list2 = new ArrayList<>();
            List<String> list3 = new ArrayList<>();
            List<String> list4 = new ArrayList<>();
            List<String> list5 = new ArrayList<>();
            List<String> list6 = new ArrayList<>();
            List<String> list7 = new ArrayList<>();
            List<String> list8 = new ArrayList<>();
            List<String> list9 = new ArrayList<>();
            List<String> list10 = new ArrayList<>();
            int max1 = s1.length(), max2 = s2.length(), max3 = s3.length(), max4 = s4.length(), max5 = s5.length(), max6 = s6.length(), max7 = s7.length(), max8 = s8.length(),  max9 = s9.length(), max10 = s10.length();
            try {
                while (rs.next()) {
                    String col1 = rs.getString(s1);
                    String col2 = rs.getString(s2);
                    String col3 = rs.getString(s3);
                    String col4 = rs.getString(s4);
                    String col5 = rs.getString(s5);
                    String col6 = rs.getString(s6);
                    String col7 = rs.getString(s7);
                    String col8 = rs.getString(s8);
                    String col9 = rs.getString(s9);
                    String col10 = rs.getString(s10);
                    list1.add(col1);
                    list2.add(col2);
                    list3.add(col3);
                    list4.add(col4);
                    list5.add(col5);
                    list6.add(col6);
                    list7.add(col7);
                    list8.add(col8);
                    list9.add(col9);
                    list9.add(col10);
                }
                Optional<String> op1 = list1.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op2 = list2.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op3 = list3.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op4 = list4.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op5 = list5.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op6 = list6.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op7 = list7.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op8 = list8.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op9 = list9.stream().max((x1, x2) -> x1.length() - x2.length());
                Optional<String> op10 = list10.stream().max((x1, x2) -> x1.length() - x2.length());
                if(!op1.isPresent()) return false;
                max1 = Math.max(op1.get().length(), max1)+4;
                max2 = Math.max(op2.get().length(), max2)+4;
                max3 = Math.max(op3.get().length(), max3)+4;
                max4 = Math.max(op4.get().length(), max4)+4;
                max5 = Math.max(op5.get().length(), max5)+4;
                max6 = Math.max(op6.get().length(), max6)+4;
                max7 = Math.max(op7.get().length(), max7)+4;
                max8 = Math.max(op8.get().length(), max8)+4;
                max9 = Math.max(op9.get().length(), max9)+4;
                max10 = Math.max(op10.get().length(), max10)+4;

                TableHeader.print(max1, s1, max2, s2, max3, s3, max4, s4, max5, s5, max6, s6, max7, s7, max8, s8, max9, s9, max10, s10);
                for (int i = 0; i < list1.size(); i++) {
                    TableData.print(max1, list1.get(i), max2, list2.get(i), max3, list3.get(i), max4, list4.get(i), max5, list5.get(i), max6, list6.get(i), max7, list7.get(i), max8, list8.get(i), max9, list9.get(i), max10, list10.get(i));
                }
                TableLiner.print(max1, max2, max3, max4, max5, max6, max7, max8, max9, max10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }
}