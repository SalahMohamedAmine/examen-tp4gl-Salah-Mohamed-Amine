/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HP-OMEN
 */
public class Auteur {
    
    private int orcid;
    private String nsc;
    private String nom;
    private String prenom;
    private String dateDeces;
    private String dateNaissance;

    public Auteur(int orcid, String nsc, String nom, String prenom, String dateDeces, String dateNaissance) {
        this.orcid = orcid;
        this.nsc = nsc;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeces = dateDeces;
        this.dateNaissance = dateNaissance;
    }
    
    public Auteur(String nsc, String nom, String prenom, String dateDeces, String dateNaissance) {
        this.nsc = nsc;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeces = dateDeces;
        this.dateNaissance = dateNaissance;
    }

    public int getOrcid() {
        return orcid;
    }

    public void setOrcid(int orcid) {
        this.orcid = orcid;
    }

    public String getNsc() {
        return nsc;
    }

    public void setNsc(String nsc) {
        this.nsc = nsc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateDeces() {
        return dateDeces;
    }

    public void setDateDeces(String dateDeces) {
        this.dateDeces = dateDeces;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "auteur{" + "orcid=" + orcid + ", nsc=" + nsc + ", nom=" + nom + ", prenom=" + prenom + ", dateDeces=" + dateDeces + ", dateNaissance=" + dateNaissance + '}';
    }
    
    
    
    
    
}
