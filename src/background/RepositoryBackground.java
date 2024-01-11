package background;

import java.util.ArrayList;

public class RepositoryBackground {
	private String name;
	private String feature;
	private String equipment;
	private ArrayList<String> personalityTraits;
	private ArrayList<String> ideals;
	private ArrayList<String> bonds;
	private ArrayList<String> flaws;

	public RepositoryBackground() {

	}

	public RepositoryBackground(String name, String feature, String equipment) {
		this.name = name;
		this.feature = feature;
		this.equipment = equipment;
	}
	
	public ArrayList<RepositoryBackground> BackgroundList(){
		ArrayList<RepositoryBackground> backgroundList = new ArrayList<>();
		backgroundList.add(Acolyte());
		backgroundList.add(Charlatan());
		backgroundList.add(Criminal());
		backgroundList.add(Entertainer());
		backgroundList.add(FolkHero());
		backgroundList.add(GuildArtisan());
		backgroundList.add(Hermit());
		backgroundList.add(Noble());
		backgroundList.add(Outlander());
		backgroundList.add(Sage());
		backgroundList.add(Sailor());
		backgroundList.add(Soldier());
		backgroundList.add(Urchin());
		return backgroundList;
	}

	public static RepositoryBackground Acolyte() {
		RepositoryBackground acolyte = new RepositoryBackground();
		acolyte.setName("Acolyte");
		acolyte.setFeature("Shelter of the Faithful");
		acolyte.setEquipment("A holy symbol (a gift to you when you\r\n"
				+ "entered the priesthood), a prayer book or prayer\r\n"
				+ "wheel, 5 sticks of incense, vestments, a set of common\r\n"
				+ "clothes, and a belt pouch containing 15 gp");
		acolyte.setPersonalityTraits(new ArrayList<>());
		acolyte.setIdeals(new ArrayList<>());
		acolyte.setBonds(new ArrayList<>());
		acolyte.setFlaws(new ArrayList<>());
		
		acolyte.getPersonalityTraits().add("I idolize a particular hero of my faith, and constantly\r\n"
				+ "refer to that person’s deeds and example.");
		acolyte.getPersonalityTraits().add("I can find common ground between the fiercest\r\n"
				+ "enemies, empathizing with them and always working toward peace.");
		acolyte.getPersonalityTraits().add("I see omens in every event and action. The gods try to\r\n"
				+ "speak to us, we just need to listen");
		acolyte.getPersonalityTraits().add("Nothing can shake my optimistic attitude.");
		acolyte.getPersonalityTraits().add("I quote (or misquote) sacred texts and proverbs in\r\n"
				+ "almost every situation.");
		acolyte.getPersonalityTraits().add("I am tolerant (or intolerant) of other faiths and respect\r\n"
				+ "(or condemn) the worship of other gods.");
		acolyte.getPersonalityTraits().add("I've enjoyed fine food, drink, and high society among\r\n"
				+ "my temple’s elite. Rough living grates on me.");
		acolyte.getPersonalityTraits().add("I've enjoyed fine food, drink, and high society among\r\n"
				+ "my temple’s elite. Rough living grates on me.");
		acolyte.getPersonalityTraits().add("I’ve spent so long in the temple that I have little\r\n"
				+ "practical experience dealing with people in the outside\r\n"
				+ "world.");
		
		acolyte.getIdeals().add("The ancient traditions of worship and\r\n"
				+ "sacrifice must be preserved and upheld.");
		acolyte.getIdeals().add("I always try to help those in need, no matter\r\n"
				+ "what the personal cost.");
		acolyte.getIdeals().add("We must help bring about the changes the\r\n"
				+ "gods are constantly working in the world.");
		acolyte.getIdeals().add("I hope to one day rise to the top of my faith’s\r\n"
				+ "religious hierarchy.");
		acolyte.getIdeals().add("I trust that my deity will guide my actions, I have\r\n"
				+ "faith that if I work hard, things will go well.");
		acolyte.getIdeals().add("I seek to prove myself worthy of my god’s\r\n"
				+ "favor by matching my actions against his or her\r\n"
				+ "teachings.");
		
		acolyte.getBonds().add("I would die to recover an ancient relic of my faith that\r\n"
				+ "was lost long ago.");
		acolyte.getBonds().add("I will someday get revenge on the corrupt temple\r\n"
				+ "hierarchy who branded me a heretic.");
		acolyte.getBonds().add("I owe my life to the priest who took me in when my\r\n"
				+ "parents died.");
		acolyte.getBonds().add("Everything I do is for the common people.");
		acolyte.getBonds().add("I will do anything to protect the temple where I served.");
		acolyte.getBonds().add("I seek to preserve a sacred text that my enemies\r\n"
				+ "consider heretical and seek to destroy.");
		
		acolyte.getFlaws().add("I judge others harshly, and myself even more severely.");
		acolyte.getFlaws().add("I put too much trust in those who wield power within\r\n"
				+ "my temple’s hierarchy.");
		acolyte.getFlaws().add("My piety sometimes leads me to blindly trust those\r\n"
				+ "that profess faith in my god.");
		acolyte.getFlaws().add("I am inflexible in my thinking.");
		acolyte.getFlaws().add("I am suspicious of strangers and expect the worst of\r\n"
				+ "them.");
		acolyte.getFlaws().add("Once I pick a goal, I become obsessed with it to the\r\n"
				+ "detriment of everything else in my life.");
		return acolyte;
	}
	
