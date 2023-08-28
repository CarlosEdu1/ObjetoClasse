package com.mycompany.carlosmartinsado1;

public class Cachorro {

    //Atributos
    private int patas = 4;
    private int rabo = 1;
    private String nomeCientifico = "Canis lupus familiaris";
    String raça;
    String cor;
    String porteFisico;
    boolean feliz;
    boolean fome;

    //Construtores
    public Cachorro() {
    }

    public Cachorro(String raça, String cor, String porteFisico, boolean feliz, boolean fome) {
        this.raça = raça;
        this.cor = cor;
        this.porteFisico = porteFisico;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPorteFisico() {
        return porteFisico;
    }

    public void setPorteFisico(String porteFisico) {
        this.porteFisico = porteFisico;
    }

    void abanarRabo() { //metodos
        if (this.feliz == true) {
            System.out.println("Abanando o rabo... ");
        } else {
            System.out.println("Ele está triste, não quer abanar");
        }
    }

    void latir() { //metodos
        if (this.fome == true) {
            System.out.println("latindo* Está com fome");
        } else {
            System.out.println("Não está com fome");
        }
    }

    void status() {
        System.out.println("Raça: " + this.raça);
        System.out.println("Cor: " + this.cor);
        System.out.println("Porte Físico: " + this.porteFisico);
        System.out.println("Ele está feliz? " + this.feliz);
        System.out.println("Ele está com fome? " + this.fome);

    }

} //fim da classe
