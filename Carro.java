public class Carro{
	private String cor, marca;
	private double velocidade;
	private boolean estado; //andando = true
	public void ligar(){
		estado = true;
	}
	public void desligar(){
		estado = false;
	}
	public boolean getEstado(){
		return estado;
	}
	public void setAcelerar(){
		if(estado == true)
			velocidade += 20;
	}
	public void setFreiar(){
		if(estado == true && velocidade > 20)
			velocidade -= 20;
	}	
	public void setCor(String nova_cor){
		cor = nova_cor;
	}
	public String getCor(){
		return cor;
	}
	public void setMarca(String nova_marca){
		marca = nova_marca;
	}
	public String getMarca(){
		return marca;
	}
	public void setVelocidade(double nova_velocidade){
		velocidade = nova_velocidade;
	}
	public double getVelocidade(){
		return velocidade;
	}
}
