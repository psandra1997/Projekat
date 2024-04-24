/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import forme.ServerForma;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class RefreshThread extends Thread{
    
    
    ServerForma fs;

    public RefreshThread(ServerForma fs) {
        this.fs = fs;
    }

    @Override
    public void run() {
       while(true){
           try {
            fs.refresh();

            sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(RefreshThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(RefreshThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    }
    
}
