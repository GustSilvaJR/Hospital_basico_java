public class Quarto{
  public int numero;
  // public Paciente paciente01 = null;
  // public Paciente paciente02 = null;
  // public Paciente paciente03 = null;

  Paciente[] a = new Paciente[3]; 

  public Quarto(int numero){
    this.numero = numero;
  }

  int retornarMaxDiasInter(){
    int maxDias = 0;
    int i = 0;

    System.out.println("aqui");
    while(i<=2){
      if(i == 0){
        maxDias = a[i].diasInternado;
      }else{
        if(a[i].diasInternado > maxDias){
          maxDias = a[i].diasInternado;
        }
      }
      i++;
    }
    return maxDias;
  }

  int retornarMinDiasInter(){
    int minDias = 0;
    int i = 0;

    while(i<=2){
      if(a[i] != null){
        if(i == 0){
          minDias = a[i].diasInternado;
        }else{
          if(a[i].diasInternado < minDias){
            minDias = a[i].diasInternado;
          }
        }
      }  
      i++;
    }
    return minDias;
  }

  int diaPorPaciente(int quarto){
    int j = 0;
    int dia = 0;
    while(j <= 2){
      if(j == quarto){
        dia = a[j].diasInternado;
      }
      j++;
    }
    return dia;
  }

  void verificarQuartoVazio(){
    int k = 0;
    int cont = 0;
    while(k <= 2){
      if(a[k] != null){
        cont++;
      }
      k++;
    }
    if(cont == 3){
      System.out.println("\nNão há espaço!");
    }else{
      System.out.println("\nHá espaço!");
    }
  }
}

