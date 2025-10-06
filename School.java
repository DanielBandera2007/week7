public class School {
    private String name;
    private String city;
    public School(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    @Override
    public String toString() {
        return name + " (" + city + ")";
    }
}