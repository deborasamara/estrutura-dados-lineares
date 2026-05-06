public class testeArrayVetor {
    public static void main(String[] args) {
        VetorDL vetor = new VetorDL();
        vetor.insertAtRank(0, "A");
        vetor.insertAtRank(1, "B");
        vetor.insertAtRank(2, "C");
        System.out.println(vetor.atRank(0));
        System.out.println(vetor.atRank(1));
        System.out.println(vetor.atRank(2)); 
        vetor.replaceAtRank(1, "D");
        System.out.println(vetor.atRank(1)); 
        vetor.removeAtRank(0);
        System.out.println(vetor.atRank(0)); 
    }
}