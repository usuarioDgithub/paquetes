package paquete.test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		paquetes.persona p = new paquetes.persona(21, "Leo","Masculino");
		paquetes.subpaquete.persona p2 = new paquetes.subpaquete.persona(21, "Alan");
		System.out.println("inicio de impresion.");
		System.out.println(p.toString());
		System.out.println(p2.toString());
		
	}

}
