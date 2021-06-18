import java.util.HashMap;

public class Cesta {
	private static HashMap<String, Producto> cesta;
	/*Mejora considerar un Hashmap de cliente para ver su carrito
	 * este Hashmap estaria compuesto key:Cliente.dniCliente value:cesta
	 * evidentemente habria que crear otra clase que gestionará las
	 * cestas de los clientes
	 */
	public HashMap<String, Producto> getCesta() {
		return cesta;
	}

	public void setCesta(HashMap<String, Producto> cesta) {
		this.cesta = cesta;
	}
	
	public static void comprar() {
		for (String c : cesta.keySet()) {
			System.out.println(cesta.get(c).toString());
		}
	}
	
	public static void insertarProducto() {
		cesta = new HashMap<String,Producto>();
		Producto p = new Producto("24569", "Portatil", "HP", 1, 450);
		Producto p2 = new Producto("24568", "Lavadora", "Siemens", 1, 650);
		Producto p3 = new Producto("24570", "Boligrafo", "Bic", 1, 0.70f);
		cesta.put(p.getCod(), p);
		cesta.put(p2.getCod(), p2);
		cesta.put(p3.getCod(), p3);
	}
	
	public static void main(String[] args) {
		Cesta.insertarProducto();
		Cesta.comprar();
	}
	
}
