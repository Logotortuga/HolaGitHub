package ejerciciosSegundoParcial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sun.tools.javap.TryBlockWriter;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Tablas {

	private JFrame frmTablas;
	private JTextArea txtResultado;
	private JTextField txtNumero;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablas window = new Tablas();
					window.frmTablas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void calcularTabla() {
		try {
			int n=Integer.parseInt(txtNumero.getText().toString());
			txtResultado.setText(
					n+" x 1 = "+(n*1)+"\n"+
					n+" x 2 = "+(n*2)+"\n"+
					n+" x 3 = "+(n*3)+"\n"+
					n+" x 4 = "+(n*4)+"\n"+					
					n+" x 5 = "+(n*5)+"\n"+
					n+" x 6 = "+(n*6)+"\n"+
					n+" x 7 = "+(n*7)+"\n"+
					n+" x 8 = "+(n*8)+"\n"+
					n+" x 9 = "+(n*9)+"\n"+
					n+" x 10 = "+(n*10));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Algo ha salido mal");
		}
	}

	public Tablas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTablas = new JFrame();
		frmTablas.setTitle("Tablas con JTextField");
		frmTablas.setIconImage(Toolkit.getDefaultToolkit().getImage(Tablas.class.getResource("/img/LogoHollow.png")));
		frmTablas.setBounds(100, 100, 450, 300);
		frmTablas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTablas.getContentPane().setLayout(null);

		JLabel lblNumero = new JLabel("Número");
		lblNumero.setBounds(10, 11, 48, 14);
		frmTablas.getContentPane().add(lblNumero);

		txtResultado = new JTextArea();
		txtResultado.setEditable(false);
		txtResultado.setBounds(10, 48, 416, 190);
		frmTablas.getContentPane().add(txtResultado);

		txtNumero = new JTextField();
		txtNumero.setBounds(79, 8, 96, 20);
		frmTablas.getContentPane().add(txtNumero);
		txtNumero.setColumns(10);

		JButton btnVer = new JButton("Ver");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularTabla();

			}
		});
		btnVer.setBounds(196, 7, 88, 22);
		frmTablas.getContentPane().add(btnVer);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNumero.setText(null);
				txtResultado.setText(null);

			}
		});
		btnBorrar.setBounds(294, 7, 88, 22);
		frmTablas.getContentPane().add(btnBorrar);
	}
}
