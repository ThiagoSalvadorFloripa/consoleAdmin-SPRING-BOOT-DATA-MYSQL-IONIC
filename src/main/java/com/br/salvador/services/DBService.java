/**
 * 
 */
package com.br.salvador.services;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.salvador.domain.Hash;
import com.br.salvador.domain.Played;
import com.br.salvador.domain.Raffle;
import com.br.salvador.domain.User;
import com.br.salvador.repositories.HashRepository;
import com.br.salvador.repositories.PlayedRepository;
import com.br.salvador.repositories.RaffleRepository;
import com.br.salvador.repositories.UserRepository;

/**
 * @author thiago
 *
 */

@Service
public class DBService {
	
	@Autowired
	private UserRepository repoUser;
	
	@Autowired
	private PlayedRepository repoPlayed;
	
	@Autowired
	private HashRepository repoHash;
	
	@Autowired
	private RaffleRepository repoRaffle;
	
	public void instantiateDevDataBase() {
		BigDecimal amount = new BigDecimal("2500.000");
		Raffle raffle1 = new Raffle(null,amount,"123456",0 );
		
		BigDecimal amount1 = new BigDecimal("500.000");
		Raffle raffle2 = new Raffle(null,amount1,"123123",0 );
		
		Raffle raffle3 = new Raffle(null,amount1,"123123",0 );
		Raffle raffle4 = new Raffle(null,amount1,"12a3123",0 );
		Raffle raffle5 = new Raffle(null,amount1,"123s123",0 );
		Raffle raffle6 = new Raffle(null,amount1,"123d123",0 );
		Raffle raffle7 = new Raffle(null,amount1,"123f123",0 );
		Raffle raffle8 = new Raffle(null,amount1,"123f123",0 );
		Raffle raffle9 = new Raffle(null,amount1,"123f123",0 );
		Raffle raffle10 = new Raffle(null,amount1,"12f3123",0 );
		Raffle raffle11 = new Raffle(null,amount1,"123f123",1 );

		
		
		
		User user1 = new User(null, "THIANA SALVADOR", "123123", "123123", "THIAGO@GMAIL.COM", 500, "0000000000");
		User user2 = new User(null, "MARIA PRADO", "123123", "123123", "THIAGO@GMAIL.COM", 500, "0000000000");
		User user3 = new User(null, "JULIA PRADO", "123123", "123123", "JULIA@GMAIL.COM", 500, "0000000000");
		User user4 = new User(null, "PEDRO SALVADOR", "123123", "123123", "PEDRO@GMAIL.COM", 500, "0000000000");
		User user5 = new User(null, "RAFAEL PRADO", "123123", "123123", "RAFAEL@GMAIL.COM", 500, "0000000000");
		User user6 = new User(null, "VITAO PRADO", "123123", "123123", "VITAO@GMAIL.COM", 500, "0000000000");
		User user7 = new User(null, "CORROI SALVADOR", "123123", "123123", "CORROI@GMAIL.COM", 500, "0000000000");
		User user8 = new User(null, "CLEITON PRADO", "123123", "123123", "CLEITON@GMAIL.COM", 500, "0000000000");
		User user9 = new User(null, "ESTUPLADOR PRADO", "123123", "123123", "ESTUPLADOR@GMAIL.COM", 500, "0000000000");
		User user10 = new User(null, "ARTUR PRADOR", "123123", "123123", "VIADO@GMAIL.COM", 500, "0000000000");
		
		Played played1 = new Played(null, "123f123", 000000, user1,raffle11);
		Played played3 = new Played(null, "123f123", 000000, user2,raffle11);
		Played played4 = new Played(null, "650321", 000000, user1,raffle2);
		Played played2 = new Played(null, "651321", 000000, user4,raffle2);
		Played played6 = new Played(null, "123456", 000000, user1,raffle1);
		Played played7 = new Played(null, "659321", 000000, user4,raffle2);
		Played played8 = new Played(null, "657321", 000000, user1,raffle2);
		Played played9 = new Played(null, "653321", 000000, user2,raffle2);
		Played played10 = new Played(null, "123456", 000000, user8,raffle1);
		Played played31 = new Played(null, "123123", 000000, user1,raffle11);
		Played played42 = new Played(null, "123123", 000000, user2,raffle11);
		Played played21 = new Played(null, "123123", 000000, user3,raffle11);
		
		
		Hash hash1 = new Hash(null,"A526AS555AF5FA",user1);
		Hash hash2 = new Hash(null,"B526AS555AF5FB",user2);		
		user1.setHash(hash1);
		user2.setHash(hash2);
		
		repoRaffle.saveAll(Arrays.asList(raffle1, raffle2,raffle3, raffle4,raffle5, raffle6,raffle7, raffle8, raffle9,raffle10, raffle11));
		repoUser.saveAll(Arrays.asList(user1,user2,user3,user4,user5,user6,user7,user8,user9, user10));
		repoPlayed.saveAll(Arrays.asList(played1, played2,played3,played4,played6,played7,played8,played9,played10,played31,played42,played21));
		repoHash.saveAll(Arrays.asList(hash1, hash2));
		
	}
	

}
