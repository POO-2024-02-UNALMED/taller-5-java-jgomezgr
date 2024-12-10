package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(){
        listado.add(this);
    }
    public Ave(String nombre, int edad, String habitat, String genero,  String colorPlumas){
        super(nombre,edad,habitat,genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
    }

    @Override
    public String movimiento(){
        return("volar");
    }

    public static int cantidadAves(){
        int totl = listado.size();
        return(totl);
    }

    public static Ave crearHalcon(String nombre, int edad, String genero){
        Ave halcon = new Ave();
        halcon.setNombre(nombre);
        halcon.setEdad(edad);
        halcon.setGenero(genero);
        halcon.setColorPlumas("cafe glorioso");
        halcon.setHabitat("montañas");
        Ave.halcones++;
        return(halcon);
    }

    public static Ave crearAguila(String nombre, int edad, String genero){
        Ave aguila = new Ave();
        aguila.setNombre(nombre);
        aguila.setEdad(edad);
        aguila.setGenero(genero);
        aguila.setColorPlumas("blanco y amarillo");
        aguila.setHabitat("montañas");
        Ave.aguilas++;
        return(aguila);
        
    }
    
    public static void setListado(ArrayList<Ave> listado){
        Ave.listado=listado;
    }

    public static ArrayList<Ave> getListado() {
        return Ave.listado;
    }

    public String getColorPlumas(){
        return(this.colorPlumas);
    }
    public void setColorPlumas(String colorPlumas){
        this.colorPlumas = colorPlumas;
    }
}