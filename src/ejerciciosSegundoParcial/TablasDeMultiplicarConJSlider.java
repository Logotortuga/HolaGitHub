package ejerciciosSegundoParcial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class TablasDeMultiplicarConJSlider {

	private JFrame frmTablasConJslider;
	private JTextArea txtResultado;
	private JLabel lblNumero;
	private JSlider sldNumero;
	private JButton btnBorrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TablasDeMultiplicarConJSlider window = new TablasDeMultiplicarConJSlider();
					window.frmTablasConJslider.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void calcularTabla() {
		try {
			int n=sldNumero.getValue();
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
	public TablasDeMultiplicarConJSlider() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTablasConJslider = new JFrame();
		frmTablasConJslider.setIconImage(Toolkit.getDefaultToolkit().getImage(TablasDeMultiplicarConJSlider.class.getResource("/img/LogoHollow.png")));
		frmTablasConJslider.setTitle("Tablas con JSlider");
		frmTablasConJslider.setBounds(100, 100, 450, 300);
		frmTablasConJslider.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTablasConJslider.getContentPane().setLayout(null);
		
		lblNumero = new JLabel("0");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNumero.setBounds(346, 11, 58, 50);
		frmTablasConJslider.getContentPane().add(lblNumero);
		
		txtResultado = new JTextArea();
		txtResultado.addContainerListener(new ContainerAdapter() {
		
		});

		sldNumero = new JSlider();
		sldNumero.setPaintLabels(true);
		sldNumero.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblNumero.setText(""+sldNumero.getValue());
				calcularTabla();
		
			}
		});
		sldNumero.setValue(0);
		sldNumero.setPaintTicks(true);
		sldNumero.setMajorTickSpacing(10);
		sldNumero.setBounds(10, 11, 313, 50);
		frmTablasConJslider.getContentPane().add(sldNumero);
		
		
		
				txtResultado.setBackground(new Color(255, 128, 192));
		txtResultado.setBounds(20, 70, 303, 164);
		frmTablasConJslider.getContentPane().add(txtResultado);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sldNumero.setValue(0);
				txtResultado.setText(null);

			}
		});
		btnBorrar.setBounds(332, 68, 94, 29);
		frmTablasConJslider.getContentPane().add(btnBorrar);
	}
}
