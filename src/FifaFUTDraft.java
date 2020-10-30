import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import processing.core.PApplet;
import processing.core.PImage;

public class FifaFUTDraft extends PApplet {
	Scanner keyboard = new Scanner(System.in);
	Random randomGenerator = new Random();
	PImage background;

	String name;
	String sls = "", srs = "";
	String slm = "", slcm = "", srcm = "", srm = "";
	String slb = "", slcb = "", srcb = "", srb = "", sgk = "";
	
	int leftStriker, rightStriker;
	int leftMid, leftCenterMid, rightCenterMid, rightMid;
	int leftBack, leftCenterBack, rightCenterBack, rightBack, goalKeeper;
	int lsNum, rsNum, lmNum, lcmNum, rcmNum, rmNum, lbNum, lcbNum, rcbNum, rbNum, gkNum;
	int offense, midfield, defense, chemistry;
	int teamTotal;

	String[] lsArray1 = { "Ronaldo(93)", "Neymar(90)", "Sanchez(86)", "Maria(86)", "Insigne(82)" };
	String[] lsArray2 = { "Reus(86)", "Cavani(85)", "Sanchez(86)", "Boufal(78)", "Payet(82)" };
	String[] lsArray3 = { "Mata(84)", "Hazard(89)", "Lewandowski(88)", "Nolito(82)", "Payet(82)" };
	String[] lsArray4 = { "Shaarawy(82)", "Insigne(90)", "Sansone(75)", "Reus(86)", "Neymar(90)" };
	String[] lsArray5 = { "Neymar(90)", "Mertens(82)", "Brahimi(82)", "Ibrahimovic(89)", "Suarez(90)" };

	String[] rsArray1 = { "Totti(80)", "Aduriz(82)", "Higuain(86)", "Suarez(90)", "Robben(90)" };
	String[] rsArray2 = { "Higuain(86)", "Aguero(88)", "Robben(90)", "Griezmann(84)", "Bruyne(86)" };
	String[] rsArray3 = { "Mahrez(76)", "Bale(87)", "Hulk(84)", "Maria(86)", "Podolski(78)" };
	String[] rsArray4 = { "Bale(87)", "Torres(81)", "Mkhitaryan(83)", "Muller(86)", "Icardi(79)" };
	String[] rsArray5 = { "Maria(86)", "Eto'o(80)", "Messi(94)", "De Bruyne(86)", "Hulk(84)" };

	String[] lmArray1 = { "Hazard(89)", "Payet(82)", "Mirallas(80)", "Nani(82)", "Turan(83)" };
	String[] lmArray2 = { "Reus(86)", "Vidal(86)", "Iniesta(88)", "Sneijder(84)", "Arnautovic(79)" };
	String[] lmArray3 = { "Gaitan(83)", "Payet(82)", "Nani(82)", "Robben(90)", "Fabregas(87)" };
	String[] lmArray4 = { "Sneijder(84)", "Schweinsteger(84)", "Toure(85)", "Turan(83)", "Vidal(86)" };
	String[] lmArray5 = { "Nasri(83)", "Toure(85)", "Robben(90)", "Rodriguez(86)", "Iniesta(88)" };

	String[] lcmArray1 = { "Ozil(86)", "Busquets(85)", "Modric(87)", "Oscar(84)", "Fabregas(85)" };
	String[] lcmArray2 = { "Schweinsteiger(84)", "Pjanic(83)", "Modric(87)", "Iniesta(89)", "Matuidi(83)" };
	String[] lcmArray3 = { "Alonso(85)", "Lahm(87)", "Isco(84)", "Bruyne(83)", "Pjanic(83)" };
	String[] lcmArray4 = { "Maria(86)", "Rakitic(83)", "Gerrard(82)", "Alonso(85)", "Kroos(85)" };
	String[] lcmArray5 = { "Kaka(81)", "Modric(87)", "Ozil(86)", "Di Maria(86)", "Vidal(86)" };

