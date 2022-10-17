package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date dataVencimentoBoleto = simpleDateFormat.parse("18/10/2022");

        Date dataAtualHoje = simpleDateFormat.parse("17/10/2022");

        if (dataVencimentoBoleto.after(dataAtualHoje)) {
            System.out.println("Boleto nao vencindo");
        } else {
            System.out.println("Boleto esta vencido");
        }
    }
}
