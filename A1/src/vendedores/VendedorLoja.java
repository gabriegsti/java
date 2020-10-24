package vendedores;

import template.Vendedor;

public class VendedorLoja extends Vendedor {

	private double salario;
	private double horaextra;

	// Builders
	public VendedorLoja() {

	}

	public VendedorLoja(String nome, double vendas, double comissao, double salario, double horaextra) {
		setNome(nome);
		setVendas(vendas);
		setComissao(comissao);
		setSalario(salario);
		setHoraExtra(horaextra);
	}

	// methods
	public String toString() {
		return super.toString() + "\n Salario: " + getSalario() + "\n Hora extrar: " + getHoraExtra() + "\n Pagamento: "
				+ calcularPagamento();
	}
	
	public double calcularPagamento() {

		double resultado;
		resultado = (getVendas() * getComissao()) + getSalario() + getHoraExtra();
		return resultado;
	}

	public boolean equals (Object obj) {
    	if(!(obj instanceof VendedorLoja))
    		return false;
    	
    	VendedorLoja e = (VendedorLoja) obj;
    	
    	return calcularPagamento() == e.calcularPagamento();
    }

	// getters and setters
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getHoraExtra() {
		return horaextra;
	}

	public void setHoraExtra(double horaextra) {
		this.horaextra = horaextra;
	}

}