	public static RepositoryBackground Charlatan() {
		RepositoryBackground charlatan = new RepositoryBackground();
		charlatan.setName("Charlatan");
		charlatan.setFeature("False Identity");
		charlatan.setEquipment("A set of fine clothes, a disguise kit, tools\r\n"
				+ "of the con of your choice (ten stoppered bottles filled\r\n"
				+ "with colored liquid, a set of weighted dice, a deck of\r\n"
				+ "marked cards, or a signet ring of an imaginary duke),\r\n"
				+ "and a belt pouch containing 15 gp");
		charlatan.setPersonalityTraits(new ArrayList<>());
		charlatan.setIdeals(new ArrayList<>());
		charlatan.setBonds(new ArrayList<>());
		charlatan.setFlaws(new ArrayList<>());
		
		charlatan.getPersonalityTraits().add("I fall in and out of love easily, and am always pursuing\r\n"
				+ "someone.");
		charlatan.getPersonalityTraits().add("I have a joke for every occasion, especially occasions\r\n"
				+ "where humor is inappropriate.");
		charlatan.getPersonalityTraits().add("Flattery is my preferred trick for getting what I want.");
		charlatan.getPersonalityTraits().add("I’m a born gambler who can't resist taking a risk for a\r\n"
				+ "potential payoff.");
		charlatan.getPersonalityTraits().add("I lie about almost everything, even when there’s no\r\n"
				+ "good reason to.");
		charlatan.getPersonalityTraits().add("Sarcasm and insults are my weapons of choice.");
		charlatan.getPersonalityTraits().add("I keep multiple holy symbols on me and invoke\r\n"
				+ "whatever deity might come in useful at any given\r\n"
				+ "moment.");
		charlatan.getPersonalityTraits().add("I pocket anything I see that might have some value.");
		
		charlatan.getIdeals().add("I am a free spirit— no one tells me what\r\n"
				+ "to do.");
		charlatan.getIdeals().add("I never target people who can’t afford to lose\r\n"
				+ "a few coins.");
		charlatan.getIdeals().add("I distribute the money I acquire to the people\r\n"
				+ "who really need it.");
		charlatan.getIdeals().add("I never run the same con twice.");
		charlatan.getIdeals().add("Material goods come and go. Bonds of\r\n"
				+ "friendship last forever.");
		charlatan.getIdeals().add("I’m determined to make something\r\n"
				+ "of myself.");
		
		charlatan.getBonds().add("I fleeced the wrong person and must work to ensure\r\n"
				+ "that this individual never crosses paths with me or\r\n"
				+ "those I care about.");
		charlatan.getBonds().add("I owe everything to my mentor—a horrible person\r\n"
				+ "who’s probably rotting in jail somewhere.");
		charlatan.getBonds().add("Somewhere out there, I have a child who doesn’t\r\n"
				+ "know me. I’m making the world better for him or her.");
		charlatan.getBonds().add("I come from a noble family, and one day I’ll reclaim my\r\n"
				+ "lands and title from those who stole them from me.");
		charlatan.getBonds().add("A powerful person killed someone I love. Some day\r\n"
				+ "soon, I’ll have my revenge.");
		charlatan.getBonds().add("I swindled and ruined a person who didn’t deserve it. I\r\n"
				+ "seek to atone for my misdeeds but might never be able\r\n"
				+ "to forgive myself.");
		
		charlatan.getFlaws().add("I can’t resist a pretty face.");
		charlatan.getFlaws().add("I'm always in debt. I spend my ill-gotten gains on\r\n"
				+ "decadent luxuries faster than I bring them in.");
		charlatan.getFlaws().add("I’m convinced that no one could ever fool me the way\r\n"
				+ "I fool others.");
		charlatan.getFlaws().add("I’m too greedy for my own good. I can’t resist taking a\r\n"
				+ "risk if there’s money involved.");
		charlatan.getFlaws().add("I can’t resist swindling people who are more powerful\r\n"
				+ "than me.");
		charlatan.getFlaws().add("I hate to admit it and will hate myself for it, but I'll run\r\n"
				+ "and preserve my own hide if the going gets tough.");
		return charlatan;
	}
	
	public static RepositoryBackground Criminal() {
		RepositoryBackground criminal = new RepositoryBackground();
		criminal.setName("Criminal");
		criminal.setFeature("Criminal Contact");
		criminal.setEquipment("A crowbar, a set of dark common clothes\r\n"
				+ "including a hood, and a belt pouch containing 15 gp");
		criminal.setPersonalityTraits(new ArrayList<>());
		criminal.setIdeals(new ArrayList<>());
		criminal.setBonds(new ArrayList<>());
		criminal.setFlaws(new ArrayList<>());
		
		criminal.getPersonalityTraits().add("I always have a plan for what to do when things go wrong");
		criminal.getPersonalityTraits().add("I am always calm, no matter what the situation. I never\r\n"
				+ " raise my voice or let my emotions control me.");
		criminal.getPersonalityTraits().add("The first thing I do in a new place is note the locations\r\n"
				+ " of everything valuable – or where such things could be\r\n"
				+ " hidden.");
		criminal.getPersonalityTraits().add("I would rather make a new friend than a new enemy.");
		criminal.getPersonalityTraits().add("I am incredibly slow to trust. Those who seem the fairest\r\n"
				+ " often have the most to hide.");
		criminal.getPersonalityTraits().add("I don't pay attention to the risks in a situation. Never tell\r\n"
				+ " me the odds.");
		criminal.getPersonalityTraits().add("The best way to get me to do something is to tell me I\r\n"
				+ " can't do it.");
		criminal.getPersonalityTraits().add("I blow up at the slightest insult.");
		
		criminal.getIdeals().add("I don’t steal from others in the trade.");
		criminal.getIdeals().add("Chains are meant to be broken, as are those\r\n"
				+ "who would forge them.");
		criminal.getIdeals().add("I steal from the wealthy so that I can help\r\n"
				+ "people in need.");
		criminal.getIdeals().add("I will do whatever it takes to become\r\n"
				+ "wealthy.");
		criminal.getIdeals().add("I’m loyal to my friends, not to any ideals, and\r\n"
				+ "everyone else can take a trip down the Styx for all I\r\n"
				+ "care.");
		criminal.getIdeals().add("There’s a spark of good in everyone.");
		
		criminal.getBonds().add("I’m trying to pay off an old debt I owe to a generous\r\n"
				+ "benefactor.");
		criminal.getBonds().add("My ill-gotten gains go to support my family.");
		criminal.getBonds().add("Something important was taken from me, and I aim to\r\n"
				+ "steal it back.");
		criminal.getBonds().add("I will become the greatest thief that ever lived.");
		criminal.getBonds().add("I’m guilty of a terrible crime. I hope I can redeem\r\n"
				+ "myself for it.");
		criminal.getBonds().add("Someone I loved died because of a mistake I made.\r\n"
				+ "That will never happen again.");
		
		criminal.getFlaws().add("When I see something valuable, I can’t think about\r\n"
				+ "anything but how to steal it.");
		criminal.getFlaws().add("When faced with a choice between money and my\r\n"
				+ "friends, I usually choose the money.");
		criminal.getFlaws().add("If there’s a plan, I’ll forget it. If I don’t forget it, I’ll\r\n"
				+ "ignore it.");
		criminal.getFlaws().add("I have a “tell” that reveals when I'm lying.");
		criminal.getFlaws().add("I turn tail and run when things look bad.");
		criminal.getFlaws().add("An innocent person is in prison for a crime that I\r\n"
				+ "committed. I’m okay with that.");
		return criminal;
	}
	
