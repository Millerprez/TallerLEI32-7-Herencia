/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_lei32_7;

public class SinFlor extends Planta {
    private String colorEspora;
    private String tipoAgua;

    public SinFlor() {
    }

    public SinFlor(String nombre, String tipo, String ambiente) {
        super(nombre, tipo, ambiente);
    }

    public SinFlor(String colorEspora, String tipoAgua, String nombre, String tipo, String ambiente) {
        super(nombre, tipo, ambiente);
        this.colorEspora = colorEspora;
        this.tipoAgua = tipoAgua;
    }
    

    public String getColorEspora() {
        return colorEspora;
    }

    public void setColorEspora(String colorEspora) {
        this.colorEspora = colorEspora;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    

    
    
    
}
