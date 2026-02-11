public No AtRank (int rank) {
    No node;
    if (rank <= size()/2) {
        node = header.getNext();
        for(int i=0; i < rank; i++)
            node = node.getNext();
    }else{
        node = trailer.getPrev();
        for(int i=0; i < size()-rank-1 ; i++)
            node = node.getPrev();
    }
    return node;
}

public Object removeAtRank(int r) throws ExceptionBoundaryViolation{ // remover do ranking inteiro x
      checkRank(r); 
      No node = AtRank(r); // Nó do índice que eu quero remover 
      // remover
      Object temp = node.getElement();
      node.getPrev().setNext(node.getNext());
      node.getNext().setPrev(node.getPrev());
      node.setNext(null);
      node.setPrev(null);
      return temp;
}