	public static RepositoryBackground Entertainer() {
		RepositoryBackground entertainer = new RepositoryBackground();
		entertainer.setName("Entertainer");
		entertainer.setFeature("By Popular Demand");
		entertainer.setEquipment("musical instrument (one of your choice),\r\n"
				+ "the favor of an admirer (love letter, lock of hair, or\r\n"
				+ "trinket), a costume, and a belt pouch containing 15 gp");
		entertainer.setPersonalityTraits(new ArrayList<>());
		entertainer.setIdeals(new ArrayList<>());
		entertainer.setBonds(new ArrayList<>());
		entertainer.setFlaws(new ArrayList<>());
		
		entertainer.getPersonalityTraits().add("I know a story relevant to almost every situation.");
		entertainer.getPersonalityTraits().add("Whenever I come to a new place, I collect local rumors\r\n"
				+ "and spread gossip.");
		entertainer.getPersonalityTraits().add("I’m a hopeless romantic, always searching for that\r\n"
				+ "“special someone.”");
		entertainer.getPersonalityTraits().add("Nobody stays angry at me or around me for long, since\r\n"
				+ "I can defuse any amount of tension.");
		entertainer.getPersonalityTraits().add("I love a good insult, even one directed at me.");
		entertainer.getPersonalityTraits().add("I get bitter if I’m not the center of attention.");
		entertainer.getPersonalityTraits().add("I’ll settle for nothing less than perfection.");
		entertainer.getPersonalityTraits().add("I change my mood or my mind as quickly as I change\r\n"
				+ "key in a song.");
		
		entertainer.getIdeals().add("When I perform, I make the world better than\r\n"
				+ "it was.");
		entertainer.getIdeals().add("The stories, legends, and songs o f the past\r\n"
				+ "must never be forgotten, for they teach us who we\r\n"
				+ "are.");
		entertainer.getIdeals().add("The world is in need of new ideas and bold\r\n"
				+ "action.");
		entertainer.getIdeals().add("I’m only in it for the money and fame.");
		entertainer.getIdeals().add("I like seeing the smiles on people’s faces when\r\n"
				+ "I perform. That’s all that matters.");
		entertainer.getIdeals().add("Art should reflect the soul; it should come\r\n"
				+ "from within and reveal who we really are.");
		
		entertainer.getBonds().add("My instrument is my most treasured possession, and it\r\n"
				+ "reminds me of someone I love.");
		entertainer.getBonds().add("Someone stole my precious instrument, and someday\r\n"
				+ "I’ll get it back.");
		entertainer.getBonds().add("I want to be famous, whatever it takes.");
		entertainer.getBonds().add("I idolize a hero of the old tales and measure my deeds\r\n"
				+ "against that person’s.");
		entertainer.getBonds().add("I will do anything to prove myself superior to my hated\r\n"
				+ "rival.");
		entertainer.getBonds().add("I would do anything for the other members of my\r\n"
				+ "old troupe.");
		
		entertainer.getFlaws().add("I’ll do anything to win fame and renown.");
		entertainer.getFlaws().add("I’ll do anything to win fame and renown.");
		entertainer.getFlaws().add("A scandal prevents me from ever going home again.\r\n"
				+ "That kind of trouble seems to follow me around.");
		entertainer.getFlaws().add("I once satirized a noble who still wants my head. It was\r\n"
				+ "a mistake that I will likely repeat.");
		entertainer.getFlaws().add("I have trouble keeping my true feelings hidden. My\r\n"
				+ "sharp tongue lands me in trouble.");
		entertainer.getFlaws().add("Despite my best efforts, I am unreliable to my friends.");
		return entertainer;
	}
	
	public static RepositoryBackground FolkHero() {
		RepositoryBackground folkHero = new RepositoryBackground();
		folkHero.setName("Folk Hero");
		folkHero.setFeature("Rustic Hospitality");
		folkHero.setEquipment("A set of artisan’s tools (one of your choice),\r\n"
				+ "a shovel, an iron pot, a set of common clothes, and a\r\n"
				+ "belt pouch containing 10 gp");
		folkHero.setPersonalityTraits(new ArrayList<>());
		folkHero.setIdeals(new ArrayList<>());
		folkHero.setBonds(new ArrayList<>());
		folkHero.setFlaws(new ArrayList<>());
		
		folkHero.getPersonalityTraits().add("I judge people by their actions, not their words.");
		folkHero.getPersonalityTraits().add("If someone is in trouble, I’m always ready to lend help.");
		folkHero.getPersonalityTraits().add("When I set my mind to something, I follow through no\r\n"
				+ "matter what gets in my way.");
		folkHero.getPersonalityTraits().add("I have a strong sense of fair play and always try to find\r\n"
				+ "the most equitable solution to arguments.");
		folkHero.getPersonalityTraits().add("I’m confident in my own abilities and do what I can to\r\n"
				+ "instill confidence in others.");
		folkHero.getPersonalityTraits().add("Thinking is for other people. I prefer action.");
		folkHero.getPersonalityTraits().add("I misuse long words in an attempt to sound smarter.");
		folkHero.getPersonalityTraits().add("I get bored easily. When am I going to get on with my\r\n"
				+ "destiny?");
		
		folkHero.getIdeals().add("People deserve to be treated with dignity and\r\n"
				+ "respect.");
		folkHero.getIdeals().add("No one should get preferential treatment\r\n"
				+ "before the law, and no one is above the law");
		folkHero.getIdeals().add("Tyrants must not be allowed to oppress the\r\n"
				+ "people.");
		folkHero.getIdeals().add("If I become strong, I can take what I want—\r\n"
				+ "what I deserve.");
		folkHero.getIdeals().add("There’s no good in pretending to be\r\n"
				+ "something I’m not.");
		folkHero.getIdeals().add("Nothing and no one can steer me away from\r\n"
				+ "my higher calling.");
		
		folkHero.getBonds().add("I have a family, but I have no idea where they are. One\r\n"
				+ "day, I hope to see them again.");
		folkHero.getBonds().add("I worked the land, I love the land, and I will protect the\r\n"
				+ "land.");
		folkHero.getBonds().add("A proud noble once gave me a horrible beating, and I\r\n"
				+ "will take my revenge on any bully I encounter.");
		folkHero.getBonds().add("My tools are symbols of my past life, and I carry them\r\n"
				+ "so that I will never forget my roots.");
		folkHero.getBonds().add("I protect those who cannot protect themselves.");
		folkHero.getBonds().add("I wish my childhood sweetheart had come with me to\r\n"
				+ "pursue my destiny.");
		
		folkHero.getFlaws().add("The tyrant who rules my land will stop at nothing to\r\n"
				+ "see me killed.");
		folkHero.getFlaws().add("I’m convinced of the significance of my destiny, and\r\n"
				+ "blind to my shortcomings and the risk of failure.");
		folkHero.getFlaws().add("The people who knew me when I was young know my\r\n"
				+ "shameful secret, so I can never go home again.");
		folkHero.getFlaws().add("I have a weakness for the vices of the city, especially\r\n"
				+ "hard drink.");
		folkHero.getFlaws().add("Secretly, I believe that things would be better if I were a\r\n"
				+ "tyrant lording over the land.");
		folkHero.getFlaws().add("I have trouble trusting in my allies.");
		return folkHero;
	}
	