	String[] rcmArray1 = { "Rodriguez(86)", "Eriksen(84)", "Oscar(84)", "Iniesta(89)", "Mascherano(83)" };
	String[] rcmArray2 = { "Motta(82)", "Silva(78)", "Kroos(85)", "Gundogan(83)", "Diarra(79)" };
	String[] rcmArray3 = { "Bender(81)", "Matic(83)", "Ozil(86)", "Iniesta(89)", "Busquets(85)" };
	String[] rcmArray4 = { "Diarra(79)", "Hamsik(83)", "Lahm(87)", "Gotze(86)", "Khedira(84)" };
	String[] rcmArray5 = { "Kaka(81)", "Gotze(86)", "Rodriguez(86)", "Schweinsteiger(84)", "Isco(84)" };

	String[] rmArray1 = { "Nani(81)", "Adin(79)", "Bale(87)", "Willian(82)", "Garcia(79)" };
	String[] rmArray2 = { "Garcia(79)", "Hernani(67)", "Robben(90)", "Muller(86)", "Blaszczykowski(82)" };
	String[] rmArray3 = { "Bellarabi(78)", "Aubameyang(79)", "Markovic(78)", "Cuadrado(83)", "Ebert(78)" };
	String[] rmArray4 = { "Shaqiri(80)", "Farfan(83)", "Tore(78)", "Cuadrado(83)", "Valencia(80)" };
	String[] rmArray5 = { "Farfan(83)", "Ebert(78)", "Volland(79)", "Salvio(79)", "Muller(86)" };

	String[] lbArray1 = { "Marcelo(82)", "Coentrao(79)", "Moreno(78)", "Jansen(77)", "Schmelzer(78)" };
	String[] lbArray2 = { "Alba(81)", "Willems(75)", "Gibbs(78)", "Marcelo(82)", "Kolarov(78)" };
	String[] lbArray3 = { "Evra(80)", "Oczipka(75)", "Baines(82)", "Cole(81)", "Wendt(75)" };
	String[] lbArray4 = { "Jefferson(75)", "Clichy(80)", "Insua(77)", "Alaba(82)", "Bernat(76)" };
	String[] lbArray5 = { "Erkin(77)", "Monreal(76)", "Luis(82)", "Rodriguez(80)", "Cole(81)" };

	String[] lcbArray1 = { "Ramos(87)", "Pique(84)", "Nkoulou(80)", "Dante(82)", "Sakho(81)" };
	String[] lcbArray2 = { "Benatia(84)", "Mangala(80)", "Barzagli(83)", "Skrtel(81)", "Boateng(87)" };
	String[] lcbArray3 = { "Pareja(78)", "Alex(82)", "Luisao(81)", "Ferdinand(79)", "Ramos(87)" };
	String[] lcbArray4 = { "Vermaelen(79)", "Rolando(78)", "Martinez(85)", "Godin(84)", "Navarro(77)" };
	String[] lcbArray5 = { "San Jose(78)", "Cahill(81)", "Alex(82)", "Ramos(87)", "Abdennour(80)" };

	String[] rcbArray1 = { "Matip(77)", "Demichelis(79)", "Miranda(83)", "Subotic(82)", "Hummels(86)" };
	String[] rcbArray2 = { "Gurpegi(77)", "Silva(87)", "Boateng(87)", "Luiz(82)", "Garay(83)" };
	String[] rcbArray3 = { "Kompany(86)", "Chiellini(84)", "Pepe(83)", "Otamendi(83)", "Hummels(86)" };
	String[] rcbArray4 = { "Manga(76)", "Smalling(76)", "Ramos(87)", "Kompany(86)", "Naldo(81)" };
	String[] rcbArray5 = { "Barta(76)", "Britos(76)", "Luisao(81)", "Lovren(80)", "Silva(87)" };

	String[] rbArray1 = { "Zabaleta(83)", "Sagna(80)", "Carvajal(80)", "Aurier(77)", "Danilo(77)" };
	String[] rbArray2 = { "Alves(83)", "Carvajal(80)", "Marcos(78)", "Piszczek(82)", "Wiel(77)" };
	String[] rbArray3 = { "Anyukov(77)", "Valera(76)", "Martinez(77)", "Jung(77)", "Rafinha(77)" };
	String[] rbArray4 = { "Debuchy(80)", "Piszczek(82)", "Ivanovic(81)", "Srna(79)", "Juanfran(79)" };
	String[] rbArray5 = { "Coleman(80)", "Rafael(77)", "Pereira(77)", "Zabaleta(83)", "Carvajal(80)" };

