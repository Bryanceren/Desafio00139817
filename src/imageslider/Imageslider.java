package imageslider;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class Imageslider extends JFrame implements ActionListener {
	String[] title = 	{
			"Bienvenido",
			"Modelo",
			"Dominio",
			"Condiciones de Contorno",
			"Condiciones de Contorno",
			"Malla",
			"Tabla conectividades",
			"Paso 1",
			"Paso 2",
			"Paso 3",
			"Paso 4",
			"Paso 5",
			"Paso 6",
			"Definiendo Componentes",
			"Definiendo Componentes",
			"Definiendo Componentes",
			"Definiendo Componentes",
			"Definiendo Componentes",
			"Definiendo Componentes",
			"Definiendo Componentes",
			"Paso 7",
			"Paso 7",
			"Paso 7",
			"Paso 8",
			"Paso 8",
			"Sistema Final",
			"Final",
		};
	String[] descripcion = 	{
			"Bienvenido a mi programa de Tecnicas Simulacion en computadoras. Creado por: Bryan Ceren ",
			"En este paso nos apoyamos del excel generador de modelos",
			"Para sacar el dominio usamos gid para realizar el dominio 3D",
			"Aqui tuvimos que hacer uso de gid para las condiciones en este caso Dirichlet en los nodos que podemos apreciar",
			"Aqui tuvimos que hacer uso de gid para las condiciones en este casi Neumann en los nodos que podemos apreciar",
			"para la malla fue generada de manera automatica con 6 elementos en gid, con un maximo de 9 nodos",
			"como podemos ver lo mencionado anteriormente se aprecia cada nodo perteneciente a cada elemento en la tabla de conectividades",
			"Paso 1, aplicando Metodo de los elementos finitos",
			"Paso 2,aplicando Metodo de los elementos finitos",
			"Paso 3,aplicando Metodo de los elementos finitos",
			"Paso 4,aplicando Metodo de los elementos finitos",
			"Paso 5,aplicando Metodo de los elementos finitos",
			"Paso 6,aplicando Metodo de los elementos finitos",
			"Definiendo Componentes, aplicando el proceso a la matriz D parte 1",
			"Definiendo Componentes, aplicando el proceso a la matriz D parte 2",
			"Definiendo Componentes, aplicando el proceso a la matriz J",
			"Definiendo Componentes, aplicando el proceso a la matriz K",
			"Definiendo Componentes, aplicando el proceso a la matriz H",
			"Definiendo Componentes, aplicando el proceso a la matriz C",
			"Definiendo Componentes, aplicando el proceso a la matriz F",
			"Ensamblaje: Para visualizar bien este proceso vamos a empezar con la forma de un elemento local, que seria algo asi",
			"Ensamblaje: Pasariamos a ubicar las coordenadas que el elemento local tendria en el sistema global",
			"Ensamblaje: Ubicando todos los elementos locales de la misma forma con el mismo proceso nos deja este sistema global",
			"Condiciones de Contorno: Con las siguientes condiciones trabajaremos con sus respectivos nodos asignados",
			"Condiciones de Contorno: Aplicamos el proceso para las condiciones de Dirichlet y Neumann anteriormente definidas",
			"Al limpiar las filas y columnas tenemos el siguiente sistema final, incluyendo las condiciones al lado derecho",
			"Gracias por llegar hasta aqui, ofrezco una chemsburguesa :3"
		};


	int index;	
	ImageIcon s[];
	JLabel l;
	JButton b1, b2;
	int i, l1;
	JTextField titulo;
	JTextArea parrafo;


	public Imageslider() {
		setLayout(new BorderLayout());
		setMinimumSize(new Dimension(800,500));
		setMaximumSize(new Dimension(1000,800));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		getContentPane().setBackground(new Color(71, 71, 71));
		JPanel p1 = new JPanel(new FlowLayout());

		JPanel p = new JPanel(new FlowLayout());
		
		titulo = new JTextField();
		parrafo = new JTextArea();
		
		titulo.setBackground(new Color(25,25,25));
		titulo.setForeground(new Color(212, 175, 55));
		titulo.setFont(new Font("Consolas",Font.BOLD,45));
		titulo.setBorder(null);
		titulo.setEditable(false);
		titulo.setHorizontalAlignment(JTextField.CENTER);


		
		parrafo.setBackground(new Color(71, 71, 71));
		parrafo.setForeground(new Color(212, 175, 55));
		parrafo.setFont(new Font("Consolas",Font.PLAIN,17));
		parrafo.setBorder(null);
		parrafo.setEditable(false);
		parrafo.setLineWrap(true);

		parrafo.setSize(500, 100);
		
		
		b1 = new JButton("Anterior");
		b2 = new JButton("Siguiente");

		b1.setFont(new Font("Roboto Light", Font.BOLD, 19));
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		
		b2.setFont(new Font("Roboto Light", Font.BOLD, 19));
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		
		p1.setBackground(new Color(71, 71, 71));
		p.setBackground(new Color(71, 71, 71));

		p.add(b1);
		p.add(b2);
		
		p1.add(parrafo);
		p1.add(p);

		b1.addActionListener(this);
		b2.addActionListener(this);
		
		s = new ImageIcon[27];
		s[0] = new ImageIcon(getClass().getResource("/images/poke.gif"));
		s[1] = new ImageIcon(getClass().getResource("/images/modelo.jpg"));
		s[2] = new ImageIcon(getClass().getResource("/images/dominipo.jpg"));
		s[3] = new ImageIcon(getClass().getResource("/images/dirichlet.jpg"));
		s[4] = new ImageIcon(getClass().getResource("/images/neumann.jpg"));
		s[5] = new ImageIcon(getClass().getResource("/images/malla.jpg"));
		s[6] = new ImageIcon(getClass().getResource("/images/tabla.jpg"));
		s[7] = new ImageIcon(getClass().getResource("/images/paso1.jpg"));
		s[8] = new ImageIcon(getClass().getResource("/images/paso2.jpg"));
		s[9] = new ImageIcon(getClass().getResource("/images/paso3.jpg"));
		s[10] = new ImageIcon(getClass().getResource("/images/paso4.jpg"));
		s[11] = new ImageIcon(getClass().getResource("/images/paso5.jpg"));
		s[12] = new ImageIcon(getClass().getResource("/images/paso6.jpg"));
		s[13] = new ImageIcon(getClass().getResource("/images/definiendoD1.jpg"));
		s[14] = new ImageIcon(getClass().getResource("/images/definiendoD2.jpg"));
		s[15] = new ImageIcon(getClass().getResource("/images/definiendoJ.jpg"));
		s[16] = new ImageIcon(getClass().getResource("/images/definiendoK.jpg"));
		s[17] = new ImageIcon(getClass().getResource("/images/definiendoH.jpg"));
		s[18] = new ImageIcon(getClass().getResource("/images/definiendoC.jpg"));
		s[19] = new ImageIcon(getClass().getResource("/images/definiendoF.jpg"));
		s[20] = new ImageIcon(getClass().getResource("/images/generandolocales1.gif"));
		s[21] = new ImageIcon(getClass().getResource("/images/generandolocales2.gif"));
		s[22] = new ImageIcon(getClass().getResource("/images/ubicandolocales.gif"));
		s[23] = new ImageIcon(getClass().getResource("/images/condiciones.jpg"));
		s[24] = new ImageIcon(getClass().getResource("/images/condiciones.gif"));
		s[25] = new ImageIcon(getClass().getResource("/images/sistemafinal.jpg"));
		s[26] = new ImageIcon(getClass().getResource("/images/chems.gif"));

		l = new JLabel("", JLabel.CENTER);
		add(titulo,BorderLayout.NORTH);
		add(l, BorderLayout.CENTER);
		add(p1, BorderLayout.SOUTH);
		l.setIcon(s[0]);
		titulo.setText(title[0]);
		parrafo.setText(descripcion[0]);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			if (i == 0) {
				JOptionPane.showMessageDialog(null, "Esa era la primera imagen, no hay vuelta atras");
			} else {
				i = i - 1;
				titulo.setText(title[i]);
				parrafo.setText(descripcion[i]);
				l.setIcon(s[i]);
				this.setSize(new Dimension(s[i].getIconWidth()+100,s[i].getIconHeight()+150));
			}
		}
		if (e.getSource() == b2) {
			if (i == s.length - 1) {
				JOptionPane.showMessageDialog(null, "Esa era la ultima pantalla... Disfruto su chemsburguesa?");
			} else {
				i = i + 1;
				titulo.setText(title[i]);
				parrafo.setText(descripcion[i]);
				l.setIcon(s[i]);
				this.setSize(new Dimension(s[i].getIconWidth()+100,s[i].getIconHeight()+150));
			}
		}
	}

	public static void main(String args[]) {
		Imageslider obj = new Imageslider();
	}
}