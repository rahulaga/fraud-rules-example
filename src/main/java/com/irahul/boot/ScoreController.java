package com.irahul.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {
	@Autowired
	private ScoreService scoreService;
	
	@RequestMapping(value = "/score-txn", method = RequestMethod.POST)
	public ScoreFact getScore(@RequestBody ScoreFact scoreRequest) {
		return scoreService.score(scoreRequest);
	}
}
