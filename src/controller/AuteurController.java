/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import model.Auteur;
import model.Crude;

/**
 *
 * @author HP-OMEN
 */
public class AuteurController implements IDAO<Auteur>{
    
    private Crude crude= new Crude();
    
    @Override
    public boolean Create(Auteur e) {
            String requete= "INSERT INTO auteur (nsc, nom, prenom,dateDeces,dateNaissance) VALUES('"+ e.getNsc() +"','"+e.getNom()+"','"+e.getPrenom()+"','"+e.getDateDeces()+"','"+e.getDateNaissance()+"')";
           return(crude.exeCreate(requete));
    }

    @Override
    public ArrayList<Auteur> Retrieve() {
          try {
             ArrayList<Auteur> ALA = new ArrayList();
             String requete= "SELECT * FROM auteur ";
             ResultSet rs= crude.exeRead(requete);
             while ( rs.next()){
                 Auteur auteur = new Auteur(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                 ALA.add(auteur) ;
             }
             return ALA;

         } catch (Exception ex) {
             return null;
         }    
    }

    @Override
    public boolean Update(Auteur e, int id) {
        String requete= "UPDATE  auteur SET nom = '"+e.getNom()+"', prenom='"+e.getPrenom()+"', dateDeces='"+e.getDateDeces()+"', nsc='"+e.getNsc()+"', dateNaissance='"+e.getDateNaissance()+"' WHERE orcid="+id ;
           return(crude.exeUpdate(requete));
    }

    @Override
    public boolean Delete(int id) {
        String requete= "DELETE FROM  auteur WHERE orcid="+id ;
           return(crude.exeDelete(requete));
    }
    
}
