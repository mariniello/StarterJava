package cursoJava.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {


	private Date dataUltimoPeriodoMenstrual;

	public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
		this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
	}
	
	private Calendar converterDateParaCalendar(Date data) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(data);
		return calendar;
	}
	
	public Date calcularDataEstimadaConcepcao() {
		// implementar cálculo de data estimada da concepção
		// 2 semanas após a data do último período menstrual
		
		
//		Calendar dataUltimoPeriodo = new GregorianCalendar();
//		dataUltimoPeriodo = converterDateParaCalendar(dataUltimoPeriodoMenstrual);
//		dataUltimoPeriodo = Calendar.getInstance();
//		Calendar dataEstimada = new GregorianCalendar();
//		dataEstimada = Calendar.getInstance();
//		dataEstimada = dataUltimoPeriodo.add(Calendar.WEEK_OF_YEAR, 2);
//		return (dataEstimada.getTime());
		
		Calendar dataEstimadaDaConcepcao = this.converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
		dataEstimadaDaConcepcao.add(Calendar.WEEK_OF_YEAR, 2);
		
		return dataEstimadaDaConcepcao.getTime();
	}
	
	public Date calcularDataEstimadaParto() {
		// implementar cálculo de data estimada para parto
		// 40 semanas após a data do último período menstrual
		
		
//		Calendar dataUltimoPeriodo = converterDateParaCalendar(dataUltimoPeriodoMenstrual);
//		
//		Calendar dataEstimadaParto = dataUltimoPeriodo.add(Calendar.WEEK_OF_YEAR, 40);
//		
//		return (dataEstimadaParto.getTime());
		
		Calendar dataEstimadaParto = this.converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
		dataEstimadaParto.add(Calendar.WEEK_OF_YEAR, 40);
		
		return dataEstimadaParto.getTime();
		
	}
	
		
}
