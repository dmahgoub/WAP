/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.cs472;

/**
 *
 * @author Dalia
 */
public class Definition {

    private String wordType;
    private String definition;

    public String getWordType() {
        return wordType;
    }

    public String getDefinition() {
        return definition;
    }

    public Definition(String wordType, String definition) {
        this.wordType = wordType;
        this.definition = definition;
    }
}
