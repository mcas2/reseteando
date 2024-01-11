public class Coche {
    public String marca;
    public boolean nuevo;
    public String modelo;
    public int caballos;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean esNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCaballos() {
        if (this.caballos > 60)
	return caballos;
	else
	return -1;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }
}

