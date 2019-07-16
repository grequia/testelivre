import java.util.Comparator;
import java.util.Objects;

public class PessoaIdComparator implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        if ((Objects.isNull(o1)) || Objects.isNull(o1.getId())){
            return 0;
        }
        if ((Objects.isNull(o2)) || Objects.isNull(o2.getId())){
            return 0;
        }
       return -1; //o1.getId().compareTo(o2.getId());
    }

}
