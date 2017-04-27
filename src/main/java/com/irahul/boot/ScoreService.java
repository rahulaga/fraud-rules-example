package com.irahul.boot;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {
	@Autowired
	private KieContainer kieContainer;

	public ScoreFact score(ScoreFact request) {
		KieSession kieSession = kieContainer.newKieSession("TxnSession");
		FactHandle fh = kieSession.insert(request);
		kieSession.fireAllRules();
		
		request = (ScoreFact) kieSession.getObject(fh);
		kieSession.dispose();
		return request;
	}
}
