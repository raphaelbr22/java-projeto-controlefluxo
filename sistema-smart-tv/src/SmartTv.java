
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
        System.out.println("TV desligada");
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Volume atual: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Volume atual: " + volume);
    }
    public void canalSeguinte(){
        canal++;
        System.out.println("Canal Atual: " + canal);
    }
    public void canalAnterior(){
        canal--;
        System.out.println("Canal Atual: " + canal);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal Atual: " + canal);
    }
}
