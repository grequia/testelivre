import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {

    private int id;
    private String nome;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public int compareTo(Pessoa o) {
        if(Objects.isNull(this.getNome())){
            return 0;
        }
        if(Objects.isNull(o) || Objects.isNull(o.getNome())){
            return 1;
        }
        return this.getNome().compareTo(o.getNome());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
