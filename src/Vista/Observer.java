/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.GameEvent;


public interface Observer {
    
    void notifyEvent(GameEvent evento);
    
}
