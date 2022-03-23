package android.exojava;

public class Triangle extends Figure{

	protected int base = 4;
	protected int hauteur = 2;
	
	public double aire() {
		return base * hauteur * 0.5;
	}

}
