package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

    public static void main(String[] args) throws ParseException {

     /* Calendar calendar = Calendar.getInstance();*//*usa data atual*//*

      *//*simular que a data vem do bacnoc de dados*//*

      calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2022"));*//*definindo data qualquer*//*

      calendar.add(Calendar.DAY_OF_MONTH, 5);

        System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));*/



        /*long dias = ChronoUnit.DAYS.between(LocalDate.parse("2022-02-01"), LocalDate.now());
        System.out.println("Possui " + dias + " entrre a faixa de data");*/

       Date dateInicial =  new SimpleDateFormat("dd/MM/yyyy").parse("08/04/2021");

       Calendar calendar = Calendar.getInstance();
       calendar.setTime(dateInicial);

       for (int parcela = 1; parcela <= 12; parcela ++){
           calendar.add(Calendar.MONTH, 1);

           System.out.println("Parcela  de Número " + parcela  + " com vencimento em: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
       }


    }
}