	String[] gkArray1 = { "Courtois(86)", "Sirigu(84)", "Buffon(82)", "Sanctis(79)", "Hart(83)" };
	String[] gkArray2 = { "Reina(81)", "Neuer(90)", "Mandanda(82)", "Handanovic(83)", "Gea(85)" };
	String[] gkArray3 = { "Asenjo(79)", "Alves(81)", "Neuer(90)", "Leno(82)", "Lloris(85)" };
	String[] gkArray4 = { "Marchetti(79)", "Cesar(82)", "Carrasso(81)", "Reina(81)", "Caballero(79)" };
	String[] gkArray5 = { "Bengalio(80)", "Weidenfeller(83)", "De Sanctis(79)", "Casillas(84)", "Cech(85)" };

	boolean options = false;

	public void instructions() 
	{
		System.out.println("Welcome to Fake Fifa Fut Draft, with your host, Hari Kumaresan.");
		System.out.println("What is your name?");
		name = keyboard.nextLine();
		System.out.println("Hello " + name + ", get ready to pick some of the best soccer players ever to live.");
		System.out.println("Here are the instructions:");
		System.out.println("You will be working with the famous 4-4-2(2) formation. You will have");
		System.out.println("to pick a player for each position, the players will be randomly selected.");
		System.out.println("Be sure to wisely choose, as your overall team will be rated based on");
		System.out.println("the best overall rated player on offense, midfield, and defense. The");
		System.out.println("players overall rating is within the parentheses. Try your best, and");
		System.out.println("good luck!");
	}

	public void positions() 
	{
		System.out.println("\nTo your left there is a picture of the formation that you");
		System.out.println("will be using. You will have to choose, 2 strikers, 4 midfielders,");
		System.out.println("4 defenders, and a goalkeeper.");
	}

	public void ls() 
	{
		int leftStriker = randomGenerator.nextInt(5) + 1;
		System.out.println("\nPlease choose a left striker\n");
		if (leftStriker == 1) 
		{
			System.out.println(Arrays.toString(lsArray1));
		}
		else if (leftStriker == 2) 
		{
			System.out.println(Arrays.toString(lsArray2));
		} 
		else if (leftStriker == 3) 
		{
			System.out.println(Arrays.toString(lsArray3));
		} 
		else if (leftStriker == 4) 
		{
			System.out.println(Arrays.toString(lsArray4));
		} 
		else {
			System.out.println(Arrays.toString(lsArray5));
		}

		boolean spelled = false;

		while (!spelled) 
		{
			sls = keyboard.nextLine();

			sls = sls.toLowerCase();
			sls = sls.toUpperCase().charAt(0) + sls.substring(1);
			for (int i = 0; i < 5; i++) 
			{
				if (lsArray1[i].contains(sls)) 
				{
					sls = lsArray1[i];
					spelled = true;
				} 
				else if (lsArray2[i].contains(sls)) 
				{
					sls = lsArray2[i];
					spelled = true;
				} 
				else if (lsArray3[i].contains(sls))
				{
					sls = lsArray3[i];
					spelled = true;
				} 
				else if (lsArray4[i].contains(sls)) 
				{
					sls = lsArray4[i];
					spelled = true;
				} 
				else if (lsArray5[i].contains(sls)) 
				{
					sls = lsArray5[i];
					spelled = true;
				}
			}

			if (!spelled) 
			{
				System.out.println("Not an option. Please try again.");
				sls = "";
			}
			
		}
	}

