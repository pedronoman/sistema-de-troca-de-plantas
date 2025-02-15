public class Planta {
    public String nome;
    public String tipo;
    public int id[];
    private int count = 0;

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
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public Planta(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
        count++;
    }
    
}
