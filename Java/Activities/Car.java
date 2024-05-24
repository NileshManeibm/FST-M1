package Activities;

public class Car {
        String color;
        String transmission;
        int make ;
        int tyres;
        int doors;
    Car(){
        this.tyres =4;
        this.doors =4;
            }
            public void displayCharacteristic(){
            System.out.println(" displays the values of color variables" +color);
                System.out.println(" displays the values of color variables" +transmission);
                System.out.println(" displays the values of color variables" +make);
                System.out.println(" displays the values of color variables" +tyres);
                System.out.println(" displays the values of color variables" +doors);
            }
            public void accelerate(){
                System.out.println("Car is Moveing Forword");
            }
            public void brak(){
        System.out.println("Car has Stopped ");

    }


}
