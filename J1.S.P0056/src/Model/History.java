package Model;

public class History extends Worker implements Comparable<History> {

    private String status;
    private String date;

    public History() {
    }

    public History(String status, String date) {
        this.status = status;
        this.date = date;
    }

    public History(String status, String date, String id, String name, int age, int salary, String workerlocation) {
        super(id, name, age, salary, workerlocation);
        this.status = status;
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public int compareTo(History o) {
        return this.getId().compareTo(o.getId());
    }
}
