/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author instructor
 */
// Anotaciones
@Named(value = "mbe")
@ApplicationScoped

// Clase -> ManagedBean
public class ManBeanExample {

    /**
     * Creates a new instance of ManBeanExample
     */
    // Atributos
    private String Name;
    
    // Métodos
    // Constructor
    public ManBeanExample() { }
    public String getName() { return Name; }
    public void setName(String Name) { this.Name = Name; }
}