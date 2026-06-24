package ArvoreBinariaPesquisa;

public class teste {
    public static void main(String[] args) {
        // instancio dizendo o valor do elemento
        ArvoreBinariaPesquisa b = new ArvoreBinariaPesquisa(15);
        b.insert(2, 50);
        b.insert(3, 40);
        b.insert(4, 60);
        b.insert(5, 70);

        System.out.println("Tamanho: " + b.size());
        System.out.println("Tamanho: " + b.height(b.root()));
        System.out.println("Achou? "+ b.search(4, b.root()));

    }
}
