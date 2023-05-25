import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {
    public static void main(String[] args) {
        System.out.println("Radix Sort em Java: ");

        // Vetor de números inteiros 
        int[] A = {200, 100, 40, 50, 32, 56, 90, 87, 120, 400};

        // Mostrar arrays de inteiros antes da ordenação
        System.out.println("Array de inteiros antes da ordenação: ");
        System.out.println(Arrays.toString(A));

        radixSort(A);

        // Mostrar arrays de inteiros depois da ordenação
        System.out.println("Array de inteiros depois da ordenação: ");
        System.out.println(Arrays.toString(A));
    }
        // Criar o método Radix Sort em Java 
    public static void radixSort(int[] A) {
        final int k = 10;

        List<Integer>[] C = new ArrayList[k];

        // Percorrer todos os elementos do vetor C dentro do for 
        for(int i = 0; i < C.length; i++){
            C[i] = new ArrayList<Integer>();
        }
        // Condição booleana caso a largura máxima seja falsa
        boolean maxLength = false;

        // Posição das variáveis top e posição
        int top = -1, posicao = 1;

        // Estruturas de repetição "while" e "for" enquanto a largura máxima for diferente do valor declarado
        while(!maxLength) {
            maxLength = true;

        for(Integer i : A) {
            top = i / posicao;
            C[top % k].add(i);
            if(maxLength && top > 0) {
                maxLength = false;
                }
            }

            int a = 0;
            for(int b = 0; b < k; b++) {
                for(Integer i : C[b]) {
                    A[a++] = i;
                }

                C[b].clear();
            }
            // Variável posição armazenada na constante "k" 
            posicao *= k;
        }
    }
}
