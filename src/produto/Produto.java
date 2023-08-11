package produto;

public class Produto {
	
	public String data;
	public String name;
	public double price;
	public double pricenew;
	public int qnte;
	public int qntenew;
	public int option;
	public int remove;
	public int add;
	
	public double infott () {
		System.out.println("\n Data de Hoje: " + data + ", Produto: " + name + ", Preço: " + price + 
				", Unidades: " + qnte + ", Total: R$" + price * qnte);
		return 0; 
	}
	
	public double optionone () {
		qntenew = qnte - remove;
		pricenew = qntenew * price;
		System.out.println("Produtos Retirados: " + remove + ", Produtos em Estoque: " + qntenew 
				+ ", Preço total Atualizado: " + pricenew);
		return 0;
	}
	
	public double optiontwo () {
		qntenew = qnte + add;
		pricenew = qntenew * price;
		System.out.println("Produtos Adicionados: " + add + ", Produtos em Estoque: " + qntenew 
				+ ", Preço total Atualizado: " + pricenew);
		return 0;
	}

}
