public class train {
    private int trainID;
    private String trainName;
    private String source;
    private String destination;
    private int totalSheats;
    private int availableSheats;

    public train(int trainID, String trainName, String source, String destination, int totalSheats) {
        this.trainID = trainID;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.totalSheats = totalSheats;
        this.availableSheats = totalSheats;
    }

    public int getTrainID() {
        return trainID;
    }

    public void setTrainID(int trainID) {
        this.trainID = trainID;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTotalSheats() {
        return totalSheats;
    }

    public void setTotalSheats(int totalSheats) {
        this.totalSheats = totalSheats;
    }

    public int getAvailableSheats() {
        return availableSheats;
    }

    public void setAvailableSheats(int availableSheats) {
        this.availableSheats = availableSheats;
    }
    public boolean bookSheats(int count){
        if(count<=availableSheats){
            availableSheats-=count;
            return true;
        }
        return false;
    }
    public void cancelSheats(int count){
        availableSheats+=count;
    }

    @Override
    public String toString() {
        return trainID +" | "+trainName+" | "+source+" -> "+destination+" Sheats Available "+availableSheats;
    }
}
