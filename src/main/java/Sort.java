import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Sort {

    /**
     * Exercício: use a classe a seguir para fazer a leitura do arquivo.
     * 1 - Crie um HashSet com o nome e ordene.
     * 2 - Crie uma classe Pessoa com os campos id e nome. Crie uma pessoa para cada linha do arquivo.
     *     Ordene as pessoas pelo nome.
     */
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Pessoa> lista = new ArrayList<>();

        Scanner sc = new Scanner(getInputFile());

        if (sc.hasNextLine()){
            System.out.println("header : " + sc.nextLine());
        }

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] partes = linha.split(",");

            String id = partes[0];
            String nome = partes[1];

            //System.out.println(id);
            //System.out.println(nome);
            lista.add(new Pessoa(Integer.parseInt(id), nome));

        }
        sc.close();

        System.out.println(lista.toString());

        Collections.sort(lista);
        System.out.println(lista.toString());

        Collections.sort(lista, new PessoaIdComparator());
        System.out.println(lista.toString());

    }

    //Conteúdo de https://paste.ee/p/nSLSB
    // Coloque na pasta /resources/
    private static File getInputFile() {
        // Ou return new File(SuaClasse.class.getClassLoader().getResource("input_1.csv").toURI());
        return new File("src/main/resources/input_1.csv");
    }
}