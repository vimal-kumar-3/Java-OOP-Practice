package Reservation_Q6_Correction;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("       RESERVATION MANAGEMENT SYSTEM");
        System.out.println("======================================");

        System.out.println("\nSelect Reservation Type:");
        System.out.println("1. Resort Reservation");
        System.out.println("2. Railway Reservation");

        System.out.print("Enter your choice: ");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Reservation ID: ");
        int reservationId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Reservation Date: ");
        String date = sc.nextLine();

        Reservation reservation;

        if (type == 1) {

            System.out.print("Enter Room Number: ");
            int roomNumber = sc.nextInt();

            reservation = new ResortReservation(
                    reservationId,
                    customerName,
                    date,
                    roomNumber
            );

        } else if (type == 2) {

            System.out.print("Enter Seat Number: ");
            int seatNumber = sc.nextInt();

            reservation = new RailwayReservation(
                    reservationId,
                    customerName,
                    date,
                    seatNumber
            );

        } else {

            System.out.println("Invalid reservation type!");
            sc.close();
            return;
        }

        System.out.println("\nReservation created successfully!");

        int choice;

        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. View Reservation Details");
            System.out.println("2. Check Reservation Status");
            System.out.println("3. Modify Customer Name");
            System.out.println("4. Modify Reservation Date");

            if (reservation instanceof ResortReservation) {
                System.out.println("5. Modify Room Number");
            } else {
                System.out.println("5. Modify Seat Number");
            }

            System.out.println("6. Cancel Reservation");
            System.out.println("7. Exit");
            System.out.println("==========================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    reservation.displayReservation();

                    break;


                case 2:

                    reservation.checkReservationStatus();

                    break;


                case 3:

                    System.out.print("Enter new customer name: ");
                    String newName = sc.nextLine();

                    reservation.setCustomerName(newName);

                    System.out.println("Customer name updated successfully!");

                    break;


                case 4:

                    System.out.print("Enter new reservation date: ");
                    String newDate = sc.nextLine();

                    reservation.setDate(newDate);

                    System.out.println("Reservation date updated successfully!");

                    break;


                case 5:

                    if (reservation instanceof ResortReservation) {

                        ResortReservation resort =
                                (ResortReservation) reservation;

                        System.out.print("Enter new room number: ");
                        int newRoom = sc.nextInt();

                        resort.setRoomNumber(newRoom);

                        System.out.println(
                                "Room number updated successfully!"
                        );

                    } else {

                        RailwayReservation railway =
                                (RailwayReservation) reservation;

                        System.out.print("Enter new seat number: ");
                        int newSeat = sc.nextInt();

                        railway.setSeatNumber(newSeat);

                        System.out.println(
                                "Seat number updated successfully!"
                        );
                    }

                    break;


                case 6:

                    reservation.setStatus("Cancelled");

                    System.out.println(
                            "Reservation cancelled successfully!"
                    );

                    break;


                case 7:

                    System.out.println(
                            "Thank you for using Reservation Management System!"
                    );

                    break;


                default:

                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}
