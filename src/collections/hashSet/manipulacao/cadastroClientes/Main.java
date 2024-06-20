package collections.hashSet.manipulacao.cadastroClientes;

public class Main {
    public static void main(String[] args) {
        CadastroClientes cadastroClientes = new CadastroClientes();

        cadastroClientes.adicionarClientes("Laura", 18, "10/11/2005", "11111111111", "33999999999");
        cadastroClientes.adicionarClientes("Maria", 24, "20/06/2000", "22222222222", "22998888888");

        cadastroClientes.listarClientes();
        cadastroClientes.buscarClientesPeloCpf("11111111111");
        cadastroClientes.removerClientePorCpf("11111111111");

    }
}
