package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

    public static void main(String[] args) throws ParseException, InterruptedException {

        /* Calendar calendar = Calendar.getInstance();*//*usa data atual*//*

         *//*simular que a data vem do bacnoc de dados*//*

      calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2022"));*//*definindo data qualquer*//*

      calendar.add(Calendar.DAY_OF_MONTH, 5);

        System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));*/



        /*long dias = ChronoUnit.DAYS.between(LocalDate.parse("2022-02-01"), LocalDate.now());
        System.out.println("Possui " + dias + " entrre a faixa de data");*/

       /*Date dateInicial =  new SimpleDateFormat("dd/MM/yyyy").parse("08/04/2021");

       Calendar calendar = Calendar.getInstance();
       calendar.setTime(dateInicial);*/

       /*for (int parcela = 1; parcela <= 12; parcela ++){
           calendar.add(Calendar.MONTH, 1);

           System.out.println("Parcela  de Número " + parcela  + " com vencimento em: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
       }*/



        /*Nova api de data a partir do java 8*/

      /*  LocalDate dataAtual = LocalDate.now();

        System.out.println(dataAtual);

        LocalTime horaAtual = LocalTime.now();

        System.out.println(horaAtual);

        LocalDateTime dataAtualHora = LocalDateTime.now();
        System.out.println(dataAtualHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));*/


        /*LocalDate localDate = LocalDate.now();
        System.out.println("Data atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Dia da semana: " + localDate.getDayOfWeek());
        System.out.println("Dia do mes: " + localDate.getDayOfMonth());
        System.out.println("Mes: " + localDate.getMonth());
        System.out.println("Ano: " + localDate.getYear());*/

        Instant inicio = Instant.now();

        Thread.sleep(2000);

        Instant ifinal = Instant.now();

        Duration duracao = Duration.between(inicio, ifinal);

        System.out.println("duracao em nano segundos: " + duracao.toNanos());
        System.out.println("duracao em minutos: " + duracao.toMinutes());
        System.out.println("duracao em miliseg: " + duracao.toMillis());


    }
}
