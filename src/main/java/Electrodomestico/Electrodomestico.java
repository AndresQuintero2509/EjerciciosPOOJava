package Electrodomestico;

import java.util.Arrays;
import java.util.Locale;

public class Electrodomestico {
    protected final static String COLOR_DEFECTO = "BLANCO";
    protected final static char CONSUMO_ENERGETICO_DEFECTO = 'F';
    protected final static double PRECIO_BASE_DEFECTO = 100;
    protected final static double PESO_DEFECTO = 5;
    private String color;
    private char consumoEnergetico;
    private double peso;
    private double precioBase;

    private void comprobarConsumoEnergetico() {
        char letrasConsumosEnergeticos[] = {'A', 'B', 'C', 'D', 'E', 'F'};
        if (Arrays.asList(letrasConsumosEnergeticos).equals(Character.toUpperCase(consumoEnergetico))) {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
        }
    }

    private void comprobarColor() {
        String colores[] = {"BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS"};
        if (Arrays.asList(colores).equals(color.toUpperCase())) {
            this.color = color;
        } else {
            this.color = COLOR_DEFECTO;
        }
    }

    public Electrodomestico(double precioBase, double peso) {
        this(COLOR_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, precioBase, peso);
    }

    public Electrodomestico() {
        this(COLOR_DEFECTO, CONSUMO_ENERGETICO_DEFECTO, PRECIO_BASE_DEFECTO, PESO_DEFECTO);
    }

    public Electrodomestico(String color, char consumoEnergetico, double peso, double precioBase) {
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        this.precioBase = precioBase;
        comprobarConsumoEnergetico();
        comprobarColor();
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}
