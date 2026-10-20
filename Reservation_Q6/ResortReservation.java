package Reservation_Q6_Correction;

class ResortReservation extends Reservation {

    private int roomNumber;


    ResortReservation(int reservationId, String customerName,
                      String date, int roomNumber) {

        super(reservationId, customerName, date);

        this.roomNumber = roomNumber;
    }


    public int getRoomNumber() {
        return roomNumber;
    }


    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }



    public void displayReservation() {

        super.displayReservation();

        System.out.println("Room Number    : " + getRoomNumber());
        System.out.println("==========================================");
    }
}
