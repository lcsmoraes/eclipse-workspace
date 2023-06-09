package principal;

import java.util.Scanner;

import entities.Cliente;
import repositories.ClienteRepository;

public class Program {
	public static void main(String[] args) {
		System.out.println("CADASTRO DE CLIENTES:\n");

		Scanner scanner = new Scanner(System.in);

		Cliente cliente = new Cliente();

		System.out.print("ENTRE COM O ID DO CLIENTE......: ");
		cliente.setIdCliente(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("ENTRE COM O NOME DO CLIENTE....: ");
		cliente.setNome(scanner.nextLine());;
		
		System.out.print("ENTRE COM O EMAIL DO CLIENTE...: ");
		cliente.setEmail(scanner.nextLine());

		System.out.println("\nDADOS DO CLIENTE:");
		System.out.println("ID DO CLIENTE...: " + cliente.getIdCliente());
		System.out.println("NOME............: " + cliente.getNome());
		System.out.println("EMAIL...........: " + cliente.getEmail());
		
		ClienteRepository clienteRepository = new ClienteRepository();
		clienteRepository.exportarDados(cliente);
	}
}
