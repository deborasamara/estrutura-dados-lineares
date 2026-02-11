
public class DLNo{
    
        private Object element;

        private DLNo proximo, anterior;

        public DLNo(){}

        // Construtor
        public DLNo(Object o, DLNo prox, DLNo ant){
            element = o;
            proximo = prox; 
            anterior = ant;
        }

        // Getters e Setters 
        public DLNo getProximo() {
            return proximo;
        }
        public void setProximo(DLNo n) {
            proximo = n;
        }
        public DLNo getAnterior() {
            return anterior;
        } 

        public void setAnterior(DLNo n) {
            anterior = n;
        }

        public Object getElement(){
            return element;
        }

        public void setElement(Object novoElemento){
            element = novoElemento;
        }
    }