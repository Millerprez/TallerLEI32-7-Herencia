
package taller_lei32_7;

public class Planta {
    private String nombre;
    private String tipo;
    private String ambiente;

    public Planta() {
    }

    public Planta(String nombre, String tipo, String ambiente) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ambiente = ambiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
    
    
    
}
