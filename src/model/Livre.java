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
public class Livre {
    
    private int isbn;
    private String titre;
    private String maisonEdition;
    private String datePublication;
    private Auteur auteur;

    public Livre(int isbn, String titre, String maisonEdition, String datePublication, Auteur auteur) {
        this.isbn = isbn;
        this.titre = titre;
        this.maisonEdition = maisonEdition;
        this.datePublication = datePublication;
        this.auteur = auteur;
    }
    
    public Livre( String titre, String maisonEdition, String datePublication, Auteur auteur) {
        this.titre = titre;
        this.maisonEdition = maisonEdition;
        this.datePublication = datePublication;
        this.auteur = auteur;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getMaisonEdition() {
        return maisonEdition;
    }

    public void setMaisonEdition(String maisonEdition) {
        this.maisonEdition = maisonEdition;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Livre{" + "isbn=" + isbn + ", titre=" + titre + ", maisonEdition=" + maisonEdition + ", datePublication=" + datePublication + ", auteur=" + auteur + '}';
    }
    
    
    
    
    
}
