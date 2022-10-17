package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

    public static void main(String[] args) throws ParseException {

      Calendar calendar = Calendar.getInstance();/*usa data atual*/

      /*simular que a data vem do bacnoc de dados*/

      calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2022"));/*definindo data qualquer*/

      calendar.add(Calendar.DAY_OF_MONTH, 5);

        System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

    }
}
