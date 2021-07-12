class Main {
  public static void main(String[] args) {
    
    Aluno aluno1 = new Aluno();
    
    aluno1.setNome("Michele Garcia Santos");
    aluno1.setCpf("015.776.890-05");
    aluno1.setRg("356.656-88");
    aluno1.setFone("(79) 99966-4448");
    aluno1.setEndereco("Rua Amazonas, bairro Alecrim, n°22");
    
    System.out.println("Nome do aluno: " + aluno1.getNome());
    System.out.println(" CPF "+ aluno1.getCpf());
    System.out.println(" RG: " + aluno1.getRg());
    System.out.println(" Celular: " + aluno1.getFone()); 
    System.out.println(" Endereço: " + aluno1.getFone());
    System.out.println(" Endereço: " + aluno1.getEndereco());
    
    
    
  }
}