package taller3.televisores;

public class TV {
	
	
	
	// Atributo_
	public Marca marca;
	private int canal=1;
	public int precio=500;
	private boolean estado;
	private int volumen=1;
	public Control control; 
	public static int numTV=0; 
	//constructor
	public TV(Marca m, boolean e) {
		numTV++;
		marca=m;
		estado=e;
	}
	
	//Contador_numTV
	
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
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
    	if(estado==true&&volumen<=7&&volumen>=0) {
		this.volumen = volumen;
    	}
	}
    public int getVolumen() {
		return volumen;
	}
    public void setCanal(int canal) {
    	if(estado==true&&canal<=120&&canal>=1) {
    		this.canal = canal;
    	}
		
	}
    public int getCanal() {
		return canal;
	}
    
    
    
    //Encendido_o_Apagado
    public void turnOn(){
    	estado= true;
    }
    public void turnOff() {
    	estado=false;
    }
    // getEstado
    public boolean getEstado() {
    	return estado;
    }
  
    //canal
    public int canalUp() {
    	if(estado==true) {
    		if(canal<120) {
    			canal=canal+1;
    		}
    	}
    	return canal;
    }
  
    public int canalDown() {
    	if(estado==true) {
    		if(canal>1) {
    			canal=canal-1;
    		}
    	}
    	return canal;
    }
    
    //volumen_
    public int volumenUp() {
    	if(estado==true) {
    		if(volumen>0&&volumen<7) {
    			volumen=volumen+1;
    		}
    	}
    	return volumen;
    }
    public int volumenDown() {
    	if(estado==true) {
    		if(volumen>0&&volumen<7) {
    			volumen=volumen-1;
    		}
    	}
    	return volumen;
    }
}
