package scraping;

public class Bat {
	
	int rbi;
	int r;
	int orden;
	double aporte;
	
	public Bat() {
		this.r = 0;
		this.rbi = 0;
	}
	
	public Bat(int valueOrden, int valueRbi, int valueR) {
		this.r = valueR;
		this.rbi = valueRbi;
		this.orden = valueOrden;
	}

	public int getRbi() {
		return rbi;
	}

	public void setRbi(int rbi) {
		this.rbi = rbi;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public int sum() {
		// TODO Auto-generated method stub
		return this.r + this.rbi;
	}

	public double getAporte() {
		return aporte;
	}

	public void setAporte(double aporte) {
		this.aporte = aporte;
	}

}
