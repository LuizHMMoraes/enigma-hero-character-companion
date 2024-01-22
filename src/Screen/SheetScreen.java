package Screen;

import javax.swing.JFrame;
import javax.swing.JPanel;

import character.AbilityScores;
import character.PlayerCharacter;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;


public class SheetScreen {

	private JFrame sheetScreen;
	private final JPanel panel = new JPanel();
	PlayerCharacter playerCharacter;
	
	public static SheetScreen sheet;
	
	public static String getTextFieldCharacterName = "";
	public static String getTextFiedPlayerName = "";
	public static int initiative = 0;
	public static int passivePerception = 10;
	public static double speed = 0.0;
	public static int bonusHitPoints = 0;
	public static int bonusHitPointsDwarf = 0;
	

	private String formatAsList(List<String> strings) {
		StringBuilder formattedList = new StringBuilder("<style>p{line-height: 10.5;}</style>");
		for (String str : strings) {
			formattedList.append("<p>").append(str).append("</p>");
		}
		return formattedList.toString();
	}
	
	

	public SheetScreen() {

		sheetScreen = new JFrame();
		sheetScreen.setIconImage(Toolkit.getDefaultToolkit().getImage(SheetScreen.class.getResource("/screen/icon.jpg")));
		sheetScreen.setTitle("EnigmaHero: Character Companion");
		sheetScreen.setBounds(100, 10, 620, 850);
		sheetScreen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		sheetScreen.setLocationRelativeTo(null);
		sheetScreen.getContentPane().setLayout(null);
		sheetScreen.setVisible(true);

		panel.setBounds(0, 0, 604, 838);
		sheetScreen.getContentPane().add(panel);
		panel.setLayout(null);

		playerCharacter = new PlayerCharacter(getTextFieldCharacterName, getTextFiedPlayerName);

		String className = playerCharacter.getClassName();
		int characterLevel = playerCharacter.getLevel();
		
		int modStr = AbilityScores.CalculateAbilityScoreModifier(AbilityScores.getStrength());
		int modDex = AbilityScores.CalculateAbilityScoreModifier(AbilityScores.getDexterity());
		int modCon = AbilityScores.CalculateAbilityScoreModifier(AbilityScores.getConstitution());
		int modInt = AbilityScores.CalculateAbilityScoreModifier(AbilityScores.getIntelligence());
		int modWis = AbilityScores.CalculateAbilityScoreModifier(AbilityScores.getWisdom());
		int modCha = AbilityScores.CalculateAbilityScoreModifier(AbilityScores.getCharisma());
		
		JLabel nameLabel = new JLabel(playerCharacter.getCharacterName());
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nameLabel.setBounds(39, 70, 209, 14);
		panel.add(nameLabel);
		
		JLabel playerNameLabel = new JLabel(playerCharacter.getPlayerName());
		playerNameLabel.setBounds(473, 57, 97, 14);
		panel.add(playerNameLabel);
		
		JLabel levelLabel = new JLabel("<html>" + String.valueOf(characterLevel) + "</html>");
		levelLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		levelLabel.setBounds(338, 56, 32, 14);
		panel.add(levelLabel);

		//HitPoints
		JLabel hitPointsLabel = new JLabel("<html>" + String.valueOf(playerCharacter.getHitPoints()) + "</html>");
		hitPointsLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		hitPointsLabel.setBounds(292, 227, 32, 18);
		panel.add(hitPointsLabel);

		JLabel classNameLabel = new JLabel(className);
		classNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		classNameLabel.setBounds(265, 56, 97, 14);
		panel.add(classNameLabel);

		JLabel experiencePointsLabel = new JLabel(String.valueOf(playerCharacter.getExperience()));
		experiencePointsLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		experiencePointsLabel.setBounds(485, 82, 67, 14);
		panel.add(experiencePointsLabel);

		JLabel alignmentLabel = new JLabel(playerCharacter.getAlignment());
		alignmentLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		alignmentLabel.setBounds(380, 82, 92, 14);
		panel.add(alignmentLabel);

		JLabel initiativeLabel = new JLabel(String.valueOf(modDex + initiative));
		initiativeLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		initiativeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		initiativeLabel.setBounds(277, 152, 46, 25);
		panel.add(initiativeLabel);

		JLabel proficinecyBonusLabel = new JLabel(String.valueOf(playerCharacter.getProficienyBonus()));
		proficinecyBonusLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		proficinecyBonusLabel.setHorizontalAlignment(SwingConstants.CENTER);
		proficinecyBonusLabel.setBounds(85, 172, 32, 25);
		panel.add(proficinecyBonusLabel);
		
		JLabel hitPointLabel = new JLabel(String.valueOf((bonusHitPoints * characterLevel) + (bonusHitPointsDwarf * characterLevel)));
		hitPointLabel.setBounds(300, 199, 46, 25);
		panel.add(hitPointLabel);

		JLabel languagesLabel = new JLabel(
				"<html> Languages: " + playerCharacter.getProficiency().getLanguage().toString() + "</html>");
		languagesLabel.setVerticalAlignment(SwingConstants.TOP);
		languagesLabel.setHorizontalAlignment(SwingConstants.LEFT);
		languagesLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		languagesLabel.setBounds(25, 641, 170, 34);
		panel.add(languagesLabel);

		JLabel skillsLabel = new JLabel(
				"<html>Skills: " + playerCharacter.SkillList(playerCharacter.getProficiency().getSkill(), playerCharacter.getClassProficiency().getSkill()).toString() + "</html>");
		skillsLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		skillsLabel.setVerticalAlignment(SwingConstants.TOP);
		skillsLabel.setBounds(25, 674, 170, 54);
		panel.add(skillsLabel);

		JLabel raceTraitsLabel = new JLabel("<html>Traits: " + playerCharacter.getRace().getRacialTraits().toString() + "</html>");
		raceTraitsLabel.setHorizontalAlignment(SwingConstants.LEFT);
		raceTraitsLabel.setVerticalAlignment(SwingConstants.TOP);
		raceTraitsLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		raceTraitsLabel.setBounds(416, 394, 154, 57);
		panel.add(raceTraitsLabel);

		JLabel raceLabel = new JLabel(playerCharacter.getRace().getName() + ": " + playerCharacter.getRace().getSubrace());
		raceLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		raceLabel.setBounds(265, 82, 116, 14);
		panel.add(raceLabel);

		JLabel speedLabel = new JLabel(String.valueOf(speed + playerCharacter.getRace().getSpeed()) + " m");
		speedLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		speedLabel.setHorizontalAlignment(SwingConstants.CENTER);
		speedLabel.setBounds(335, 146, 46, 31);
		panel.add(speedLabel);

		String charProficiency;
		if (playerCharacter.ProficiencyList(playerCharacter.getRace().getProficiency(), playerCharacter.getPlayerClass().getClassProficiency()).isEmpty()) {
			charProficiency = "";
		} else {
			charProficiency = "<html>Armor&Weapons: " + playerCharacter.ProficiencyList(playerCharacter.getRace().getProficiency(), playerCharacter.getPlayerClass().getClassProficiency()).toString()
					+ "</html>";
		}
		JLabel raceProficiencyLabel = new JLabel(charProficiency);
		raceProficiencyLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		raceProficiencyLabel.setHorizontalAlignment(SwingConstants.LEFT);
		raceProficiencyLabel.setVerticalAlignment(SwingConstants.TOP);
		raceProficiencyLabel.setBounds(25, 715, 170, 71);
		panel.add(raceProficiencyLabel);

		JLabel backgroundFeatureLabel = new JLabel("<html>Feature: " + playerCharacter.getBackground().getFeature() + "</html>");
		backgroundFeatureLabel.setVerticalAlignment(SwingConstants.TOP);
		backgroundFeatureLabel.setHorizontalAlignment(SwingConstants.LEFT);
		backgroundFeatureLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		backgroundFeatureLabel.setBounds(416, 453, 154, 34);
		panel.add(backgroundFeatureLabel);

		// Class features
		JLabel classFeatureLabel = new JLabel("<html>Class Features: " + playerCharacter.getPlayerClass().getFeatures() + "</html>");
		classFeatureLabel.setVerticalAlignment(SwingConstants.TOP);
		classFeatureLabel.setHorizontalAlignment(SwingConstants.LEFT);
		classFeatureLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		classFeatureLabel.setBounds(416, 487, 154, 250);
		panel.add(classFeatureLabel);

		JLabel backgroundEquipmentLabel = new JLabel("<html>" + playerCharacter.getBackground().getEquipment() + "</html>");
		backgroundEquipmentLabel.setVerticalAlignment(SwingConstants.TOP);
		backgroundEquipmentLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		backgroundEquipmentLabel.setBounds(265, 606, 122, 167);
		panel.add(backgroundEquipmentLabel);

		JLabel flawsLabel = new JLabel("<html>" + playerCharacter.getBackground().getFlaws() + "</html>");
		flawsLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		flawsLabel.setVerticalAlignment(SwingConstants.TOP);
		flawsLabel.setBounds(416, 328, 154, 40);
		panel.add(flawsLabel);

		JLabel bondsLabel = new JLabel("<html>" + playerCharacter.getBackground().getBonds() + "</html>");
		bondsLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		bondsLabel.setVerticalAlignment(SwingConstants.TOP);
		bondsLabel.setBounds(416, 274, 154, 34);
		panel.add(bondsLabel);

		JLabel idealsLabel = new JLabel("<html>" + playerCharacter.getBackground().getIdeals() + "</html>");
		idealsLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		idealsLabel.setVerticalAlignment(SwingConstants.TOP);
		idealsLabel.setBounds(416, 217, 154, 34);
		panel.add(idealsLabel);

		JLabel personalityTraitsLabel = new JLabel("<html>" + playerCharacter.getBackground().getPersonalityTraits() + "</html>");
		personalityTraitsLabel.setFont(new Font("Tahoma", Font.PLAIN, 9));
		personalityTraitsLabel.setVerticalAlignment(SwingConstants.TOP);
		personalityTraitsLabel.setBounds(416, 146, 154, 46);
		panel.add(personalityTraitsLabel);

		JLabel backgroundNameLabel = new JLabel(playerCharacter.getBackground().getName());
		backgroundNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		backgroundNameLabel.setBounds(380, 55, 73, 14);
		panel.add(backgroundNameLabel);

		JLabel charismaLabel = new JLabel(String.valueOf(AbilityScores.getCharisma()));
		charismaLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		charismaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		charismaLabel.setBounds(34, 555, 30, 19);
		panel.add(charismaLabel);

		JLabel charismaModLabel = new JLabel(String.valueOf(modCha));
		charismaModLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		charismaModLabel.setHorizontalAlignment(SwingConstants.CENTER);
		charismaModLabel.setBounds(25, 524, 46, 25);
		panel.add(charismaModLabel);

		JLabel wisdomLabel = new JLabel(String.valueOf(AbilityScores.getWisdom()));
		wisdomLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		wisdomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		wisdomLabel.setBounds(34, 482, 30, 19);
		panel.add(wisdomLabel);

		JLabel wisdomModLabel = new JLabel(String.valueOf(modWis));
		wisdomModLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		wisdomModLabel.setHorizontalAlignment(SwingConstants.CENTER);
		wisdomModLabel.setBounds(25, 453, 46, 25);
		panel.add(wisdomModLabel);

		JLabel intelligenceLabel = new JLabel(String.valueOf(AbilityScores.getIntelligence()));
		intelligenceLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		intelligenceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		intelligenceLabel.setBounds(34, 410, 30, 19);
		panel.add(intelligenceLabel);

		JLabel intelligenceModLabel = new JLabel(String.valueOf(modInt));
		intelligenceModLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		intelligenceModLabel.setHorizontalAlignment(SwingConstants.CENTER);
		intelligenceModLabel.setBounds(25, 381, 46, 25);
		panel.add(intelligenceModLabel);

		JLabel constitutionLabel = new JLabel(String.valueOf(AbilityScores.getConstitution()));
		constitutionLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		constitutionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		constitutionLabel.setBounds(34, 337, 30, 19);
		panel.add(constitutionLabel);

		JLabel constitutionModLabel = new JLabel(String.valueOf(modCon));
		constitutionModLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		constitutionModLabel.setHorizontalAlignment(SwingConstants.CENTER);
		constitutionModLabel.setBounds(25, 308, 46, 25);
		panel.add(constitutionModLabel);

		JLabel dexterityLabel = new JLabel(String.valueOf(AbilityScores.getDexterity()));
		dexterityLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dexterityLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dexterityLabel.setBounds(34, 262, 30, 25);
		panel.add(dexterityLabel);

		JLabel dexterityModLabel = new JLabel(String.valueOf(modDex));
		dexterityModLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dexterityModLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dexterityModLabel.setBounds(25, 236, 51, 25);
		panel.add(dexterityModLabel);

		JLabel strenghtModLabel = new JLabel(String.valueOf(modStr));
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
				String.valueOf(modStr + playerCharacter.ApplySavingThrowProficiencyBonus("Strenght")));
		strenghtSavingThrowLabel.setHorizontalAlignment(SwingConstants.CENTER);
		strenghtSavingThrowLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		strenghtSavingThrowLabel.setBounds(103, 210, 18, 14);
		panel.add(strenghtSavingThrowLabel);

