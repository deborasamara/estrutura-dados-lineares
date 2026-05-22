package TadSequencia;

class testeSequencia {
    public static void main(String[] args) {
        TadSequencia sequencia = new TadSequencia();
        sequencia.insertAtRank(0, "A");
        sequencia.insertAtRank(1, "B");
        sequencia.insertAtRank(2, "C");
        System.out.println(sequencia.size());
        System.out.println(sequencia.atRank(0));
        System.out.println(sequencia.atRank(1));
        System.out.println(sequencia.atRank(2));
        sequencia.insertFirst("X");
        sequencia.insertLast("Z");
        System.out.println(sequencia.first().getElement());
        System.out.println(sequencia.last().getElement());
        System.out.println(sequencia.rankOf(sequencia.atRank(2)));
        sequencia.replaceAtRank(2, "D");
        System.out.println(sequencia.atRank(2));
        sequencia.removeAtRank(1);
        System.out.println(sequencia.size());
        System.out.println(sequencia.atRank(0));
        System.out.println(sequencia.atRank(1));
        System.out.println(sequencia.atRank(2));
        DLNo primeiro = sequencia.first();
        DLNo ultimo = sequencia.last();
        sequencia.swapElements(primeiro, ultimo);
        System.out.println(sequencia.first().getElement());
        System.out.println(sequencia.last().getElement());
    }
}
