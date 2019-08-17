package Lab3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Plane {
    private static final int MAX_SEATS = 12;
    private PlaneSeat[] plane;
    private int numEmptySeat;

    public Plane() {
        numEmptySeat = MAX_SEATS;
        plane = new PlaneSeat[MAX_SEATS];
        for(int i = 0; i<MAX_SEATS; i++) {
            plane[i] = new PlaneSeat(i+1);
        }
    }

    // returns an array of (only) occupied plane seats that are sorted
    private PlaneSeat[] sortSeats() {
        ArrayList<PlaneSeat> copy = new ArrayList<>();
        for(int i = 0; i<plane.length;i++) {
            if(plane[i].isOccupied()) {
                copy.add(plane[i]);
            }
        }
        for(int i = 0; i<copy.size();i++) {
            for(int j = 0; j<copy.size()-1;j++) {
                if (copy.get(j).getCustomerId() > copy.get(j + 1).getCustomerId()) {
                    PlaneSeat temp = copy.get(j);
                    copy.set(j, copy.get(j+1));
                    copy.set(j+1,temp);
                }
            }
        }
        return copy.toArray(new PlaneSeat[copy.size()]);
    }

    public void showNumEmptySeats() {
        System.out.printf("   There are %d empty seats\n", numEmptySeat);
    }

    public void showEmptySeats() {
        System.out.println("    The following seats are empty: ");
        for (PlaneSeat seat:plane) {
            if(!seat.isOccupied())
            System.out.println("    SeatID " + seat.getSeatId());
        }
    }

    public void showAssignedSeats(boolean bySeatId) {
        ArrayList<PlaneSeat> assignedSeatList = new ArrayList<>();


        System.out.println("    The seat assignments are as follow: ");
        if(bySeatId) {
            for(PlaneSeat seat:plane) {
                if (seat.isOccupied()) {
                    assignedSeatList.add(seat);
                }
            }
        }

        else {
            PlaneSeat[] sorted = sortSeats();
            for(PlaneSeat seat:sorted) {
                if (seat.isOccupied()) {
                    assignedSeatList.add(seat);
                }
            }
        }

        for (PlaneSeat seat : assignedSeatList) {
            System.out.println("    SeatID " + seat.getSeatId()
                    + " assigned to CustomerID " + seat.getCustomerId() + ".");
        }

    }

    public void assignSeat(int seatId, int cust_id) {
        if(plane[seatId-1].isOccupied()) {
            System.out.println("Seat already assigned to a customer.");
            return;
        }
        plane[seatId-1].assign(cust_id);
        numEmptySeat--;
    }

    public void unAssignSeat(int seatId) {
        plane[seatId-1].unAssign();
        numEmptySeat++;
    }
}
