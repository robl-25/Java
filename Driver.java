
public class Driver{
	public static void main(String args[]){
		System.out.println("Propriedades da Televisao:");
		Televisao Tv1 = new Televisao();
		Tv1.setCor("preto");
		Tv1.ligar();
		Tv1.setTamanho(12);
		System.out.println("O tamanho da televisao eh: " + Tv1.getTamanho());
		System.out.println("A cor da televisao eh: " + Tv1.getCor());
		System.out.println("A televisao esta ligado? " + Tv1.getEstado() + "\n");
		
		System.out.println("Propriedades da Roda:");
		Roda R1 = new Roda();
		R1.setCor("Rosa");
		R1.parar();
		R1.setMarca("GoodYear");
		R1.setRaio(25);
		System.out.println("A roda esta rodando? " + R1.getEstado());
		System.out.println("A cor da roda eh:  " + R1.getCor());
		System.out.println("O raio da roda eh: " + R1.getRaio());
		System.out.println("A marca da roda eh: " + R1.getMarca());
		System.out.println("A televisao esta ligado? " + Tv1.getEstado() + "\n");
		
		System.out.println("Propriedades do Carro:");
		Carro C1 = new Carro();
		C1.setCor("Rosa");
		C1.ligar();
		C1.setMarca("BMW");
		C1.setVelocidade(250);
		System.out.println("O carro esta ligado? " + C1.getEstado());
		System.out.println("A cor do carro eh:  " + C1.getCor());
		System.out.println("A velocidade do carro eh: " + C1.getVelocidade());
		System.out.println("A marca da roda eh: " + C1.getMarca());
		C1.setAcelerar();
	    System.out.println("A velocidade do carro agora eh: " + C1.getVelocidade());
	}
}
