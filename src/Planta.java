import java.util.Scanner;

public class Planta {
    
    private String nome;
    private String tipo;
    private int count = 0;

    Scanner scanner = new Scanner(System.in);

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public void cadastroPlantaSistema(Planta p1){
        System.out.print("Digite o nome da planta: ");
        String nomeDigitado = scanner.nextLine(); 
        p1.setNome(nomeDigitado);
        System.out.println("Planta criado " + p1.nome);
        System.out.print("Digite o tipo: ");
        String tipoDigitado = scanner.nextLine(); 
        p1.setTipo(tipoDigitado);
        System.out.println("Tipo criado " + p1.tipo);
        count++;
    }
    public void exibirPlantas(){

    }
   
}
