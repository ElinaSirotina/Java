public class Card {
    long number;
    String name;
    int cvv;
    String data;
    public Card(long number,String name, int cvv, String data) {
        this.number = number;
        this.name = name;
        this.cvv = cvv;
        this.data = data;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}