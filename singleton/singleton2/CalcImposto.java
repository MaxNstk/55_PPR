package singleton2;

public class CalcImposto {

	private static CalcImposto instance;

	public synchronized static CalcImposto getInstance(){
		if (instance==null){
			instance = new CalcImposto();
		}
		return instance;
	}

	private float aliquota;
	private CalcImposto(){}

	public float getAliquota() {
		return aliquota;
	}
	public void setAliquota(float aliquota) {
		instance.aliquota = aliquota;
	}
	
	public float calcImposto(float valor) {
		return valor * instance.aliquota / 100;
	}
	
}
