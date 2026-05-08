class testeVetores {
    public static void main(String[] args) {
        ArrayVetor vetor = new ArrayVetor();
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

        VetorDL vetordDl = new VetorDL();
        vetordDl.insertAtRank(0, "A");
        vetordDl.insertAtRank(1, "B");
        vetordDl.insertAtRank(2, "C");
        System.out.println(vetordDl.atRank(0));
        System.out.println(vetordDl.atRank(1));
        System.out.println(vetordDl.atRank(2)); 
        vetordDl.replaceAtRank(1, "D");
        System.out.println(vetordDl.atRank(1)); 
        vetordDl.removeAtRank(0);
        System.out.println(vetordDl.atRank(0)); 
    }
}