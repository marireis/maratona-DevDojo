package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {

        try {
            throw new RuntimeException();

        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RunTimeException");
        }

        try{
            tavezLanceException();
        }catch (IOException | SQLException e){
            e.printStackTrace();
        }
    }
    private static void tavezLanceException () throws SQLException, FileNotFoundException, IOException {

    }
}
