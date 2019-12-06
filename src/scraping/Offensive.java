package scraping;

import java.util.ArrayList;

public class Offensive {
	
	ArrayList<Bat> listBat;
	int points;
	int total;
	
	public Offensive(){
		//si gana se distribuye 2 point, si pierdes 1 point
		this.points = 2;
		
		this.listBat = new ArrayList<>();
		Bat b1 = new Bat(1, 2, 1);
		this.listBat.add(b1);
		
		Bat b2 = new Bat(2, 3, 0);
		this.listBat.add(b2);
		
		Bat b3 = new Bat(3, 1, 1);
		this.listBat.add(b3);
		
		Bat b4 = new Bat(4, 0, 1);
		this.listBat.add(b4);
		
		Bat b5 = new Bat(5, 0, 0);
		this.listBat.add(b5);
		
		Bat b6 = new Bat(6, 4, 3);
		this.listBat.add(b6);
	}
	
	public void listar() {
		this.calcularAporte();
		for (Bat bat : listBat) {
			System.out.print("(:" + bat.getOrden() + ")");
			System.out.print("-");
			System.out.print("(rbi:" + bat.getRbi() + ")");
			System.out.print("-");
			System.out.print("(r:" + bat.getR() + ")");
			System.out.print("-");
			System.out.print("(point:");
			System.out.printf("%.3f", bat.getAporte());
			System.out.println(")");
		}
	}
	
	private int total() {
		int sum = 0;
		
		for (Bat bat : listBat) {
			sum += bat.sum();
		}
		
		return sum;
	}
	
	private void calcularAporte() {
		int total = this.total();
		
		for (Bat bat : listBat) {
			float dividendo = bat.sum() * this.points;
			float aaa = dividendo / total;
			bat.setAporte(aaa);
		}
	}

	public ArrayList<Bat> getListBat() {
		return listBat;
	}

	public void setListBat(ArrayList<Bat> listBat) {
		this.listBat = listBat;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
