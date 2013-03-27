import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;
import java.awt.Container;


public class ClaseComponents extends Ventanas
{
	
	
	private  JButton  btnPrueba;
	
	public ClaseComponents()
	{
		
		btnPrueba= new  JButton("Boton de prueba");
		this.add(btnPrueba);
		//FlowLayout fl=new FlowLayout(FlowLayout.CENTER);
		BorderLayout fl=new BorderLayout();
		//Container contet=this.getContentPane();
		//contet.setLayout(fl);
		Box izq=Box.createVerticalBox();
		ButtonGroup grupoRadio=new ButtonGroup();
		JRadioButton rbutton;
	
		grupoRadio.add(rbutton= new JRadioButton("Rojo"));
		izq.add(rbutton);
		grupoRadio.add(rbutton=new JRadioButton("Azul"));
		izq.add(rbutton);
		
		grupoRadio.add(rbutton=new JRadioButton("Amarilo"));
		izq.add(rbutton);
		
		Box der=Box.createVerticalBox();
		der.add(new JCheckBox("hola"));
		der.add(new JCheckBox("Buenas Tardes"));
		der.add(new JCheckBox("Buenas Tardes"));
		
		 Box arriba=Box.createHorizontalBox();
		 arriba.add(izq);
		 arriba.add(der);
		 
		 Container contet=this.getContentPane();
		 contet.add(arriba);
		
	//	GridLayout gr =new GridLayout(3,4,50,50);
	//	contet.setLayout(gr);
	//	for(int i=0;i<10;i++)
	//	{
	 //   contet.add(new JButton ("Boton"+i));
				
	//	}
		//contet.add(btnPrueba);
	//	contet.add(btnPrueba);
		
		
		//for(int i=0;i<10;i++)
		//{
		//	contet.add(new JButton ("Boton"+i));
		//}
		
		this.pack();
		contet.add(new JButton("Este"),BorderLayout.EAST);
		contet.add(new JButton("Oeste"),BorderLayout.WEST);
		
		
		
		
	}

	
	
	

}
