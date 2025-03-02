package JDBC.HotelReservationSystem;

import JDBC.Table.Table;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HotelReservationSystem {
    public static final String url = "jdbc:mysql://localhost:3306/hotel_db";
    public static final String user = "root";
    public static final String password = "Ansh@2004";

    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.print(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            reservations(connection);

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }

    static void reservations(Connection connection){
        Scanner Sc = new Scanner(System.in);
        int option = -1;

        slowmo();
        while(option!=0){
            System.out.println("1. New Reservation");
            System.out.println("2. Check Reservations");
            System.out.println("3. Get Room Number");
            System.out.println("4. Update Reservation");
            System.out.println("5. Delete Reservation");
            System.out.println("6. Press 0 to Exit");
            System.out.print("Choose an Option: ");
            option = Sc.nextInt();
            if(option == 0) {
                System.out.print("Exiting System.");
                for(int i=0;i<7;i++){
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.print(".");
                }
                System.out.println();
                System.out.println("Thank you :)");
                break;
            }

            switch(option){
                case 1 :
                    newReservation(connection);
                    break;
                case 2 :
                    checkReservation(connection);
                    break;
                case 3 :
                    getRoomNum(connection);
                    break;
                case 4 :
                    updateReservation(connection);
                    break;
                case 5 :
                    deleteReservation(connection);
                    break;
                default: System.out.println("Invalid Option!!");
            }
            System.out.println();
        }

    }

    static void newReservation(Connection connection){
        System.out.println();
        Scanner Sc = new Scanner(System.in);
        String query = "INSERT INTO reservations (reservation_id, guest_name, room_number, contact_number) VALUES (?, ?, ?, ?)";


        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            System.out.print("Enter Reservation ID: ");
            int reservation_id = Sc.nextInt();

            System.out.print("Enter Guest Name: ");
            Sc.nextLine();
            String guest_name = Sc.nextLine();

            System.out.print("Enter Room Number: ");
            int room_num = Sc.nextInt();

            System.out.print("Enter Contact Number: ");
            Sc.nextLine();
            String contact_num = Sc.nextLine();

            preparedStatement.setInt(1, reservation_id);
            preparedStatement.setString(2, guest_name);
            preparedStatement.setInt(3, room_num);
            preparedStatement.setString(4, contact_num);

            preparedStatement.executeUpdate();
            System.out.print("Proceeding Reservation.");
            for(int i=0;i<8;i++) {
                try {
                    Thread.sleep(200);
                    System.out.print(".");
                } catch (InterruptedException e) {
                    e.getMessage();
                }
            }
            System.out.println();
            System.out.println("Reservation Confirm");
            System.out.println("Thanks for the Reservation :)");

        }catch (SQLException | InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }

    static void checkReservation(Connection connection){
        System.out.println();
        String query = "SELECT * FROM reservations";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            System.out.print("Loading Reservations.");
            for(int i=0;i<8;i++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.print(".");
            }
            System.out.println();
            ResultSet resultSet = preparedStatement.executeQuery();

            Table.Print(connection, "reservations", resultSet);

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
    }

    static void getRoomNum(Connection connection){
        System.out.println();
        Scanner Sc = new Scanner(System.in);
        String query = "SELECT * FROM reservations WHERE reservation_id = ?";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            System.out.print("Enter Reservation Id: ");
            int r_id = Sc.nextInt();
            preparedStatement.setInt(1, r_id);
            System.out.print("Checking for the Reservation.");
            for(int i=0;i<8;i++){
                try {
                    Thread.sleep(200);
                    System.out.print(".");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println();
            ResultSet resultSet = preparedStatement.executeQuery();

            boolean status = Table.Print(connection, "reservations", resultSet);

            if(!status) System.out.print("Reservation Id "+r_id+" not found!!");

        }catch (SQLException e){
            e.getMessage();
        }
        System.out.println();
    }

    static void updateReservation(Connection connection){
        System.out.println();
        Scanner Sc = new Scanner(System.in);
        String query = "UPDATE reservations SET guest_name = ?, contact_number = ?, reservation_id = ?, reservation_date = CURRENT_TIMESTAMP WHERE reservation_id = ?";

        System.out.print("Enter Reservation Id: ");
        int id = Sc.nextInt();

        System.out.print("Enter Guest Name: ");
        Sc.nextLine();
        String name = Sc.nextLine();

        System.out.print("Enter Contact Number: ");
        String num = Sc.nextLine();

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(3, id);
            preparedStatement.setInt(4, id);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, num);

            System.out.print("Updating Reservations.");
            for(int i=0;i<8;i++){
                try {
                    Thread.sleep(200);
                    System.out.print(".");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            int n = preparedStatement.executeUpdate();
            System.out.println();
            if(n==0){
                System.out.println("Invalid Reservation ID '"+id+"'");
                return;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Reservation Updated");
    }

    static void deleteReservation(Connection connection){
        System.out.println();
        Scanner Sc = new Scanner(System.in);
        String query = "DELETE FROM reservations WHERE reservation_id = ?";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            System.out.print("Enter Reservation ID: ");
            int id = Sc.nextInt();

            preparedStatement.setInt(1, id);
            int n = preparedStatement.executeUpdate();

            if(n==0){
                System.out.println("Invalid Reservation ID '"+id+"'");
                return;
            }
            System.out.print("Deleting Reservation Details.");

            for(int i=0;i<8;i++){
                try {
                    Thread.sleep(200);
                    System.out.print(".");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println();
            System.out.println("Reservation Deleted");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
    }

    static void slowmo(){
        System.out.println();
        String s = "Hotel Reservation System";

        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
            try {
                Thread.sleep(120);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
    }
}
