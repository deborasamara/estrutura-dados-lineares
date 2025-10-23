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
    
    //Verifica capacidade
    public int capacidade(){
        return capacidade;
    }

    public void aumentarPilha(){
        // Declara array auxiliar 
        Object[] array_aux = new Object[capacidade*2];

        // preenche pilha vermelha
        for(int i = 0; i<(sizeV());i++){
            array_aux[i]= a[i];
        }
        // preenche pilha preta

        // novo Tpreto
        int novotPreto = capacidade*2 - sizeP();

        for(int i = novotPreto; i<(capacidade*2); i++){
            array_aux[i]=a[i-capacidade];
        }
        a = array_aux;
        this.capacidade = capacidade*2;
        tPreto = novotPreto;
    }

    public void diminuirPilha(){
        // Declara array auxiliar 
        Object[] array_auxd = new Object[capacidade/2];

        // copia pilha vermelha
         for(int i = 0; i<(sizeV());i++){
            array_auxd[i]= a[i];
        }

        // Novo Tp = capacidade/2 - TamanhoPilhaPreta
         int novotPreto = capacidade/2 - sizeP();
        // copia pilha preta
        for(int i = novotPreto; i<(capacidade/2); i++){
            array_auxd[i] = a[i+(capacidade/2)];
        }
         a = array_auxd;
         this.capacidade = capacidade/2;
         tPreto = novotPreto;
    }

    public void verificaCheio(){
        if(tVermelho == (tPreto-1)){
            aumentarPilha();
        }
    }

    public void verificaUmTerco(){
        if((sizeV() + sizeP()) <= capacidade/3){
            diminuirPilha();
        }
    }

    public int sizeV(){
        return tVermelho+1;
    }

    public int sizeP(){
        return capacidade-tPreto;
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
        a[++tVermelho]=o;
        verificaCheio();
    }

    public void pushP(Object o){
        a[--tPreto]=o;
        verificaCheio();
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
