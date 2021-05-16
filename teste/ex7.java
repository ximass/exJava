package teste;

public class ex7 {
	public static void main (String args[]) {
		Float altura, largura, areatijolo, areaparede, x;
		System.out.print("Digite a altura da parede em m:");
		altura = entrada.leiaFloat();
		System.out.print("Digite a largura da parede em m:");
		largura = entrada.leiaFloat();
		areatijolo = (float) 253 / 1000;
		areaparede = altura * largura;
		x = areaparede / areatijolo;
		System.out.print("Serão necessários " + x + " " + "tijolos de 23x11 cm para construir a parede!");
				
	}

}
