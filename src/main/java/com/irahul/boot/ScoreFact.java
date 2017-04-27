package com.irahul.boot;

public class ScoreFact {
	private int txnAmount;
	private int score;

	public int getTxnAmount() {
		return txnAmount;
	}

	public void setTxnAmount(int txnAmount) {
		this.txnAmount = txnAmount;
	}

	public int getScore() {
		return score;
	}

	public void addScore(int score) {
		this.score += score;
	}
	
}
