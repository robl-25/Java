public class Roda{
	private String cor, marca;
	private double raio;
	private boolean estado; //rodando = true
	public void rodar(){
		estado = true;
	}
	public void parar(){
		estado = false;
	}
	public boolean getEstado(){
		return estado;
	}
	public void setRaio(double novo_raio){
		raio = novo_raio;
	}
	public double getRaio(){
		return raio;
	}
	public void setMarca(String Nova_marca){
		marca = Nova_marca;
	}
	public String getMarca(){
		return marca;
	}
	public void setCor(String nova_cor){
		cor = nova_cor;
	}
	public String getCor(){
		return cor;
	}
}
