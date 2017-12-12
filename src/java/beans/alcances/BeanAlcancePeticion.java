package beans.alcances;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "peticion")
@RequestScoped
public class BeanAlcancePeticion {

    private String valor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
    public BeanAlcancePeticion() {
    }
    
}