		JLabel dexteritySavingThrowLabel = new JLabel(
				String.valueOf(modDex + playerCharacter.ApplySavingThrowProficiencyBonus("Dexterity")));
		dexteritySavingThrowLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dexteritySavingThrowLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		dexteritySavingThrowLabel.setBounds(103, 223, 18, 14);
		panel.add(dexteritySavingThrowLabel);

		JLabel constitutionSavingThrowLabel = new JLabel(
				String.valueOf(modCon + playerCharacter.ApplySavingThrowProficiencyBonus("Constitution")));
		constitutionSavingThrowLabel.setHorizontalAlignment(SwingConstants.CENTER);
		constitutionSavingThrowLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		constitutionSavingThrowLabel.setBounds(103, 237, 18, 14);
		panel.add(constitutionSavingThrowLabel);

		JLabel intelligenceSavingThrowLabel = new JLabel(
				String.valueOf(modInt + playerCharacter.ApplySavingThrowProficiencyBonus("Intelligence")));
		intelligenceSavingThrowLabel.setHorizontalAlignment(SwingConstants.CENTER);
		intelligenceSavingThrowLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		intelligenceSavingThrowLabel.setBounds(103, 251, 18, 14);
		panel.add(intelligenceSavingThrowLabel);

		JLabel wisdomSavingThrowLabel = new JLabel(
				String.valueOf(modWis + playerCharacter.ApplySavingThrowProficiencyBonus("Wisdom")));
		wisdomSavingThrowLabel.setHorizontalAlignment(SwingConstants.CENTER);
		wisdomSavingThrowLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		wisdomSavingThrowLabel.setBounds(103, 264, 18, 14);
		panel.add(wisdomSavingThrowLabel);

