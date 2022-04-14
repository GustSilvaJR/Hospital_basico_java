class Main {
  public static void main(String[] args) {

    Quarto quarto1 = new Quarto(1);
    Quarto quarto2 = new Quarto(2);
    
    Ala ala1 = new Ala("Cirurgia", quarto1);
    Ala ala2 = new Ala("Pediatria", quarto2);

    Paciente p1 = new Paciente("Gustavo","Júlio",15);
    Paciente p2 = new Paciente("Pedro", "Camila", 40);
    Paciente p3 = new Paciente("Iuri", "Otávio", 100);
    Paciente p4 = new Paciente("Christian", "Marina",16);

    quarto1.a[0] = p1;
    quarto1.a[1] = p2;
    quarto1.a[2] = p3;

    
    System.out.println("Tempo máximo internado no quarto 1:"+quarto1.retornarMaxDiasInter());
    

    System.out.println("Tempo mínimo internado no quarto 1:"+quarto1.retornarMinDiasInter());

    p1.exibirRelatorioPac();
    p2.exibirRelatorioPac();

    quarto1.verificarQuartoVazio();

    System.out.println("\n"+quarto1.diaPorPaciente(0));

ala1.exibirRelatorio();

ala2.exibirRelatorio();
    

    
    
  }
}