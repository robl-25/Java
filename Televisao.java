public class Televisao{
	private String cor;
	private double tamanho;
	private boolean estado; //ligar -> true
	public void ligar(){
		estado = true;
	}
	public void desligar(){
		estado = false;
	}
	public boolean getEstado(){
		return estado;
	}
	public void setTamanho(double nova_medida){
		tamanho = nova_medida;
	}
	public double getTamanho(){
		return tamanho;
	}
	public void setCor(String nova_cor){
		cor = nova_cor;
	}
	public String getCor(){
		return cor;
	}
}