		JLabel charismaSavingThrowLabel = new JLabel(
				String.valueOf(modCha + playerCharacter.ApplySavingThrowProficiencyBonus("Charisma")));
		charismaSavingThrowLabel.setHorizontalAlignment(SwingConstants.CENTER);
		charismaSavingThrowLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		charismaSavingThrowLabel.setBounds(103, 278, 18, 14);
		panel.add(charismaSavingThrowLabel);
		
		JLabel acrobaticsLabel = new JLabel(String.valueOf(modDex + playerCharacter.ApplySkillProficiencyBonus("Acrobatics")));
		acrobaticsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		acrobaticsLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		acrobaticsLabel.setBounds(103, 327, 18, 14);
		panel.add(acrobaticsLabel);

		JLabel animalHandlingLabel = new JLabel(String.valueOf(modWis + playerCharacter.ApplySkillProficiencyBonus("Animal Handling")));
		animalHandlingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		animalHandlingLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		animalHandlingLabel.setBounds(103, 341, 18, 14);
		panel.add(animalHandlingLabel);

		JLabel arcanaLabel = new JLabel(String.valueOf(modInt + playerCharacter.ApplySkillProficiencyBonus("Arcana")));
		arcanaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		arcanaLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		arcanaLabel.setBounds(103, 355, 18, 14);
		panel.add(arcanaLabel);