	public static RepositoryBackground GuildArtisan() {
		RepositoryBackground guildArtisan = new RepositoryBackground();
		guildArtisan.setName("Guild Artisan");
		guildArtisan.setFeature("Guild Membership");
		guildArtisan.setEquipment("A set of artisan’s tools (one of your choice),\r\n"
				+ "a letter of introduction from your guild, a set of\r\n"
				+ "traveler’s clothes, and a belt pouch containing 15 gp");
		guildArtisan.setPersonalityTraits(new ArrayList<>());
		guildArtisan.setIdeals(new ArrayList<>());
		guildArtisan.setBonds(new ArrayList<>());
		guildArtisan.setFlaws(new ArrayList<>());
		
		guildArtisan.getPersonalityTraits().add("I believe that anything worth doing is worth doing\r\n"
				+ "right. I can’t help it— I’m a perfectionist.");
		guildArtisan.getPersonalityTraits().add("I’m a snob who looks down on those who can’t\r\n"
				+ "appreciate fine art.");
		guildArtisan.getPersonalityTraits().add("I always want to know how things work and what\r\n"
				+ "makes people tick.");
		guildArtisan.getPersonalityTraits().add("I’m full of witty aphorisms and have a proverb for\r\n"
				+ "every occasion.");
		guildArtisan.getPersonalityTraits().add("I’m rude to people who lack my commitment to hard\r\n"
				+ "work and fair play.");
		guildArtisan.getPersonalityTraits().add("I like to talk at length about my profession.");
		guildArtisan.getPersonalityTraits().add("I don’t part with my money easily and will haggle\r\n"
				+ "tirelessly to get the best deal possible.");
		guildArtisan.getPersonalityTraits().add("I’m well known for my work, and I want to make sure\r\n"
				+ "everyone appreciates it. I'm always taken aback when\r\n"
				+ "people haven’t heard of me.");
		
		guildArtisan.getIdeals().add("It is the duty of all civilized people to\r\n"
				+ "strengthen the bonds of community and the security\r\n"
				+ "of civilization.");
		guildArtisan.getIdeals().add("My talents were given to me so that I could\r\n"
				+ "use them to benefit the world");
		guildArtisan.getIdeals().add("Everyone should be free to pursue his or her\r\n"
				+ "own livelihood.");
		guildArtisan.getIdeals().add("I’m only in it for the money.");
		guildArtisan.getIdeals().add("I’m committed to the people I care about, not\r\n"
				+ "to ideals.");
		guildArtisan.getIdeals().add("I work hard to be the best there is at\r\n"
				+ "my craft.");
		
		guildArtisan.getBonds().add("The workshop where I learned my trade is the most\r\n"
				+ "important place in the world to me.");
		guildArtisan.getBonds().add("I created a great work for someone, and then found\r\n"
				+ "them unworthy to receive it. I’m still looking for\r\n"
				+ "someone worthy.");
		guildArtisan.getBonds().add("I owe my guild a great debt for forging me into the\r\n"
				+ "person I am today.");
		guildArtisan.getBonds().add("I pursue wealth to secure someone’s love.");
		guildArtisan.getBonds().add("One day I will return to my guild and prove that I am\r\n"
				+ "the greatest artisan of them all.");
		guildArtisan.getBonds().add("I will get revenge on the evil forces that destroyed my\r\n"
				+ "place of business and ruined my livelihood.");
		
		guildArtisan.getFlaws().add("I’ll do anything to get my hands on something rare or\r\n"
				+ "priceless.");
		guildArtisan.getFlaws().add("I’m quick to assume that someone is trying to cheat\r\n"
				+ "me.");
		guildArtisan.getFlaws().add("No one must ever learn that I once stole money from\r\n"
				+ "guild coffers.");
		guildArtisan.getFlaws().add("I’m never satisfied with what I have— I always want\r\n"
				+ "more.");
		guildArtisan.getFlaws().add("I would kill to acquire a noble title.");
		guildArtisan.getFlaws().add("I’m horribly jealous of anyone who can outshine my\r\n"
				+ "handiwork. Everywhere I go, I’m surrounded by rivals.");
		return guildArtisan;
	}
	
