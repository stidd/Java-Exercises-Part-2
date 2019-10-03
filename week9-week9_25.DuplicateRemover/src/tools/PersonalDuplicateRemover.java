/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author steventidd
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> strings = new HashSet<String>();
    private int numberOfDuplicates;
 
    @Override
    public void add(String characterString) {
        boolean added = strings.add(characterString);
        if (!added) {
            numberOfDuplicates++;
        }
    }
 
    @Override
    public int getNumberOfDetectedDuplicates() {
        return numberOfDuplicates;
    }
 
    @Override
    public Set<String> getUniqueCharacterStrings() {
        return strings;
    }
 
    @Override
    public void empty() {
        strings.clear();
        numberOfDuplicates = 0;
    }
    
}
