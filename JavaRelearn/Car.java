package JavaRelearn;

import java.util.Locale;

public class Car {

    private String make = "Innoson";
    private String model = "Ix 23.7";
    private String color = "Gray";
    private int doors = 0;
    private boolean convertible = true;
    private boolean commercial = false;

    //GETTERS.
    //Getters and Setters are a way to get data from and set data to - respectively - a field variable without making the variables public. This approach is called 'Encapsulation'.
    public String getMake(){
        return  make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
//        if (convertible){
//            commercial = true;
//        }
        return convertible;
    }

    public boolean isCommercial() {
//        if (commercial)
//            convertible = false;
//
        return commercial;
    }

    //SETTERS
    // It's important to use getters and setters, so we can encapsulate important data, but also so we can make rules
    //within which our class variables are used and instantiated.
    public void setMake(String make) {

        this.make = make;

/*        if (make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase();

        switch (lowerCaseMake){
            case "innoson" :
            case "lamborghini" :
            case "porsche" :
                this.make = make;
            break;
            default: this.make = "Unsupported";
            break;
        }
 */
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        //If it's not a commercial vehicle, then the number of doors ought to be even!
        if ((!commercial && (doors / 2 != 0)) || doors < 1) {
            System.out.println("Unsupported Doors Number");
        }

        else this.doors = doors;

    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setCommercial(boolean commercial) {
        this.commercial = commercial;
    }

    public void describeCar(){
        System.out.println(doors + "-Door " + color + " " + make + " " + model + " " + (convertible ? "Convertible" : ""));
    }
}
