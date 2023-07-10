package observer3.estacao;

import observer3.dispositivos.DispositivoConsole;
import observer3.dispositivos.DispositivoObervador;
import observer3.sensores.SensorTemperatura;
import observer3.sensores.SensorUmidade;

import java.util.ArrayList;

public class EstacaoMeteorologica {
	
	private SensorTemperatura sensorTemp;
	private SensorUmidade sensorUmidade;
	private ArrayList<DispositivoObervador> dispositivos = new ArrayList<>();
	
	public SensorTemperatura getSensorTemp() {
		return sensorTemp;
	}
	
	public void setSensorTemp(SensorTemperatura sensorTemp) {
		this.sensorTemp = sensorTemp;
	}
	
	public SensorUmidade getSensorUmidade() {
		return sensorUmidade;
	}

	public void addDispositivo(DispositivoObervador dispositivo){
		this.dispositivos.add(dispositivo);
	}
	
	public void setSensorUmidade(SensorUmidade sensorUmidade) {
		this.sensorUmidade = sensorUmidade;
	}

	public double getTemperatura() {
		return temp;
	}

	public double getUmidade() {
		return umid;
	}
	
	private double umid;
	private double temp;


	public void ligar() {
		Thread t = new Thread() {
			
			@Override
			public void run() {
				while (true) {
					temp = sensorTemp.getMedicao();
					umid = sensorUmidade.getMedicao();
					
					notificar();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		};
		t.start();
	}
	
	public void notificar() {
		for (DispositivoObervador dispositivo: dispositivos){
			dispositivo.atualizar(temp, umid);
		}
	}

}
