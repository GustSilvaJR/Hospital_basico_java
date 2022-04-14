public class Ala{

  public int id = 0;
  public String especialidade;
  public Quarto quarto;
  
  public Ala(String especialidade,Quarto quarto){
    this.id +=1;
    this.especialidade = especialidade;
    this.quarto = quarto;
  }

  void exibirRelatorio(){
    System.out.println("\nid: "+this.id+"\nEspecialidade: "+this.especialidade+"\nEstado do quarto: ");
    quarto.verificarQuartoVazio();
  }
}