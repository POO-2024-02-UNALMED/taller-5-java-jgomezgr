package gestion;
import java.util.ArrayList;

public class Zoologico{
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<>();

    public Zoologico(){}

    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public int agregarZona(Zona zona){
        this.zonas.add(Uzona);
    }

    public int cantidadTotalAnimales(){
        int ttl = 0;
        for (int i=0; i<zonas.size();i++){
            ttl += zonas.get(i).cantidadTotalAnimales();//asd
        }
        return ttl;
    }

    public string GetNombre(){
        return (this.nombre);
    }

    public setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getUbicacion(){
        return(this.ubicacion);
    }
    public setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZona(){
        return(this.zonas);
    }
    public setZona(ArrayList<Zona> zonas){
        this.zonas = zonas;
    }

}