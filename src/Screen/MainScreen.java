package screen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class MainScreen {

	private JFrame frameEnigmaheroCharacterCompanion;
	private final JPanel mainSreen = new JPanel();
	private final JPanel randomCharacterScreen = new JPanel();
	private final JLabel randScreenImglabel = new JLabel(new ImageIcon(MainScreen.class.getResource("/Screen/imgBackground.jpg")));
	private final JLabel mainSreenImgLabel = new JLabel(new ImageIcon(MainScreen.class.getResource("/Screen/imgBackground.jpg")));
	private final JLabel titleLabel = new JLabel("<html><b>EnigmaHero: Character Companion</b></html>");
	private final JLabel titleLabel2 = new JLabel("<html><b>EnigmaHero: Character Companion</b></html>");
	private final JLabel description = new JLabel(
			"<html><p>Welcome to EnigmaHero: Character"
			+ " Companion, your  digital character "
			+ "workshop for Dungeons and Dragons!<br/><br/>"
			+ " Whether you are a cunning dungeon "
			+ "master or a fearless adventurer, "
			+ "EnigmaHero is your ally in building "
			+ "unique characters!</html></p>");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.frameEnigmaheroCharacterCompanion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		randomCharacterScreen.setVisible(false);
		
		frameEnigmaheroCharacterCompanion = new JFrame();
		frameEnigmaheroCharacterCompanion.setIconImage(Toolkit.getDefaultToolkit().getImage(MainScreen.class.getResource("/screen/icon.jpg")));
		frameEnigmaheroCharacterCompanion.setTitle("EnigmaHero: Character Companion");
		frameEnigmaheroCharacterCompanion.setBounds(100, 100, 700, 450);
		frameEnigmaheroCharacterCompanion.setLocationRelativeTo(null);
		frameEnigmaheroCharacterCompanion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameEnigmaheroCharacterCompanion.getContentPane().setLayout(null);

		mainSreen.setBounds(0, 0, 684, 411);
		frameEnigmaheroCharacterCompanion.getContentPane().add(mainSreen);
		mainSreen.setLayout(null);
		mainSreen.setVisible(true);

		JButton btnRandomCharacterButton = new JButton("Random Character");
		btnRandomCharacterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainSreen.setVisible(false);
				randomCharacterScreen.setVisible(true);
			}
		});
		btnRandomCharacterButton.setBounds(489, 333, 185, 35);
		btnRandomCharacterButton.setBorder(BorderFactory.createRaisedBevelBorder());
		mainSreen.add(btnRandomCharacterButton);
		
		titleLabel.setFont(new Font("MasonSerif", Font.PLAIN, 26));
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(0, 21, 480, 41);
		
		titleLabel2.setFont(new Font("MasonSerif", Font.PLAIN, 26));
		titleLabel2.setForeground(Color.WHITE);
		titleLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel2.setBounds(0, 21, 480, 41);
		
		mainSreen.add(titleLabel);
		
		mainSreenImgLabel.setBounds(0, 0, 480, 411);

		mainSreen.add(mainSreenImgLabel);
		description.setHorizontalAlignment(SwingConstants.CENTER);
		description.setFont(new Font("Tahoma", Font.PLAIN, 14));
		description.setBounds(489, 11, 185, 243);
		
		mainSreen.add(description);

		randomCharacterScreen.setBounds(0, 0, 684, 411);
		frameEnigmaheroCharacterCompanion.getContentPane().add(randomCharacterScreen);
		randomCharacterScreen.setLayout(null);
		randomCharacterScreen.add(titleLabel2);

		JButton btnBackMainScreenButton = new JButton("Return to main screen");
		btnBackMainScreenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainSreen.setVisible(true);
				randomCharacterScreen.setVisible(false);
			}
		});
		btnBackMainScreenButton.setBounds(489, 263, 185, 35);
		btnBackMainScreenButton.setBorder(BorderFactory.createRaisedBevelBorder());
		randomCharacterScreen.add(btnBackMainScreenButton);

		JButton btnGenerateRandomCharacterButton = new JButton("Generate Character");
		btnGenerateRandomCharacterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				@SuppressWarnings("unused")
				SheetScreen sheetScreen = new SheetScreen();			
			}
		});
		btnGenerateRandomCharacterButton.setBounds(489, 333, 185, 35);
		btnGenerateRandomCharacterButton.setBorder(BorderFactory.createRaisedBevelBorder());
		randomCharacterScreen.add(btnGenerateRandomCharacterButton);
		
		randScreenImglabel.setBounds(0, 0, 480, 411);
		randomCharacterScreen.add(randScreenImglabel);
		
		

	}
}
