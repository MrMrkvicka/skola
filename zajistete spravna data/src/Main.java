import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        try{
            new Modelar("x", LocalDate.now()); //jmeno null nebo mezera
        }catch (IllegalArgumentException ex){
            System.err.println(ex.getLocalizedMessage());
        }

    }
}