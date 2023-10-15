package controllers;

import java.util.Scanner;

import entities.Cliente;
import repositories.ClienteRepository;

public class ClienteController {
	public void cadastrarCliente() {
		System.out.println("/n *** CADASTRO DE CLIENTES");

		Scanner input = new Scanner(System.in);

		Cliente cliente = new Cliente();

		System.out.print("NOME DO CLIENTE: ");
		cliente.setNome(input.nextLine());

		System.out.print("E-MAIL: ");
		cliente.setEmail(input.nextLine());

		System.out.print("TELEFONE: ");
		cliente.setTelefone(input.nextLine());

		System.out.print("CPF: ");
		cliente.setCpf(input.nextLine());
		
		ClienteRepository clienteRepository = new ClienteRepository();
	
		
		try {
			clienteRepository.create(cliente);
			System.out.println("/n CLIENTE CADASTRADO COM SUCESSO!");
			
		}catch (Exception e) {
			System.out.println("/n FALHA AO CADASTRAR CLIENTE! ");
			e.printStackTrace(); //imprirmir o log do erro.
		}

	}

}
