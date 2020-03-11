package Lesson12_1;

import Lesson12_1.Helm;
import Lesson12_1.Motor;

public class Car {
	private int horses_power;
	private int year;
	private Helm helm;
	private Motor motor;
	private Material material;

	

	

	public Car(int horses_power, int year, Helm helm, Motor motor, Material material) {
		super();
		this.horses_power = horses_power;
		this.year = year;
		this.helm = helm;
		this.motor = motor;
		this.material = material;
	}

	public int getHorses_power() {
		return horses_power;
	}

	public int getYear() {
		return year;
	}

	public Helm getHelm() {
		return helm;
	}

	public Motor getMotor() {
		return motor;
	}

	@Override
	public String toString() {
		return "Car [horses_power=" + horses_power + ", year=" + year + ", helm=" + helm + ", motor=" + motor + "]";
	}

	

}
