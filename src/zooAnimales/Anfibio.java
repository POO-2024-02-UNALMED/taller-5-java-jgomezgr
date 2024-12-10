package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(){
        listado.add(this);
    }

    public Anfibio(String nombre, int edad, String habitat, String genero,  String colorPiel, boolean venenoso){
        super(nombre,edad,habitat,genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
    }
    
    @Override
    public String movimiento(){
        return("saltar");
    }
    
    public static int cantidadAnfibios(){
		int totl = listado.size();
        return(totl);
    }

    public static Anfibio crearRana(String nombre, int edad, String genero){
		Anfibio rana = new Anfibio();
        rana.setNombre(nombre);
        rana.setEdad(edad);
        rana.setGenero(genero);
        rana.setColorPiel("rojo");
        rana.setVenenoso(true);
        rana.setHabitat("selva");
        Anfibio.ranas++;
        return(rana);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
		Anfibio salamandra = new Anfibio();
        salamandra.setNombre(nombre);
        salamandra.setEdad(edad);
        salamandra.setGenero(genero);
        salamandra.setColorPiel("negro y amarillo");
        salamandra.setVenenoso(false);
        salamandra.setHabitat("selva");
        Anfibio.salamandras++;
        return(salamandra);
    }

	public static void setListado(ArrayList<Anfibio> listado){
        Anfibio.listado=listado;
    }

    public static ArrayList<Anfibio> getListado() {
        return (Anfibio.listado);
    }
    public String getColorPiel(){
        return(this.colorPiel);
    }
    public void setColorPiel(String colorPiel){
        this.colorPiel = colorPiel;
    }

    public boolean getVenenoso(){
        return(this.venenoso);
    }
    public void setVenenoso(boolean venenoso){
        this.venenoso = venenoso;
    }
    public Boolean isVenenoso() {
        return (this.venenoso);
    }

}