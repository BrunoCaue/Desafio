package relogio;

/*
 * Bruno Caue Chaves
 * 0:00h possui um ângulo de 0 00:15h possui um ângulo 
 * de 45 00:30h possui um ângulo de 180
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;

public class Relogio {
	private static long retornaAnguloRelogio(GregorianCalendar horario){

		// chamar o calendario
		GregorianCalendar calendario = new GregorianCalendar();

		//Date data = new Date();
		// trabalhando com horas 
		String dataStr = calendario.toString();
		System.out.println("Hora do dia:"+ calendario.get(GregorianCalendar.HOUR_OF_DAY));
		System.out.println("Minuto:"+ calendario.get(GregorianCalendar.MINUTE));
		System.out.println();
		// fazendo o calculo para achar o angulo da hora
		long x = 0;
		x = (calendario.get(GregorianCalendar.MINUTE) * 30) / 60;
		/*
		 * 0 = 0
		 * 1=30
		 * 2=30
		 * 3=30
		 * 4=30
		 * 5=30
		 * 6=30
		 * 7=30
		 * 8=30
		 * 9=30
		 * 10=30
		 * 11=30
		 * 12=30
		 */
		//calculo para achar angulo do minuto

		long y =0;
		y = (calendario.get(GregorianCalendar.MINUTE) * 360) / 60;


		return (long) Math.abs((x - y)); 
	}
	public static void main(String[] args) {
		GregorianCalendar calendario = new GregorianCalendar();
		Relogio r = new Relogio();
		
		long angulo = retornaAnguloRelogio(calendario  = new GregorianCalendar());
		System.out.print("O ângulo é de "+angulo+"");
	}

}
