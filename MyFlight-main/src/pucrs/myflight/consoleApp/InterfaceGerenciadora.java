package pucrs.myflight.consoleApp;

public interface InterfaceGerenciadora
{ 
    public abstract void addEntidade(Object object);

    public abstract Object getEntidade(String codigo);

    public abstract Object procuraEntidade();
    
}
