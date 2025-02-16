import java.util.Scanner;

public class Usuario {
    private String nome;
    private String senha;
    private Planta plantasCadastradas;

    Scanner scanner = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Planta getPlantasCadastradas() {
        return plantasCadastradas;
    }

    public void setPlantasCadastradas(Planta plantasCadastradas) {
        this.plantasCadastradas = plantasCadastradas;
    }

    public void cadastroUsuario(Usuario user){
        System.out.print("Digite o nome: ");
        String nomeDigitado = scanner.nextLine(); 
        user.setNome(nomeDigitado);
        System.out.println("Usuario criado " + user.nome);
        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.nextLine(); 
        user.setSenha(senhaDigitada);
        System.out.println("Senha criada ");
    }


}
