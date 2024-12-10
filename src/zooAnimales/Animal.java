package zooAnimales;
import gestion.Zona;

public class Animal{
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(){
        Animal.totalAnimales++;
    }
    public Animal(String nombre, int edad, String habitat, String genero, Zona zona){
        this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		Animal.totalAnimales++;
    }
    public Animal(String nombre, int edad, String habitat, String genero){
        this(nombre,edad,habitat,genero,null);
    }
    
    public String movimiento(){
        return("desplazarse");
    }

    public static String totalPorTipo(){
        int mamifero = Mamifero.cantidadMamiferos();
        int ave = Ave.cantidadAves();
        int anfibio = Anfibio.cantidadAnfibios();
        int reptil = Reptil.cantidadReptiles();
        int pez = Pez.cantidadPeces();


        return("Mamiferos: "+mamifero + "\nAves: "+ave+ "\nReptiles: "+reptil+ "\nPeces: "+pez+ "\nAnfibios: "+anfibio);
    }
    @Override
    public String toString(){
        if (this.zona != null) {
			return ("Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+", la zona en la que me ubico es "+zona.getNombre()+" en el "+zona.getZoo().getNombre());
		}
		else {
			return ("Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero);
		}
    }

    public static int getTotalAnimales(){
        return(Animal.totalAnimales);
    }
    public static void setTotalAnimales(int totalAnimales){
        Animal.totalAnimales = totalAnimales;
    }

    public String getNombre(){
        return(this.nombre);
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return(this.edad);
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getHabitat(){
        return(this.habitat);
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }

    public String getGenero(){
        return(this.genero);
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public Zona getZona(){
        return(this.zona);
    }
    public void setZona(Zona zona){
        this.zona = zona;
    }

}