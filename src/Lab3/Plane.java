package Lab3;

import java.util.ArrayList;

public class Plane {
    private static final int MAX_SEATS = 12;
    private PlaneSeat[] plane;
    private int numEmptySeat;

    public Plane() {

    }

    // simple bubble sort
    private PlaneSeat[] sortSeats() {
        PlaneSeat[] copy = this.plane;
        for(int i = 0; i<MAX_SEATS-1; i++) {
            if(copy[i].getCustomerId()>copy[i+1].getCustomerId()){
                int temp = copy[i+1].getCustomerId();
                copy[i+1].assign(copy[i].getCustomerId());
                copy[i].assign(temp);
            }
        }
        return copy;
    }

    public void showNumEmptySeats() {
        System.out.println("Number of empty seats: " + numEmptySeat);
    }

    public void showEmptySeats() {
        ArrayList<Integer> emptySeatList = new ArrayList<>();
        for(int i = 0; i<MAX_SEATS; i++) {
            if(!plane[i].isOccupied()) {
                emptySeatList.add(i);
            }
        }
        System.out.println("List of empty seats");
        for(Integer i:emptySeatList) {
            System.out.println(i);
        }
    }

    public void showAssignedSeats(boolean bySeatId) {
        ArrayList<Integer> assignedSeatList = new ArrayList<>();
        for(int i = 0; i<MAX_SEATS; i++) {
            if(plane[i].isOccupied()) {
                assignedSeatList.add(i);
            }
        }
        System.out.println("List of empty seats");
        for(Integer i: assignedSeatList) {
            System.out.println(i);
        }
    }

    public void assignSeat(int seatId, int cust_id) {
        plane[seatId].assign(cust_id);
    }

    public void unAssignSeat(int seatId) {
        plane[seatId].unAssign();
    }
}
