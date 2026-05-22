class testeListas {
    public static void main(String[] args) {
        ListaArray listaArray = new ListaArray();
        listaArray.insertFirst("A");
        listaArray.insertLast("B");
        listaArray.insertAfter("C", 0);
        listaArray.insertBefore("X", 2);
        System.out.println(listaArray.size());
        System.out.println(listaArray.first());
        System.out.println(listaArray.last());
        System.out.println(listaArray.before(2));
        System.out.println(listaArray.after(1));
        listaArray.swapElements(0, 3);
        System.out.println(listaArray.first());
        System.out.println(listaArray.last());
        listaArray.replaceElement(1, "D");
        System.out.println(listaArray.after(0));
        listaArray.remove(2);
        System.out.println(listaArray.size());
        System.out.println(listaArray.first());
        System.out.println(listaArray.last());

        ListaDLNo listaDLNo = new ListaDLNo();
        DLNo primeiro = listaDLNo.insertFirst("A");
        DLNo segundo = listaDLNo.insertLast("B");
        DLNo terceiro = listaDLNo.insertAfter("C", primeiro);
        DLNo quarto = listaDLNo.insertBefore("X", segundo);
        System.out.println(listaDLNo.size());
        System.out.println(listaDLNo.first().getElement());
        System.out.println(listaDLNo.last().getElement());
        System.out.println(listaDLNo.before(quarto).getElement());
        System.out.println(listaDLNo.after(terceiro).getElement());
        listaDLNo.swapElements(primeiro, segundo);
        System.out.println(listaDLNo.first().getElement());
        System.out.println(listaDLNo.last().getElement());
        listaDLNo.replaceElement(terceiro, "D");
        System.out.println(terceiro.getElement());
        listaDLNo.remove(quarto);
        System.out.println(listaDLNo.size());
        System.out.println(listaDLNo.first().getElement());
        System.out.println(listaDLNo.last().getElement());
    }
}