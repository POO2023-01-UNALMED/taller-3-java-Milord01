package taller3.televisores;

public class TV {
	
	
	
	// Atributo_
	public Marca marca;
	private int canal=1;
	public int precio=500;
	private boolean estado;
	private int volumen=1;
	public Control control; 
	private static int numTV; 
	//constructor
	public TV(Marca m, boolean e) {
		numTV++;
		marca=m;
		estado=e;
	}
	
	//metodos_set_y_get
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
    public Marca getMarca() {
	    return marca;
    }
    public void setControl(Control control) {
		this.control = control;
	}
    public Control getControl() {
		return control;
	}
    public void setPrecio(int precio) {
		this.precio = precio;
	}
    public int getPrecio() {
		return precio;
	}
    public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
    public int getVolumen() {
		return volumen;
	}
    public void setCanal(int canal) {
		this.canal = canal;
	}
    public int getCanal() {
		return canal;
	}
    
    //Contador_numTV
    public static int numTV() {
    	return numTV;
    	}
    	
    
    //Encendido_o_Apagado
    public boolean turnOn(){
    	return true;
    }
    public boolean turnOff() {
    	return false;
    }
    // getEstado
    public boolean getEstado() {
    	return estado;
    }
  
    //canal
    public int canalUp() {
    	if(turnOn()==true) {
    		if(canal>1&&canal<120) {
    			canal=canal+1;
    		}
    	}
    	return canal;
    }
  
    public int canalDown() {
    	if(turnOn()==true) {
    		if(canal>1&&canal<120) {
    			canal=canal-1;
    		}
    	}
    	return canal;
    }
    
    //volumen_
    public int volumenUp() {
    	if(turnOn()==true) {
    		if(volumen>0&&volumen<7) {
    			volumen=volumen+1;
    		}
    	}
    	return volumen;
    }
    public int volumenDown() {
    	if(turnOn()==true) {
    		if(volumen>0&&volumen<7) {
    			volumen=volumen-1;
    		}
    	}
    	return volumen;
    }
}
