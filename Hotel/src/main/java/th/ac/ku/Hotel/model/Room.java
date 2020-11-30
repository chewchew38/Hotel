package th.ac.ku.Hotel.model;

public class Room {
    private int no;
    private String type;
    private String bed;

    public Room(int no, String type, String bed) {
        this.no = no;
        this.type = type;
        this.bed = bed;
    }
    public Room(){}
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }
}
