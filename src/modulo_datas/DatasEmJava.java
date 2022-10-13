package modulo_datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {

    public static void main(String[] args) {

        Date date = new Date();

        System.out.println("data  " + date);

        /*------simple date format-------*/

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("data atual em formato padrao e string " + simpleDateFormat.format(date));
    }
}
