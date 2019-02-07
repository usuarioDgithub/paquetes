package paquete.test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		paquetes.persona p = new paquetes.persona(21, "Leo","Masculino");
		paquetes.subpaquete.persona p2 = new paquetes.subpaquete.persona(21, "Alan");
		paquetes.persona p3 = new paquetes.persona(10, "Emiliano", "Masculino");
		System.out.println(p.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
	}

}
