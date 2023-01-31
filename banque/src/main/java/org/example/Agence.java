package org.example;

import java.io.Serializable;

public class Agence implements Serializable {
    int id;
    int code_agence;
    String nom_agence;
    String adresse;

    public Agence(int id, int code_agence, String nom_agence, String adresse) {
        this.id = id;
        this.code_agence = code_agence;
        this.nom_agence = nom_agence;
        this.adresse = adresse;
    }

    /**
     * get field
     *
     * @return id
     */
    public int getId() {
        return this.id;
    }

    /**
     * set field
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * get field
     *
     * @return code_agence
     */
    public int getCode_agence() {
        return this.code_agence;
    }

    /**
     * set field
     *
     * @param code_agence
     */
    public void setCode_agence(int code_agence) {
        this.code_agence = code_agence;
    }

    /**
     * get field
     *
     * @return nom_agence
     */
    public String getNom_agence() {
        return this.nom_agence;
    }

    /**
     * set field
     *
     * @param nom_agence
     */
    public void setNom_agence(String nom_agence) {
        this.nom_agence = nom_agence;
    }

    /**
     * get field
     *
     * @return adresse
     */
    public String getAdresse() {
        return this.adresse;
    }

    /**
     * set field
     *
     * @param adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
