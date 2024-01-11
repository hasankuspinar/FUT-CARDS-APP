package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.LeagueDAO;
import com.example.dao.PlayerDAO;
import com.example.dao.TeamDAO;
import com.example.model.League;
import com.example.model.Player;
import com.example.model.Team;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/futcards")
public class FUTController {
	
	@Autowired
	private LeagueDAO leagueDAO;
	
	@Autowired
	private TeamDAO teamDAO;
	
	@Autowired
	private PlayerDAO playerDAO;
	
	@PostConstruct
	public void init() {
		if(leagueDAO.count() ==0) {
			Player player1 = new Player("Galatasaray","Lucas Torreira", "URY", "CDM", 82, 76, 70, 77, 80, 79, 78);
			Player player2 = new Player("Galatasaray","Dries Mertens", "BEL", "CF", 81,76,80,80,83,40,49);
			Player player3 = new Player("Galatasaray","Wilfried Zaha", "CIV", "LW",81,90,78,72,85,37,76);
			Player player4 = new Player("Galatasaray","Mauro Icardi", "ARG", "ST",80,67,81,69,73,40,72);
			Player player6 = new Player("Galatasaray","Hakim Ziyech", "MAR", "RW",80,74,75,83,81,50,64);
			Player player7 = new Player("Galatasaray","Sacha Boey", "FRA", "RB",79,86,55,65,75,76,84);
			Player player8 = new Player("Galatasaray","Kerem Demirbay", "DEU", "CM",79,59,76,79,81,71,71);
			Player player9 = new Player("Galatasaray","Angelino", "ESP", "LB",79,71,71,81,82,74,68);
			Player player10 = new Player("Galatasaray","Tanguy Ndombele", "FRA", "CM",78,65,71,79,86,68,66);
			Player player11 = new Player("Galatasaray","Victor Nelsson", "DNK", "CB",78,64,43,59,66,79,84);
			Player player12 = new Player("Galatasaray","Sergio Oliveira", "PRT", "CM",78,51,76,82,74,67,62);
			Player player13 = new Player("Galatasaray","Kerem Akturkoglu", "TUR", "LM",77,84,73,71,79,38,56);
			Player player14 = new Player("Galatasaray","Abdulkerim Bardakci", "TUR", "CB",77,61,32,64,65,78,83);
			Player player15 = new Player("Galatasaray","Davinson Sanchez", "COL", "CB",77,73,47,54,64,77,78);
			Player player16 = new Player("Galatasaray","Cedric Bakambu", "COG", "ST",76,81,77,66,73,36,63);
			Player player17 = new Player("Galatasaray","Tete", "BRA", "RM",76,81,72,72,79,41,55);
			Player player19 = new Player("Galatasaray","Kaan Ayhan", "TUR", "CB",72,58,53,69,67,72,74);
			Player player20 = new Player("Galatasaray","Baris Alper Yilmaz", "TUR", "RM",72,87,70,64,71,37,84);
			Player player21 = new Player("Galatasaray","Halil Ibrahim Dervisoglu", "TUR", "ST",70,75,68,64,73,39,66);
			Player player22 = new Player("Galatasaray","Kazimcan Karatas", "TUR", "LB",68,79,57,59,66,64,70);
			
			playerDAO.save(player1);
			playerDAO.save(player2);
			playerDAO.save(player3);
			playerDAO.save(player4);
			playerDAO.save(player6);
			playerDAO.save(player7);
			playerDAO.save(player8);
			playerDAO.save(player9);
			playerDAO.save(player10);
			playerDAO.save(player11);
			playerDAO.save(player12);
			playerDAO.save(player13);
			playerDAO.save(player14);
			playerDAO.save(player15);
			playerDAO.save(player16);
			playerDAO.save(player17);
			playerDAO.save(player19);
			playerDAO.save(player20);
			playerDAO.save(player21);
			playerDAO.save(player22);
			
			List<Player> galatasarayPlayers = playerDAO.findByTeam("Galatasaray");
			
			Team galatasaray = new Team("Galatasaray","Super Lig", galatasarayPlayers);
			teamDAO.save(galatasaray);
			
			Player player23 = new Player("Trabzonspor","Edin Visca","BIH","RW",79,84,78,76,80,47,62);
			Player player25 = new Player("Trabzonspor","Nicolas Pepe","CIV","RM",78,87,76,74,81,36,63);
			Player player26 = new Player("Trabzonspor","Anastasios Bakasetas","GRC","CM",76,66,78,77,76,59,76);
			Player player27 = new Player("Trabzonspor","Trezeguet","EGY","LW",76,77,74,73,78,36,67);
			Player player28 = new Player("Trabzonspor","Joaquin","ESP","CB",75,62,45,61,55,74,79);
			Player player29 = new Player("Trabzonspor","Taxiarchis Fountas","GRC","CF",75,88,76,66,76,47,66);
			Player player30 = new Player("Trabzonspor","Mislav Orsic","HRV","LW",75,78,81,72,73,59,60);
			Player player31 = new Player("Trabzonspor","Enis Bardhi","MKD","CM",74,71,78,77,79,58,53);
			Player player32 = new Player("Trabzonspor","Dimitrios Kourbelis","GRC","CDM",74,75,52,64,67,72,76);
			Player player33 = new Player("Trabzonspor","Jens Stryger Larsen","DNK","RB",74,74,60,70,73,69,76);
			Player player34 = new Player("Trabzonspor","Umut Bozok","TUR","ST",73,78,72,64,74,33,68);
			Player player35 = new Player("Trabzonspor","Stefano Denswil","SUR","CB",73,57,56,67,65,74,75);
			Player player36 = new Player("Trabzonspor","Abdulkadir Omur","TUR","CM",73,84,67,72,81,53,57);
			Player player37 = new Player("Trabzonspor","Paul Ebere Onuachu","NGA","LW",73,60,73,58,64,45,80);
			Player player38 = new Player("Trabzonspor","Filip Benkovic","HRV","CB",72,60,44,54,55,71,79);
			Player player39 = new Player("Trabzonspor","Batista Mendy","FRA","CDM",72,56,50,64,61,71,79);
			Player player40 = new Player("Trabzonspor","Berat Ozdemir","TUR","CM",71,71,60,70,69,67,75);
			Player player41 = new Player("Trabzonspor","Eren Elmali","TUR","LB",70,80,40,62,68,65,74);
			Player player42 = new Player("Trabzonspor","Rayyan Baniya","TUR","CB",69,56,31,43,52,69,77);
			Player player43 = new Player("Trabzonspor","Umut Gunes","TUR","CM",68,65,51,63,66,64,66);
			Player player44 = new Player("Trabzonspor","Huseyin Turkmen","TUR","CB",68,73,36,47,56,67,72);
			Player player45 = new Player("Trabzonspor","Mehmet Can Aydin","TUR","RB",67,76,57,63,72,60,61);
			Player player46 = new Player("Trabzonspor","Tonio Teklic","HRV","CAM",66,81,60,62,69,34,63);
			Player player47 = new Player("Trabzonspor","Enis Destan","TUR","ST",62,68,64,55,61,47,69);
			Player player48 = new Player("Trabzonspor","Goktan Gurpuz","TUR","CAM",62,66,49,60,68,44,42);
			
			playerDAO.save(player23);
			playerDAO.save(player25);
			playerDAO.save(player26);
			playerDAO.save(player27);
			playerDAO.save(player28);
			playerDAO.save(player29);
			playerDAO.save(player30);
			playerDAO.save(player31);
			playerDAO.save(player32);
			playerDAO.save(player33);
			playerDAO.save(player34);
			playerDAO.save(player35);
			playerDAO.save(player36);
			playerDAO.save(player37);
			playerDAO.save(player38);
			playerDAO.save(player39);
			playerDAO.save(player40);
			playerDAO.save(player41);
			playerDAO.save(player42);
			playerDAO.save(player43);
			playerDAO.save(player44);
			playerDAO.save(player45);
			playerDAO.save(player46);
			playerDAO.save(player47);
			playerDAO.save(player48);
			
			List<Player> trabzonsporPlayers = playerDAO.findByTeam("Trabzonspor");
			
			Team trabzonspor = new Team("Trabzonspor", "Super Lig", trabzonsporPlayers);
			teamDAO.save(trabzonspor);
			
			Player player50 = new Player("Antalyaspor","Sam Larsson","SWE","LM",75,79,71,73,80,38,59);
			Player player51 = new Player("Antalyaspor","Omer Toprak","TUR","CB",74,62,39,59,67,76,72);
			Player player52 = new Player("Antalyaspor","Adam Buksa","POL","ST",72,63,72,57,69,31,72);
			Player player53 = new Player("Antalyaspor","Britt Assombalonga","COD","ST",70,80,68,59,67,35,74);
			Player player54 = new Player("Antalyaspor","Zymer Bytyqi","KOS","LM",70,77,67,67,72,37,69);
			Player player55 = new Player("Antalyaspor","Geritt Holtmann","PHL","LM",70,88,64,63,68,56,61);
			Player player56 = new Player("Antalyaspor","Dario Saric","BIH","CM",69,67,65,68,70,53,71);
			Player player57 = new Player("Antalyaspor","Guray Vural","TUR","LB",69,76,68,70,73,61,62);
			Player player58 = new Player("Antalyaspor","Bunyamin Balci","TUR","RB",68,74,44,60,67,64,63);
			Player player59 = new Player("Antalyaspor","Erdal Rakip","MKD","CDM",68,68,59,63,69,64,71);
			Player player60 = new Player("Antalyaspor","Veysel Sari","TUR","CB",67,48,52,55,50,67,75);
			Player player61 = new Player("Antalyaspor","Erdogan Yesilyurt","TUR","RM",67,72,63,62,69,55,64);
			Player player62 = new Player("Antalyaspor","Ufuk Akyol","TUR","CDM",66,67,55,62,65,64,68);
			Player player63 = new Player("Antalyaspor","Deni Milosevic","BIH","CAM",65,58,65,66,67,42,61);
			Player player64 = new Player("Antalyaspor","Bahadir Ozturk","TUR","CB",65,39,31,43,46,67,68);
			Player player65 = new Player("Antalyaspor","Jakub Kaluzinski","POL","CDM",64,65,55,59,65,59,61);
			Player player66 = new Player("Antalyaspor","Mert Yilmaz","TUR","RB",63,83,46,52,66,56,57);
			Player player67 = new Player("Antalyaspor","Erkan Eyibil","TUR","CAM",59,66,47,60,63,35,44);
			
			playerDAO.save(player50);
			playerDAO.save(player51);
			playerDAO.save(player52);
			playerDAO.save(player53);
			playerDAO.save(player54);
			playerDAO.save(player55);
			playerDAO.save(player56);
			playerDAO.save(player57);
			playerDAO.save(player58);
			playerDAO.save(player59);
			playerDAO.save(player60);
			playerDAO.save(player61);
			playerDAO.save(player62);
			playerDAO.save(player63);
			playerDAO.save(player64);
			playerDAO.save(player65);
			playerDAO.save(player66);
			playerDAO.save(player67);
			
			List<Player> antalyasporPlayers = playerDAO.findByTeam("Antalyaspor");
			
			Team antalyaspor = new Team("Antalyaspor","Super Lig", antalyasporPlayers);
			teamDAO.save(antalyaspor);
			
			Player player68 = new Player("Samsunspor","Flavien Tait","FRA","CM",76,68,71,75,77,67,67);
			Player player69 = new Player("Samsunspor","Ercan Kara","AUT","ST",73,75,74,51,62,28,86);
			Player player70 = new Player("Samsunspor","Landry Dimata","BEL","ST",72,76,71,63,68,39,79);
			Player player71 = new Player("Samsunspor","Emre Kilinc","TUR","RM",72,73,69,66,75,51,59);
			Player player72 = new Player("Samsunspor","Olivier Ntcham","CMR","CM",71,67,69,73,75,63,73);
			Player player73 = new Player("Samsunspor","Moryke Fofana","CIV","LM",70,87,65,61,75,26,58);
			Player player74 = new Player("Samsunspor","Carlo Holse","DNK","RW",70,79,63,67,73,53,66);
			Player player75 = new Player("Samsunspor","Rivk Van Drongelen","NLD","CB",70,60,26,56,53,69,73);
			Player player76 = new Player("Samsunspor","Youssef Ait Bennasser","MAR","CDM",69,65,62,72,73,65,65);
			Player player77 = new Player("Samsunspor","Taylan Antalyali","TUR","CM",69,67,64,67,67,68,73);
			Player player78 = new Player("Samsunspor","Nanu","GNB","RB",69,85,60,61,67,64,71);
			Player player79 = new Player("Samsunspor","Lubomir Satka","SVK","CB",69,63,29,53,53,69,69);
			Player player80 = new Player("Samsunspor","Kingsley Schindler","GHA","RM",69,77,62,64,68,57,70);
			Player player81 = new Player("Samsunspor","Soner Aydogdu","TUR","CDM",68,63,67,71,70,64,64);
			Player player82 = new Player("Samsunspor","Marc Bola","ENG","LB",68,74,35,54,63,65,71);
			Player player83 = new Player("Samsunspor","Gaetan Laura","FRA","ST",68,85,65,51,68,24,74);
			Player player84 = new Player("Samsunspor","Marius Mouandilmadji","TCD","ST",68,73,68,47,65,31,74);
			Player player85 = new Player("Samsunspor","Muhammed Gumuskaya","TUR","LM",66,72,61,66,68,52,57);
			Player player86 = new Player("Samsunspor","Zeki Yavru","TUR","RB",66,66,60,61,65,62,68);
			Player player87 = new Player("Samsunspor","Osman Celik","TUR","CDM",64,50,47,55,61,62,73);
			Player player88 = new Player("Samsunspor","Alim Ozturk","TUR","CB",63,38,46,49,51,62,73);
			
			
			playerDAO.save(player68);
			playerDAO.save(player69);
			playerDAO.save(player70);
			playerDAO.save(player71);
			playerDAO.save(player72);
			playerDAO.save(player73);
			playerDAO.save(player74);
			playerDAO.save(player75);
			playerDAO.save(player76);
			playerDAO.save(player77);
			playerDAO.save(player78);
			playerDAO.save(player79);
			playerDAO.save(player80);
			playerDAO.save(player81);
			playerDAO.save(player82);
			playerDAO.save(player83);
			playerDAO.save(player84);
			playerDAO.save(player85);
			playerDAO.save(player86);
			playerDAO.save(player87);
			playerDAO.save(player88);
			
			List<Player> samsunsporPlayers = playerDAO.findByTeam("Samsunspor");
			
			Team samsunspor = new Team("Samsunspor","Super Lig", samsunsporPlayers);
			teamDAO.save(samsunspor);
			
			Player player89 = new Player("Istanbulspor","Alassane Ndao","SEN","RM",70,80,62,64,73,31,54);
			Player player90 = new Player("Istanbulspor","Racine Coly","SEN","LB",66,76,44,56,61,62,70);
			Player player91 = new Player("Istanbulspor","Okan Erdogan","TUR","CB",66,62,35,49,41,67,70);
			Player player92 = new Player("Istanbulspor","David Sambissa","GAB","RW",65,75,56,54,69,55,61);
			Player player93 = new Player("Istanbulspor","Modestas Vorobjovas","LTU","CDM",65,67,53,60,61,60,74);
			Player player94 = new Player("Istanbulspor","Florian Loshaj","KOS","CM",64,62,56,65,67,57,66);
			Player player95 = new Player("Istanbulspor","Ibrahim Yilmaz","TUR","ST",64,67,61,51,64,28,62);
			Player player96 = new Player("Istanbulspor","Demeaco Duhaney","ENG","RB",63,74,33,50,63,58,65);
			Player player97 = new Player("Istanbulspor","Ali Yasar","TUR","LB",63,68,28,53,58,62,57);
			
			playerDAO.save(player89);
			playerDAO.save(player90);
			playerDAO.save(player91);
			playerDAO.save(player92);
			playerDAO.save(player93);
			playerDAO.save(player94);
			playerDAO.save(player95);
			playerDAO.save(player96);
			playerDAO.save(player97);
			
			List<Player> istanbulsporPlayers = playerDAO.findByTeam("Istanbulspor");
			
			Team istanbulspor = new Team("Istanbulspor","Super Lig", istanbulsporPlayers);
			teamDAO.save(istanbulspor);
			
			
			Player fbPlayer1 = new Player("Fenerbahce", "Edin Dzeko", "BIH", "ST", 83, 59, 84, 72, 77, 45, 76);
		    Player fbPlayer2 = new Player("Fenerbahce", "Dusan Tadic", "SRB", "LW", 82, 64, 80, 85,83, 43, 76);
		    Player fbPlayer3 = new Player("Fenerbahce", "Fred", "BRA", "CM", 81, 75, 69, 79, 81, 76, 70);
		    Player fbPlayer4 = new Player("Fenerbahce", "Cengiz Under", "TUR", "RM", 78, 78, 76, 77, 80, 38, 50);
		    Player fbPlayer5 = new Player("Fenerbahce", "Michy Batshuayi", "BEL", "ST", 77, 78, 78, 62, 76, 36, 79);
		    Player fbPlayer6 = new Player("Fenerbahce", "Ferdi Kadioglu", "TUR", "RB", 77, 86, 64, 72, 82, 69, 71);
		    Player fbPlayer7 = new Player("Fenerbahce", "Rodrigo Becao", "BRA", "CB", 77, 49, 33, 56, 50, 79, 72);
		    Player fbPlayer8 = new Player("Fenerbahce", "Sebastian Szymanski", "POL", "CAM", 77, 81, 70, 78, 77, 39, 52);
		    Player fbPlayer9 = new Player("Fenerbahce", "Alexander Djiku", "GHA", "CB", 76, 66, 43, 66, 67, 76, 80);
		    Player fbPlayer10 = new Player("Fenerbahce", "Ryan Kent", "ENG", "LW", 76, 89, 68, 72, 81, 42, 64);
		    Player fbPlayer11 = new Player("Fenerbahce", "Luan Peres", "BRA", "CB", 76, 73, 43, 67, 68, 77, 76);
		    Player fbPlayer12 = new Player("Fenerbahce", "Miguel Crespo", "PRT", "CM", 75, 70, 65, 72, 75, 73, 77);
		    Player fbPlayer13 = new Player("Fenerbahce", "Irfan Can Kahveci", "TUR", "RW", 75, 73, 72, 78, 78, 58, 66);
		    Player fbPlayer14 = new Player("Fenerbahce", "Joshua King", "NOR", "ST", 75, 81, 75, 71, 76, 38, 76);
		    Player fbPlayer15 = new Player("Fenerbahce", "Lincoln", "BRA", "CAM", 75, 75, 70, 78, 78, 59, 65);
		    Player fbPlayer16 = new Player("Fenerbahce", "Miha Zajc", "SVN", "CM", 75, 66, 75, 76, 75, 65, 65);
		    Player fbPlayer17 = new Player("Fenerbahce", "Emre Mor", "TUR", "RW", 74, 89, 65, 66, 83, 38, 59);
		    Player fbPlayer18 = new Player("Fenerbahce", "Bright Osayi-Samuel", "NGA", "RW", 74, 93, 58, 62, 78, 66, 81);
		    Player fbPlayer19 = new Player("Fenerbahce", "Serdar Aziz", "TUR", "CB", 73, 68, 32, 50, 52, 74, 79);
		    Player fbPlayer20 = new Player("Fenerbahce", "Mert Muldur", "TUR", "RB", 72, 74, 53, 63, 73, 59, 72);
		    Player fbPlayer21 = new Player("Fenerbahce", "Ismail Yuksek", "TUR", "CDM", 72, 75, 60, 68, 70, 69, 76);
		    Player fbPlayer22 = new Player("Fenerbahce", "Umut Nayir", "TUR", "ST", 71, 76, 70, 53, 66, 31, 80);
		    Player fbPlayer23 = new Player("Fenerbahce", "Mert Hakan Yandas", "TUR", "CM", 71, 72, 69, 72, 71, 62, 73);
		    Player fbPlayer24 = new Player("Fenerbahce", "Samet Akaydin", "TUR", "CB", 70, 61, 37, 44, 49, 71, 76);
		    Player fbPlayer25 = new Player("Fenerbahce", "Jarden Oosterwolde", "NLD", "LB", 69, 87, 41, 60, 68, 63, 72);
		    Player fbPlayer26 = new Player("Fenerbahce", "Bartug Elmaz", "TUR", "CM", 66, 60, 56, 67, 68, 61, 49);
		    
		   
		    playerDAO.save(fbPlayer1); playerDAO.save(fbPlayer2);
		    playerDAO.save(fbPlayer3); playerDAO.save(fbPlayer4);
		    playerDAO.save(fbPlayer5); playerDAO.save(fbPlayer6);
		    playerDAO.save(fbPlayer7); playerDAO.save(fbPlayer8);
		    playerDAO.save(fbPlayer9); playerDAO.save(fbPlayer10);
		    playerDAO.save(fbPlayer11); playerDAO.save(fbPlayer12);
		    playerDAO.save(fbPlayer13); playerDAO.save(fbPlayer14);
		    playerDAO.save(fbPlayer15); playerDAO.save(fbPlayer16);
		    playerDAO.save(fbPlayer17); playerDAO.save(fbPlayer18);	    
		    playerDAO.save(fbPlayer19);  playerDAO.save(fbPlayer20);	   
		    playerDAO.save(fbPlayer21); playerDAO.save(fbPlayer22);	    
		    playerDAO.save(fbPlayer23); playerDAO.save(fbPlayer24);	   
		    playerDAO.save(fbPlayer25);playerDAO.save(fbPlayer26);	    
		   
		    List<Player> fbPlayerList = playerDAO.findByTeam("Fenerbahce");
		    Team teamFb = new Team("Fenerbahce", "Super Lig", fbPlayerList);
		    teamDAO.save(teamFb);
		    
		    Player kgmPlayer1 = new Player("Karagumruk", "Federica Ceccherini", "ITA", "CB", 74, 62, 48, 58, 63, 75, 74);
		    Player kgmPlayer2 = new Player("Karagumruk", "Sofiane Feghouli", "DZA", "RM", 71, 63, 69 ,74,72, 32, 59);
		    Player kgmPlayer3 = new Player("Karagumruk", "Serdar Dursun", "TUR", "ST", 73, 56, 74, 61, 69, 40, 75 );
		    Player kgmPlayer4 = new Player("Karagumruk", "Kevin Lasagna", "ITA", "CF", 71, 84, 69,64,71,37, 69);
		    Player kgmPlayer5 = new Player("Karagumruk", "Marcus Rohden", "SWE", "CM", 71,74,66,67,71,61,81);
		    Player kgmPlayer6 = new Player("Karagumruk", "Otabek Shukurov", "UZB", "CM", 71,70,65,69,70,67,74);
		    Player kgmPlayer7 = new Player("Karagumruk", "Davide Biraschi", "ITA", "RWB", 70,61,36,60,68,72,69);
		    Player kgmPlayer8 = new Player("Karagumruk", "Ibrahim Dresevic", "KOS", "CB", 70,48,48,60,66,70,77);
		    Player kgmPlayer9 = new Player("Karagumruk", "Guven Yalcin", "TUR", "ST", 70,78,72,61,71,23, 62);
		    Player kgmPlayer10 = new Player("Karagumruk", "Brahim Darri", "NLD", "LW", 68,78,63,59,74,25,52);
		    Player kgmPlayer11 = new Player("Karagumruk", "Levent Mercan", "TUR", "LB", 67,76,62,65,68,64,50);
		    Player kgmPlayer12 = new Player("Karagumruk", "Kerem Kesgin", "TUR", "CM", 66, 68,64,64,70,52,58);
		    Player kgmPlayer13 = new Player("Karagumruk", "Frederic Veseli", "ALB", "CB", 66,67,41,55,64,66,66);  
		    Player kgmPlayer14 = new Player("Karagumruk", "Salih Dursun", "TUR", "RB", 64,54,44,54,57,65,76);
		    Player kgmPlayer15 = new Player("Karagumruk", "Can Keles", "TUR", "RM", 64,72,59,59,66,35,59);
		    Player kgmPlayer16 = new Player("Karagumruk", "Adnan Ugur", "TUR", "CM", 64,70,53,65,69,61,63);
		    Player kgmPlayer17 = new Player("Karagumruk", "Samed Onur", "TUR", "CAM", 60,67,60,60,64,29,42);
		    Player kgmPlayer18 = new Player("Karagumruk", "Emir Tintis", "TUR", "LB", 60,64,50,55,60,57,64);
		    
		    playerDAO.save(kgmPlayer1);playerDAO.save(kgmPlayer2);playerDAO.save(kgmPlayer3);
		    playerDAO.save(kgmPlayer4);playerDAO.save(kgmPlayer5);playerDAO.save(kgmPlayer6);
		    playerDAO.save(kgmPlayer7);playerDAO.save(kgmPlayer8);playerDAO.save(kgmPlayer9);
		    playerDAO.save(kgmPlayer10);playerDAO.save(kgmPlayer11);playerDAO.save(kgmPlayer12);
		    playerDAO.save(kgmPlayer13);playerDAO.save(kgmPlayer14);playerDAO.save(kgmPlayer15);
		    playerDAO.save(kgmPlayer16);playerDAO.save(kgmPlayer17);playerDAO.save(kgmPlayer18);
		    
		    List<Player> kgmPlayerList = playerDAO.findByTeam("Karagumruk");
		    Team teamKgm = new Team("Karagumruk", "Super Lig", kgmPlayerList);
		    teamDAO.save(teamKgm);
		    
		    Player kpPlayer1 = new Player("Kasimpasa", "Haris Hajradinovic", "BIH", "CM", 73,75,67,76,75,54,68);
		    Player kpPlayer2 = new Player("Kasimpasa", "Claudio Winck", "BRA", "RB", 72,73,59,62,66,68,74);
		    Player kpPlayer3 = new Player("Kasimpasa", "Nuno da Costa", "CVI", "ST", 71,82,69,63,72,26,65);
		    Player kpPlayer4 = new Player("Kasimpasa", "Samuel Bastien", "COD", "CM", 70,72,66,70,73,62,69);
		    Player kpPlayer5 = new Player("Kasimpasa", "Kenneth Omeruo", "NGA", "CB", 70,64,32,49,56,69,77);
		    Player kpPlayer6 = new Player("Kasimpasa", "Mortadha Ben Ouanes", "TUN", "LB", 69,72,60,68,68,65,65);
		    Player kpPlayer7 = new Player("Kasimpasa", "Mamadou Fall", "SEN", "RM", 69,87,64,60,69,37,73);
		    Player kpPlayer8 = new Player("Kasimpasa", "Sadik Ciftpinar", "TUR", "CB", 67,71,25,40,49,67,70);
		    Player kpPlayer9 = new Player("Kasimpasa", "Julien Ngoy", "BEL", "ST", 67,83,65,53,68,25,70);
		    Player kpPlayer10 = new Player("Kasimpasa", "Iron Gomis", "FRA", "CM", 66,71,56,65,69,57,65);
		    Player kpPlayer11 = new Player("Kasimpasa", "Aytac Kara", "TUR", "CDM", 65,51,67,63,61,63,75);
		    Player kpPlayer12 = new Player("Kasimpasa", "Gokhan Gul", "TUR", "CDM", 62,61,29,50,58,63,62);
		    Player kpPlayer13 = new Player("Kasimpasa", "Tuncer Duhan Aksu", "TUR", "LB", 61,57,32,52,56,62,56);
		    
		    playerDAO.save(kpPlayer1);playerDAO.save(kpPlayer2);playerDAO.save(kpPlayer3);
		    playerDAO.save(kpPlayer4);playerDAO.save(kpPlayer5);playerDAO.save(kpPlayer6);
		    playerDAO.save(kpPlayer7);playerDAO.save(kpPlayer8);playerDAO.save(kpPlayer9);
		    playerDAO.save(kpPlayer10);playerDAO.save(kpPlayer11);playerDAO.save(kpPlayer12);playerDAO.save(kpPlayer13);
			
		    List<Player> kpPlayerList = playerDAO.findByTeam("Kasimpasa");
		    Team teamKp = new Team("Kasimpasa","Super Lig",  kpPlayerList);
		    teamDAO.save(teamKp);
		    
		    Player alnPlayer1 = new Player("Alanyaspor", "Neroy Fer", "NLD", "CDM", 74,64,66,71,70,71,81);
		    Player alnPlayer2 = new Player("Alanyaspor", "Efecan Karaca", "TUR", "RM", 74,78,63,71,77,44,49);
		    Player alnPlayer3 = new Player("Alanyaspor", "Joao Novais", "PRT", "CM", 72,66,74,75,73,51,68);
		    Player alnPlayer4 = new Player("Alanyaspor", "Florent Hadergjonaj", "KOS", "RB", 70,81,50,64,68,64,69);
		    Player alnPlayer5 = new Player("Alanyaspor", "Jure Balkovec", "SVN", "CB", 69,67,55,68,66,68, 72);
		    Player alnPlayer6 = new Player("Alanyaspor", "Anderson Oliveira", "BRA", "ST", 69,74,69,58,66,27, 70);
		    Player alnPlayer7 = new Player("Alanyaspor", "Carlos Eduardo", "BRA", "LM", 69,77,63,60,73,21,46);
		    Player alnPlayer8 = new Player("Alanyaspor", "Fatih Aksoy", "TUR", "CB", 68,37,42,54,60,70,72);
		    Player alnPlayer9 = new Player("Alanyaspor", "Richard", "BRA", "CDM", 68,69,55,62,66,69,65);
		    Player alnPlayer10 = new Player("Alanyaspor", "Fidan Aliti", "KOS", "CB", 67,63,46,57,60,65,80);
		    Player alnPlayer11 = new Player("Alanyaspor", "Nicolas Janvier", "FRA", "CM", 67,65,58,66,67,62,66);
		    Player alnPlayer12 = new Player("Alanyaspor", "Furkan Bayir", "TUR", "CB", 66,61,31,43,56,65,71);
		    Player alnPlayer13 = new Player("Alanyaspor", "Sergio Cordova", "VEN", "ST", 66,72,66,52,67,23,65);
		    Player alnPlayer14 = new Player("Alanyaspor", "Oguz Aydin", "TUR", "LM",65,73,64,57,67,31,55);
		    Player alnPlayer15 = new Player("Alanyaspor", "Yusuf Ozdemir", "TUR", "LB", 65,80,40,55,64,57,65);
		    Player alnPlayer16 = new Player("Alanyaspor", "Pione Sisto", "DNK", "LW", 64,67,63,63,68,45,57);
		    Player alnPlayer17 = new Player("Alanyaspor", "Yunus Bahadir", "TUR", "RB", 57,65,29,44,57,54,51);
		    Player alnPlayer18 = new Player("Alanyaspor", "Mert Yusuf Torlak", "TUR", "CAM", 56,59,49,54,63,32,39);
		    
		    playerDAO.save(alnPlayer1);playerDAO.save(alnPlayer2);playerDAO.save(alnPlayer3);
		    playerDAO.save(alnPlayer4);playerDAO.save(alnPlayer5);playerDAO.save(alnPlayer6);
		    playerDAO.save(alnPlayer7);playerDAO.save(alnPlayer8);playerDAO.save(alnPlayer9);
		    playerDAO.save(alnPlayer10);playerDAO.save(alnPlayer11);playerDAO.save(alnPlayer12);
		    playerDAO.save(alnPlayer13);playerDAO.save(alnPlayer14);playerDAO.save(alnPlayer15);
		    playerDAO.save(alnPlayer16);playerDAO.save(alnPlayer17);playerDAO.save(alnPlayer18);
		    
		    List<Player> alnPlayerList = playerDAO.findByTeam("Alanyaspor");
		    Team teamAln = new Team("Alanyaspor", "Super Lig", alnPlayerList);
		    teamDAO.save(teamAln);
		    
		    Player pndPlayer1 = new Player("Pendikspor", "Sequiera", "PRT", "LB", 77,67,60,72,72,77,78);
		    Player pndPlayer2 = new Player("Pendikspor", "Fredrick Midtsjo", "NOR", "CM", 74,76,63,73,72,72,78);
		    Player pndPlayer3 = new Player("Pendikspor", "Halil Akbunar", "TUR", "RM", 72,79,66,69,74,38,57);
		    Player pndPlayer4 = new Player("Pendikspor", "Arnaud Lusamba", "COD", "CM", 71,72,64,70,74,64,70);
		    Player pndPlayer5 = new Player("Pendikspor", "Emeka Friday Eze", "NGA", "ST", 71,76,72,55,67,26,80);
		    Player pndPlayer6 = new Player("Pendikspor", "Abdoulay Diaby", "MLI", "RM", 70,83,69,66,72,37,56);
		    Player pndPlayer7 = new Player("Pendikspor", "Joher Khadim Rassoul", "SEN", "CB", 69,72,46,57,63,67,78);
		    Player pndPlayer8 = new Player("Pendikspor", "Josip Vukovic", "HRV", "CDM", 67,53,49,62,64,64,73);
		    Player pndPlayer9 = new Player("Pendikspor", "Serkan Asan", "TUR", "RB", 66,76,43,56,65,63,53);
		    Player pndPlayer10 = new Player("Pendikspor", "Alpaslan Ozturk", "TUR", "CB", 66,61,53,51,58,62,79);
		    Player pndPlayer11 = new Player("Pendikspor", "Aias Aosman", "SYR", "CF", 65,75,62,63,71,33,64);
		    Player pndPlayer12 = new Player("Pendikspor", "Thuram", "BRA", "ST", 64,68,65,48,62,22,58);
		    Player pndPlayer13 = new Player("Pendikspor", "Murat Akca", "TUR", "CB", 64,53,46,52,51,63,69);
		    Player pndPlayer14 = new Player("Pendikspor", "Erencan Yardimci", "TUR", "ST", 63,79,60,49,61,27,65);
		    Player pndPlayer15 = new Player("Pendikspor", "Ibrahim Akdag", "TUR", "CDM", 63,54,50,61,58,61,59);
		    Player pndPlayer16 = new Player("Pendikspor", "Emre Tasdemir", "TUR", "LB", 63,72,58,61,64,59,53);
		    Player pndPlayer17 = new Player("Pendikspor", "Erdem Ozgenc", "TUR", "RB", 63,57,55,65,64,62,66);
		    Player pndPlayer18 = new Player("Pendikspor", "Gokcan Kaya", "TUR", "CAM", 62,67,56,57,66,40,49);
		       
		    playerDAO.save(pndPlayer1);playerDAO.save(pndPlayer2);playerDAO.save(pndPlayer3);
		    playerDAO.save(pndPlayer4);playerDAO.save(pndPlayer5);playerDAO.save(pndPlayer6);
		    playerDAO.save(pndPlayer7);playerDAO.save(pndPlayer8);playerDAO.save(pndPlayer9);
		    playerDAO.save(pndPlayer10);playerDAO.save(pndPlayer11);playerDAO.save(pndPlayer12);
		    playerDAO.save(pndPlayer13);playerDAO.save(pndPlayer14);playerDAO.save(pndPlayer15);
		    playerDAO.save(pndPlayer16);playerDAO.save(pndPlayer17);playerDAO.save(pndPlayer18);
		    
		    List<Player> pndPlayerList = playerDAO.findByTeam("Pendikspor");
		    Team teamPnd = new Team("Pendikspor","Super Lig",  pndPlayerList);
		    teamDAO.save(teamPnd);
		    
		    
		    Player bjkPlayer1 = new Player("Besiktas","Vincent Aboubakar","CMR","ST",79,73,80,71,79,36,80);
			Player bjkPlayer2 = new Player("Besiktas","Gedson Fernandes","PRT","CM",78,79,73,76,80,75,77);		
			Player bjkPlayer3 = new Player("Besiktas","Rachid Ghezzal","DZA","RW",78,71,72,81,82,28,58);
			Player bjkPlayer4 = new Player("Besiktas","Ante Rebic","HRV","ST",77,80,77,72,77,46,77);
			Player bjkPlayer5 = new Player("Besiktas","Eric Bailly","CIV","CB",76,68,42,59,66,76,72);
			Player bjkPlayer6 = new Player("Besiktas","Arthur Masuaku","COD","LB",76,79,61,73,79,70,79);
			Player bjkPlayer7 = new Player("Besiktas","Milot Rashica","KOS","RM",76,81,75,71,77,50,73);
			Player bjkPlayer8 = new Player("Besiktas","Valentin Rosier","FRA","RB",76,84,52,65,75,72,76);
			Player bjkPlayer9 = new Player("Besiktas","Amir Hadziahmetovic","BIH","CDM",75,71,60,71,72,71,77);
			Player bjkPlayer10 = new Player("Besiktas","Cenk Tosun","TUR","ST",75,66,77,67,72,36,72);
			Player bjkPlayer11 = new Player("Besiktas","Daniel Amartey","GHA","CB",74,60,55,62,68,75,73);
			Player bjkPlayer12 = new Player("Besiktas","Omar Colley","GMB","CB",74,64,31,48,55,73,84);
			Player bjkPlayer13 = new Player("Besiktas","Jean Onana","CMR","CM",74,54,66,70,71,71,82);
			Player bjkPlayer14 = new Player("Besiktas","Salih Ucan","TUR","CM",74,57,70,75,75,66,65);
			Player bjkPlayer15 = new Player("Besiktas","Onur Bulut","TUR","RB",70,77,59,69,70,64,72);
			Player bjkPlayer16 = new Player("Besiktas","Jackson Muleka","COD","RW",70,81,71,58,71,35,71);
			Player bjkPlayer17 = new Player("Besiktas","Tayyip Sanuc","TUR","CB",70,60,43,48,58,69,75);
			Player bjkPlayer18 = new Player("Besiktas","Tayfur Bingol","TUR","LB",68,77,60,66,68,60,69);
			Player bjkPlayer19 = new Player("Besiktas","Necip Uysal","TUR","CB",68,54,56,61,63,68,72);
			Player bjkPlayer20 = new Player("Besiktas","Umut Meras","TUR","LB",67,74,42,59,65,62,70);
			
			playerDAO.save(bjkPlayer1); playerDAO.save(bjkPlayer2);
			playerDAO.save(bjkPlayer3); playerDAO.save(bjkPlayer4);
			playerDAO.save(bjkPlayer5); playerDAO.save(bjkPlayer6);
			playerDAO.save(bjkPlayer7); playerDAO.save(bjkPlayer8);
			playerDAO.save(bjkPlayer9); playerDAO.save(bjkPlayer10);
			playerDAO.save(bjkPlayer11); playerDAO.save(bjkPlayer12);
			playerDAO.save(bjkPlayer13); playerDAO.save(bjkPlayer14);
			playerDAO.save(bjkPlayer15); playerDAO.save(bjkPlayer16);
			playerDAO.save(bjkPlayer17); playerDAO.save(bjkPlayer18);
			playerDAO.save(bjkPlayer19); playerDAO.save(bjkPlayer20);
			
			List<Player> bjkPlayerList = playerDAO.findByTeam("Besiktas");
			Team teamBjk = new Team("Besiktas","Super Lig",  bjkPlayerList);
			teamDAO.save(teamBjk);
			
			Player ankPlayer1 = new Player("Ankaragucu","Pedrinho","PRT","CM",74,77,70,76,77,59,59);
			Player ankPlayer2 = new Player("Ankaragucu","Tolga Cigerci","TUR","CDM",73,36,66,70,68,70,77);
			Player ankPlayer3 = new Player("Ankaragucu","Ali Sowe","GMB","ST",71,72,70,60,71,31,76);
			Player ankPlayer4 = new Player("Ankaragucu","Mert Cetin","TUR","CB",70,58,44,54,56,69,76);
			Player ankPlayer5 = new Player("Ankaragucu","Anastasios Chatzigiovanis","GRC","LM",70,76,64,67,71,36,60);
			Player ankPlayer6 = new Player("Ankaragucu","Olimpiu Morutan","ROU","CF",70,74,69,68,73,46,55);
			Player ankPlayer7 = new Player("Ankaragucu","Enock Kwateng","FRA","RB",69,62,37,61,65,69,70);
			Player ankPlayer8 = new Player("Ankaragucu","Riad Bajic","BIH","ST",68,58,68,55,65,28,68);
			Player ankPlayer9 = new Player("Ankaragucu","Stelios Kitsiou","GRC","RM",68,68,61,65,69,69,67);
			Player ankPlayer10 = new Player("Ankaragucu","Nihad Mujakic","BIH","CB",68,70,28,42,47,66,77);
			Player ankPlayer11 = new Player("Ankaragucu","Uros Radakovic","SRB","CB",68,52,33,45,44,67,74);
			Player ankPlayer12 = new Player("Ankaragucu","Efkan Bekiroglu","TUR","CM",67,69,62,67,70,46,69);
			Player ankPlayer13 = new Player("Ankaragucu","Matej Hanousek","CZE","LWB",67,79,44,60,64,61,73);
			Player ankPlayer14 = new Player("Ankaragucu","Atakan Cankaya","TUR","CB",65,59,45,56,56,63,72);
			Player ankPlayer15 = new Player("Ankaragucu","Hayrullah Bilazer","TUR","RB",64,71,44,56,65,61,59);
			Player ankPlayer16 = new Player("Ankaragucu","Cem Turkmen","TUR","CDM",64,58,44,58,67,62,60);
			Player ankPlayer17 = new Player("Ankaragucu","Alper Uludag","TUR","LB",64,66,61,61,64,61,68);
			
			playerDAO.save(ankPlayer1); playerDAO.save(ankPlayer2);
			playerDAO.save(ankPlayer3); playerDAO.save(ankPlayer4);
			playerDAO.save(ankPlayer5); playerDAO.save(ankPlayer6);
			playerDAO.save(ankPlayer7); playerDAO.save(ankPlayer8);
			playerDAO.save(ankPlayer9); playerDAO.save(ankPlayer10);
			playerDAO.save(ankPlayer11); playerDAO.save(ankPlayer12);
			playerDAO.save(ankPlayer13); playerDAO.save(ankPlayer14);
			playerDAO.save(ankPlayer15); playerDAO.save(ankPlayer16);
			playerDAO.save(ankPlayer17); 
			
			List<Player> ankPlayerList = playerDAO.findByTeam("Ankaragucu");
			Team teamAnk = new Team("Ankaragucu","Super Lig",  ankPlayerList);
			teamDAO.save(teamAnk);
			
			Player bskPlayer1 = new Player("Basaksehir","Emmanuel Dennis","NGA","ST",75,85,74,62,76,38,69);
			Player bskPlayer2 = new Player("Basaksehir","Leo Duarte","BRA","CB",75,57,36,49,60,76,78);
			Player bskPlayer3 = new Player("Basaksehir","Leo Dubois","FRA","RB",74,68,58,73,71,73,70);
			Player bskPlayer4 = new Player("Basaksehir","Mehdi Abeid","DZA","CDM",73,60,68,70,73,67,75);
			Player bskPlayer5 = new Player("Basaksehir","Krzysztof Piatek","POL","ST",73,70,73,54,70,36,70);
			Player bskPlayer6 = new Player("Basaksehir","Deniz Turuc","TUR","RM",73,75,71,73,74,57,71);
			Player bskPlayer7 = new Player("Basaksehir","Danijel Aleksic","SRB","CM",72,68,76,72,75,51,74);
			Player bskPlayer8 = new Player("Basaksehir","Serdar Gurler","TUR","LM",72,82,65,68,74,43,56);
			Player bskPlayer9 = new Player("Basaksehir","Edgar Ie","GNB","CB",72,77,44,59,67,73,71);
			Player bskPlayer10 = new Player("Basaksehir","Berkay Ozcan","TUR","CM",72,70,64,72,75,55,68);
			Player bskPlayer11 = new Player("Basaksehir","Dimitrios Pelkas","GRC","CAM",72,74,68,72,75,44,58);
			Player bskPlayer12 = new Player("Basaksehir","Lucas Lima","BRA","LB",71,72,57,70,70,65,71);
			Player bskPlayer13 = new Player("Basaksehir","Jerome Opoku","ENG","CB",71,58,43,52,58,72,80);
			Player bskPlayer14 = new Player("Basaksehir","Mahmut Tekdemir","TUR","CDM",70,51,59,63,67,71,68);
			Player bskPlayer15 = new Player("Basaksehir","Omer Ali Sahiner","TUR","RB",68,74,67,66,71,62,70);
			Player bskPlayer16 = new Player("Basaksehir","Sener Ozbayrakli","TUR","RB",67,70,56,63,66,63,68);
			Player bskPlayer17 = new Player("Basaksehir","Philippe Paulin Keny","SEN","ST",66,80,64,55,63,29,71);
			Player bskPlayer18 = new Player("Basaksehir","Cemali Sertel","TUR","LB",66,70,38,59,63,63,68);
			Player bskPlayer19 = new Player("Basaksehir","Emirhan Ilkhan","TUR","CM",64,66,58,63,70,50,48);
			
			playerDAO.save(bskPlayer1); playerDAO.save(bskPlayer2);
			playerDAO.save(bskPlayer3); playerDAO.save(bskPlayer4);
			playerDAO.save(bskPlayer5); playerDAO.save(bskPlayer6);
			playerDAO.save(bskPlayer7); playerDAO.save(bskPlayer8);
			playerDAO.save(bskPlayer9); playerDAO.save(bskPlayer10);
			playerDAO.save(bskPlayer11); playerDAO.save(bskPlayer12);
			playerDAO.save(bskPlayer13); playerDAO.save(bskPlayer14);
			playerDAO.save(bskPlayer15); playerDAO.save(bskPlayer16);
			playerDAO.save(bskPlayer17); playerDAO.save(bskPlayer18);
			playerDAO.save(bskPlayer19);
			
			List<Player> bskPlayerList = playerDAO.findByTeam("Basaksehir");
			Team teamBsk = new Team("Basaksehir","Super Lig",  bskPlayerList);
			teamDAO.save(teamBsk);
			
			Player adsPlayer1 = new Player("Adana Demirspor","Jonas Svensson","NOR","RB",76,80,60,70,74,72,79);
			Player adsPlayer2 = new Player("Adana Demirspor","Younes Belhanda","MAR","CAM",75,68,74,77,77,59,71);
			Player adsPlayer3 = new Player("Adana Demirspor","Badou Ndiaye","SEN","CM",75,84,69,70,76,72,79);
			Player adsPlayer4 = new Player("Adana Demirspor","Kevin Rodrigues","PRT","LB",75,73,71,76,74,70,66);
			Player adsPlayer5 = new Player("Adana Demirspor","Andreaw Gravillon","FRA","CB",74,70,42,48,55,74,77);
			Player adsPlayer6 = new Player("Adana Demirspor","Benjamin Stambouli","FRA","CDM",74,51,58,66,71,71,75);
			Player adsPlayer7 = new Player("Adana Demirspor","Dorukhan Tokoz","TUR","CM",74,71,68,71,75,74,74);
			Player adsPlayer8 = new Player("Adana Demirspor","Nani","PRT","LW",73,68,73,75,78,34,70);
			Player adsPlayer9 = new Player("Adana Demirspor","Emre Akbaba","TUR","CAM",72,64,73,74,71,58,59);
			Player adsPlayer10 = new Player("Adana Demirspor","Arber Zeneli","KOS","LM",72,69,70,72,75,35,57);
			Player adsPlayer11 = new Player("Adana Demirspor","Yusuf Sari","TUR","RW",71,85,68,66,76,32,46);
			Player adsPlayer12 = new Player("Adana Demirspor","Babajide David Akintola","NGR","RW",69,90,62,58,70,40,66);
			Player adsPlayer13 = new Player("Adana Demirspor","Yusuf Erdogan","TUR","RW",69,81,67,66,71,59,64);
			Player adsPlayer14 = new Player("Adana Demirspor","Semih Guler","TUR","CB",68,68,37,48,53,66,78);
			Player adsPlayer15 = new Player("Adana Demirspor","Yusuf Barasi","TUR","ST",64,75,65,51,67,21,61);
			Player adsPlayer16 = new Player("Adana Demirspor","Abdurrahim Dursun","TUR","LB",63,72,47,53,63,61,57);
			Player adsPlayer17 = new Player("Adana Demirspor","Ismail Cokcalis","TUR","RB",61,71,30,46,62,57,60);
			
			playerDAO.save(adsPlayer1); playerDAO.save(adsPlayer2);
			playerDAO.save(adsPlayer3); playerDAO.save(adsPlayer4);
			playerDAO.save(adsPlayer5); playerDAO.save(adsPlayer6);
			playerDAO.save(adsPlayer7); playerDAO.save(adsPlayer8);
			playerDAO.save(adsPlayer9); playerDAO.save(adsPlayer10);
			playerDAO.save(adsPlayer11); playerDAO.save(adsPlayer12);
			playerDAO.save(adsPlayer13); playerDAO.save(adsPlayer14);
			playerDAO.save(adsPlayer15); playerDAO.save(adsPlayer16);
			playerDAO.save(adsPlayer17);
			
			List<Player> adsPlayerList = playerDAO.findByTeam("Adana Demirspor");
			Team teamAds = new Team("Adana Demirspor","Super Lig",  adsPlayerList);
			teamDAO.save(teamAds);
			
			Player kysPlayer1 = new Player("Kayserispor","Carlos Mane","GNB","LM",73,90,68,65,77,41,50);
			Player kysPlayer2 = new Player("Kayserispor","Mame Thiam","SEN","ST",72,74,72,64,72,26,72);
			Player kysPlayer3 = new Player("Kayserispor","Olivier Kemen","CMR","CM",71,75,68,66,73,67,80);
			Player kysPlayer4 = new Player("Kayserispor","Lionel Carole","FRA","LB",70,73,42,62,67,68,74);
			Player kysPlayer5 = new Player("Kayserispor","Majid Hosseini","IRN","CB",70,64,30,48,51,70,76);
			Player kysPlayer6 = new Player("Kayserispor","Miguel Cardoso","PRT","LM",70,74,67,65,72,39,60);
			Player kysPlayer7 = new Player("Kayserispor","Joseph Attamah","GHA","CDM",67,64,45,55,59,66,72);
			Player kysPlayer8 = new Player("Kayserispor","Ramazan Civelek","TUR","RM",67,76,57,64,69,62,59);
			Player kysPlayer9 = new Player("Kayserispor","Ali Karimi","IRN","CM",67,59,60,64,67,64,70);
			Player kysPlayer10 = new Player("Kayserispor","Kartal Yilmaz","TUR","CDM",67,67,52,72,66,62,66);
			Player kysPlayer11 = new Player("Kayserispor","Yaw Ackah","GHA","CDM",66,68,45,55,68,65,58);
			Player kysPlayer12 = new Player("Kayserispor","Dimitrios Kolovetsios","GRC","CB",66,52,33,50,50,68,71);
			Player kysPlayer13 = new Player("Kayserispor","Gokhan Sazdagi","TUR","LM",66,69,64,62,66,53,62);
			Player kysPlayer14 = new Player("Kayserispor","Anthony Uzodimma","NGA","CDM",61,72,54,56,66,58,59);
			
			playerDAO.save(kysPlayer1); playerDAO.save(kysPlayer2);
			playerDAO.save(kysPlayer3); playerDAO.save(kysPlayer4);
			playerDAO.save(kysPlayer5); playerDAO.save(kysPlayer6);
			playerDAO.save(kysPlayer7); playerDAO.save(kysPlayer8);
			playerDAO.save(kysPlayer9); playerDAO.save(kysPlayer10);
			playerDAO.save(kysPlayer11); playerDAO.save(kysPlayer12);
			playerDAO.save(kysPlayer13); playerDAO.save(kysPlayer14);
			
			List<Player> kysPlayerList = playerDAO.findByTeam("Kayserispor");
			Team teamKys = new Team("Kayserispor", "Super Lig", kysPlayerList);
			teamDAO.save(teamKys);
			
			
			Player hatayPlayer1 = new Player("Hatayspor", "Didier Ze", "CMR ", "ST", 72, 78, 73, 67, 73, 49, 78);
			Player hatayPlayer2 = new Player("Hatayspor", "Carlos Strandberg", "SWE", "ST", 71, 82, 72, 54, 63, 25, 80);
			Player hatayPlayer3 = new Player("Hatayspor", "Kamil Corekci", "TUR", "ST", 71, 82, 72, 54, 63, 25, 80);
			Player hatayPlayer4 = new Player("Hatayspor", "Rayane Aabid", "FRA", "CM", 67, 52, 62, 67, 68, 63, 72);
			Player hatayPlayer5 = new Player("Hatayspor", "Giorgi Aburjania", "GEO", "CM", 67, 52, 62, 67, 68, 63, 72);
			Player hatayPlayer6 = new Player("Hatayspor", "Nikola Maksmimovic", "SRB", "CB", 67, 47, 28, 43, 51, 67, 72);
			Player hatayPlayer7 = new Player("Hatayspor", "Joelson Fernandes", "PRT", "RM", 67, 89, 60, 58, 75, 24, 42);
			Player hatayPlayer8 = new Player("Hatayspor", "Renat Dadashov", "AZE", "ST", 66, 67, 66, 53, 63, 25, 70);
			Player hatayPlayer9 = new Player("Hatayspor", "Gorkem Saglam", "TUR", "CAM", 66,71 , 59, 66, 68, 54, 61);
			Player hatayPlayer10 = new Player("Hatayspor", "Guy-Marcelin Kilama", "CMR", "CB", 66, 69,38, 57, 61, 66, 75);
			Player hatayPlayer11 = new Player("Hatayspor", "Kerim Alici", "TUR", "RB", 65, 73, 49, 59, 63, 63, 62);
			Player hatayPlayer12 = new Player("Hatayspor", "Fisayo Dele-Bashiru", "NGA", "CM", 65, 77 ,61, 59, 73, 57, 77);
			Player hatayPlayer13 = new Player("Hatayspor", "Burak Bekaroglu", "TUR", "CB", 62, 55, 27, 42, 44, 63, 66);
			Player hatayPlayer14 = new Player("Hatayspor", "Omer Beyaz", "TUR", "CAM", 62, 65, 52, 62, 69, 47, 38);
			Player hatayPlayer15 = new Player("Hatayspor", "Mehdi Boudjemaa", "DZA", "CM", 62, 68, 46, 59, 67, 62, 68);
		
		
			playerDAO.save(hatayPlayer1);
			playerDAO.save(hatayPlayer2);
			playerDAO.save(hatayPlayer3);
			playerDAO.save(hatayPlayer4);
			playerDAO.save(hatayPlayer5);
			playerDAO.save(hatayPlayer6);
			playerDAO.save(hatayPlayer7);
			playerDAO.save(hatayPlayer8);
			playerDAO.save(hatayPlayer9);
			playerDAO.save(hatayPlayer10);
			playerDAO.save(hatayPlayer11);
			playerDAO.save(hatayPlayer12);
			playerDAO.save(hatayPlayer13);
			playerDAO.save(hatayPlayer14);
			playerDAO.save(hatayPlayer15);
		
		
			List<Player> hatayPlayerList = playerDAO.findByTeam("Hatayspor");
			Team teamHatay = new Team("Hatayspor","Super Lig",  hatayPlayerList);
			teamDAO.save(teamHatay);
		
		
		
			Player konyaPlayer1 = new Player("Konyaspor", "Guilherme Sitya", "BRA", "LB", 75, 80, 62, 75, 73, 67, 77);
			Player konyaPlayer2 = new Player("Konyaspor", "Alexandru Cicaldau", "ROU", "CM", 72, 66, 69, 74, 72, 62, 68);
			Player konyaPlayer3 = new Player("Konyaspor", "Ahmet Oguz", "TUR", "RB", 72, 76, 59, 67, 70, 68, 81);
			Player konyaPlayer4 = new Player("Konyaspor", "Francisco Calvo", "CRI", "CB", 71, 66, 44, 60, 65, 69, 78);
			Player konyaPlayer5 = new Player("Konyaspor", "Muhammet Demir", "TUR", "ST", 70, 72, 72, 66, 68, 37, 68);
			Player konyaPlayer6 = new Player("Konyaspor", "Yunus Malli", "TUR", "CAM", 70, 68, 66, 71, 72, 33, 50);
			Player konyaPlayer7 = new Player("Konyaspor", "Soner Dikmen", "TUR", "CM", 68, 66, 69, 62, 67, 67, 72);
			Player konyaPlayer8 = new Player("Konyaspor", "Marlos Moreno", "COL", "LW", 68, 84, 63, 60, 71, 28, 50);
			Player konyaPlayer9 = new Player("Konyaspor", "Sokol Cikalleshi", "ALB", "ST", 67, 61, 67, 59, 61, 35, 71);
			Player konyaPlayer10 = new Player("Konyaspor", "Adil Demirbag", "TUR", "CB", 67, 56, 31, 44, 46, 68, 70);
			Player konyaPlayer11 = new Player("Konyaspor", "Robert Muric", "HRV", "RW", 67, 75, 64, 64, 73, 31, 61);
			Player konyaPlayer12 = new Player("Konyaspor", "Bruno Paz", "AGO", "CM", 67, 72, 55, 67, 70, 64, 72);
			Player konyaPlayer13 = new Player("Konyaspor", "Cebrail Karayel", "TUR", "RB", 66, 72, 47, 61, 67, 62, 67);
			Player konyaPlayer14 = new Player("Konyaspor", "Kahraman Demirtas", "TUR", "CB", 64, 70, 32, 49, 57, 62, 69);
			Player konyaPlayer15 = new Player("Konyaspor", "Ugurcan Yazgılı", "TUR", "CB", 64, 54, 34, 42, 48, 63, 71);
			Player konyaPlayer16 = new Player("Konyaspor", "Mehmet Buyuksayar", "TUR", "LW", 61, 73, 51, 59, 67, 29, 38);
			Player konyaPlayer17 = new Player("Konyaspor", "Yasir Subasi", "TUR", "LB", 61, 70, 36, 45, 57, 58, 64);
		
		
		
			playerDAO.save(konyaPlayer1);
			playerDAO.save(konyaPlayer2);
			playerDAO.save(konyaPlayer3);
			playerDAO.save(konyaPlayer4);
			playerDAO.save(konyaPlayer5);
			playerDAO.save(konyaPlayer6);
			playerDAO.save(konyaPlayer7);
			playerDAO.save(konyaPlayer8);
			playerDAO.save(konyaPlayer9);
			playerDAO.save(konyaPlayer10);
			playerDAO.save(konyaPlayer11);
			playerDAO.save(konyaPlayer12);
			playerDAO.save(konyaPlayer13);
			playerDAO.save(konyaPlayer14);
			playerDAO.save(konyaPlayer15);
			playerDAO.save(konyaPlayer16);
			playerDAO.save(konyaPlayer17);
		
			List<Player> konyaPlayerList = playerDAO.findByTeam("Konyaspor");
			Team teamKonya = new Team("Konyaspor","Super Lig",  konyaPlayerList);
			teamDAO.save(teamKonya);
		
		
		
			Player rizePlayer1 = new Player("Caykur Rizespor", "Jonjo Shelvey", "ENG", "CM", 75, 37, 69, 80, 71, 62, 69);
			Player rizePlayer2 = new Player("Caykur Rizespor", "Casper Hojer", "DNK", "LWB", 73, 74, 69, 75, 70, 67, 73);
			Player rizePlayer3 = new Player("Caykur Rizespor", "Martin Minchev", "BGR", "ST", 72, 82, 70, 63, 69, 34, 75);
			Player rizePlayer4 = new Player("Caykur Rizespor", "Oscar Pinchi", "ESP", "LM", 70, 75, 70, 62, 74, 43, 56);
			Player rizePlayer5 = new Player("Caykur Rizespor", "John Mary", "CMR", "ST", 65, 61 ,63, 55, 62, 21, 68);
			Player rizePlayer6 = new Player("Caykur Rizespor", "Halil Pehlivan", "TUR", "LB", 65, 70, 48, 55, 61, 62, 68);
			Player rizePlayer7 = new Player("Caykur Rizespor", "Alberk Koc", "TUR", "LB", 64, 68, 36, 54, 59, 63, 63);
			Player rizePlayer8 = new Player("Caykur Rizespor", "Emirhan Topcu", "TUR", "CB", 64, 49, 33, 50, 59, 65, 67);
		
		
			playerDAO.save(rizePlayer1);
			playerDAO.save(rizePlayer2);
			playerDAO.save(rizePlayer3);
			playerDAO.save(rizePlayer4);
			playerDAO.save(rizePlayer5);
			playerDAO.save(rizePlayer6);
			playerDAO.save(rizePlayer7);
			playerDAO.save(rizePlayer8);
		
		
			List<Player> rizePlayerList = playerDAO.findByTeam("Caykur Rizespor");
			Team teamRize = new Team("Caykur Rizespor", "Super Lig", rizePlayerList);
			teamDAO.save(teamRize);
		
		
		
		
			Player sivasPlayer1 = new Player("Sivasspor", "Samu Saiz", "ESP", "CAM", 74, 76, 73, 73, 77, 31, 69);
			Player sivasPlayer2 = new Player("Sivasspor", "Roman Kvet", "CZE", "CAM", 71, 72, 72, 70, 70, 58, 73);
			Player sivasPlayer3 = new Player("Sivasspor", "Clinton Njie", "CMR", "RM", 71, 80, 67, 63, 73, 32, 66);
			Player sivasPlayer4 = new Player("Sivasspor", "Modou Barrow", "GMB", "RM", 70, 92, 63, 61, 72, 37, 57);
			Player sivasPlayer5 = new Player("Sivasspor", "Gerson Rodrigues", "LUX", "LM", 70, 82, 65, 64, 67, 44, 80);
			Player sivasPlayer6 = new Player("Sivasspor", "Hakan Arslan", "TUR", "CM", 69, 59, 69, 66, 69, 69, 75);
			Player sivasPlayer7 = new Player("Sivasspor", "Abdulkadir Parmak", "TUR", "CDM", 69, 75, 65, 68, 70, 68, 69);
			Player sivasPlayer8 = new Player("Sivasspor", "Emrah Bassan", "TUR", "RM", 68, 76, 69, 67, 68, 22, 58);
			Player sivasPlayer9 = new Player("Sivasspor", "Ugur Ciftci", "TUR", "LB", 68, 70, 50, 66, 66, 62, 70);
			Player sivasPlayer10 = new Player("Sivasspor", "Samba Camara", "MLI", "CB", 67, 57, 39, 51, 51, 66, 76);
			Player sivasPlayer11 = new Player("Sivasspor", "Charilaos Charisis", "GRC", "CM", 67, 57, 62, 68, 69, 64, 69);
			Player sivasPlayer12 = new Player("Sivasspor", "Ahmed Musa", "NGA", "RM", 67, 83, 64, 61, 71, 30, 45);
			Player sivasPlayer13 = new Player("Sivasspor", "Caner Osmanpasa", "TUR", "CB", 67, 45, 32, 50, 49, 69, 69);
			Player sivasPlayer14 = new Player("Sivasspor", "Ziya Erdal", "TUR", "LB", 65, 65, 51, 57, 62, 65, 61);
			Player sivasPlayer15 = new Player("Sivasspor", "Burak Kapacak", "TUR", "RM", 65, 78, 57, 60, 69, 50, 62);
			Player sivasPlayer16 = new Player("Sivasspor", "Murat Paluli", "TUR", "RB", 65, 71, 43, 57, 66, 61, 65);
			Player sivasPlayer17 = new Player("Sivasspor", "Kader Keita", "CIV", "CDM", 63, 66, 41, 53, 59, 59, 71);
		
		
			playerDAO.save(sivasPlayer1);
			playerDAO.save(sivasPlayer2);
			playerDAO.save(sivasPlayer3);
			playerDAO.save(sivasPlayer4);
			playerDAO.save(sivasPlayer5);
			playerDAO.save(sivasPlayer6);
			playerDAO.save(sivasPlayer7);
			playerDAO.save(sivasPlayer8);
			playerDAO.save(sivasPlayer9);
			playerDAO.save(sivasPlayer10);
			playerDAO.save(sivasPlayer11);
			playerDAO.save(sivasPlayer12);
			playerDAO.save(sivasPlayer13);
			playerDAO.save(sivasPlayer14);
			playerDAO.save(sivasPlayer15);
			playerDAO.save(sivasPlayer16);
			playerDAO.save(sivasPlayer17);
		
		
			List<Player> sivasPlayerList = playerDAO.findByTeam("Sivasspor");
			Team teamSivas = new Team("Sivasspor","Super Lig",  sivasPlayerList);
			teamDAO.save(teamSivas);
		
		
			Player gaziPlayer1 =  new Player("Gaziantep", "Alexandru Maxim", "ROU", "CAM", 76, 69, 76, 77, 79, 32, 60);
			Player gaziPlayer2 =  new Player("Gaziantep", "Max-Alain Gradel", "CIV", "LM", 74, 74, 74, 71, 77, 42, 61);
			Player gaziPlayer3 =  new Player("Gaziantep", "Lazar Markovic", "SRB", "LM", 73, 85, 65, 70, 78, 41, 48);
			Player gaziPlayer4 =  new Player("Gaziantep", "Papy Djilobodji", "SEN", "CB", 71, 58, 47, 54, 57, 70, 80);
			Player gaziPlayer5 =  new Player("Gaziantep", "Marko Jevtovic", "SRB", "CDM", 69, 44, 62, 61, 59, 71, 78);
			Player gaziPlayer6 =  new Player("Gaziantep", "Brayan Riascos", "COL", "ST", 69, 83, 69, 62, 67, 35, 81);
			Player gaziPlayer7 =  new Player("Gaziantep", "Salem M'Bakata", "FRA", "RB", 68, 83, 31, 58, 61, 64, 71);
			Player gaziPlayer8 =  new Player("Gaziantep", "Junior Morais", "BRA", "LB", 68, 67, 64, 65, 66, 65, 73);
			Player gaziPlayer9 =  new Player("Gaziantep", "Furkan Soyalp", "TUR", "CM", 68, 70, 62, 69, 70, 54, 64);
			Player gaziPlayer10 =  new Player("Gaziantep", "Denis Dragus", "ROU", "ST", 67, 80, 65, 53, 71, 19, 71);
			Player gaziPlayer11 =  new Player("Gaziantep", "Mustafa Eskihellac", "TUR", "RM", 67, 86, 57, 60, 69, 52, 55);
			Player gaziPlayer12 =  new Player("Gaziantep", "Naoufel Khacef", "DZA", "LB", 67, 67, 44, 49, 69, 65, 66);
			Player gaziPlayer13 =  new Player("Gaziantep", "Abdulkerim Cakar", "TUR", "RM", 66, 77, 62, 60, 71, 29, 60);
			Player gaziPlayer14 =  new Player("Gaziantep", "Batuhan Sen", "TUR", "RM", 66, 77, 62, 60, 71, 29, 60);
			Player gaziPlayer15 =  new Player("Gaziantep", "Ertugrul Ersoy", "TUR", "CB", 65, 51, 29, 42, 50, 64, 77);
			Player gaziPlayer16 =  new Player("Gaziantep", "Arda Kizildag", "TUR", "CB", 65, 62, 37, 48, 51, 68, 66);
			Player gaziPlayer17 =  new Player("Gaziantep", "Onurhan Babuscu", "TUR", "RM", 60, 65, 62, 60, 65, 28, 51);
			Player gaziPlayer18 =  new Player("Gaziantep", "Mirza Cihan", "TUR", "LM", 60, 67, 52, 56, 65, 33, 41);
			Player gaziPlayer19 =  new Player("Gaziantep", "Ulas Zengin", "TUR", "CB", 59, 49, 28, 35, 39, 60, 61);
			Player gaziPlayer20 =  new Player("Gaziantep", "Ilker Karakas", "TUR", "ST", 57, 59, 58, 43, 51, 25, 68);
		
		
		
			playerDAO.save(gaziPlayer1);
			playerDAO.save(gaziPlayer2);
			playerDAO.save(gaziPlayer3);
			playerDAO.save(gaziPlayer4);
			playerDAO.save(gaziPlayer5);
			playerDAO.save(gaziPlayer6);
			playerDAO.save(gaziPlayer7);
			playerDAO.save(gaziPlayer8);
			playerDAO.save(gaziPlayer9);
			playerDAO.save(gaziPlayer10);
			playerDAO.save(gaziPlayer11);
			playerDAO.save(gaziPlayer12);
			playerDAO.save(gaziPlayer13);
			playerDAO.save(gaziPlayer14);
			playerDAO.save(gaziPlayer15);
			playerDAO.save(gaziPlayer16);
			playerDAO.save(gaziPlayer17);
			playerDAO.save(gaziPlayer18);
			playerDAO.save(gaziPlayer19);
			playerDAO.save(gaziPlayer20);
		
		
		
			List<Player> gaziPlayerList = playerDAO.findByTeam("Gaziantep");
			Team teamGazi = new Team("Gaziantep", "Super Lig", gaziPlayerList);
			teamDAO.save(teamGazi);
			
			
			Player arsenalPlayer1 = new Player("Arsenal", "Beth Mead", "ENG", "RW", 87, 81, 84, 84, 87, 67, 73);
			Player arsenalPlayer2 = new Player("Arsenal", "Vivianne Miedema", "NLD", "ST", 86, 82, 85, 70, 86, 32, 81);
			Player arsenalPlayer3 = new Player("Arsenal", "Kim Little", "SCO", "CM", 86, 76, 78, 83, 88, 62, 66);
			Player arsenalPlayer4 = new Player("Arsenal", "Katie McCabe", "IRL", "LB", 85, 80, 74, 80, 80, 81, 82);
			Player arsenalPlayer5 = new Player("Arsenal", "Leah Williamson", "ENG", "CB", 85, 75, 45, 73, 72, 86, 76);
			Player arsenalPlayer6 = new Player("Arsenal", "Caitlin Foord", "AUS", "LW", 84, 86, 77, 80, 83, 45, 70);
			Player arsenalPlayer7 = new Player("Arsenal", "Amanda Ilestedt", "SWE", "CB", 84, 68, 42, 65, 63, 87, 78);
			Player arsenalPlayer8 = new Player("Arsenal", "Alessia Russo", "ENG", "ST", 84, 82, 82, 68, 84, 39, 72);
			Player arsenalPlayer9 = new Player("Arsenal", "Steph Catley", "AUS", "LB", 83, 85, 66, 80, 78, 78, 76);
			Player arsenalPlayer10 = new Player("Arsenal", "Lia Walti", "CHE", "CDM", 83, 80, 62, 77, 83, 81, 76);
			Player arsenalPlayer11 = new Player("Arsenal", "Frida Maanum", "NOR", "CM", 82, 66, 81, 81, 80, 72, 66);
			Player arsenalPlayer12 = new Player("Arsenal", "Stina Blackstenius", "SWE", "ST", 81, 83, 83, 60, 81, 39, 75);
			Player arsenalPlayer13 = new Player("Arsenal", "Lina Hurtig", "SWE", "LW", 79, 78, 78, 74, 78, 48, 76);
			Player arsenalPlayer14 = new Player("Arsenal", "Noelle Maritz", "CHE","RB", 79, 77, 47, 75, 72, 79, 73);
			Player arsenalPlayer15 = new Player("Arsenal", "Lotte Wubben-Moy", "ENG", "CB", 79, 58, 42, 62, 63, 82, 77);
			Player arsenalPlayer16 = new Player("Arsenal", "Jennifer Beattie", "SCO", "CB", 76, 53, 41, 55, 55, 77, 79);
			Player arsenalPlayer17 = new Player("Arsenal", "Cloe Lacasse", "CAN", "LW", 76, 85, 74, 69, 75, 26, 54);
			Player arsenalPlayer18 = new Player("Arsenal", "Victoria Pelova", "NLD", "CAM", 76, 76, 69, 72, 79, 35, 58);
			Player arsenalPlayer19 = new Player("Arsenal", "Laia Codina", "ESP", "CB", 73, 51, 42, 63, 65, 76, 67);
			Player arsenalPlayer20 = new Player("Arsenal", "Laura Wienroither", "AUT", "RB", 73, 72, 52, 65, 70, 72, 48);
			Player arsenalPlayer21 = new Player("Arsenal", "Kathrine Kuhl", "DNK", "CM", 71, 66, 54, 64, 73, 62, 66);
			Player arsenalPlayer22 = new Player("Arsenal", "Gio Queiroz", "BRA", "LW", 71, 79, 71, 61, 76, 24, 68);
			Player arsenalPlayer23 = new Player("Arsenal", "Teyah Goldie", "ENG", "CB", 62, 52, 48, 59, 59, 66, 52);



			playerDAO.save(arsenalPlayer1);
			playerDAO.save(arsenalPlayer2);
			playerDAO.save(arsenalPlayer3);
			playerDAO.save(arsenalPlayer4);
			playerDAO.save(arsenalPlayer5);
			playerDAO.save(arsenalPlayer6);
			playerDAO.save(arsenalPlayer7);
			playerDAO.save(arsenalPlayer8);
			playerDAO.save(arsenalPlayer9);
			playerDAO.save(arsenalPlayer10);
			playerDAO.save(arsenalPlayer11);
			playerDAO.save(arsenalPlayer12);
			playerDAO.save(arsenalPlayer13);
			playerDAO.save(arsenalPlayer14);
			playerDAO.save(arsenalPlayer15);
			playerDAO.save(arsenalPlayer16);
			playerDAO.save(arsenalPlayer17);
			playerDAO.save(arsenalPlayer18);
			playerDAO.save(arsenalPlayer19);
			playerDAO.save(arsenalPlayer20);
			playerDAO.save(arsenalPlayer21);
			playerDAO.save(arsenalPlayer22);
			playerDAO.save(arsenalPlayer23);



			List<Player> arsenalPlayerList = playerDAO.findByTeam("Arsenal");
			Team teamArsenal = new Team("Arsenal", "Barclays WSL", arsenalPlayerList);
			teamDAO.save(teamArsenal);
	//---------------------------------------------------------------------------------------------------------------


			Player chelseaPlayer1 = new Player("Chelsea", "Sam Kerr", "AUS", "ST", 90, 85, 88, 74, 90, 42, 85);
			Player chelseaPlayer2 = new Player("Chelsea", "Guro Reiten", "NOR", "LW", 88, 88, 80, 86, 86, 60, 63);
			Player chelseaPlayer3 = new Player("Chelsea", "Ashley Lawrence", "CAN", "RB", 86, 86, 67, 82, 80, 82, 78);
			Player chelseaPlayer4 = new Player("Chelsea", "Millie Bright", "ENG", "CB", 86, 57, 50, 69, 58, 86, 87);
			Player chelseaPlayer5 = new Player("Chelsea", "Kadeisha Buchanan", "CAN", "CB", 85, 67, 44, 58, 65, 87, 85);
			Player chelseaPlayer6 = new Player("Chelsea", "Catarine Macario", "USA", "CAM", 84, 81, 83, 80, 89, 57, 73);
			Player chelseaPlayer7 = new Player("Chelsea", "Erin Cuthbert", "SCO", "CM", 83, 78, 80, 81, 82, 75, 69);
			Player chelseaPlayer8 = new Player("Chelsea", "Lauren James", "ENG", "RW", 83, 87, 78, 80, 85, 28, 80);
			Player chelseaPlayer9 = new Player("Chelsea", "Eve Perisset", "FRA", "RB", 82, 76, 52, 79, 76, 79, 71);
			Player chelseaPlayer10 = new Player("Chelsea", "Melanie Leupolz", "DEU", "CDM", 81, 79, 75, 78, 83, 79, 73);
			Player chelseaPlayer11 = new Player("Chelsea", "Niamh Charles", "ENG", "RB", 80, 79, 65, 78, 75, 76, 68);
			Player chelseaPlayer12 = new Player("Chelsea", "Jessie Fleming", "CAN", "CM", 80, 82, 77, 77, 82, 68, 54);
			Player chelseaPlayer13 = new Player("Chelsea", "Sophie Ingle", "WAL", "CDM", 80, 64, 65, 75, 76, 77, 67);
			Player chelseaPlayer14 = new Player("Chelsea", "Sjoeke Nusken", "DEU", "CB", 80, 69, 54, 73, 73, 81, 73);
			Player chelseaPlayer15 = new Player("Chelsea", "Jelena Cankovic", "SRB", "CM", 79, 73, 79, 75, 81, 59, 71);
			Player chelseaPlayer16 = new Player("Chelsea", "Katerina Svitkova", "CZE", "CAM", 79, 77, 76, 76, 83, 71, 69);
			Player chelseaPlayer17 = new Player("Chelsea", "Jess Carter", "ENG", "CB", 78, 55, 46, 63, 63, 82, 75);
			Player chelseaPlayer18 = new Player("Chelsea", "Aniek Nouwen", "NLD", "CB", 78, 55, 50, 57, 58, 78, 82);
			Player chelseaPlayer19 = new Player("Chelsea", "Maren Mjelde", "NOR", "RB", 77, 63, 53, 68, 73, 78, 68);
			Player chelseaPlayer20 = new Player("Chelsea","Johanna Kaneryd", "SWE", "RW", 75, 82, 69, 69, 79, 48, 64);
			Player chelseaPlayer21 = new Player("Chelsea", "Mia Fishel", "USA", "ST", 74, 75, 75, 65, 72, 23, 67);
			Player chelseaPlayer22 = new Player("Chelsea", "Jorja Fox", "ENG", "RB", 68, 68, 36, 66, 62, 67, 62);
			Player chelseaPlayer23 = new Player("Chelsea", "Agnes Beever-Jones", "ENG", "ST", 66, 67, 63, 56, 70, 35, 66);
			Player chelseaPlayer24 = new Player("Chelsea", "Lucy Watson", "ENG", "LW", 65, 68, 67, 58, 65, 28, 64);


			playerDAO.save(chelseaPlayer1);
			playerDAO.save(chelseaPlayer2);
			playerDAO.save(chelseaPlayer3);
			playerDAO.save(chelseaPlayer4);
			playerDAO.save(chelseaPlayer5);
			playerDAO.save(chelseaPlayer6);
			playerDAO.save(chelseaPlayer7);
			playerDAO.save(chelseaPlayer8);
			playerDAO.save(chelseaPlayer9);
			playerDAO.save(chelseaPlayer10);
			playerDAO.save(chelseaPlayer11);
			playerDAO.save(chelseaPlayer12);
			playerDAO.save(chelseaPlayer13);
			playerDAO.save(chelseaPlayer14);
			playerDAO.save(chelseaPlayer15);
			playerDAO.save(chelseaPlayer16);
			playerDAO.save(chelseaPlayer17);
			playerDAO.save(chelseaPlayer18);
			playerDAO.save(chelseaPlayer19);
			playerDAO.save(chelseaPlayer20);
			playerDAO.save(chelseaPlayer21);
			playerDAO.save(chelseaPlayer22);
			playerDAO.save(chelseaPlayer23);
			playerDAO.save(chelseaPlayer24);


			List<Player> chelseaPlayerList = playerDAO.findByTeam("Chelsea");
			Team teamChelsea = new Team("Chelsea", "Barclays WSL",chelseaPlayerList);
			teamDAO.save(teamChelsea);

	//------------------------------------------------------------------------------------------------------------------------

			Player spursPlayer1 = new Player("Spurs", "Ashleigh Neville", "ENG", "RB", 84, 77, 70, 77, 77, 85, 84);
			Player spursPlayer2 = new Player("Spurs", "Bethany England", "ENG", "ST", 82, 66, 84, 67, 77, 40, 72);
			Player spursPlayer3 = new Player("Spurs", "Molly Bartrip", "ENG", "CB", 79, 69, 53, 69, 68, 81, 77);
			Player spursPlayer4 = new Player("Spurs", "Shelina Zadorsky", "CAN", "CB", 79, 71, 48, 70, 65, 80, 78);
			Player spursPlayer5 = new Player("Spurs", "Luana Buhler", "CHE", "CB", 77, 74, 56, 71, 68, 78, 75);
			Player spursPlayer6 = new Player("Spurs", "Celin Bizet", "NOR", "RM", 6, 84, 70, 70, 77, 37, 66);
			Player spursPlayer7 = new Player("Spurs", "Jessica Naz", "ENG", "ST", 76, 82, 74, 66, 82, 43, 66);
			Player spursPlayer8 = new Player("Spurs", "Ria Percival", "NZL", "CM", 76, 69, 70, 76, 76, 71, 60);
			Player spursPlayer9 = new Player("Spurs", "Ramona Petzelberger", "DEU", "LM", 76, 71, 72, 72, 76, 42, 59);
			Player spursPlayer10 = new Player("Spurs", "Eveliina Summanen", "FIN", "CM", 76, 48, 67, 73, 74, 74, 81);
			Player spursPlayer11 = new Player("Spurs", "Martha Thomas", "SCO", "ST", 76, 78, 76, 59, 76, 39, 70);
			Player spursPlayer12 = new Player("Spurs", "Rosella Ayane", "MAR", "ST", 75, 69, 75, 67, 78, 38, 67);
			Player spursPlayer13 = new Player("Spurs", "Drew Spence", "JAM", "CM", 74, 34, 74, 73, 72, 61, 70);
			Player spursPlayer14 = new Player("Spurs", "Asmita Ale", "ENG", "RB", 73, 66, 51, 67, 64, 73, 67);
			Player spursPlayer15 = new Player("Spurs", "Angharad James", "WAL", "CM", 73, 61, 64, 76, 69, 68, 65);
			Player spursPlayer16 = new Player("Spurs", "Ellie Brazil", "ENG", "RM", 69, 80, 62, 61, 73, 50, 56);
			Player spursPlayer17 = new Player("Spurs", "Grace Clinton", "ENG", "CAM", 69, 75, 63, 65, 70, 62, 74);
			Player spursPlayer18 = new Player("Spurs", "Kit Graham", "ENG", "CAM", 69, 54, 64, 65, 75, 39, 68);
			Player spursPlayer19 = new Player("Spurs", "Amy Turner", "ENG", "CB", 69, 40 ,27, 48, 52, 68, 65);
			Player spursPlayer20 = new Player("Spurs", "Gracie Pearse", "ENG", "CB", 57, 46, 41, 49, 44, 57, 57);


			playerDAO.save(spursPlayer1);
			playerDAO.save(spursPlayer2);
			playerDAO.save(spursPlayer3);
			playerDAO.save(spursPlayer4);
			playerDAO.save(spursPlayer5);
			playerDAO.save(spursPlayer6);
			playerDAO.save(spursPlayer7);
			playerDAO.save(spursPlayer8);
			playerDAO.save(spursPlayer9);
			playerDAO.save(spursPlayer10);
			playerDAO.save(spursPlayer11);
			playerDAO.save(spursPlayer12);
			playerDAO.save(spursPlayer13);
			playerDAO.save(spursPlayer14);
			playerDAO.save(spursPlayer15);
			playerDAO.save(spursPlayer16);
			playerDAO.save(spursPlayer17);
			playerDAO.save(spursPlayer18);
			playerDAO.save(spursPlayer19);
			playerDAO.save(spursPlayer20);




			List<Player> spursPlayerList = playerDAO.findByTeam("Spurs");
			Team teamSpurs = new Team("Spurs", "Barclays WSL",spursPlayerList);
			teamDAO.save(teamSpurs);
			
			
			Player bristolPlayer1 = new Player("Bristol City","Shania Hayles","JAM","ST",73,77,70,59,74,42,68);
			Player bristolPlayer2 = new Player("Bristol City","Satara Murray","JAM","CB",73,53,38,56,60,76,63);
			Player bristolPlayer3 = new Player("Bristol City","Rachel Furness","IRL","CM",72,69,69,73,72,57,63);
			Player bristolPlayer4 = new Player("Bristol City","Abigail Harrison","SCO","ST",72,74,76,61,71,24,65);
			Player bristolPlayer5 = new Player("Bristol City","Ffion Morgan","WAL","RM",72,73,70,68,74,24,53);
			Player bristolPlayer6 = new Player("Bristol City","Ella Powell","WAL","RB",72,73,31,60,64,72,66);
			Player bristolPlayer7 = new Player("Bristol City","Chloe Mustaki","IRL","LB",69,64,54,58,61,69,64);
			Player bristolPlayer8 = new Player("Bristol City","Carrie Jones","WAL","LM",68,65,64,63,69,39,64);
			Player bristolPlayer9 = new Player("Bristol City","Emily Syme","ENG","CDM",68,57,47,63,61,67,68);
			Player bristolPlayer10 = new Player("Bristol City","Brooke Aspin","ENG","CB",68,51,30,47,49,65,68);
			Player bristolPlayer11 = new Player("Bristol City","Naomi Layzell","ENG","CB",65,44,26,51,49,67,62);
			Player bristolPlayer12 = new Player("Bristol City","Amy Rodgers","SCO","CM",65,63,63,64,65,60,64);
			Player bristolPlayer13 = new Player("Bristol City","Jasmine Bull","ENG","RM",63,62,58,63,64,36,50);
			Player bristolPlayer14 = new Player("Bristol City","Jesse Woolley","ENG","ST",63,61,60,54,62,23,60);
			Player bristolPlayer15 = new Player("Bristol City","Jessica Simpson","ENG","LB",61,63,30,53,52,61,56);
			
			playerDAO.save(bristolPlayer1);
			playerDAO.save(bristolPlayer2);
			playerDAO.save(bristolPlayer3);
			playerDAO.save(bristolPlayer4);
			playerDAO.save(bristolPlayer5);
			playerDAO.save(bristolPlayer6);
			playerDAO.save(bristolPlayer7);
			playerDAO.save(bristolPlayer8);
			playerDAO.save(bristolPlayer9);
			playerDAO.save(bristolPlayer10);
			playerDAO.save(bristolPlayer11);
			playerDAO.save(bristolPlayer12);
			playerDAO.save(bristolPlayer13);
			playerDAO.save(bristolPlayer14);
			playerDAO.save(bristolPlayer15);
			
			List<Player> bristolPlayers = playerDAO.findByTeam("Bristol City");
			Team Bristol = new Team("Bristol City","Barclays WSL",bristolPlayers);
			teamDAO.save(Bristol);
			
			
			
			Player liverpoolPlayer1 = new Player("Liverpool","Emma Koivisto","FIN","RWB",80,76,61,69,69,82,78);
			Player liverpoolPlayer2 = new Player("Liverpool","Shanice van de Sanden","NLD","RM",78,86,70,73,78,37,72);
			Player liverpoolPlayer3 = new Player("Liverpool","Grace Fisk","ENG","CB",76,54,43,65,63,79,71);
			Player liverpoolPlayer4 = new Player("Liverpool","Ceri Holland","WAL","CM",75,58,71,71,76,67,71);
			Player liverpoolPlayer5 = new Player("Liverpool","Taylor Hinds","ENG","LWB",74,76,59,71,73,66,64);
			Player liverpoolPlayer6 = new Player("Liverpool","Melissa Lawley","ENG","LM",74,77,69,72,75,40,66);
			Player liverpoolPlayer7 = new Player("Liverpool","Teagan Micah","AUS","RWB",74,72,73,76,73,30,73);
			Player liverpoolPlayer8 = new Player("Liverpool","Fuka Nagano","JPN","CM",74,78,60,72,78,61,63);
			Player liverpoolPlayer9 = new Player("Liverpool","Gemma Bonner","ENG","CB",73,49,47,41,58,74,74);
			Player liverpoolPlayer10 = new Player("Liverpool","Niamh Fahey","IRL","CB",73,55,40,63,62,78,60);
			Player liverpoolPlayer11 = new Player("Liverpool","Missy Bo Kearns","ENG","CM",73,76,68,76,75,60,67);
			Player liverpoolPlayer12 = new Player("Liverpool","Leanne Kiernan","IRL","ST",73,81,76,64,76,28,59);
			Player liverpoolPlayer13 = new Player("Liverpool","Jasmine Matthews","ENG","CB",73,59,61,63,68,76,66);
			Player liverpoolPlayer14 = new Player("Liverpool","Natasha Flint","ENG","ST",72,49,72,58,70,39,75);
			Player liverpoolPlayer15 = new Player("Liverpool","Yana Daniels","BEL","ST",71,71,70,59,74,34,46);
			Player liverpoolPlayer16 = new Player("Liverpool","Marie Hobinger","AUT","CM",71,65,59,68,69,66,62);
			Player liverpoolPlayer17 = new Player("Liverpool","Sofie Lundgaard","DNK","CM",68,71,66,59,69,57,61);
			Player liverpoolPlayer18 = new Player("Liverpool","Jenna Clark","SCO","CB",67,70,35,51,63,69,61);
			Player liverpoolPlayer19 = new Player("Liverpool","Miriael Taylor","ENG","RM",65,50,69,62,69,45,69);
			Player liverpoolPlayer20 = new Player("Liverpool","Lucy Parry","ENG","RWB",60,73,45,55,58,56,59);
			Player liverpoolPlayer21 = new Player("Liverpool","Hannah Silcock","ENG","CB",58,64,37,55,59,58,54);
			
			playerDAO.save(liverpoolPlayer1);
			playerDAO.save(liverpoolPlayer2);
			playerDAO.save(liverpoolPlayer3);
			playerDAO.save(liverpoolPlayer4);
			playerDAO.save(liverpoolPlayer5);
			playerDAO.save(liverpoolPlayer6);
			playerDAO.save(liverpoolPlayer7);
			playerDAO.save(liverpoolPlayer8);
			playerDAO.save(liverpoolPlayer9);
			playerDAO.save(liverpoolPlayer10);
			playerDAO.save(liverpoolPlayer11);
			playerDAO.save(liverpoolPlayer12);
			playerDAO.save(liverpoolPlayer13);
			playerDAO.save(liverpoolPlayer14);
			playerDAO.save(liverpoolPlayer15);
			playerDAO.save(liverpoolPlayer16);
			playerDAO.save(liverpoolPlayer17);
			playerDAO.save(liverpoolPlayer18);
			playerDAO.save(liverpoolPlayer19);
			playerDAO.save(liverpoolPlayer20);
			playerDAO.save(liverpoolPlayer21);
			
			List<Player> liverpoolPlayers = playerDAO.findByTeam("Liverpool");
			Team Liverpool = new Team("Liverpool","Barclays WSL",liverpoolPlayers);
			teamDAO.save(Liverpool);
			
			
			Player leicesterPlayer1 = new Player("Leicester City","Lena Petermann","DEU","ST",79,71,80,66,74,43,75);
			Player leicesterPlayer2 = new Player("Leicester City","Janice Cayman","BEL","CB",75,57,75,78,79,75,68);
			Player leicesterPlayer3 = new Player("Leicester City","Sophie Howard","SCO","CB",75,54,39,60,55,76,68);
			Player leicesterPlayer4 = new Player("Leicester City","Alieen Whelan","ENG","CAM",75,67,70,71,75,67,73);
			Player leicesterPlayer5 = new Player("Leicester City","Shannon O'Brien","ENG","ST",73,71,69,60,77,67,71);
			Player leicesterPlayer6 = new Player("Leicester City","Sam Tierney","ENG","CDM",73,72,68,64,68,73,72);
			Player leicesterPlayer7 = new Player("Leicester City","Aimee Palmer","ENG","CM",72,67,63,69,72,70,68);
			Player leicesterPlayer8 = new Player("Leicester City","CJ Bott","NZL","RB",70,48,53,63,65,72,68);
			Player leicesterPlayer9 = new Player("Leicester City","Remy Siemsen","AUS","ST",69,66,67,58,66,27,52);
			Player leicesterPlayer10 = new Player("Leicester City","Josie Green","WAL","CDM",68,69,62,64,66,65,59);
			Player leicesterPlayer11 = new Player("Leicester City","Courtney Nevin","AUS","LB",66,67,43,62,58,65,61);
			Player leicesterPlayer12 = new Player("Leicester City","Hannah Cain","WAL","LM",65,71,61,61,66,36,56);
			Player leicesterPlayer13 = new Player("Leicester City","Missy Goodwin","ENG","ST",63,69,61,48,67,32,58);
			Player leicesterPlayer14 = new Player("Leicester City","Monique Robinson","ENG","CM",57,66,57,53,59,53,61);
			
			playerDAO.save(leicesterPlayer1);
			playerDAO.save(leicesterPlayer2);
			playerDAO.save(leicesterPlayer3);
			playerDAO.save(leicesterPlayer4);
			playerDAO.save(leicesterPlayer5);
			playerDAO.save(leicesterPlayer6);
			playerDAO.save(leicesterPlayer7);
			playerDAO.save(leicesterPlayer8);
			playerDAO.save(leicesterPlayer9);
			playerDAO.save(leicesterPlayer10);
			playerDAO.save(leicesterPlayer11);
			playerDAO.save(leicesterPlayer12);
			playerDAO.save(leicesterPlayer13);
			playerDAO.save(leicesterPlayer14);
			
			List<Player> leicesterPlayers = playerDAO.findByTeam("Leicester City");
			Team Leicester = new Team("Leicester City","Barclays WSL", leicesterPlayers);
			teamDAO.save(Leicester);
			
			Player briPlayer1 = new Player("Brighton", "Pauline Bremer", "DEU", "ST", 78,75,75,68,75,36,77);
			Player briPlayer2 = new Player("Brighton", "Lee Geum Min", "KOR", "ST", 78,80,77,72,79,37,68);
			Player briPlayer3 = new Player("Brighton", "Vicky Losada", "ESP", "CM", 77,67,72,73,77,65,68);
			Player briPlayer4 = new Player("Brighton", "Maria Thorisdottir", "NOR", "CB", 76,45,32,60,60,76,78);
			Player briPlayer5 = new Player("Brighton", "Emma Kullberg", "SWE", "CB", 75,71,37,65,65,77, 67);
			Player briPlayer6 = new Player("Brighton", "Veatriki Sarri", "GRC", "LM", 75,76,70,72,74,67, 65);
			Player briPlayer7 = new Player("Brighton", "Madison Haley", "USA", "ST", 74,79,73,59,68,35,68);
			Player briPlayer8 = new Player("Brighton", "Katie Robinson", "ENG", "RM", 74,79,66,68,75,38, 63);
			Player briPlayer9 = new Player("Brighton", "Elisabeth Terland", "NOR", "ST", 73,77,73,69,72,34,66);
			Player briPlayer10 = new Player("Brighton", "Julia Zigiotti", "SWE", "CM", 73,69,64,74,76,58,55);
			Player briPlayer11 = new Player("Brighton", "Poppy Pattinson", "ENG", "LB", 72,69,47,66,62,71,63);
			Player briPlayer12 = new Player("Brighton", "Guro Bergsvand", "NOR", "CB", 71,65,28,47,54,73,69);
			Player briPlayer13 = new Player("Brighton", "Dejana Stefanovic", "SRB", "CDM", 70,65,48,64,64,70,74);
			Player briPlayer14 = new Player("Brighton", "Mackenzie Hawkesby", "AUS", "CM", 69,65,62,68,68,63,63);
			Player briPlayer15 = new Player("Brighton", "Maisie Symonds", "ENG", "CM", 68,64,64,67,70,62,59);
			Player briPlayer16 = new Player("Brighton", "Charlize Rule", "AUS", "RB", 69,77,55,58,65,67,62);
			
			playerDAO.save(briPlayer1);playerDAO.save(briPlayer2);playerDAO.save(briPlayer3);
			playerDAO.save(briPlayer4);playerDAO.save(briPlayer5);playerDAO.save(briPlayer6);
			playerDAO.save(briPlayer7);playerDAO.save(briPlayer8);playerDAO.save(briPlayer9);
			playerDAO.save(briPlayer10);playerDAO.save(briPlayer11);playerDAO.save(briPlayer12);
			playerDAO.save(briPlayer13);playerDAO.save(briPlayer14);playerDAO.save(briPlayer15);playerDAO.save(briPlayer16);
			
			List<Player> briPlayerList = playerDAO.findByTeam("Brighton");
			Team teamBri = new Team("Brighton","Barclays WSL", briPlayerList);
			teamDAO.save(teamBri);
			
			Player whamPlayer1 = new Player("West Ham", "Viviane Asseyi", "FRA", "ST", 80,88,78,75,81,50,71);
			Player whamPlayer2 = new Player("West Ham", "Hawa Cisokko", "FRA", "CB", 79,53,32,60,54,78,79);
			Player whamPlayer3 = new Player("West Ham", "Dagny Brynjarsdottir", "ISL", "CM", 79,64,73,71,73,79,83);
			Player whamPlayer4 = new Player("West Ham", "Risa Shimizu", "JPN", "RB", 79,81,53,71,71,78,58);
			Player whamPlayer5 = new Player("West Ham", "Honoka Hayashi", "JPN", "CM", 78,78,70,78,80,62,56);
			Player whamPlayer6 = new Player("West Ham", "Lisa Evans", "SCO", "RW", 78,84,71,74,81,46,58);
			Player whamPlayer7 = new Player("West Ham", "Kirsty Smith", "SCO", "LB", 75,79,34,60,61,73,56);
			Player whamPlayer8 = new Player("West Ham", "Abbey-Leigh Stringer", "ENG", "CDM", 75,46,66,68,69,72,83);
			Player whamPlayer9 = new Player("West Ham", "Emma Harries", "ENG", "ST", 72,75,71,57,73,37,68);
			Player whamPlayer10 = new Player("West Ham", "Amber Tysiak", "BEL", "CB",70,69,38,44,57,70,70);
			Player whamPlayer11 = new Player("West Ham", "Jessica Ziu", "IRL", "RW", 69,63,63,68,70,46,61);
			Player whamPlayer12 = new Player("West Ham", "Izzy Atkinson", "IRL", "LW", 69,72,64,64,70,35,57);
			Player whamPlayer13 = new Player("West Ham", "Mel Fillis", "ENG", "CAM", 69,66,71,65,66,40,68);
			Player whamPlayer14 = new Player("West Ham", "Emma Snerle", "DNK", "CM", 69,67,69,67,73,53,67);
			Player whamPlayer15 = new Player("West Ham", "Shannon Cooke", "ENG", "CB", 66,65,52,53,56,66,69);
			Player whamPlayer16 = new Player("West Ham", "Jessie Stapleton", "IRL", "CB", 65,63,54,55,61,66,62);
			Player whamPlayer17 = new Player("West Ham", "Anouk Denton", "ENG", "LB", 66,71,43,56,56,65,63);
			
			playerDAO.save(whamPlayer1);playerDAO.save(whamPlayer2);playerDAO.save(whamPlayer3);
			playerDAO.save(whamPlayer4);playerDAO.save(whamPlayer5);playerDAO.save(whamPlayer6);
			playerDAO.save(whamPlayer7);playerDAO.save(whamPlayer8);playerDAO.save(whamPlayer9);
			playerDAO.save(whamPlayer10);playerDAO.save(whamPlayer11);playerDAO.save(whamPlayer12);
			playerDAO.save(whamPlayer13);playerDAO.save(whamPlayer14);playerDAO.save(whamPlayer15);
			playerDAO.save(whamPlayer16);playerDAO.save(whamPlayer17);
			
			List<Player> whamPlayerList = playerDAO.findByTeam("West Ham");
			Team teamWham = new Team("West Ham","Barclays WSL", whamPlayerList);
			teamDAO.save(teamWham);
			
			Player avPlayer1 = new Player("Aston Villa", "Rachel Daly", "ENG", "ST", 85,77,85,76,82,64,76);
			Player avPlayer2 = new Player("Aston Villa", "Kenza Dali", "FRA", "CB", 82,72,79,82,85,68,71);
			Player avPlayer3 = new Player("Aston Villa", "Jordan Nobbs", "ENG", "CM", 81,75,77,81,83,67,64);
			Player avPlayer4 = new Player("Aston Villa", "Alisha Lehmann", "CHE", "RW", 81,78,76,74,82,57,67);
			Player avPlayer5 = new Player("Aston Villa", "Mayumi Pacheco", "ENG", "LB", 81,79,51,75,78,78,77);
			Player avPlayer6 = new Player("Aston Villa", "Sarah Mayling", "ENG", "RB", 79,73,59,71,71,78,76);
			Player avPlayer7 = new Player("Aston Villa", "Ebony Salmon", "ENG", "ST", 79,88,79,75,76,41,67);
			Player avPlayer8 = new Player("Aston Villa", "Kirsty Hanson", "SCO", "LM", 78,80,74,77,78,57,72);
			Player avPlayer9 = new Player("Aston Villa", "Rachel Corsie", "SCO", "LM",  77,61,37,55,47,78,74);
			Player avPlayer10 = new Player("Aston Villa", "Adriana Leon", "CAN", "ST", 77,81,76,66,79,35,64);
			Player avPlayer11 = new Player("Aston Villa", "Danielle Turner", "ENG", "CB", 76,66,49,71,65,77,74);
			Player avPlayer12 = new Player("Aston Villa", "Anna Patten", "ENG", "CB", 74,65,44,62,63,76,71);
			Player avPlayer13 = new Player("Aston Villa", "Lucy Parker", "ENG", "CB", 73,58,39,59,61,75,73);
			Player avPlayer14 = new Player("Aston Villa", "Laura Blindkilde Brown", "ENG", "CM", 73,73,57,70,73,61,54);
			Player avPlayer15 = new Player("Aston Villa", "Lucy Staniforth", "ENG", "CM", 73,75,66,70,77,63,53);
			Player avPlayer16 = new Player("Aston Villa", "Simone Magill", "IRL", "ST", 65,62,63,57,68,35,55);
			Player avPlayer17 = new Player("Aston Villa", "Olivia McLoughlin", "ENG", "CDM", 64,62,48,60,62,63,50);
			
			playerDAO.save(avPlayer1);playerDAO.save(avPlayer2);playerDAO.save(avPlayer3);
			playerDAO.save(avPlayer4);playerDAO.save(avPlayer5);playerDAO.save(avPlayer6);
			playerDAO.save(avPlayer7);playerDAO.save(avPlayer8);playerDAO.save(avPlayer9);
			playerDAO.save(avPlayer10);playerDAO.save(avPlayer11);playerDAO.save(avPlayer12);
			playerDAO.save(avPlayer13);playerDAO.save(avPlayer14);playerDAO.save(avPlayer15);
			playerDAO.save(avPlayer16);playerDAO.save(avPlayer17);
			
			List<Player> avPlayerList = playerDAO.findByTeam("Aston Villa");
			Team teamAv = new Team("Aston Villa","Barclays WSL", avPlayerList);
			teamDAO.save(teamAv);
			
			
			//Manchester City
			Player mncPlayer1 = new Player("Manchester City","Lauren Hemp","ENG","LW",86,90,76,84,87,63,68);
			Player mncPlayer2 = new Player("Manchester City","Jill Roord","NLD","CAM",86,77,84,84,85,52,73);
			Player mncPlayer3 = new Player("Manchester City","Khadija Shaw","JAM","ST",85,69,85,69,75,30,85);
			Player mncPlayer4 = new Player("Manchester City","Chloe Kelly","ENG","RW",84,88,77,85,85,43,67);
			Player mncPlayer5 = new Player("Manchester City","Alex Greenwood","ENG","CB",83,70,64,79,74,84,81);
			Player mncPlayer6 = new Player("Manchester City","Yui Hasegawa","JPN","CDM",82,78,71,82,86,78,52);
			Player mncPlayer7 = new Player("Manchester City","Leila Ouahabi","ESP","LB",82,75,52,71,72,81,73);
			Player mncPlayer8 = new Player("Manchester City","Deyna Castellanos","VEN","CM",80,74,83,77,83,55,70);
			Player mncPlayer9 = new Player("Manchester City","Steph Houghton","ENG","CB",79,61,50,65,64,80,78);
			Player mncPlayer10 = new Player("Manchester City","Laura Coombs","ENG","CM",78,69,77,74,76,68,62);
			Player mncPlayer11 = new Player("Manchester City","Jess Park","ENG","RW",78,84,70,71,83,41,58);
			Player mncPlayer12 = new Player("Manchester City","Demi Stokes","ENG","LB",78,87,43,71,80,73,76);
			Player mncPlayer13 = new Player("Manchester City","Laia Aleixandri","ESP","CB",77,74,28,58,52,78,73);
			Player mncPlayer14 = new Player("Manchester City","Filippa Angeldahl","SWE","CM",77,75,66,75,77,67,67);
			Player mncPlayer15 = new Player("Manchester City","Alanna Kennedy","AUS","CB",77,54,45,68,61,78,76);
			Player mncPlayer16 = new Player("Manchester City","Kerstin Casparij","NLD","RB",76,76,56,70,73,74,60);
			Player mncPlayer17 = new Player("Manchester City","Mary Fowler","AUS","CAM",76,76,74,69,79,46,62);
			Player mncPlayer18 = new Player("Manchester City","Esme Morgan","ENG","RB",74,76,34,71,67,72,68);
			Player mncPlayer19 = new Player("Manchester City","Julie Blakstad","NOR","LW",72,79,68,70,70,45,64);
			Player mncPlayer20 = new Player("Manchester City","Ruby Mace","ENG","CB",64,35,40,54,53,64,68);
			
			playerDAO.save(mncPlayer1); playerDAO.save(mncPlayer2);
			playerDAO.save(mncPlayer3); playerDAO.save(mncPlayer4);
			playerDAO.save(mncPlayer5); playerDAO.save(mncPlayer6);
			playerDAO.save(mncPlayer7); playerDAO.save(mncPlayer8);
			playerDAO.save(mncPlayer9); playerDAO.save(mncPlayer10);
			playerDAO.save(mncPlayer11); playerDAO.save(mncPlayer12);
			playerDAO.save(mncPlayer13); playerDAO.save(mncPlayer14);
			playerDAO.save(mncPlayer15); playerDAO.save(mncPlayer16);
			playerDAO.save(mncPlayer17); playerDAO.save(mncPlayer18);
			playerDAO.save(mncPlayer19); playerDAO.save(mncPlayer20);
			
			List<Player> mncPlayerList = playerDAO.findByTeam("Manchester City");
			Team teamMnc = new Team("Manchester City", "Barclays WSL",mncPlayerList);
			teamDAO.save(teamMnc);
			
			//Manchester United
			Player mnuPlayer1 = new Player("Manchester United","Hannah Blundell","ENG","LB",83,71,54,72,72,83,72);
			Player mnuPlayer2 = new Player("Manchester United","Leah Galton","ENG","LM",83,73,82,82,82,60,79);
			Player mnuPlayer3 = new Player("Manchester United","Ella Toone","ENG","CAM",83,81,79,77,85,51,65);
			Player mnuPlayer4 = new Player("Manchester United","Melvine Malard","FRA","LW",82,80,79,78,83,40,66);
			Player mnuPlayer5 = new Player("Manchester United","Katie Zelem","ENG","CDM",82,69,78,82,79,79,78);
			Player mnuPlayer6 = new Player("Manchester United","Geyse","BRA","ST",81,90,79,74,85,34,87);
			Player mnuPlayer7 = new Player("Manchester United","Hayley Ladd","WAL","CDM",81,61,57,73,70,79,78);
			Player mnuPlayer8 = new Player("Manchester United","Maya Le Tissier","ENG","CB",81,76,57,75,72,82,79);
			Player mnuPlayer9 = new Player("Manchester United","Nikita Parris","ENG","RM",81,88,74,77,82,44,65);
			Player mnuPlayer10 = new Player("Manchester United","Lucia Garcia","ESP","RM",80,89,80,71,82,33,63);
			Player mnuPlayer11 = new Player("Manchester United","Millie Turner","ENG","CB",78,59,50,63,63,78,77);
			Player mnuPlayer12 = new Player("Manchester United","Gabrielle George","ENG","CB",77,53,57,68,66,76,81);
			Player mnuPlayer13 = new Player("Manchester United","Irene Guerrero","ESP","CM",77,71,67,68,73,72,62);
			Player mnuPlayer14 = new Player("Manchester United","Gemma Evans","WAL","CB",76,42,47,61,62,79,75);
			Player mnuPlayer15 = new Player("Manchester United","Rachel Williams","ENG","ST",76,63,77,64,73,45,72);
			Player mnuPlayer16 = new Player("Manchester United","Lisa Fjeldstad Naalsund","NOR","CDM",70,62,57,62,68,66,68);
			Player mnuPlayer17 = new Player("Manchester United","Aoife Mannion","IRL","CB",69,43,38,65,58,73,56);
			Player mnuPlayer18 = new Player("Manchester United","Jayde Riviere","CAN","RB",69,67,51,65,64,67,66);
			Player mnuPlayer19 = new Player("Manchester United","Evie Rabjohn","ENG","CB",61,64,38,51,58,62,57);
			
			playerDAO.save(mnuPlayer1); playerDAO.save(mnuPlayer2);
			playerDAO.save(mnuPlayer3); playerDAO.save(mnuPlayer4);
			playerDAO.save(mnuPlayer5); playerDAO.save(mnuPlayer6);
			playerDAO.save(mnuPlayer7); playerDAO.save(mnuPlayer8);
			playerDAO.save(mnuPlayer9); playerDAO.save(mnuPlayer10);
			playerDAO.save(mnuPlayer11); playerDAO.save(mnuPlayer12);
			playerDAO.save(mnuPlayer13); playerDAO.save(mnuPlayer14);
			playerDAO.save(mnuPlayer15); playerDAO.save(mnuPlayer16);
			playerDAO.save(mnuPlayer17); playerDAO.save(mnuPlayer18);
			playerDAO.save(mnuPlayer19);
			
			List<Player> mnuPlayerList = playerDAO.findByTeam("Manchester United");
			Team teamMnu = new Team("Manchester United","Barclays WSL", mnuPlayerList);
			teamDAO.save(teamMnu);
			
			//Everton
			Player evtPlayer1 = new Player("Everton","Nathalie Bjorn","SWE","CB",79,76,40,71,65,80,78);
			Player evtPlayer2 = new Player("Everton","Katja Snoeijs","NLD","ST",79,79,81,66,79,43,69);
			Player evtPlayer3 = new Player("Everton","Aurora Galli","ITA","CM",77,74,72,74,78,66,61);
			Player evtPlayer4 = new Player("Everton","Hanna Bennison","SWE","CAM",76,74,72,73,81,54,50);
			Player evtPlayer5 = new Player("Everton","Toni Duggan","ENG","ST",76,72,77,66,76,29,70);
			Player evtPlayer6 = new Player("Everton","Justine Vanhaevermaet","BEL","CM",76,47,70,73,72,73,80);
			Player evtPlayer7 = new Player("Everton","Martina Piemonte","ITA","ST",75,70,77,57,68,35,71);
			Player evtPlayer8 = new Player("Everton","Nicoline Sorensen","DNK","RW",75,67,70,75,75,39,70);
			Player evtPlayer9 = new Player("Everton","Katrine Veje","DNK","LB",75,68,45,73,67,73,68);
			Player evtPlayer10 = new Player("Everton","Karen Holmgaard","DNK","CDM",74,59,55,68,64,75,74);
			Player evtPlayer11 = new Player("Everton","Megan Finnigan","ENG","CB",73,60,43,63,62,74,72);
			Player evtPlayer12 = new Player("Everton","Lucy Hope","SCO","RB",72,66,62,68,71,71,72);
			Player evtPlayer13 = new Player("Everton","Clare Wheeler","AUS","CM",71,64,61,68,69,69,63);
			Player evtPlayer14 = new Player("Everton","Sara Holmgaard","DNK","LB",69,61,35,65,61,69,64);
			Player evtPlayer15 = new Player("Everton","Elise Isolde Stenevik","NOR","LB",69,72,37,62,65,67,64);
			Player evtPlayer16 = new Player("Everton","Emma Bissell","ENG","CM",65,65,63,56,67,56,61);
		
			playerDAO.save(evtPlayer1); playerDAO.save(evtPlayer2);
			playerDAO.save(evtPlayer3); playerDAO.save(evtPlayer4);
			playerDAO.save(evtPlayer5); playerDAO.save(evtPlayer6);
			playerDAO.save(evtPlayer7); playerDAO.save(evtPlayer8);
			playerDAO.save(evtPlayer9); playerDAO.save(evtPlayer10);
			playerDAO.save(evtPlayer11); playerDAO.save(evtPlayer12);
			playerDAO.save(evtPlayer13); playerDAO.save(evtPlayer14);
			playerDAO.save(evtPlayer15); playerDAO.save(evtPlayer16);
			
			List<Player> evtPlayerList = playerDAO.findByTeam("Everton");
			Team teamEvt = new Team("Everton", "Barclays WSL",evtPlayerList);
			teamDAO.save(teamEvt);
			
			
			List<Team> superteamList = teamDAO.findByLeagueName("Super Lig");
			List<Team> barclaysteamList = teamDAO.findByLeagueName("Barclays WSL");
			League superLig = new League("Super Lig",superteamList);
			League barclaysWSL = new League("Barclays WSL", barclaysteamList);
			leagueDAO.save(superLig);
			leagueDAO.save(barclaysWSL);
			
			
		}
		
	}
	
	@GetMapping("/players")
	public List<Player> players(){
		return playerDAO.findAll();
	}
	
	
	@GetMapping("/teams")
	public List<Team> teams(){
		return teamDAO.findAll();
	}
	
	@GetMapping("/leagues")
	public List<League> leagues(){
		return leagueDAO.findAll();
	}
	
	@PostMapping("/players/search")
	@ResponseBody
	public Player searchPlayers(@RequestBody Player player){
		Player player1 = playerDAO.findByName(player.getName());
		return player1;
	}
	
	@PostMapping("/teams/search")
	@ResponseBody
	public List<Player> searchTeams(@RequestBody Team team){
		Team team1 = teamDAO.findByName(team.getName());
		return team1.getPlayerList();
	}
	
	@PostMapping("/leagues/search")
	@ResponseBody
	public List<Team> searchLeagues(@RequestBody League league){
		League league1 = leagueDAO.findByName(league.getName());
		return league1.getTeamList();
	}
	

}
