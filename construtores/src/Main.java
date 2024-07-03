
    public class Main {
        public static void main(String[] args) {
            Cliente cliente1 = new Cliente("Eric", 10111992, 123456789, 329999999);

            System.out.println("Nome: " + cliente1.nome);
            System.out.println("Data de Nascimento: " + cliente1.dataDeNacimento);
            System.out.println("CPF: " + cliente1.cpf);
            System.out.println("Telefone: " + cliente1.telefone);
        }
    }
