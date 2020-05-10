
package taller_lei32_7;

public class ConFlor extends Planta {
    
    private int cantidadColores;
    private String colorPrincipal;

    public ConFlor() {
    }

    public ConFlor(String nombre, String tipo, String ambiente) {
        super(nombre, tipo, ambiente);
    }

    public ConFlor(int cantidadColores, String colorPrincipal, String nombre, String tipo, String ambiente) {
        super(nombre, tipo, ambiente);
        this.cantidadColores = cantidadColores;
        this.colorPrincipal = colorPrincipal;
    }
    

    public int getCantidadColores() {
        return cantidadColores;
    }

    public void setCantidadColores(int cantidadColores) {
        this.cantidadColores = cantidadColores;
    }

    public String getColorPrincipal() {
        return colorPrincipal;
    }

    public void setColorPrincipal(String colorPrincipal) {
        this.colorPrincipal = colorPrincipal;
    }
    
    
    
}
