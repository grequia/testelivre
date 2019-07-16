import java.time.LocalDate;

public class Movimento {
    public LocalDate getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(LocalDate dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    private LocalDate dataMovimento;
}
