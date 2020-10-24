package vendedores;

import template.Vendedor;

public class VendedorExterno extends Vendedor {
	private double ajudaCusto;

	// builders
	public VendedorExterno() {

	}

	public VendedorExterno(String nome,double vendas,double comissao,double ajudaCusto) {
		
		setNome(nome);
		setVendas(vendas);
		setComissao(comissao);
		setAjudaCusto(ajudaCusto);
		
	}

	
	
	// methods	
	public String toString() {
		return super.toString() + 
				"\n Ajuda de Custo: " + getAjudaCusto() +
				"\n Pagamento: " + calcularPagamento();	
	}
	
	public double calcularPagamento() {
		double resultado;

		resultado = (getVendas() * getComissao()) + getAjudaCusto();

		return resultado;
	}
	
	public boolean equals (Object obj) {
    	if(!(obj instanceof VendedorExterno))
    		return false;
    	
    	VendedorExterno e = (VendedorExterno) obj;
    	
    	return (this.calcularPagamento() == e.calcularPagamento());
    }


	// getters and setters
	public double getAjudaCusto() {
		return ajudaCusto;
	}

	public void setAjudaCusto(double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}

}