	public static RepositoryBackground Hermit() {
		RepositoryBackground hermit = new RepositoryBackground();
		hermit.setName("Hermit");
		hermit.setFeature("Discovery");
		hermit.setEquipment("A scroll case stuffed full of notes from your\r\n"
				+ "studies or prayers, a winter blanket, a set of common\r\n"
				+ "clothes, an herbalism kit, and 5 gp");
		hermit.setPersonalityTraits(new ArrayList<>());
		hermit.setIdeals(new ArrayList<>());
		hermit.setBonds(new ArrayList<>());
		hermit.setFlaws(new ArrayList<>());
		
		hermit.getPersonalityTraits().add("I’ve been isolated for so long that I rarely speak,\r\n"
				+ "preferring gestures and the occasional grunt.");
		hermit.getPersonalityTraits().add("I am utterly serene, even in the face of disaster.");
		hermit.getPersonalityTraits().add("The leader of my community had something wise\r\n"
				+ "to say on every topic, and I am eager to share\r\n"
				+ "that wisdom.");
		hermit.getPersonalityTraits().add("I feel tremendous empathy for all who suffer.");
		hermit.getPersonalityTraits().add("I’m oblivious to etiquette and social expectations.");
		hermit.getPersonalityTraits().add("I connect everything that happens to me to a grand,\r\n"
				+ "cosmic plan.");
		hermit.getPersonalityTraits().add("I often get lost in my own thoughts and contemplation,\r\n"
				+ "becoming oblivious to my surroundings.");
		hermit.getPersonalityTraits().add("I am working on a grand philosophical theory and love\r\n"
				+ "sharing my ideas.");
		
		hermit.getIdeals().add("My gifts are meant to be shared with all,\r\n"
				+ "not used for my own benefit");
		hermit.getIdeals().add("Emotions must not cloud our sense of what is\r\n"
				+ "right and true, or our logical thinking.");
		hermit.getIdeals().add("Inquiry and curiosity are the pillars of\r\n"
				+ "progress.");
		hermit.getIdeals().add("Solitude and contemplation are paths toward\r\n"
				+ "mystical or magical power.");
		hermit.getIdeals().add("Meddling in the affairs o f others only\r\n"
				+ "causes trouble.");
		hermit.getIdeals().add("If you know yourself, there’s nothing\r\n"
				+ "left to know.");
		
		hermit.getBonds().add("Nothing is more important than the other members of\r\n"
				+ "my hermitage, order, or association.");
		hermit.getBonds().add("I entered seclusion to hide from the ones who might\r\n"
				+ "still be hunting me. I must someday confront them.");
		hermit.getBonds().add("I’m still seeking the enlightenment I pursued in my\r\n"
				+ "seclusion, and it still eludes me.");
		hermit.getBonds().add("I entered seclusion because I loved someone I could\r\n"
				+ "not have.");
		hermit.getBonds().add("Should my discovery come to light, it could bring ruin to\r\n"
				+ "the world.");
		hermit.getBonds().add("My isolation gave me great insight into a great evil that\r\n"
				+ "only I can destroy.");
		
		hermit.getFlaws().add("Now that I've returned to the world, I enjoy its delights\r\n"
				+ "a little too much.");
		hermit.getFlaws().add("I harbor dark, bloodthirsty thoughts that my isolation\r\n"
				+ "and meditation failed to quell.");
		hermit.getFlaws().add("I am dogmatic in my thoughts and philosophy.");
		hermit.getFlaws().add("I let my need to win arguments overshadow\r\n"
				+ "friendships and harmony.");
		hermit.getFlaws().add("I’d risk too much to uncover a lost bit of knowledge.");
		hermit.getFlaws().add("I like keeping secrets and won’t share them with\r\n"
				+ "anyone.");
		return hermit;
	}
	
	public static RepositoryBackground Noble() {
		RepositoryBackground noble = new RepositoryBackground();
		noble.setName("Noble");
		noble.setFeature("Position of Privilege");
		noble.setEquipment("A set of fine clothes, a signet ring, a scroll\r\n"
				+ "of pedigree, and a purse containing 25 gp");
		noble.setPersonalityTraits(new ArrayList<>());
		noble.setIdeals(new ArrayList<>());
		noble.setBonds(new ArrayList<>());
		noble.setFlaws(new ArrayList<>());
		
		noble.getPersonalityTraits().add("My eloquent flattery makes everyone I talk to feel\r\n"
				+ "like the most wonderful and important person in the\r\n"
				+ "world.");
		noble.getPersonalityTraits().add("The common folk love me for my kindness and\r\n"
				+ "generosity.");
		noble.getPersonalityTraits().add("No one could doubt by looking at my regal bearing that\r\n"
				+ "I am a cut above the unwashed masses.");
		noble.getPersonalityTraits().add("I take great pains to always look my best and follow the\r\n"
				+ "latest fashions.");
		noble.getPersonalityTraits().add("I don’t like to get my hands dirty, and I won’t be caught\r\n"
				+ "dead in unsuitable accommodations.");
		noble.getPersonalityTraits().add("Despite my noble birth, I do not place myself above\r\n"
				+ "other folk. We all have the same blood.");
		noble.getPersonalityTraits().add("My favor, once lost, is lost forever.");
		noble.getPersonalityTraits().add("If you do me an injury, I will crush you, ruin your name,\r\n"
				+ "and salt your fields.");
		
		noble.getIdeals().add("Respect is due to me because of my position,\r\n"
				+ "but all people regardless of station deserve to be\r\n"
				+ "treated with dignity.");
		noble.getIdeals().add("It is my duty to respect the authority of\r\n"
				+ "those above me, just as those below me must respect\r\n"
				+ "mine.");
		noble.getIdeals().add("I must prove that I can handle myself\r\n"
				+ "without the coddling of my family.");
		noble.getIdeals().add("If I can attain more power, no one will tell me\r\n"
				+ "what to do.");
		noble.getIdeals().add("Blood runs thicker than water.");
		noble.getIdeals().add("It is my duty to protect and care for\r\n"
				+ "the people beneath me.");
		
		noble.getBonds().add("I will face any challenge to win the approval of my\r\n"
				+ "family.");
		noble.getBonds().add("My house’s alliance with another noble family\r\n"
				+ "must be sustained at all costs.");
		noble.getBonds().add("Nothing is more important than the other members\r\n"
				+ "o f my family.");
		noble.getBonds().add("I am in love with the heir of a family that my family\r\n"
				+ "despises.");
		noble.getBonds().add("My loyalty to my sovereign is unwavering.");
		noble.getBonds().add("The common folk must see me as a hero o f the people.");
		
		noble.getFlaws().add("I secretly believe that everyone is beneath me.");
		noble.getFlaws().add("I hide a truly scandalous secret that could ruin my\r\n"
				+ "family forever.");
		noble.getFlaws().add("I too often hear veiled insults and threats in every word\r\n"
				+ "addressed to me, and I’m quick to anger.");
		noble.getFlaws().add("I have an insatiable desire for carnal pleasures.");
		noble.getFlaws().add("In fact, the world does revolve around me.");
		noble.getFlaws().add("By my words and actions, I often bring shame to\r\n"
				+ "my family.");
		return noble;
	}
	
