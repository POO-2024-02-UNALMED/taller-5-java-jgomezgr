package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
    private static ArrayList<Reptil> listado = new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(){
        listado.add(this);
    }
    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        super(nombre,edad,habitat,genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
    }

    @Override
    public String movimiento(){
        return("reptar");
    }
    
    public static int cantidadReptiles(){
		int totl = listado.size();
        return(totl);
    }

	public static Reptil crearIguana(String nombre, int edad, String genero){
		Reptil iguana = new Reptil();
        iguana.setNombre(nombre);
        iguana.setEdad(edad);
        iguana.setGenero(genero);
        iguana.setColorEscamas("verde");
        iguana.setLargoCola(3);
        iguana.setHabitat("humedal");
        Reptil.iguanas++;
        return(iguana);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero){
		Reptil serpiente = new Reptil();
        serpiente.setNombre(nombre);
        serpiente.setEdad(edad);
        serpiente.setGenero(genero);
        serpiente.setColorEscamas("blanco");
        serpiente.setLargoCola(1);
        serpiente.setHabitat("jungla");
        Reptil.serpientes++;
        return(serpiente);
    }
    
    public static void setListado(ArrayList<Reptil> listado){
        Reptil.listado=listado;
    }

    public static ArrayList<Reptil> getListado() {
        return (Reptil.listado);
    }

    public String getColorEscamas(){
        return(this.colorEscamas);
    }
    public void setColorEscamas(String colorEscamas){
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola(){
        return(this.largoCola);
    }
    public void setLargoCola(int largoCola){
        this.largoCola = largoCola;
    }

}