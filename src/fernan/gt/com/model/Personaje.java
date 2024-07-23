package fernan.gt.com.model;

public abstract class Personaje {
    private String nombre;
    private String descripcion;
    private Long tamaño;
    private Integer poder;
    private Integer vida;


    public abstract  void desplazarse();

    public abstract  int mostrarVida();

    public abstract void mostrarPoder();

}
