/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.cs472;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dalia
 */
public class Entry {
    private final String word;
    private final List<Definition> defs;
    
    public String getWord(){
        return word;
    }
    
    public List<Definition> getDefs(){
        return defs;
    }
    
    public boolean addDefinition(Definition def){
        return defs.add(def);
    }
    
    public Entry(String word){
        this.word = word;
        defs = new ArrayList<>();
    }
    
}