	public void rs() 
	{
		int rightStriker = randomGenerator.nextInt(5) + 1;
		System.out.println("\nPlease choose a right striker\n");
		if (rightStriker == 1) 
		{
			System.out.println(Arrays.toString(rsArray1));
		} 
		else if (rightStriker == 2) 
		{
			System.out.println(Arrays.toString(rsArray2));
		} 
		else if (rightStriker == 3) 
		{
			System.out.println(Arrays.toString(rsArray3));
		} 
		else if (rightStriker == 4) 
		{
			System.out.println(Arrays.toString(rsArray4));
		} 
		else 
		{
			System.out.println(Arrays.toString(rsArray5));
		}

		boolean spelled = false;

		while (!spelled) 
		{
			srs = keyboard.nextLine();

			srs = srs.toLowerCase();
			srs = srs.toUpperCase().charAt(0) + srs.substring(1);
			for (int i = 0; i < 5; i++) 
			{
				if (rsArray1[i].contains(srs)) 
				{
					srs = rsArray1[i];
					spelled = true;
				} 
				else if (rsArray2[i].contains(srs)) 
				{
					srs = rsArray2[i];
					spelled = true;
				} 
				else if (rsArray3[i].contains(srs)) 
				{
					srs = rsArray3[i];
					spelled = true;
				} 
				else if (rsArray4[i].contains(srs)) 
				{
					srs = rsArray4[i];
					spelled = true;
				} 
				else if (rsArray5[i].contains(srs))
				{
					srs = rsArray5[i];
					spelled = true;
				}
			}

			if (!spelled)
			{
				System.out.println("Not an option. Please try again.");
				srs = "";
			}
		}
	}

	public void lm() 
	{
		int leftMid = randomGenerator.nextInt(5) + 1;
		System.out.println("\nPlease choose a left midfielder\n");
		if (leftMid == 1) 
		{
			System.out.println(Arrays.toString(lmArray1));
		} 
		else if (leftMid == 2) 
		{
			System.out.println(Arrays.toString(lmArray2));
		} 
		else if (leftMid == 3) 
		{
			System.out.println(Arrays.toString(lmArray3));
		} 
		else if (leftMid == 4) 
		{
			System.out.println(Arrays.toString(lmArray4));
		} 
		else 
		{
			System.out.println(Arrays.toString(lmArray5));
		}

		boolean spelled = false;

		while (!spelled) 
		{
			slm = keyboard.nextLine();

			slm = slm.toLowerCase();
			slm = slm.toUpperCase().charAt(0) + slm.substring(1);

			for (int i = 0; i < 5; i++) 
			{
				if (lmArray1[i].contains(slm)) 
				{
					slm = lmArray1[i];
					spelled = true;
				} 
				else if (lmArray2[i].contains(slm))
				{
					slm = lmArray2[i];
					spelled = true;
				} 
				else if (lmArray3[i].contains(slm))
				{
					slm = lmArray3[i];
					spelled = true;
				} 
				else if (lmArray4[i].contains(slm)) 
				{
					slm = lmArray4[i];
					spelled = true;
				} 
				else if (lmArray5[i].contains(slm)) 
				{
					slm = lmArray5[i];
					spelled = true;
				}
			}

			if (!spelled)
			{
				System.out.println("Not an option. Please try again.");
				slm = "";
			}
		}
	}

	public void lcm() 
	{
		int leftCenterMid = randomGenerator.nextInt(5) + 1;
		System.out.println("\nPlease choose a left center midfielder\n");
		if (leftCenterMid == 1) 
		{
			System.out.println(Arrays.toString(lcmArray1));
		} 
		else if (leftCenterMid == 2) 
		{
			System.out.println(Arrays.toString(lcmArray2));
		} 
		else if (leftCenterMid == 3) 
		{
			System.out.println(Arrays.toString(lcmArray3));
		} 
		else if (leftCenterMid == 4) 
		{
			System.out.println(Arrays.toString(lcmArray4));
		} 
		else
		{
			System.out.println(Arrays.toString(lcmArray5));
		}

		boolean spelled = false;

		while (!spelled)
		{
			slcm = keyboard.nextLine();

			slcm = slcm.toLowerCase();
			slcm = slcm.toUpperCase().charAt(0) + slcm.substring(1);

			for (int i = 0; i < 5; i++) 
			{
				if (lcmArray1[i].contains(slcm)) 
				{
					slcm = lcmArray1[i];
					spelled = true;
				} 
				else if (lcmArray2[i].contains(slcm)) 
				{
					slcm = lcmArray2[i];
					spelled = true;
				} 
				else if (lcmArray3[i].contains(slcm))
				{
					slcm = lcmArray3[i];
					spelled = true;
				} 
				else if (lcmArray4[i].contains(slcm))
				{
					slcm = lcmArray4[i];
					spelled = true;
				}
				else if (lcmArray5[i].contains(slcm)) 
				{
					slcm = lcmArray5[i];
					spelled = true;
				}
			}
			if (!spelled)
			{
				System.out.println("Not an option. Please try again.");
				slcm = "";
			}
		}
	}

