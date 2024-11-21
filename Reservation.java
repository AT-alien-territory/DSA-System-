package BBS;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {
    // Properties of Reservation
    private String reservationId;     // Unique identifier for each reservation
    private String customerName;      // From the registered customer details
    private String mobileNumber;      // From the registered customer details
    private String emailId;           // From the registered customer details
    private String busNumber;         // The bus on which the seat is being reserved       
    private String startingPoint;     // Where the journey starts
    private String endingPoint;       // Where the journey ends
    private LocalTime startingTime;   // Time when the bus departs
    private double fare;              // The cost of the ticket
    private LocalDate reservationDate; // When the reservation was made
    private String reservationStatus;  // e.g., confirmed, canceled, or waiting

   
    // Getters and Setters for each property
    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }
    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public String getEndingPoint() {
        return endingPoint;
    }

    public void setEndingPoint(String endingPoint) {
        this.endingPoint = endingPoint;
    }

    public LocalTime getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(LocalTime startingTime) {
        this.startingTime = startingTime;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }
    
    public Reservation(){}
    public Reservation(String reservationId, String customerName, String mobileNumber, String emailId,
                   String busNumber, String startingPoint, String endingPoint,
                   LocalTime startingTime, double fare, LocalDate reservationDate, String reservationStatus) {
    this.reservationId = reservationId;
    this.customerName = customerName;
    this.mobileNumber = mobileNumber;
    this.emailId = emailId;
    this.busNumber = busNumber;
    this.startingPoint = startingPoint;
    this.endingPoint = endingPoint;
    this.startingTime = startingTime;
    this.fare = fare;
    this.reservationDate = reservationDate;
    this.reservationStatus = reservationStatus;
}
@Override
public String toString() {
    return "Reservation{" +
            "reservationId='" + reservationId + '\'' +
            ", customerName='" + customerName + '\'' +
            ", mobileNumber='" + mobileNumber + '\'' +
            ", emailId='" + emailId + '\'' +
            ", busNumber='" + busNumber + '\'' +
            ", startingPoint='" + startingPoint + '\'' +
            ", endingPoint='" + endingPoint + '\'' +
            ", startingTime=" + startingTime +
            ", fare=" + fare +
            ", reservationDate=" + reservationDate +
            ", reservationStatus='" + reservationStatus + '\'' +
            '}';
}


}
