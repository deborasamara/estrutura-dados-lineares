public class PilhaRubroNegra{
    // Variáveis
    public int capacidade;
    public Object[] a;
    public int tVermelho, tPreto;

    // Construtor
    public PilhaRubroNegra(int capacidade){
        this.capacidade=capacidade;
        tVermelho = -1;
        tPreto = capacidade;
        a = new Object[capacidade];
    }

    // Métodos

    public void aumentarPilha(){
        // aumenta pilha
        

        // copia pilha vermelha


        // copia pilha preta

    }

    public void diminuirPilha(){
        // reduz pilha

        // copia pilha vermelha


        // copia pilha preta

    }

    public void verificaCheio(){
        if(tVermelho == tPreto){
            aumentarPilha();
        }
    }

    public void verificaUmTerco(){
        if(sizeV() + sizeP() <= capacidade/3){
            diminuirPilha();
        }
    }

    public int sizeV(){
        return tVermelho+1;
    }

    public int sizeP(){
        return tPreto+1;
    }

    public boolean isEmptyV(){
        return tVermelho == -1;
    }

    public boolean isEmptyP(){
        return tPreto == capacidade;
    }

    public Object topV() throws PilhaVaziaExcecao{
        if(isEmptyV()){
            throw new PilhaVaziaExcecao("A pilha vermelha tá vazia!");
        }
        return a[tVermelho];
    }

    public Object topP(){
        if(isEmptyP()){
            throw new PilhaVaziaExcecao("A pilha preta tá vazia!");
        }
        return a[tPreto];

    }

    public void pushV(Object o){
        verificaCheio();
        a[++tVermelho]=o;
    }

    public void pushP(Object o){
        verificaCheio();
        a[--tPreto]=o;
    }

    public Object popV() throws PilhaVaziaExcecao{
        if(isEmptyV()){
            throw new PilhaVaziaExcecao("A pilha vermelha tá vazia!!");
        }
        verificaUmTerco();
        Object r=a[tVermelho--];
        return r;
    }

    public Object popP() throws PilhaVaziaExcecao{
        if(isEmptyP()){
            throw new PilhaVaziaExcecao("A pilha preta tá vazia!!");
        }
        verificaUmTerco();
        Object l=a[tPreto++];
        return l;
    }

}