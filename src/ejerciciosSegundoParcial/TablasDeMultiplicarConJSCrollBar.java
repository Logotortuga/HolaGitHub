package ejerciciosSegundoParcial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

public class TablasDeMultiplicarConJSCrollBar {

	private JFrame frmTablasDeMultipklicar;
	private JTextPane txtResultado;
	private JScrollBar desNumero;
	private JLabel lblNumero;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TablasDeMultiplicarConJSCrollBar window = new TablasDeMultiplicarConJSCrollBar();
					window.frmTablasDeMultipklicar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void calcularTabla() {
		try {
			int n=desNumero.getValue();
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
	public TablasDeMultiplicarConJSCrollBar() {
		initialize();
	}
	private void initialize() {
		frmTablasDeMultipklicar = new JFrame();
		frmTablasDeMultipklicar.setIconImage(Toolkit.getDefaultToolkit().getImage(TablasDeMultiplicarConJSCrollBar.class.getResource("/img/LogoHollow.png")));
		frmTablasDeMultipklicar.setTitle("Tablas de multiplicar con JScrollBar");
		frmTablasDeMultipklicar.setBounds(100, 100, 450, 300);
		frmTablasDeMultipklicar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTablasDeMultipklicar.getContentPane().setLayout(null);
		
		desNumero = new JScrollBar();
		desNumero.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				lblNumero.setText(""+desNumero.getValue());
				calcularTabla();
			}
		});
		desNumero.addContainerListener(new ContainerAdapter() {
			
		});
		desNumero.setOrientation(JScrollBar.HORIZONTAL);
		desNumero.setBounds(20, 11, 302, 48);
		frmTablasDeMultipklicar.getContentPane().add(desNumero);
		
		txtResultado = new JTextPane();
		txtResultado.setBackground(new Color(255, 128, 192));
		txtResultado.setEditable(false);
		txtResultado.setBounds(20, 73, 302, 179);
		frmTablasDeMultipklicar.getContentPane().add(txtResultado);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desNumero.setValue(0);

				txtResultado.setText(null);

			}
		});
		btnBorrar.setBounds(332, 140, 88, 39);
		frmTablasDeMultipklicar.getContentPane().add(btnBorrar);
		
		lblNumero = new JLabel("0");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblNumero.setBounds(332, 11, 88, 48);
		frmTablasDeMultipklicar.getContentPane().add(lblNumero);
	}
}
