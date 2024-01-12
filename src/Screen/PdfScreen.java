package screen;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import character.AbilityScores;
import character.PlayerCharacter;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class PdfScreen extends JPanel {

	private JFrame pdfScreen;
	private final JPanel panel = new JPanel();

	public PdfScreen() {

		pdfScreen = new JFrame();
		pdfScreen.setIconImage(Toolkit.getDefaultToolkit().getImage(PdfScreen.class.getResource("/screen/icon.jpg")));
		pdfScreen.setTitle("EnigmaHero: Character Companion");
		pdfScreen.setBounds(100, 10, 620, 850);
		pdfScreen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		pdfScreen.setLocationRelativeTo(null);
		pdfScreen.getContentPane().setLayout(null);
		pdfScreen.setVisible(true);

		panel.setBounds(0, 0, 604, 838);
		pdfScreen.getContentPane().add(panel);
		panel.setLayout(null);

		PlayerCharacter pc1 = new PlayerCharacter("teste");

		JLabel levelLabel = new JLabel("<html>" + String.valueOf(pc1.getLevel()) + "�</html>");
		levelLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		levelLabel.setBounds(338, 56, 32, 14);
		panel.add(levelLabel);

		JLabel experiencePointsLabel = new JLabel(String.valueOf(pc1.getExperience()));
		experiencePointsLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		experiencePointsLabel.setBounds(485, 82, 67, 14);
		panel.add(experiencePointsLabel);

		JLabel nameLabel = new JLabel(pc1.getCharacterName());
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nameLabel.setBounds(50, 70, 92, 14);
		panel.add(nameLabel);

		JLabel alignmentLabel = new JLabel(pc1.getAlignment());
		alignmentLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		alignmentLabel.setBounds(380, 82, 92, 14);
		panel.add(alignmentLabel);

		JLabel initiativeLabel = new JLabel(String.valueOf(AbilityScores.modDex));
		initiativeLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		initiativeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		initiativeLabel.setBounds(277, 152, 46, 25);
		panel.add(initiativeLabel);

		JLabel proficinecyBonusLabel = new JLabel(String.valueOf(pc1.getProficienyBonus()));
		proficinecyBonusLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		proficinecyBonusLabel.setHorizontalAlignment(SwingConstants.CENTER);
		proficinecyBonusLabel.setBounds(85, 172, 32, 25);
		panel.add(proficinecyBonusLabel);

		JLabel languagesLabel = new JLabel(
				"<html> Languages: " + pc1.getProficiency().getLanguage().toString() + "</html>");
		languagesLabel.setVerticalAlignment(SwingConstants.TOP);
		languagesLabel.setHorizontalAlignment(SwingConstants.LEFT);
		languagesLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		languagesLabel.setBounds(25, 641, 170, 34);
		panel.add(languagesLabel);

		JLabel skillsLabel = new JLabel(
				"<html>Skills: " + pc1.SkillList(pc1.getProficiency().getSkill()).toString() + "</html>");
		skillsLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		skillsLabel.setVerticalAlignment(SwingConstants.TOP);
		skillsLabel.setBounds(25, 674, 170, 34);
		panel.add(skillsLabel);

		JLabel raceTraitsLabel = new JLabel("<html>Traits: " + pc1.getRace().getRacialTraits().toString() + "</html>");
		raceTraitsLabel.setHorizontalAlignment(SwingConstants.LEFT);
		raceTraitsLabel.setVerticalAlignment(SwingConstants.TOP);
		raceTraitsLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		raceTraitsLabel.setBounds(416, 394, 154, 57);
		panel.add(raceTraitsLabel);

		JLabel raceLabel = new JLabel(pc1.getRace().getName() + ": " + pc1.getRace().getSubrace());
		raceLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		raceLabel.setBounds(265, 82, 116, 14);
		panel.add(raceLabel);

		JLabel speedLabel = new JLabel(String.valueOf(pc1.getRace().getSpeed()) + " m");
		speedLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		speedLabel.setHorizontalAlignment(SwingConstants.CENTER);
		speedLabel.setBounds(335, 146, 46, 31);
		panel.add(speedLabel);

		String charProficiency;
		if (pc1.ProficiencyList(pc1.getRace().getProficiency()).isEmpty()) {
			charProficiency = "";
		} else {
			charProficiency = "<html>Armor&Weapons: " + pc1.ProficiencyList(pc1.getRace().getProficiency()).toString()
					+ "</html>";
		}
		JLabel raceProficiencyLabel = new JLabel(charProficiency);
		raceProficiencyLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		raceProficiencyLabel.setHorizontalAlignment(SwingConstants.LEFT);
		raceProficiencyLabel.setVerticalAlignment(SwingConstants.TOP);
		raceProficiencyLabel.setBounds(25, 702, 170, 71);
		panel.add(raceProficiencyLabel);

		JLabel backgroundFeatureLabel = new JLabel("<html>Feature: " + pc1.getBackground().getFeature() + "</html>");
		backgroundFeatureLabel.setVerticalAlignment(SwingConstants.TOP);
		backgroundFeatureLabel.setHorizontalAlignment(SwingConstants.LEFT);
		backgroundFeatureLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		backgroundFeatureLabel.setBounds(416, 437, 154, 34);
		panel.add(backgroundFeatureLabel);

		JLabel backgroundEquipmentLabel = new JLabel("<html>" + pc1.getBackground().getEquipment() + "</html>");
		backgroundEquipmentLabel.setVerticalAlignment(SwingConstants.TOP);
		backgroundEquipmentLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		backgroundEquipmentLabel.setBounds(265, 606, 122, 167);
		panel.add(backgroundEquipmentLabel);

		JLabel flawsLabel = new JLabel("<html>" + pc1.getBackground().getFlaws() + "</html>");
		flawsLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		flawsLabel.setVerticalAlignment(SwingConstants.TOP);
		flawsLabel.setBounds(416, 328, 154, 40);
		panel.add(flawsLabel);

		JLabel bondsLabel = new JLabel("<html>" + pc1.getBackground().getBonds() + "</html>");
		bondsLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		bondsLabel.setVerticalAlignment(SwingConstants.TOP);
		bondsLabel.setBounds(416, 274, 154, 34);
		panel.add(bondsLabel);

		JLabel idealsLabel = new JLabel("<html>" + pc1.getBackground().getIdeals() + "</html>");
		idealsLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		idealsLabel.setVerticalAlignment(SwingConstants.TOP);
		idealsLabel.setBounds(416, 217, 154, 34);
		panel.add(idealsLabel);

		JLabel personalityTraitsLabel = new JLabel("<html>" + pc1.getBackground().getPersonalityTraits() + "</html>");
		personalityTraitsLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		personalityTraitsLabel.setVerticalAlignment(SwingConstants.TOP);
		personalityTraitsLabel.setBounds(416, 146, 154, 46);
		panel.add(personalityTraitsLabel);

		JLabel backgroundNameLabel = new JLabel(pc1.getBackground().getName());
		backgroundNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		backgroundNameLabel.setBounds(380, 55, 73, 14);
		panel.add(backgroundNameLabel);

		JLabel charismaLabel = new JLabel(String.valueOf(AbilityScores.getCharisma()));
		charismaLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		charismaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		charismaLabel.setBounds(34, 555, 30, 19);
		panel.add(charismaLabel);

		JLabel charismaModLabel = new JLabel(String.valueOf(AbilityScores.modCha));
		charismaModLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		charismaModLabel.setHorizontalAlignment(SwingConstants.CENTER);
		charismaModLabel.setBounds(25, 524, 46, 25);
		panel.add(charismaModLabel);

		JLabel wisdomLabel = new JLabel(String.valueOf(AbilityScores.getWisdom()));
		wisdomLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		wisdomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		wisdomLabel.setBounds(34, 482, 30, 19);
		panel.add(wisdomLabel);

		JLabel wisdomModLabel = new JLabel(String.valueOf(AbilityScores.modWis));
		wisdomModLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		wisdomModLabel.setHorizontalAlignment(SwingConstants.CENTER);
		wisdomModLabel.setBounds(25, 453, 46, 25);
		panel.add(wisdomModLabel);

		JLabel intelligenceLabel = new JLabel(String.valueOf(AbilityScores.getIntelligence()));
		intelligenceLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		intelligenceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		intelligenceLabel.setBounds(34, 410, 30, 19);
		panel.add(intelligenceLabel);

		JLabel intelligenceModLabel = new JLabel(String.valueOf(AbilityScores.modInt));
		intelligenceModLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		intelligenceModLabel.setHorizontalAlignment(SwingConstants.CENTER);
		intelligenceModLabel.setBounds(25, 381, 46, 25);
		panel.add(intelligenceModLabel);

		JLabel constitutionLabel = new JLabel(String.valueOf(AbilityScores.getConstitution()));
		constitutionLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		constitutionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		constitutionLabel.setBounds(34, 337, 30, 19);
		panel.add(constitutionLabel);

		JLabel constitutionModLabel = new JLabel(String.valueOf(AbilityScores.modCon));
		constitutionModLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		constitutionModLabel.setHorizontalAlignment(SwingConstants.CENTER);
		constitutionModLabel.setBounds(25, 308, 46, 25);
		panel.add(constitutionModLabel);

		JLabel dexterityLabel = new JLabel(String.valueOf(AbilityScores.getDexterity()));
		dexterityLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dexterityLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dexterityLabel.setBounds(34, 262, 30, 25);
		panel.add(dexterityLabel);

		JLabel dexterityModLabel = new JLabel(String.valueOf(AbilityScores.modDex));
		dexterityModLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dexterityModLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dexterityModLabel.setBounds(25, 236, 51, 25);
		panel.add(dexterityModLabel);

		JLabel strenghtModLabel = new JLabel(String.valueOf(AbilityScores.modStr));
		strenghtModLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		strenghtModLabel.setHorizontalAlignment(SwingConstants.CENTER);
		strenghtModLabel.setBounds(25, 158, 51, 34);
		panel.add(strenghtModLabel);

		JLabel strenghtLabel = new JLabel(String.valueOf(AbilityScores.getStrength()));
		strenghtLabel.setHorizontalAlignment(SwingConstants.CENTER);
		strenghtLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		strenghtLabel.setBounds(34, 189, 30, 25);
		panel.add(strenghtLabel);

		JLabel strenghtSavingThrowLabel = new JLabel(
				String.valueOf(AbilityScores.modStr + pc1.ApplySavingThrowProficiencyBonus("Strenght")));
		strenghtSavingThrowLabel.setHorizontalAlignment(SwingConstants.CENTER);
		strenghtSavingThrowLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		strenghtSavingThrowLabel.setBounds(103, 210, 18, 14);
		panel.add(strenghtSavingThrowLabel);

		JLabel dexteritySavingThrowLabel = new JLabel(
				String.valueOf(AbilityScores.modDex + pc1.ApplySavingThrowProficiencyBonus("Dexterity")));
		dexteritySavingThrowLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dexteritySavingThrowLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		dexteritySavingThrowLabel.setBounds(103, 223, 18, 14);
		panel.add(dexteritySavingThrowLabel);

		JLabel constitutionSavingThrowLabel = new JLabel(
				String.valueOf(AbilityScores.modCon + pc1.ApplySavingThrowProficiencyBonus("Constitution")));
		constitutionSavingThrowLabel.setHorizontalAlignment(SwingConstants.CENTER);
		constitutionSavingThrowLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		constitutionSavingThrowLabel.setBounds(103, 237, 18, 14);
		panel.add(constitutionSavingThrowLabel);

		JLabel intelligenceSavingThrowLabel = new JLabel(
				String.valueOf(AbilityScores.modInt + pc1.ApplySavingThrowProficiencyBonus("Intelligence")));
		intelligenceSavingThrowLabel.setHorizontalAlignment(SwingConstants.CENTER);
		intelligenceSavingThrowLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		intelligenceSavingThrowLabel.setBounds(103, 251, 18, 14);
		panel.add(intelligenceSavingThrowLabel);

		JLabel wisdomSavingThrowLabel = new JLabel(
				String.valueOf(AbilityScores.modWis + pc1.ApplySavingThrowProficiencyBonus("Wisdom")));
		wisdomSavingThrowLabel.setHorizontalAlignment(SwingConstants.CENTER);
		wisdomSavingThrowLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		wisdomSavingThrowLabel.setBounds(103, 264, 18, 14);
		panel.add(wisdomSavingThrowLabel);

		JLabel charismaSavingThrowLabel = new JLabel(
				String.valueOf(AbilityScores.modCha + pc1.ApplySavingThrowProficiencyBonus("Charisma")));
		charismaSavingThrowLabel.setHorizontalAlignment(SwingConstants.CENTER);
		charismaSavingThrowLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		charismaSavingThrowLabel.setBounds(103, 278, 18, 14);
		panel.add(charismaSavingThrowLabel);
		// +
		// ((pc1.getProficiency().getSkill().contains("Acrobatics"))?pc1.getProficienyBonus():0)));
		JLabel acrobaticsLabel = new JLabel(String.valueOf(AbilityScores.modDex + pc1.ApplySkillProficiencyBonus("Acrobatics")));
		acrobaticsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		acrobaticsLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		acrobaticsLabel.setBounds(103, 327, 18, 14);
		panel.add(acrobaticsLabel);

		JLabel animalHandlingLabel = new JLabel(String.valueOf(AbilityScores.modWis + pc1.ApplySkillProficiencyBonus("Animal Handling")));
		animalHandlingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		animalHandlingLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		animalHandlingLabel.setBounds(103, 341, 18, 14);
		panel.add(animalHandlingLabel);

		JLabel arcanaLabel = new JLabel(String.valueOf(AbilityScores.modInt + pc1.ApplySkillProficiencyBonus("Arcana")));
		arcanaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		arcanaLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		arcanaLabel.setBounds(103, 355, 18, 14);
		panel.add(arcanaLabel);

		JLabel athleticsLabel = new JLabel(String.valueOf(AbilityScores.modStr + pc1.ApplySkillProficiencyBonus("Athletics")));
		athleticsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		athleticsLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		athleticsLabel.setBounds(103, 369, 18, 14);
		panel.add(athleticsLabel);

		JLabel deceptionLabel = new JLabel(String.valueOf(AbilityScores.modCha + pc1.ApplySkillProficiencyBonus("Deception")));
		deceptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		deceptionLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		deceptionLabel.setBounds(103, 381, 18, 14);
		panel.add(deceptionLabel);

		JLabel historyLabel = new JLabel(String.valueOf(AbilityScores.modInt + pc1.ApplySkillProficiencyBonus("History")));
		historyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		historyLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		historyLabel.setBounds(103, 395, 18, 14);
		panel.add(historyLabel);

		JLabel insightLabel = new JLabel(String.valueOf(AbilityScores.modWis + pc1.ApplySkillProficiencyBonus("Insight")));
		insightLabel.setHorizontalAlignment(SwingConstants.CENTER);
		insightLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		insightLabel.setBounds(103, 409, 18, 14);
		panel.add(insightLabel);

		JLabel intimidationLabel = new JLabel(String.valueOf(AbilityScores.modCha + pc1.ApplySkillProficiencyBonus("Intimidation")));
		intimidationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		intimidationLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		intimidationLabel.setBounds(103, 423, 18, 14);
		panel.add(intimidationLabel);

		JLabel investigationLabel = new JLabel(String.valueOf(AbilityScores.modInt + pc1.ApplySkillProficiencyBonus("Investigation")));
		investigationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		investigationLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		investigationLabel.setBounds(103, 436, 18, 14);
		panel.add(investigationLabel);

		JLabel medicineLabel = new JLabel(String.valueOf(AbilityScores.modWis + pc1.ApplySkillProficiencyBonus("Medicine")));
		medicineLabel.setHorizontalAlignment(SwingConstants.CENTER);
		medicineLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		medicineLabel.setBounds(103, 450, 18, 14);
		panel.add(medicineLabel);

		JLabel natureLabel = new JLabel(String.valueOf(AbilityScores.modInt + pc1.ApplySkillProficiencyBonus("Nature")));
		natureLabel.setHorizontalAlignment(SwingConstants.CENTER);
		natureLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		natureLabel.setBounds(103, 463, 18, 14);
		panel.add(natureLabel);

		JLabel perceptionLabel = new JLabel(String.valueOf(AbilityScores.modWis + pc1.ApplySkillProficiencyBonus("Perception")));
		perceptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		perceptionLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		perceptionLabel.setBounds(103, 477, 18, 14);
		panel.add(perceptionLabel);

		JLabel performanceLabel = new JLabel(String.valueOf(AbilityScores.modCha + pc1.ApplySkillProficiencyBonus("Performance")));
		performanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		performanceLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		performanceLabel.setBounds(103, 491, 18, 14);
		panel.add(performanceLabel);

		JLabel persuasionLabel = new JLabel(String.valueOf(AbilityScores.modCha + pc1.ApplySkillProficiencyBonus("Persuasion")));
		persuasionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		persuasionLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		persuasionLabel.setBounds(103, 505, 18, 14);
		panel.add(persuasionLabel);

		JLabel religionLabel = new JLabel(String.valueOf(AbilityScores.modInt + pc1.ApplySkillProficiencyBonus("Religion")));
		religionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		religionLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		religionLabel.setBounds(103, 519, 18, 14);
		panel.add(religionLabel);

		JLabel sleightOfHandLabel = new JLabel(String.valueOf(AbilityScores.modDex + pc1.ApplySkillProficiencyBonus("Sleight of Hand")));
		sleightOfHandLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sleightOfHandLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		sleightOfHandLabel.setBounds(103, 532, 18, 14);
		panel.add(sleightOfHandLabel);

		JLabel stealthLabel = new JLabel(String.valueOf(AbilityScores.modDex + pc1.ApplySkillProficiencyBonus("Stealth")));
		stealthLabel.setHorizontalAlignment(SwingConstants.CENTER);
		stealthLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		stealthLabel.setBounds(103, 546, 18, 14);
		panel.add(stealthLabel);

		JLabel survivalLabel = new JLabel(String.valueOf(AbilityScores.modWis + pc1.ApplySkillProficiencyBonus("Survival")));
		survivalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		survivalLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		survivalLabel.setBounds(103, 560, 18, 14);
		panel.add(survivalLabel);

		JLabel passivePerceptionLabel = new JLabel(String.valueOf(AbilityScores.modInt + 10 + pc1.ApplySkillProficiencyBonus("Perception")));
		passivePerceptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passivePerceptionLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passivePerceptionLabel.setBounds(23, 602, 25, 20);
		panel.add(passivePerceptionLabel);

		JLabel dndSheetLabel = new JLabel("");
		dndSheetLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		dndSheetLabel.setBounds(-8, 5, 620, 803);
		dndSheetLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		dndSheetLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dndSheetLabel.setIcon(new ImageIcon(PdfScreen.class.getResource("/screen/dnd5Sheet.jpg")));
		panel.add(dndSheetLabel);

		JTextPane displayInfo = new JTextPane();
		displayInfo.setBounds(286, 813, 32, 34);
		panel.add(displayInfo);
		displayInfo.setText(pc1.getCharacterName() + "\n" + pc1.getProficienyBonus());

	}
}