		JLabel athleticsLabel = new JLabel(String.valueOf(modStr + playerCharacter.ApplySkillProficiencyBonus("Athletics")));
		athleticsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		athleticsLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		athleticsLabel.setBounds(103, 369, 18, 14);
		panel.add(athleticsLabel);

		JLabel deceptionLabel = new JLabel(String.valueOf(modCha + playerCharacter.ApplySkillProficiencyBonus("Deception")));
		deceptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		deceptionLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		deceptionLabel.setBounds(103, 381, 18, 14);
		panel.add(deceptionLabel);

		JLabel historyLabel = new JLabel(String.valueOf(modInt + playerCharacter.ApplySkillProficiencyBonus("History")));
		historyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		historyLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		historyLabel.setBounds(103, 395, 18, 14);
		panel.add(historyLabel);

		JLabel insightLabel = new JLabel(String.valueOf(modWis + playerCharacter.ApplySkillProficiencyBonus("Insight")));
		insightLabel.setHorizontalAlignment(SwingConstants.CENTER);
		insightLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		insightLabel.setBounds(103, 409, 18, 14);
		panel.add(insightLabel);

		JLabel intimidationLabel = new JLabel(String.valueOf(modCha + playerCharacter.ApplySkillProficiencyBonus("Intimidation")));
		intimidationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		intimidationLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		intimidationLabel.setBounds(103, 423, 18, 14);
		panel.add(intimidationLabel);

