/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.util.ArrayList;

/**
 *
 * @author omrani
 */
public interface IDAO <T> {
    
   public boolean Create(T e);
   public ArrayList<T> Retrieve();
   public boolean Update(T e, int id);
   public boolean Delete(int id);
    
}