	public static RepositoryBackground Outlander() {
		RepositoryBackground outlander = new RepositoryBackground();
		outlander.setName("Outlander");
		outlander.setFeature("Wanderer");
		outlander.setEquipment("A staff, a hunting trap, a trophy from an\r\n"
				+ "animal you killed, a set of traveler’s clothes, and a belt\r\n"
				+ "pouch containing 10 gp");
		outlander.setPersonalityTraits(new ArrayList<>());
		outlander.setIdeals(new ArrayList<>());
		outlander.setBonds(new ArrayList<>());
		outlander.setFlaws(new ArrayList<>());
		
		outlander.getPersonalityTraits().add("I’m driven by a wanderlust that led me away\r\n"
				+ "from home.");
		outlander.getPersonalityTraits().add("I watch over my friends as if they were a litter of\r\n"
				+ "newborn pups.");
		outlander.getPersonalityTraits().add("I once ran twenty-five miles without stopping to warn\r\n"
				+ "to my clan of an approaching orc horde. I’d do it again\r\n"
				+ "if I had to.");
		outlander.getPersonalityTraits().add("I have a lesson for every situation, drawn from\r\n"
				+ "observing nature.");
		outlander.getPersonalityTraits().add("I place no stock in wealthy or well-mannered folk.\r\n"
				+ "Money and manners won’t save you from a hungry\r\n"
				+ "owlbear.");
		outlander.getPersonalityTraits().add("I’m always picking things up, absently fiddling with\r\n"
				+ "them, and sometimes accidentally breaking them.");
		outlander.getPersonalityTraits().add("I feel far more comfortable around animals than\r\n"
				+ "people.");
		outlander.getPersonalityTraits().add("I was, in fact, raised by wolves.");
		
		outlander.getIdeals().add("Life is like the seasons, in constant change,\r\n"
				+ "and we must change with it.");
		outlander.getIdeals().add("It is each person’s responsibility to\r\n"
				+ "make the most happiness for the whole tribe.");
		outlander.getIdeals().add("If I dishonor myself, I dishonor my whole\r\n"
				+ "clan.");
		outlander.getIdeals().add("The strongest are meant to rule.");
		outlander.getIdeals().add("The natural world is more important than all\r\n"
				+ "the constructs of civilization.");
		outlander.getIdeals().add("I must earn glory in battle, for myself and\r\n"
				+ "my clan.");
		
		outlander.getBonds().add("My family, clan, or tribe is the most important thing in\r\n"
				+ "my life, even when they are far from me.");
		outlander.getBonds().add("An injury to the unspoiled wilderness of my home is an\r\n"
				+ "injury to me.");
		outlander.getBonds().add("I will bring terrible wrath down on the evildoers who\r\n"
				+ "destroyed my homeland.");
		outlander.getBonds().add("I am the last of my tribe, and it is up to me to ensure\r\n"
				+ "their names enter legend.");
		outlander.getBonds().add("I suffer awful visions of a coming disaster and will do\r\n"
				+ "anything to prevent it.");
		outlander.getBonds().add("It is my duty to provide children to sustain my tribe.");
		
		outlander.getFlaws().add("I am too enamored of ale, wine, and other intoxicants.");
		outlander.getFlaws().add("There’s no room for caution in a life lived to the fullest.");
		outlander.getFlaws().add("I remember every insult I’ve received and nurse a silent\r\n"
				+ "resentment toward anyone who’s ever wronged me.");
		outlander.getFlaws().add("I am slow to trust members of other races, tribes, and\r\n"
				+ "societies.");
		outlander.getFlaws().add("Violence is my answer to almost any challenge.");
		outlander.getFlaws().add("Don’t expect me to save those who can’t save\r\n"
				+ "themselves. It is nature’s way that the strong thrive\r\n"
				+ "and the weak perish.");
		return outlander;
	}
	
	public static RepositoryBackground Sage() {
		RepositoryBackground sage = new RepositoryBackground();
		sage.setName("Sage");
		sage.setFeature("Researcher");
		sage.setEquipment("A bottle of black ink, a quill, a small knife,\r\n"
				+ "a letter from a dead colleague posing a question you\r\n"
				+ "have not yet been able to answer, a set of common\r\n"
				+ "clothes, and a belt pouch containing 10 gp");
		sage.setPersonalityTraits(new ArrayList<>());
		sage.setIdeals(new ArrayList<>());
		sage.setBonds(new ArrayList<>());
		sage.setFlaws(new ArrayList<>());
		
		sage.getPersonalityTraits().add("I use polysyllabic words that convey the impression of\r\n"
				+ "great erudition.");
		sage.getPersonalityTraits().add("I've read every book in the world’s greatest libraries—\r\n"
				+ "or I like to boast that I have.");
		sage.getPersonalityTraits().add("I'm used to helping out those who aren’t as smart as I\r\n"
				+ "am, and I patiently explain anything and everything to\r\n"
				+ "others.");
		sage.getPersonalityTraits().add("There’s nothing I like more than a good mystery.");
		sage.getPersonalityTraits().add("I’m willing to listen to every side of an argument before\r\n"
				+ "I make my own judgment.");
		sage.getPersonalityTraits().add("I . . . speak . . . slowly . . . when talking . . . to idiots, . . .\r\n"
				+ "which . . . almost . . . everyone . . . is . . . compared . . .\r\n"
				+ "to me.");
		sage.getPersonalityTraits().add("I am horribly, horribly awkward in social situations.");
		sage.getPersonalityTraits().add("I’m convinced that people are always trying to steal my\r\n"
				+ "secrets.");
		
		sage.getIdeals().add("The path to power and self-improvement\r\n"
				+ "is through knowledge.");
		sage.getIdeals().add("What is beautiful points us beyond itself\r\n"
				+ "toward what is true.");
		sage.getIdeals().add("Emotions must not cloud our logical thinking.");
		sage.getIdeals().add("Nothing should fetter the infinite possibility\r\n"
				+ "inherent in all existence.");
		sage.getIdeals().add("Knowledge is the path to power and\r\n"
				+ "domination.");
		sage.getIdeals().add("The goal of a life of study is the\r\n"
				+ "betterment of oneself.");
		
		sage.getBonds().add("It is my duty to protect my students.");
		sage.getBonds().add("I have an ancient text that holds terrible secrets that\r\n"
				+ "must not fall into the wrong hands.");
		sage.getBonds().add("I work to preserve a library, university, scriptorium,\r\n"
				+ "or monastery.");
		sage.getBonds().add("My life’s work is a series o f tomes related to a specific\r\n"
				+ "field of lore.");
		sage.getBonds().add("I've been searching my whole life for the answer to a\r\n"
				+ "certain question.");
		sage.getBonds().add("I sold my soul for knowledge. I hope to do great deeds\r\n"
				+ "and win it back.");
		
		sage.getFlaws().add("I am easily distracted by the promise of information.");
		sage.getFlaws().add("Most people scream and run when they see a demon. I\r\n"
				+ "stop and take notes on its anatomy.");
		sage.getFlaws().add("Unlocking an ancient mystery is worth the price of a\r\n"
				+ "civilization.");
		sage.getFlaws().add("I overlook obvious solutions in favor of complicated\r\n"
				+ "ones.");
		sage.getFlaws().add("I speak without really thinking through my words,\r\n"
				+ "invariably insulting others.");
		sage.getFlaws().add("I can’t keep a secret to save my life, or anyone else’s.");
		return sage;
	}
	
