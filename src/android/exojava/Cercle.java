package android.exojava;

public class Cercle extends Figure{

	protected int rayon = 4;
	public Cercle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double aire() {
		// TODO Auto-generated method stub
		return Math.PI * rayon * rayon;
	}

}
