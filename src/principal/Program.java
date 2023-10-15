package principal;

import controllers.ClienteController;

public class Program {

	public static void main(String[] args) {
	
		// chamando a class controller
		
		ClienteController clientecontroller = new ClienteController();
		clientecontroller.cadastrarCliente();

	}

}
