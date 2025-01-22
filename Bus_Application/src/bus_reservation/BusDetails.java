package bus_reservation;

public class BusDetails {
    private int busNo;
    private int capacity;
    private boolean busAC;

    public BusDetails(int busNo, int capacity, boolean busAC) {
        this.busNo = busNo;
        this.capacity = capacity;
        this.busAC = busAC;
    }

    public int getBusNo() {
        return busNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void busInformation() {
        System.out.println("Bus Number: " + busNo);
        System.out.println("Capacity: " + capacity);
        System.out.println("AC Available: " + (busAC ? "Yes" : "No"));
    }
}
