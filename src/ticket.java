public class ticket {
    private static int counter=1000;
    private int ticketID;
    private user user;
    private train train;
    private int sheatbooked;

    public ticket( user user, train train, int sheatbooked) {
        this.ticketID = counter++;
        this.user = user;
        this.train = train;
        this.sheatbooked = sheatbooked;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        ticket.counter = counter;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }

    public train getTrain() {
        return train;
    }

    public void setTrain(train train) {
        this.train = train;
    }

    public int getSheatbooked() {
        return sheatbooked;
    }

    public void setSheatbooked(int sheatbooked) {
        this.sheatbooked = sheatbooked;
    }

    @Override
    public String toString() {
        return "ticket ID"+ticketID+"| Train: "+train.getTrainName()+
                "  Route:"+ train.getSource()+"->"+ train.getDestination()+
                "|sheats:"+sheatbooked+" |booked by :"+user.getFullname();

    }
}