	public static RepositoryBackground Sailor() {
		RepositoryBackground sailor = new RepositoryBackground();
		sailor.setName("Sailor");
		sailor.setFeature("Ship's Passage");
		sailor.setEquipment("A belaying pin (club), 50 feet of silk rope,\r\n"
				+ "a lucky charm such as a rabbit foot or a small stone\r\n"
				+ "with a hole in the center (or you may roll for a random\r\n"
				+ "trinket on the Trinkets table in chapter 5), a set of\r\n"
				+ "common clothes, and a belt pouch containing 10 gp");
		sailor.setPersonalityTraits(new ArrayList<>());
		sailor.setIdeals(new ArrayList<>());
		sailor.setBonds(new ArrayList<>());
		sailor.setFlaws(new ArrayList<>());
		
		sailor.getPersonalityTraits().add("My friends know they can rely on me, no matter what.");
		sailor.getPersonalityTraits().add("I work hard so that I can play hard when the work\r\n"
				+ "is done.");
		sailor.getPersonalityTraits().add("I enjoy sailing into new ports and making new friends\r\n"
				+ "over a flagon of ale.");
		sailor.getPersonalityTraits().add("I stretch the truth for the sake of a good story.");
		sailor.getPersonalityTraits().add("To me, a tavern brawl is a nice way to get to know a\r\n"
				+ "new city.");
		sailor.getPersonalityTraits().add("I never pass up a friendly wager.");
		sailor.getPersonalityTraits().add("My language is as foul as an otyugh nest.");
		sailor.getPersonalityTraits().add("I like a job well done, especially if I can convince\r\n"
				+ "someone else to do it.");
		
		sailor.getIdeals().add("The thing that keeps a ship together is mutual\r\n"
				+ "respect between captain and crew.");
		sailor.getIdeals().add("We all do the work, so we all share in the\r\n"
				+ "rewards.");
		sailor.getIdeals().add("The sea is freedom—the freedom to go\r\n"
				+ "anywhere and do anything.");
		sailor.getIdeals().add("I’m a predator, and the other ships on the sea\r\n"
				+ "are my prey.");
		sailor.getIdeals().add("I’m committed to my crewmates, not to ideals.");
		sailor.getIdeals().add("Someday I’ll own my own ship and chart\r\n"
				+ "my own destiny.");
		
		sailor.getBonds().add("I’m loyal to my captain first, everything else second.");
		sailor.getBonds().add("The ship is most important—crewmates and captains\r\n"
				+ "come and go.");
		sailor.getBonds().add("I’ll always remember my first ship");
		sailor.getBonds().add("In a harbor town, I have a paramour whose eyes nearly\r\n"
				+ "stole me from the sea.");
		sailor.getBonds().add("I was cheated out of my fair share of the profits, and I\r\n"
				+ "want to get my due.");
		sailor.getBonds().add("Ruthless pirates murdered my captain and crewmates,\r\n"
				+ "plundered our ship, and left me to die. Vengeance will\r\n"
				+ "be mine.");
		
		sailor.getFlaws().add("I follow orders, even if I think they’re wrong.");
		sailor.getFlaws().add("I’ll say anything to avoid having to do extra work.");
		sailor.getFlaws().add("Once someone questions my courage, I never back\r\n"
				+ "down no matter how dangerous the situation.");
		sailor.getFlaws().add("Once I start drinking, it’s hard for me to stop.");
		sailor.getFlaws().add("I can’t help but pocket loose coins and other trinkets I\r\n"
				+ "come across.");
		sailor.getFlaws().add("My pride will probably lead to my destruction.");
		return sailor;
	}
	
