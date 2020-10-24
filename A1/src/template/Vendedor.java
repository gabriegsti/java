package template;


public abstract class Vendedor implements Pagamento, Comparable<Vendedor> {
	
	private String nome;
	private double vendas;
	private double comissao;
	
	
	
	//methods
	public String toString() {
		return "\n Vendedor externo: " + getNome() + 
    		   "\n Vendas: " + getVendas() + 
    		   "\n Comissao: " + getComissao();
	}
	
	public abstract boolean equals (Object obj);
	
	public int compareTo(Vendedor v)
	{
		if (v.calcularPagamento() > this.calcularPagamento()) {
			return 1;
		} else if (v.calcularPagamento() < this.calcularPagamento()){
			return -1;
		} else {
			return 0;
		}
	}
	
	
	
	//getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVendas() {
		return vendas;
	}
	public void setVendas(double vendas) {
		this.vendas = vendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