		JLabel investigationLabel = new JLabel(String.valueOf(modInt + playerCharacter.ApplySkillProficiencyBonus("Investigation")));
		investigationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		investigationLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		investigationLabel.setBounds(103, 436, 18, 14);
		panel.add(investigationLabel);

		JLabel medicineLabel = new JLabel(String.valueOf(modWis + playerCharacter.ApplySkillProficiencyBonus("Medicine")));
		medicineLabel.setHorizontalAlignment(SwingConstants.CENTER);
		medicineLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		medicineLabel.setBounds(103, 450, 18, 14);
		panel.add(medicineLabel);

		JLabel natureLabel = new JLabel(String.valueOf(modInt + playerCharacter.ApplySkillProficiencyBonus("Nature")));
		natureLabel.setHorizontalAlignment(SwingConstants.CENTER);
		natureLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		natureLabel.setBounds(103, 463, 18, 14);
		panel.add(natureLabel);

		JLabel perceptionLabel = new JLabel(String.valueOf(modWis + playerCharacter.ApplySkillProficiencyBonus("Perception")));
		perceptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		perceptionLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		perceptionLabel.setBounds(103, 477, 18, 14);
		panel.add(perceptionLabel);

		JLabel performanceLabel = new JLabel(String.valueOf(modCha + playerCharacter.ApplySkillProficiencyBonus("Performance")));
		performanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		performanceLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		performanceLabel.setBounds(103, 491, 18, 14);
		panel.add(performanceLabel);

		JLabel persuasionLabel = new JLabel(String.valueOf(modCha + playerCharacter.ApplySkillProficiencyBonus("Persuasion")));
		persuasionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		persuasionLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		persuasionLabel.setBounds(103, 505, 18, 14);
		panel.add(persuasionLabel);

		JLabel religionLabel = new JLabel(String.valueOf(modInt + playerCharacter.ApplySkillProficiencyBonus("Religion")));
		religionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		religionLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		religionLabel.setBounds(103, 519, 18, 14);
		panel.add(religionLabel);

