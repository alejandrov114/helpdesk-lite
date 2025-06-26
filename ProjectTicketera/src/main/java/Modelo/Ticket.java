package Modelo;

public class Ticket {

    //Atributos
    private int id;
    private String titulo;
    private String descripcion;
    private String estado;
    private String prioridad;
    private int clienteId;
    private String clienteNombre;

    public Ticket() {
    }

    public Ticket(String titulo, String descripcion, String prioridad, Cliente cliente) {
    this.id = 0; // o algún generador de ID si querés
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.prioridad = prioridad;
    this.estado = "Abierto";
    this.clienteId = cliente.getIdUsuario();
    this.clienteNombre = cliente.getNombre(); // ← nuevo
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
    
    public String getClienteNombre() {
    return clienteNombre;
    }
    
    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", estado='" + estado + '\'' +
                ", prioridad='" + prioridad + '\'' +
                ", clienteId=" + clienteId +
                '}';
    }
}
