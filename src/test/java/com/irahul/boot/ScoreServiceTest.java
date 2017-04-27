package com.irahul.boot;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ScoreServiceTest {
	@Autowired
	private ScoreService scoreService;

	@Test
	public void amountHigh() {
		ScoreFact req = new ScoreFact();
		req.setTxnAmount(5000);
		
		ScoreFact score = scoreService.score(req);
		assertThat(score.getScore()).isEqualTo(50);
	}
	
	@Test
	public void amountLow() {
		ScoreFact req = new ScoreFact();
		req.setTxnAmount(50);
		
		ScoreFact score = scoreService.score(req);
		assertThat(score.getScore()).isEqualTo(0);
	}

}
