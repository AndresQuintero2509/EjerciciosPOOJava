package Persona;

public class Persona {
    private int altura;
    private String dni;
    private int edad;
    private String nombre;
    private double peso;
    private char sexo;
    public static final char SEXO = 'H';
    public static final int DEBAJO = -1;
    public static final int NORMAL = 0;
    public static final int ALTO = 1;

    public Persona() {
        this(0, 0, "", 0, 'H');
    }

    public Persona(String nombre, int edad, char sexo) {
        this(0, edad, nombre, 0, SEXO);
    }

    public Persona(int altura, int edad, String nombre, double peso, char sexo) {
        this.altura = altura;
        this.dni = Double.toString(generaDni());
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
        validarGenero();
    }

    public int calcularImc() {
        double altura = this.altura / 100;
        double imc = (this.peso / (Math.pow(altura, 2)));
        if (imc < 20) {
            return this.DEBAJO;
        }
        if (imc >= 20 & imc <= 25) {
            return this.NORMAL;
        }
        return this.ALTO;
    }

    private void validarGenero() {
        if (sexo != 'M' || sexo != 'H') {
            this.sexo = SEXO;
        }
    }

    private double generaDni() {
        double dni = Math.random() * 10000000;
        return dni;
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        }
        return false;
    }

    public int getAltura() {
        return altura;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "altura=" + altura +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
