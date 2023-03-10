package homework.model;

import org.junit.jupiter.api.Test;

import java.util.Objects;
class ResultTest {

    String MGender = "M";
    String FGender = "F";
    
    String five_km = "5 км";
    String ten_km = "10 км";

    String name = "name";

    @Test
    void hasGender() {
        if (Objects.equals(this.MGender, "M")){
            System.out.println(MGender);
        } else if (Objects.equals(this.FGender, "F")) {
            System.out.println(FGender);
        } else {
            System.out.println("Error! No gender");
        }
    }

    @Test
    void hasDistance() {
        if (Objects.equals(this.five_km, "5 км")) {
            System.out.println(five_km);
        } else if (Objects.equals(this.ten_km, "10 км")) {
            System.out.println(ten_km);
        } else {
            System.out.println("Error! No distance");
        }
    }

    @Test
    void person() {
        if (Objects.equals(this.name, "name")){
            System.out.println(name);
        } else {
            System.out.println("Error! No name");
        }
    }
}