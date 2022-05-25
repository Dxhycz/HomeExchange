package main.java.Model;

public class House {
    private String houseId;
    private String adress;
    private String city;
    private String code_postal;
    private String country;
    private String date_start;
    private String date_fin;
    private String num_people;
    private String house_type;
    private String description;

    private String constraints;

    public House(String adress, String city, String code_postal, String country, String date_start, String date_fin, String num_people, String house_type, String description) {
        this.adress = adress;
        this.city = city;
        this.code_postal = code_postal;
        this.country = country;
        this.date_start = date_start;
        this.date_fin = date_fin;
        this.num_people = num_people;
        this.house_type = house_type;
        this.description = description;
    }

    public House() {
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate_start() {
        return date_start;
    }

    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }

    public String getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }

    public String getNum_people() {
        return num_people;
    }

    public void setNum_people(String num_people) {
        this.num_people = num_people;
    }

    public String getHouse_type() {
        return house_type;
    }

    public void setHouse_type(String house_type) {
        this.house_type = house_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getConstraints() { return constraints; }

    public void setConstraints(String constraints) {
        this.constraints = constraints;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseId='" + houseId + '\'' +
                ", adress='" + adress + '\'' +
                ", city='" + city + '\'' +
                ", code_postal='" + code_postal + '\'' +
                ", country='" + country + '\'' +
                ", date_start='" + date_start + '\'' +
                ", date_fin='" + date_fin + '\'' +
                ", num_people=" + num_people +
                ", house_type='" + house_type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }


}
