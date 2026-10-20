package Reservation_Q6_Correction;

class Reservation {

    private int reservationId;
    private String customerName;
    private String date;
    private String status;


    Reservation(int reservationId, String customerName, String date) {
        this.reservationId = reservationId;
        this.customerName = customerName;
        this.date = date;
        this.status = "Confirmed";
    }


    public int getReservationId() {
        return reservationId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }


    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public void checkReservationStatus() {
        System.out.println("Reservation Status: " + getStatus());
    }


    public void displayReservation() {

        System.out.println("\n========== RESERVATION DETAILS ==========");
        System.out.println("Reservation ID : " + getReservationId());
        System.out.println("Customer Name  : " + getCustomerName());
        System.out.println("Date           : " + getDate());
        System.out.println("Status         : " + getStatus());
    }
}

