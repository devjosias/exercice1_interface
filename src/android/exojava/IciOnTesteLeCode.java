package android.exojava;

public class IciOnTesteLeCode {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
		System.out.println(new Triangle().aire());
		System.out.println(new Carre().aire());
		System.out.println(new Cercle().aire());
		
		Chat chat = new Chat();
		chat.communiquer();
		
		Chien chien = new Chien();
		chien.communiquer();
	}

}