	public void rcm() 
	{
		int rightCenterMid = randomGenerator.nextInt(5) + 1;
		System.out.println("\nPlease choose a right center midfielder\n");
		if (rightCenterMid == 1) 
		{
			System.out.println(Arrays.toString(rcmArray1));
		} 
		else if (rightCenterMid == 2) 
		{
			System.out.println(Arrays.toString(rcmArray2));
		}
		else if (rightCenterMid == 3) 
		{
			System.out.println(Arrays.toString(rcmArray3));
		}
		else if (rightCenterMid == 4) 
		{
			System.out.println(Arrays.toString(rcmArray4));
		} 
		else 
		{
			System.out.println(Arrays.toString(rcmArray5));
		}

		boolean spelled = false;

		while (!spelled) 
		{
			srcm = keyboard.nextLine();

			srcm = srcm.toLowerCase();
			srcm = srcm.toUpperCase().charAt(0) + srcm.substring(1);

			for (int i = 0; i < 5; i++) 
			{
				if (rcmArray1[i].contains(srcm)) 
				{
					srcm = rcmArray1[i];
					spelled = true;
				} 
				else if (rcmArray2[i].contains(srcm)) 
				{
					srcm = rcmArray2[i];
					spelled = true;
				} 
				else if (rcmArray3[i].contains(srcm)) 
				{
					srcm = rcmArray3[i];
					spelled = true;
				} 
				else if (rcmArray4[i].contains(srcm))
				{
					srcm = rcmArray4[i];
					spelled = true;
				} 
				else if (rcmArray5[i].contains(srcm))
				{
					srcm = rcmArray5[i];
					spelled = true;
				}
			}
			if (!spelled)
			{
				System.out.println("Not an option. Please try again.");
				srcm = "";
			}
		}
	}

	public void rm() 
	{
		int rightMid = randomGenerator.nextInt(5) + 1;
		System.out.println("\nPlease choose a right midfielder\n");
		if (rightMid == 1) 
		{
			System.out.println(Arrays.toString(rmArray1));
		} 
		else if (rightMid == 2) 
		{
			System.out.println(Arrays.toString(rmArray2));
		} 
		else if (rightMid == 3) 
		{
			System.out.println(Arrays.toString(rmArray3));
		} 
		else if (rightMid == 4) 
		{
			System.out.println(Arrays.toString(rmArray4));
		} 
		else 
		{
			System.out.println(Arrays.toString(rmArray5));
		}

		boolean spelled = false;

		while (!spelled)
		{
			srm = keyboard.nextLine();

			srm = srm.toLowerCase();
			srm = srm.toUpperCase().charAt(0) + srm.substring(1);

			for (int i = 0; i < 5; i++) 
			{
				if (rmArray1[i].contains(srm)) 
				{
					srm = rmArray1[i];
					spelled = true;
				} 
				else if (rmArray2[i].contains(srm)) 
				{
					srm = rmArray2[i];
					spelled = true;
				} 
				else if (rmArray3[i].contains(srm)) 
				{
					srm = rmArray3[i];
					spelled = true;
				}
				else if (rmArray4[i].contains(srm))
				{
					srm = rmArray4[i];
					spelled = true;
				} 
				else if (rmArray5[i].contains(srm)) 
				{
					srm = rmArray5[i];
					spelled = true;
				}
			}
			if (!spelled)
			{
				System.out.println("Not an option. Please try again.");
				srm = "";
			}
		}
	}