		JLabel sleightOfHandLabel = new JLabel(String.valueOf(modDex + playerCharacter.ApplySkillProficiencyBonus("Sleight of Hand")));
		sleightOfHandLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sleightOfHandLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		sleightOfHandLabel.setBounds(103, 532, 18, 14);
		panel.add(sleightOfHandLabel);

		JLabel stealthLabel = new JLabel(String.valueOf(modDex + playerCharacter.ApplySkillProficiencyBonus("Stealth")));
		stealthLabel.setHorizontalAlignment(SwingConstants.CENTER);
		stealthLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		stealthLabel.setBounds(103, 546, 18, 14);
		panel.add(stealthLabel);

		JLabel survivalLabel = new JLabel(String.valueOf(modWis + playerCharacter.ApplySkillProficiencyBonus("Survival")));
		survivalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		survivalLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		survivalLabel.setBounds(103, 560, 18, 14);
		panel.add(survivalLabel);

		JLabel passivePerceptionLabel = new JLabel(String.valueOf((modWis + passivePerception) + playerCharacter.ApplySkillProficiencyBonus("Perception")));
		passivePerceptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passivePerceptionLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passivePerceptionLabel.setBounds(23, 602, 25, 20);
		panel.add(passivePerceptionLabel);
		
		JPanel spellSheetPanel = new JPanel();
		spellSheetPanel.setBounds(0, 0, 604, 838);
		sheetScreen.getContentPane().add(spellSheetPanel);
		spellSheetPanel.setLayout(null);
		spellSheetPanel.setVisible(false);

