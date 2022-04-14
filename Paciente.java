public class Paciente{
  public String nome;
  public Medico medico;
  public int diasInternado = 0;
  public int idMed = 0;

  public Paciente(String nome, String nomeMedico, int diasInternado){
    this.nome = nome;
    this.diasInternado = diasInternado;
    this.medico = new Medico(nomeMedico);
  }

  void exibirRelatorioPac(){
    System.out.println("\nNome: "+this.nome+"\nNome do Médico: "+this.medico.nome+"\nDias internado: "+this.diasInternado);
  }
}