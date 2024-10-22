import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] numeros = {5, 2, 9, 1, 5, 6};


        System.out.println("Vetor original:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();


        bubbleSort(numeros);


        System.out.println("Vetor ordenado:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();


        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Andressa",23));
        pessoas.add(new Pessoa("Paula",48));
        pessoas.add(new Pessoa("Guilherme", 33));
        pessoas.add(new Pessoa("Marcelo", 30));
        pessoas.add(new Pessoa("Bruno", 15));


        Collections.sort(pessoas, Comparator.comparing(Pessoa::getNome));


        System.out.println("Pessoas ordenadas:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
            System.out.println(pessoa.getIdade());
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}