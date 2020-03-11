package Lesson12_1;

public class Helm {

	private int diametr;
	

	public Helm(int diametr) {
		super();
		this.setDiametr(diametr);
		
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	

	@Override
	public String toString() {
		return "Helm diametr=" + diametr ;
	}

}
