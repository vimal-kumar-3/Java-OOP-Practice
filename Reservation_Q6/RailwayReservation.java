package Reservation_Q6_Correction;

class RailwayReservation extends Reservation {

    private int seatNumber;


    RailwayReservation(int reservationId, String customerName,
                       String date, int seatNumber) {

        super(reservationId, customerName, date);

        this.seatNumber = seatNumber;
    }


    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }


    public void displayReservation() {

        super.displayReservation();

        System.out.println("Seat Number    : " + getSeatNumber());
        System.out.println("==========================================");
    }
}