	public static RepositoryBackground Soldier() {
		RepositoryBackground soldier = new RepositoryBackground();
		soldier.setName("Soldier");
		soldier.setFeature("Military Rank");
		soldier.setEquipment("An insignia of rank, a trophy taken from\r\n"
				+ "a fallen enemy (a dagger, broken blade, or piece of a\r\n"
				+ "banner), a set of bone dice or deck of cards, a set of\r\n"
				+ "common clothes, and a belt pouch containing 10 gp");
		soldier.setPersonalityTraits(new ArrayList<>());
		soldier.setIdeals(new ArrayList<>());
		soldier.setBonds(new ArrayList<>());
		soldier.setFlaws(new ArrayList<>());
		
		soldier.getPersonalityTraits().add("I'm always polite and respectful.");
		soldier.getPersonalityTraits().add("I’m haunted by memories of war. I can’t get the images\r\n"
				+ "of violence out of my mind.");
		soldier.getPersonalityTraits().add("I’ve lost too many friends, and I’m slow to make new\r\n"
				+ "ones.");
		soldier.getPersonalityTraits().add("I’m full of inspiring and cautionary tales from my\r\n"
				+ "military experience relevant to almost every combat\r\n"
				+ "situation.");
		soldier.getPersonalityTraits().add("I can stare down a hell hound without flinching.");
		soldier.getPersonalityTraits().add("I enjoy being strong and like breaking things.");
		soldier.getPersonalityTraits().add("I have a crude sense of humor.");
		soldier.getPersonalityTraits().add("I face problems head-on. A simple, direct solution is\r\n"
				+ "the best path to success.");
		
		soldier.getIdeals().add("Our lot is to lay down our lives in\r\n"
				+ "defense of others.");
		soldier.getIdeals().add("I do what I must and obey just\r\n"
				+ "authority.");
		soldier.getIdeals().add("When people follow orders blindly, they\r\n"
				+ "embrace a kind of tyranny.");
		soldier.getIdeals().add("In life as in war, the stronger force wins.");
		soldier.getIdeals().add("Ideals aren’t worth killing over or\r\n"
				+ "going to war for.");
		soldier.getIdeals().add("My city, nation, or people are all that matter.");
		
		soldier.getBonds().add("I would still lay down my life for the people I\r\n"
				+ "served with.");
		soldier.getBonds().add("Someone saved my life on the battlefield. To this day, I\r\n"
				+ "will never leave a friend behind.");
		soldier.getBonds().add("My honor is my life.");
		soldier.getBonds().add("I’ll never forget the crushing defeat my company\r\n"
				+ "suffered or the enemies who dealt it.");
		soldier.getBonds().add("Those who fight beside me are those worth dying for.");
		soldier.getBonds().add("I fight for those who cannot fight for themselves.");
		
		soldier.getFlaws().add("The monstrous enemy we faced in battle still leaves\r\n"
				+ "me quivering with fear.");
		soldier.getFlaws().add("I have little respect for anyone who is not a\r\n"
				+ "proven warrior.");
		soldier.getFlaws().add("I made a terrible mistake in battle cost many lives—\r\n"
				+ "and I would do anything to keep that mistake secret.");
		soldier.getFlaws().add("My hatred of my enemies is blind and unreasoning.");
		soldier.getFlaws().add("I obey the law, even if the law causes misery.");
		soldier.getFlaws().add("I’d rather eat my armor than admit when I’m wrong.");
		return soldier;
	}
	
	public static RepositoryBackground Urchin() {
		RepositoryBackground urchin = new RepositoryBackground();
		urchin.setName("Urchin");
		urchin.setFeature("City Secrets");
		urchin.setEquipment("A small knife, a map of the city you\r\n"
				+ "grew up in, a pet mouse, a token to remember your\r\n"
				+ "parents by, a set of common clothes, and a belt pouch\r\n"
				+ "containing 10 gp");
		urchin.setPersonalityTraits(new ArrayList<>());
		urchin.setIdeals(new ArrayList<>());
		urchin.setBonds(new ArrayList<>());
		urchin.setFlaws(new ArrayList<>());
		
		urchin.getPersonalityTraits().add("I hide scraps of food and trinkets away in my pockets.");
		urchin.getPersonalityTraits().add("I ask a lot of questions.");
		urchin.getPersonalityTraits().add("I like to squeeze into small places where no one else\r\n"
				+ "can get to me.");
		urchin.getPersonalityTraits().add("I sleep with my back to a wall or tree, with everything I\r\n"
				+ "own wrapped in a bundle in my arms.");
		urchin.getPersonalityTraits().add("I eat like a pig and have bad manners.");
		urchin.getPersonalityTraits().add("I think anyone who’s nice to me is hiding evil intent.");
		urchin.getPersonalityTraits().add("I don’t like to bathe.");
		urchin.getPersonalityTraits().add("I bluntly say what other people are hinting at or hiding.");
		
		urchin.getIdeals().add("All people, rich or poor, deserve respect.");
		urchin.getIdeals().add("We have to take care of each other,\r\n"
				+ "because no one else is going to do it.");
		urchin.getIdeals().add("The low are lifted up, and the high and mighty\r\n"
				+ "are brought down. Change is the nature o f things.");
		urchin.getIdeals().add("The rich need to be shown what life and\r\n"
				+ "death are like in the gutters.");
		urchin.getIdeals().add("I help the people who help me—that’s what\r\n"
				+ "keeps us alive.");
		urchin.getIdeals().add("I'm going to prove that I'm worthy of a\r\n"
				+ "better life.");
		
		urchin.getBonds().add("My town or city is my home, and I’ll fight to defend it.");
		urchin.getBonds().add("I sponsor an orphanage to keep others from enduring\r\n"
				+ "what I was forced to endure.");
		urchin.getBonds().add("I owe my survival to another urchin who taught me to\r\n"
				+ "live on the streets.");
		urchin.getBonds().add("I owe a debt I can never repay to the person who took\r\n"
				+ "pity on me.");
		urchin.getBonds().add("I escaped my life of poverty by robbing an important\r\n"
				+ "person, and I’m wanted for it.");
		urchin.getBonds().add("No one else should have to endure the hardships I’ve\r\n"
				+ "been through.");
		
		urchin.getFlaws().add("If I'm outnumbered, I will run away from a fight.");
		urchin.getFlaws().add("Gold seems like a lot of money to me, and I’ll do just\r\n"
				+ "about anything for more of it.");
		urchin.getFlaws().add("I will never fully trust anyone other than myself.");
		urchin.getFlaws().add("I’d rather kill someone in their sleep then fight fair.");
		urchin.getFlaws().add("It’s not stealing if I need it more than someone else.");
		urchin.getFlaws().add("People who can't take care of themselves get what they\r\n"
				+ "deserve.");
		return urchin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public ArrayList<String> getPersonalityTraits() {
		return personalityTraits;
	}

	public void setPersonalityTraits(ArrayList<String> personalityTraits) {
		this.personalityTraits = personalityTraits;
	}

	public ArrayList<String> getIdeals() {
		return ideals;
	}

	public void setIdeals(ArrayList<String> ideals) {
		this.ideals = ideals;
	}

	public ArrayList<String> getBonds() {
		return bonds;
	}

	public void setBonds(ArrayList<String> bonds) {
		this.bonds = bonds;
	}

	public ArrayList<String> getFlaws() {
		return flaws;
	}

	public void setFlaws(ArrayList<String> flaws) {
		this.flaws = flaws;
	}
}
