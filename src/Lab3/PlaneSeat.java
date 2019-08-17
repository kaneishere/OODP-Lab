package Lab3;

public class PlaneSeat {
    private int seatId;
    private boolean assigned = false;
    private int customerId = -1;

    public PlaneSeat(int seatId) {
        this.seatId = seatId;
    }

    public int getSeatId() {
        return seatId;
    }

    public boolean isOccupied() {
        return assigned;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void assign(int customerId) {
        this.customerId = customerId;
        assigned = true;
    }

    public void unAssign() {
        assigned = false;
        customerId = -1;
    }
}
