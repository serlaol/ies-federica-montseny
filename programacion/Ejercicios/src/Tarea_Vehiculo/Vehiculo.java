package Tarea_Vehiculo;

public class Vehiculo {
    private String tipo;
    private double velocidad;
    private String color;
    private String matricula;

    public Vehiculo(String tipo, double velocidad, String color, String matricula) {
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.color = color;
        this.matricula = matricula;
    }

    public void infoVehiculos() {
        System.out.println("El vehiculo tiene la siguente informacion: " + tipo + " Con una velocidad de " + velocidad + " De color " + color + " Y con la siguente matricula " + matricula);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public String getColor() {
        return color;
    }

    public String getMatricula() {
        return matricula;
    }
}
