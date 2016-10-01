package assignment6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class Etch_A_Sketch implements MouseListener, MouseMotionListener, ActionListener {
 
    JFrame window;
    Container content;
    int newX,newY,oldX,oldY,height,width;
    JButton clear = new JButton ("Clear");
    Graphics g;
     
    public Etch_A_Sketch() {
    	
        JFrame window = new JFrame("Etch a Sketch");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        content = window.getContentPane();
        content.addMouseListener(this);        
        content.addMouseMotionListener(this);
        window.add(clear, BorderLayout.SOUTH);
        clear.addActionListener(this);
        height = 800;
        width = 800;
        window.setResizable(false);
        window.setSize(height,width);
        window.setVisible(true);
    }

    public void mouseClicked(MouseEvent evt) {
    	
        newX = evt.getX();
        newY = evt.getY();     
    }
    
    public void mousePressed(MouseEvent evt) {
    	
        newX = evt.getX();
        newY = evt.getY();
        
    }
 
    public void mouseReleased(MouseEvent evt) {
    	
        newX = evt.getX();
        newY = evt.getY();   
    }
 
    public void mouseExited(MouseEvent evt) {
    	
        newX = evt.getX();
        newY = evt.getY();       
    }
    
    public void mouseEntered(MouseEvent evt) {
    	
        newX = evt.getX();
        newY = evt.getY();
    }
 
    public void mouseDragged(MouseEvent evt) {
    	
        newX = evt.getX();
        newY = evt.getY();
 
        if (oldX ==0 ) {
            oldX=newX;
            oldY=newY;
            return;
        }
        
        g = content.getGraphics();
        g.drawLine( oldX,oldY, newX, newY );
        g.getColor();
        oldX = newX;
        oldY = newY;
    }
    
    public void mouseMoved(MouseEvent evt) {
    	
        newX = evt.getX();
        newY = evt.getY();
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
    	if (evt.getSource() == clear){
    		g.clearRect(0, 0, width, height);;
    	}
    }

    public static void main( String[] args) {
        new Etch_A_Sketch();
    }
}