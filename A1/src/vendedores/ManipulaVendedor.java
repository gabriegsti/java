package vendedores;

import template.Vendedor;

public class ManipulaVendedor {
	public void listarVendedores(Vendedor[] vend) {
		try {

			if (vend == null)
				throw new Exception("Lista vazia.");

			for (int i = 0; i < vend.length; i++)
				System.out.println(vend[i].toString());

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}

	public int LocalizaVendedor(Vendedor v, Vendedor[] vendedoresarray) {
		int indice = -1;
		for (int i = 0; i < vendedoresarray.length; i++) {
			if (vendedoresarray[i].equals(v)) {
				indice = i;
				return indice;
			}
		}
		return indice;
	}
}