	public void lb() 
	{
		int leftBack = randomGenerator.nextInt(5) + 1;
		System.out.println("\nPlease choose a left back\n");
		if (leftBack == 1) 
		{
			System.out.println(Arrays.toString(lbArray1));
		} 
		else if (leftBack == 2) 
		{
			System.out.println(Arrays.toString(lbArray2));
		} 
		else if (leftBack == 3) 
		{
			System.out.println(Arrays.toString(lbArray3));
		} 
		else if (leftBack == 4) 
		{
			System.out.println(Arrays.toString(lbArray4));
		} 
		else 
		{
			System.out.println(Arrays.toString(lbArray5));
		}

		boolean spelled = false;

		while (!spelled) {
			slb = keyboard.nextLine();

			slb = slb.toLowerCase();
			slb = slb.toUpperCase().charAt(0) + slb.substring(1);

			for (int i = 0; i < 5; i++) 
			{
				if (lbArray1[i].contains(slb)) 
				{
					slb = lbArray1[i];
					spelled = true;
				} 
				else if (lbArray2[i].contains(slb)) 
				{
					slb = lbArray2[i];
					spelled = true;
				} 
				else if (lbArray3[i].contains(slb))
				{
					slb = lbArray3[i];
					spelled = true;
				} 
				else if (lbArray4[i].contains(slb))
				{
					slb = lbArray4[i];
					spelled = true;
				} 
				else if (lbArray5[i].contains(slb)) 
				{
					slb = lbArray5[i];
					spelled = true;
				}
			}
			if (!spelled)
			{
				System.out.println("Not an option. Please try again.");
				slb = "";
			}
		}
	}

	public void lcb() 
	{
		int leftCenterBack = randomGenerator.nextInt(5) + 1;
		System.out.println("\nPlease choose a left center back\n");
		if (leftCenterBack == 1) 
		{
			System.out.println(Arrays.toString(lcbArray1));
		} 
		else if (leftCenterBack == 2) 
		{
			System.out.println(Arrays.toString(lcbArray2));
		} 
		else if (leftCenterBack == 3) 
		{
			System.out.println(Arrays.toString(lcbArray3));
		} 
		else if (leftCenterBack == 4) 
		{
			System.out.println(Arrays.toString(lcbArray4));
		} 
		else 
		{
			System.out.println(Arrays.toString(lcbArray5));
		}

		boolean spelled = false;

		while (!spelled) 
		{
			slcb = keyboard.nextLine();

			slcb = slcb.toLowerCase();
			slcb = slcb.toUpperCase().charAt(0) + slcb.substring(1);

			for (int i = 0; i < 5; i++) 
			{
				if (lcbArray1[i].contains(slcb)) 
				{
					slcb = lcbArray1[i];
					spelled = true;
				} 
				else if (lcbArray2[i].contains(slcb)) 
				{
					slcb = lcbArray2[i];
					spelled = true;
				} 
				else if (lcbArray3[i].contains(slcb)) 
				{
					slcb = lcbArray3[i];
					spelled = true;
				} 
				else if (lcbArray4[i].contains(slcb)) 
				{
					slcb = lcbArray4[i];
					spelled = true;
				} 
				else if (lcbArray5[i].contains(slcb)) 
				{
					slcb = lcbArray5[i];
					spelled = true;
				}
			}
			if (!spelled)
			{
				System.out.println("Not an option. Please try again.");
				slcb = "";
			}
		}
	}

	public void rcb() 
	{
		int rightCenterBack = randomGenerator.nextInt(5) + 1;
		System.out.println("\nPlease choose a right center back\n");
		if (rightCenterBack == 1) 
		{
			System.out.println(Arrays.toString(rcbArray1));
		} 
		else if (rightCenterBack == 2) 
		{
			System.out.println(Arrays.toString(rcbArray2));
		} 
		else if (rightCenterBack == 3) 
		{
			System.out.println(Arrays.toString(rcbArray3));
		} 
		else if (rightCenterBack == 4) 
		{
			System.out.println(Arrays.toString(rcbArray4));
		}
		else {
			System.out.println(Arrays.toString(rcbArray5));
		}

		boolean spelled = false;

		while (!spelled)
		{
			srcb = keyboard.nextLine();

			srcb = srcb.toLowerCase();
			srcb = srcb.toUpperCase().charAt(0) + srcb.substring(1);

			for (int i = 0; i < 5; i++) 
			{
				if (rcbArray1[i].contains(srcb)) 
				{
					srcb = rcbArray1[i];
					spelled = true;
				} 
				else if (rcbArray2[i].contains(srcb)) 
				{
					srcb = rcbArray2[i];
					spelled = true;
				} 
				else if (rcbArray3[i].contains(srcb)) 
				{
					srcb = rcbArray3[i];
					spelled = true;
				} 
				else if (rcbArray4[i].contains(srcb)) 
				{
					srcb = rcbArray4[i];
					spelled = true;
				} 
				else if (rcbArray5[i].contains(srcb)) 
				{
					srcb = rcbArray5[i];
					spelled = true;
				}
			}
			if (!spelled)
			{
				System.out.println("Not an option. Please try again.");
				srcb = "";
			}
		}
	}

