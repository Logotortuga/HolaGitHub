package ejerciciosSegundoParcial;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpinnerListModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignoZodiacalAplicationWindows {

	private JFrame frmSignoZodiacal;
	private JLabel lblValorDia;
	private JLabel lblImagen;
	private JLabel lblFecha;

	private JSlider sldDia;
	private JSpinner spiMes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignoZodiacalAplicationWindows window = new SignoZodiacalAplicationWindows();
					window.frmSignoZodiacal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SignoZodiacalAplicationWindows() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignoZodiacal = new JFrame();
		frmSignoZodiacal.setTitle("Signo zodiacal");
		//frmSignoZodiacal.setIconImage(Toolkit.getDefaultToolkit().getImage(SignoZodiacalAplicationWindows.class.getResource("/img/LogoHollow.png")));
		frmSignoZodiacal.setBounds(100, 100, 629, 345);
		frmSignoZodiacal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignoZodiacal.setResizable(false);
		frmSignoZodiacal.setLocationRelativeTo(null);
		frmSignoZodiacal.getContentPane().setLayout(null);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDia.setBounds(20, 21, 70, 28);
		frmSignoZodiacal.getContentPane().add(lblDia);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMes.setBounds(20, 121, 70, 28);
		frmSignoZodiacal.getContentPane().add(lblMes);
		
		spiMes = new JSpinner();
		spiMes.setModel(new SpinnerListModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		spiMes.setBounds(20, 171, 198, 45);
		// Listener para detectar cuando cambia el mes en tiempo real
		spiMes.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				actualizarZodiaco();
			}
		});
		frmSignoZodiacal.getContentPane().add(spiMes);
		
		lblValorDia = new JLabel("1");
		lblValorDia.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblValorDia.setBounds(103, 21, 70, 28);
		frmSignoZodiacal.getContentPane().add(lblValorDia);
		
		// Imagen por defecto al iniciar
		lblImagen = new JLabel("");
		//lblImagen.setIcon(new ImageIcon(SignoZodiacalAplicationWindows.class.getResource("/img/LogoHollow.png")));
		lblImagen.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblImagen.setBounds(374, 11, 231, 286);
		frmSignoZodiacal.getContentPane().add(lblImagen);
		colocarImagenEscalada("LogoHollow.png");
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				restablecerValores();
			}
		});
		btnBorrar.setBounds(223, 223, 102, 45);
		frmSignoZodiacal.getContentPane().add(btnBorrar);
		
		lblFecha = new JLabel("");
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFecha.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblFecha.setBounds(20, 238, 198, 45);
		frmSignoZodiacal.getContentPane().add(lblFecha);
		
		sldDia = new JSlider();
		sldDia.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblValorDia.setText(String.valueOf(sldDia.getValue()));
				actualizarZodiaco(); // Actualiza en tiempo real al mover el slider
			}
		});
		sldDia.setMajorTickSpacing(2);
		sldDia.setValue(1);
		sldDia.setPaintTicks(true);
		sldDia.setPaintLabels(true);
		sldDia.setMinimum(1);
		sldDia.setMaximum(31); // Ajustado a 31 para incluir todos los días del mes
		sldDia.setBounds(10, 52, 343, 45);
		frmSignoZodiacal.getContentPane().add(sldDia);
		
		
		
		// Inicializa con la fecha inicial activa
		actualizarZodiaco();
	}

	/**
	 * Calcula el signo zodiacal en base al día y mes, actualiza lblFecha e intenta cargar la imagen.
	 */
	private void actualizarZodiaco() {
		int dia = sldDia.getValue();
		String mes = (String) spiMes.getValue();

		// Actualiza la fecha en tiempo real
		lblFecha.setText(" " + dia + " de " + mes);

		String signo = calcularSigno(dia, mes);
		colocarImagenEscalada(signo + ".jpg");

		// Intenta cargar la imagen correspondiente al signo (e.g. /img/Aries.png)
		
	}

	/**
	 * Determina el signo zodiacal según el día y el mes seleccionado.
	 */
	private String calcularSigno(int dia, String mes) {
		switch (mes) {
			case "Enero":
				return (dia <= 19) ? "Capricornio" : "Acuario";
			case "Febrero":
				return (dia <= 18) ? "Acuario" : "Piscis";
			case "Marzo":
				return (dia <= 20) ? "Piscis" : "Aries";
			case "Abril":
				return (dia <= 19) ? "Aries" : "Tauro";
			case "Mayo":
				return (dia <= 20) ? "Tauro" : "Geminis";
			case "Junio":
				return (dia <= 20) ? "Geminis" : "Cancer";
			case "Julio":
				return (dia <= 22) ? "Cancer" : "Leo";
			case "Agosto":
				return (dia <= 22) ? "Leo" : "Virgo";
			case "Septiembre":
				return (dia <= 22) ? "Virgo" : "Libra";
			case "Octubre":
				return (dia <= 22) ? "Libra" : "Escorpio";
			case "Noviembre":
				return (dia <= 21) ? "Escorpio" : "Sagitario";
			case "Diciembre":
				return (dia <= 21) ? "Sagitario" : "Capricornio";
			default:
				return "LogoHollow";
		}
	}

	/**
	 * Restablece todos los campos a su estado inicial.
	 */
	private void restablecerValores() {
		sldDia.setValue(1);
		spiMes.setValue("Enero");
		lblValorDia.setText("1");
		lblFecha.setText("");
		colocarImagenEscalada("LogoHollow.png");	}
	/**
	 * Busca una imagen, la escala al tamaño de lblImagen y la coloca.
	 */
	private void colocarImagenEscalada(String nombreArchivo) {
		try {
			ImageIcon iconoOriginal = new ImageIcon(SignoZodiacalAplicationWindows.class.getResource("/img/" + nombreArchivo));
			Image imagenOriginal = iconoOriginal.getImage();
			
			// Se escala la imagen al ancho y alto del JLabel usando SCALE_SMOOTH para que no pierda calidad
			Image imagenEscalada = imagenOriginal.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH);
			
			lblImagen.setIcon(new ImageIcon(imagenEscalada));
		} catch (Exception e) {
			// Si falla o no encuentra la imagen, se queda vacío sin crashear
			lblImagen.setIcon(null); 
		}
	}
}