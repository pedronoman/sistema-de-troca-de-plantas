public class User {

    public String nome;
    private String senha;
    public Planta plantasCadastradas;

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

    public User(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
        System.out.println("Usuario:" + nome + " cadastrado" );
    }

}