	public void rb() 
	{
		int rightBack = randomGenerator.nextInt(5) + 1;
		System.out.println("\nPlease choose a right back\n");
		if (rightBack == 1) 
		{
			System.out.println(Arrays.toString(rbArray1));
		}
		else if (rightBack == 2) 
		{
			System.out.println(Arrays.toString(rbArray2));
		} 
		else if (rightBack == 3) 
		{
			System.out.println(Arrays.toString(rbArray3));
		} 
		else if (rightBack == 4) 
		{
			System.out.println(Arrays.toString(rbArray4));
		} 
		else 
		{
			System.out.println(Arrays.toString(rbArray5));
		}

		boolean spelled = false;

		while (!spelled) 
		{
			srb = keyboard.nextLine();

			srb = srb.toLowerCase();
			srb = srb.toUpperCase().charAt(0) + srb.substring(1);

			for (int i = 0; i < 5; i++) 
			{
				if (rbArray1[i].contains(srb)) 
				{
					srb = rbArray1[i];
					spelled = true;
				} 
				else if (rbArray2[i].contains(srb)) 
				{
					srb = rbArray2[i];
					spelled = true;
				} 
				else if (rbArray3[i].contains(srb)) 
				{
					srb = rbArray3[i];
					spelled = true;
				} 
				else if (rbArray4[i].contains(srb))
				{
					srb = rbArray4[i];
					spelled = true;
				} else if (rbArray5[i].contains(srb)) 
				{
					srb = rbArray5[i];
					spelled = true;
				}
			}
			if (!spelled)
			{
				System.out.println("Not an option. Please try again.");
				srb = "";
			}
		}
	}

	public void gk() 
	{
		int goalKeeper = randomGenerator.nextInt(5) + 1;
		System.out.println("\nPlease choose a goal keeper\n");
		if (goalKeeper == 1) 
		{
			System.out.println(Arrays.toString(gkArray1));
		} 
		else if (goalKeeper == 2) 
		{
			System.out.println(Arrays.toString(gkArray2));
		} 
		else if (goalKeeper == 3) 
		{
			System.out.println(Arrays.toString(gkArray3));
		} 
		else if (goalKeeper == 4) 
		{
			System.out.println(Arrays.toString(gkArray4));
		} 
		else 
		{
			System.out.println(Arrays.toString(gkArray5));
		}

		boolean spelled = false;

		while (!spelled) 
		{
			sgk = keyboard.nextLine();

			sgk = sgk.toLowerCase();
			sgk = sgk.toUpperCase().charAt(0) + sgk.substring(1);

			for (int i = 0; i < 5; i++) 
			{
				if (gkArray1[i].contains(sgk)) 
				{
					sgk = gkArray1[i];
					spelled = true;
				} 
				else if (gkArray2[i].contains(sgk))
				{
					sgk = gkArray2[i];
					spelled = true;
				} 
				else if (gkArray3[i].contains(sgk)) 
				{
					sgk = gkArray3[i];
					spelled = true;
				} 
				else if (gkArray4[i].contains(sgk)) 
				{
					sgk = gkArray4[i];
					spelled = true;
				} 
				else if (gkArray5[i].contains(sgk)) 
				{
					sgk = gkArray5[i];
					spelled = true;
				}
			}
			if (!spelled)
			{
				System.out.println("Not an option. Please try again.");
				sgk = "";
			}
		}
	}