		//Slots de magia
		if (className == "Bard" || className == "Cleric" || className == "Druid" || className == "Paladin" || className == "Ranger" 
			|| className == "Sorcerer" || className == "Warlock" || className == "Wizard") {

				//Lista de cantrips
				JLabel cantrips = new JLabel("<html>" + formatAsList(playerCharacter.getKnownSpells().get(0)) + "</html>");
				cantrips.setVerticalAlignment(SwingConstants.TOP);
				cantrips.setHorizontalAlignment(SwingConstants.LEFT);
				cantrips.setFont(new Font("Tahoma", Font.PLAIN, 11));
				cantrips.setBounds(40, 180, 154, 250);
				spellSheetPanel.add(cantrips);
				
				//Slots e magias conhecidas de nivel 1
				JLabel slots1 = new JLabel(String.valueOf(playerCharacter.getSpell().getSpellSlots(className, characterLevel, 1)));
				slots1.setHorizontalAlignment(SwingConstants.CENTER);
				slots1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				slots1.setBounds(55, 326, 18, 14);
				spellSheetPanel.add(slots1);

				JLabel spells1 = new JLabel("<html>" + formatAsList(playerCharacter.getKnownSpells().get(1)) + "</html>");
				spells1.setVerticalAlignment(SwingConstants.TOP);
				spells1.setHorizontalAlignment(SwingConstants.LEFT);
				spells1.setFont(new Font("Tahoma", Font.PLAIN, 11));
				spells1.setBounds(40, 353, 154, 250);
				spellSheetPanel.add(spells1);

				//Slots e magias conhecidas de nivel 2
				JLabel slots2 = new JLabel(String.valueOf(playerCharacter.getSpell().getSpellSlots(className, characterLevel, 2)));
				slots2.setHorizontalAlignment(SwingConstants.CENTER);
				slots2.setFont(new Font("Tahoma", Font.PLAIN, 16));
				slots2.setBounds(55, 558, 18, 14);
				spellSheetPanel.add(slots2);

				JLabel spells2 = new JLabel("<html>" + formatAsList(playerCharacter.getKnownSpells().get(2)) + "</html>");
				spells2.setVerticalAlignment(SwingConstants.TOP);
				spells2.setHorizontalAlignment(SwingConstants.LEFT);
				spells2.setFont(new Font("Tahoma", Font.PLAIN, 11));
				spells2.setBounds(40, 583, 154, 250);
				spellSheetPanel.add(spells2);

				//Slots e magias conhecidas de nivel 3
				JLabel slots3 = new JLabel(String.valueOf(playerCharacter.getSpell().getSpellSlots(className, characterLevel, 3)));
				slots3.setHorizontalAlignment(SwingConstants.CENTER);
				slots3.setFont(new Font("Tahoma", Font.PLAIN, 16));
				slots3.setBounds(246, 157, 18, 14);
				spellSheetPanel.add(slots3);

				JLabel spells3 = new JLabel("<html>" + formatAsList(playerCharacter.getKnownSpells().get(3)) + "</html>");
				spells3.setVerticalAlignment(SwingConstants.TOP);
				spells3.setHorizontalAlignment(SwingConstants.LEFT);
				spells3.setFont(new Font("Tahoma", Font.PLAIN, 11));
				spells3.setBounds(231, 181, 154, 250);
				spellSheetPanel.add(spells3);

				//Slots e magias conhecidas de nivel 4
				JLabel slots4 = new JLabel(String.valueOf(playerCharacter.getSpell().getSpellSlots(className, characterLevel, 4)));
				slots4.setHorizontalAlignment(SwingConstants.CENTER);
				slots4.setFont(new Font("Tahoma", Font.PLAIN, 16));
				slots4.setBounds(246, 385, 18, 14);
				spellSheetPanel.add(slots4);

				JLabel spells4 = new JLabel("<html>" + formatAsList(playerCharacter.getKnownSpells().get(4)) + "</html>");
				spells4.setVerticalAlignment(SwingConstants.TOP);
				spells4.setHorizontalAlignment(SwingConstants.LEFT);
				spells4.setFont(new Font("Tahoma", Font.PLAIN, 11));
				spells4.setBounds(231, 410, 154, 250);
				spellSheetPanel.add(spells4);

				//Slots e magias conhecidas de nivel 5
				JLabel slots5 = new JLabel(String.valueOf(playerCharacter.getSpell().getSpellSlots(className, characterLevel, 5)));
				slots5.setHorizontalAlignment(SwingConstants.CENTER);
				slots5.setFont(new Font("Tahoma", Font.PLAIN, 16));
				slots5.setBounds(246, 614, 18, 14);
				spellSheetPanel.add(slots5);

				JLabel spells5 = new JLabel("<html>" + formatAsList(playerCharacter.getKnownSpells().get(5)) + "</html>");
				spells5.setVerticalAlignment(SwingConstants.TOP);
				spells5.setHorizontalAlignment(SwingConstants.LEFT);
				spells5.setFont(new Font("Tahoma", Font.PLAIN, 11));
				spells5.setBounds(231, 639, 154, 250);
				spellSheetPanel.add(spells5);

				//Slots e magias conhecidas de nivel 6
				JLabel slots6 = new JLabel(String.valueOf(playerCharacter.getSpell().getSpellSlots(className, characterLevel, 6)));
				slots6.setHorizontalAlignment(SwingConstants.CENTER);
				slots6.setFont(new Font("Tahoma", Font.PLAIN, 16));
				slots6.setBounds(437, 156, 18, 14);
				spellSheetPanel.add(slots6);

				JLabel spells6 = new JLabel("<html>" + formatAsList(playerCharacter.getKnownSpells().get(6)) + "</html>");
				spells6.setVerticalAlignment(SwingConstants.TOP);
				spells6.setHorizontalAlignment(SwingConstants.LEFT);
				spells6.setFont(new Font("Tahoma", Font.PLAIN, 11));
				spells6.setBounds(420, 181, 154, 250);
				spellSheetPanel.add(spells6);

				//Slots e magias conhecidas de nivel 7
				JLabel slots7 = new JLabel(String.valueOf(playerCharacter.getSpell().getSpellSlots(className, characterLevel, 7)));
				slots7.setHorizontalAlignment(SwingConstants.CENTER);
				slots7.setFont(new Font("Tahoma", Font.PLAIN, 16));
				slots7.setBounds(437, 328, 18, 14);
				spellSheetPanel.add(slots7);

				JLabel spells7 = new JLabel("<html>" + formatAsList(playerCharacter.getKnownSpells().get(7)) + "</html>");
				spells7.setVerticalAlignment(SwingConstants.TOP);
				spells7.setHorizontalAlignment(SwingConstants.LEFT);
				spells7.setFont(new Font("Tahoma", Font.PLAIN, 11));
				spells7.setBounds(420, 353, 154, 250);
				spellSheetPanel.add(spells7);

				//Slots e magias conhecidas de nivel 8
				JLabel slots8 = new JLabel(String.valueOf(playerCharacter.getSpell().getSpellSlots(className, characterLevel, 8)));
				slots8.setHorizontalAlignment(SwingConstants.CENTER);
				slots8.setFont(new Font("Tahoma", Font.PLAIN, 16));
				slots8.setBounds(437, 500, 18, 14);
				spellSheetPanel.add(slots8);

				JLabel spells8 = new JLabel("<html>" + formatAsList(playerCharacter.getKnownSpells().get(8)) + "</html>");
				spells8.setVerticalAlignment(SwingConstants.TOP);
				spells8.setHorizontalAlignment(SwingConstants.LEFT);
				spells8.setFont(new Font("Tahoma", Font.PLAIN, 11));
				spells8.setBounds(420, 525, 154, 250);
				spellSheetPanel.add(spells8);

				//Slots e magias conhecidas de nivel 9
				JLabel slots9 = new JLabel(String.valueOf(playerCharacter.getSpell().getSpellSlots(className, characterLevel, 9)));
				slots9.setHorizontalAlignment(SwingConstants.CENTER);
				slots9.setFont(new Font("Tahoma", Font.PLAIN, 16));
				slots9.setBounds(437, 642, 18, 14);
				spellSheetPanel.add(slots9);

				JLabel spells9 = new JLabel("<html>" + formatAsList(playerCharacter.getKnownSpells().get(9)) + "</html>");
				spells9.setVerticalAlignment(SwingConstants.TOP);
				spells9.setHorizontalAlignment(SwingConstants.LEFT);
				spells9.setFont(new Font("Tahoma", Font.PLAIN, 11));
				spells9.setBounds(420, 668, 154, 250);
				spellSheetPanel.add(spells9);
			}
		
