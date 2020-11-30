package th.ac.ku.Hotel.model;

public class Bill {
    private int no;
    private int amount;
    private String Date;

    public Bill(int no, int amount, String date) {
        this.no = no;
        this.amount = amount;
        Date = date;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
