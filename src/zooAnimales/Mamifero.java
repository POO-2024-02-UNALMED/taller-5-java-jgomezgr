package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado = new ArrayList<>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(){
        listado.add(this);
    }
    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        super(nombre,edad,habitat,genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
    }

    public static int cantidadMamiferos(){
        int totl = listado.size();
        return(totl);
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        Mamifero caballo = new Mamifero();
        caballo.setNombre(nombre);
        caballo.setEdad(edad);
        caballo.setGenero(genero);
        caballo.setPelaje(true);
        caballo.setPatas(4);
        caballo.setHabitat("pradera");
        Mamifero.caballos++;
        return(caballo);
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero){
        Mamifero leon = new Mamifero();
        leon.setNombre(nombre);
        leon.setEdad(edad);
        leon.setGenero(genero);
        leon.setPelaje(true);
        leon.setPatas(4);
        leon.setHabitat("selva");
        Mamifero.leones++;
        return(leon);
    }

	public static void setListado(ArrayList<Mamifero> listado){
        Mamifero.listado=listado;
    }

    public static ArrayList<Mamifero> getListado() {
        return Mamifero.listado;
    }
    
    public boolean getPelaje(){
        return(this.pelaje);
    }
    public void setPelaje(boolean pelaje){
        this.pelaje = pelaje;
    }

    public int getPatas(){
        return(this.patas);
    }
    public void setPatas(int patas){
        this.patas = patas;
    }
    public boolean isPelaje() {
		return (this.pelaje);
	}
   
}