		JButton btnMainSheetButton = new JButton("Main sheet");
		btnMainSheetButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnMainSheetButton.setFocusPainted(false);
		btnMainSheetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				spellSheetPanel.setVisible(false);
			}
		});
		btnMainSheetButton.setBounds(470, 11, 110, 25);
		spellSheetPanel.add(btnMainSheetButton);
		
		JLabel spellSheetLabel = new JLabel("");
		spellSheetLabel.setIcon(new ImageIcon(SheetScreen.class.getResource("/screen/spellSheet.png")));
		spellSheetLabel.setBounds(-8, 5, 620, 803);
		spellSheetPanel.add(spellSheetLabel);
		
		JButton btnSpellScreenButton = new JButton("Spells sheet");
		btnSpellScreenButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSpellScreenButton.setFocusPainted(false);
		btnSpellScreenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				spellSheetPanel.setVisible(true);
			}
		});
		btnSpellScreenButton.setBounds(470, 11, 110, 25);
		panel.add(btnSpellScreenButton);
		
		JButton btnRerollButton = new JButton("Reroll Character");
		btnRerollButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnRerollButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SheetScreen sheetScreen = new SheetScreen();
				SheetScreen.sheet.sheetScreen.dispose();
				SheetScreen.sheet = sheetScreen;
			}
		});
		btnRerollButton.setBounds(343, 11, 110, 25);
		panel.add(btnRerollButton);

		JLabel dndSheetLabel = new JLabel("");
		dndSheetLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		dndSheetLabel.setBounds(-8, 5, 620, 803);
		dndSheetLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		dndSheetLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dndSheetLabel.setIcon(new ImageIcon(SheetScreen.class.getResource("/screen/dnd5Sheet.jpg")));
		panel.add(dndSheetLabel);
		
	}
}
