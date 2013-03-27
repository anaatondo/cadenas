import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ClasecomponentesPosicion  extends Ventanas implements MouseListener
{
	private JButton btn;
	private JTextField txt;
	
	

	public ClasecomponentesPosicion(int w, int h,String t)
	{
			super(w,h,t);
			this.setLayout(null);
			
			btn=new JButton("Click");
			btn.setBounds(50,50,150,30);
			//btn.addMouseListener(this);
			
			btn.addMouseListener(new MouseListener ()
			{

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			this.add(btn);	
			
			txt =new JTextField();
			txt.setBounds(10, 10, 150, 30);
			this.add(txt);
			
			
			JLabel lbl = new JLabel ("Este e mi etiqueta");
			lbl.setBounds(400, 10, 300, 60);
			this.add(lbl);
			
		}



	@Override
	public void mouseClicked(MouseEvent e) {
		
		//System.out.printf(" X" +e.getX(), "Y" +e.getY());
		
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	
	}