	public void end() 
	{
		lsNum = Integer.valueOf(sls.substring(sls.indexOf("(") + 1, sls.indexOf(")")));
		rsNum = Integer.valueOf(srs.substring(srs.indexOf("(") + 1, srs.indexOf(")")));
		lmNum = Integer.valueOf(slm.substring(slm.indexOf("(") + 1, slm.indexOf(")")));
		lcmNum = Integer.valueOf(slcm.substring(slcm.indexOf("(") + 1, slcm.indexOf(")")));
		rcmNum = Integer.valueOf(srcm.substring(srcm.indexOf("(") + 1, srcm.indexOf(")")));
		rmNum = Integer.valueOf(srm.substring(srm.indexOf("(") + 1, srm.indexOf(")")));
		lbNum = Integer.valueOf(slb.substring(slb.indexOf("(") + 1, slb.indexOf(")")));
		lcbNum = Integer.valueOf(slcb.substring(slcb.indexOf("(") + 1, slcb.indexOf(")")));
		rcbNum = Integer.valueOf(srcb.substring(srcb.indexOf("(") + 1, srcb.indexOf(")")));
		rbNum = Integer.valueOf(srb.substring(srb.indexOf("(") + 1, srb.indexOf(")")));
		gkNum = Integer.valueOf(sgk.substring(sgk.indexOf("(") + 1, sgk.indexOf(")")));
		
		System.out.println("Congratulations, you have completed the Fake Fifa Fut Draft");
		System.out.println("On your left is the very team that you have created, Well Done!");
		
		chemistry = 100;
		if (lsNum > rsNum)
		{
			offense = lsNum;
		}
		else
		{
			offense = rsNum;
		}
		
		if(lmNum > lcmNum && lmNum > rcmNum && lmNum > rmNum)
		{
			midfield = lmNum;
		}
		else if (lcmNum > lmNum && lcmNum > rcmNum && lcmNum > rmNum)
		{
			midfield = lcmNum;
		}
		else if (rcmNum > lmNum && rcmNum > lcmNum && rcmNum > rmNum)
		{
			midfield = rcmNum;
		}
		else
		{
			midfield = rmNum;
		}
		
		if(lbNum > lcbNum && lbNum > rcbNum && lbNum > rbNum)
		{
			defense = lbNum;
		}
		else if (lcbNum > lbNum && lcbNum > rcbNum && lcbNum > rbNum)
		{
			defense = lcbNum;
		}
		else if (rcbNum > lbNum && rcbNum > lcbNum && rcbNum > rbNum)
		{
			defense = rcbNum;
		}
		else if (rbNum > lbNum && rbNum > lcbNum && rbNum > rcbNum)
		{
			defense = rbNum;
		}
		else
		{
			defense = gkNum;
		}
		
		teamTotal = (offense + midfield + defense + chemistry) / 4;
		System.out.println("Your overall team rating is, " + teamTotal);
		System.out.println("Thank you for playing Fake Fifa Fut Draft, created by you host, Hari Kumaresan");
	}

	public void setup() 
	{
		instructions();
		size(862, 460);
		background = loadImage("picture1.png");
		positions();

		new Thread(() -> {
			while (!options) {
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			options();
		}).start();
	}

	public void draw() 
	{
		background(background);
		options = true;

		textSize(20);

		if (!sls.equals(""))
			text(sls.substring(0, sls.indexOf("(")), 417, 40);
		if (!srs.equals(""))
			text(srs.substring(0, srs.indexOf("(")), 546, 40);
		if (!slm.equals(""))
			text(slm.substring(0, slm.indexOf("(")), 217, 120);
		if (!slcm.equals(""))
			text(slcm.substring(0, slcm.indexOf("(")), 398, 180);
		if (!srcm.equals(""))
			text(srcm.substring(0, srcm.indexOf("(")), 576, 180);
		if (!srm.equals(""))
			text(srm.substring(0, srm.indexOf("(")), 753, 120);
		if (!slb.equals(""))
			text(slb.substring(0, slb.indexOf("(")), 217, 300);
		if (!slcb.equals(""))
			text(slcb.substring(0, slcb.indexOf("(")), 354, 315);
		if (!srcb.equals(""))
			text(srcb.substring(0, srcb.indexOf("(")), 620, 315);
		if (!srb.equals(""))
			text(srb.substring(0, srb.indexOf("(")), 750, 300);
		if (!sgk.equals(""))
			text(sgk.substring(0, sgk.indexOf("(")), 488, 345);
	}

	public void options() 
	{
		ls();
		rs();
		lm();
		lcm();
		rcm();
		rm();
		lb();
		lcb();
		rcb();
		rb();
		gk();
		end();
	}
}