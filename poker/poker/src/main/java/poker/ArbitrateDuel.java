package poker;

import poker.hand.Hand;

public class ArbitrateDuel {

	HandParser parser = new HandParser();

	public int getCard(String cardsPlayers) {
		String a = cardsPlayers.substring(0, cardsPlayers.length() / 2);
		String b = cardsPlayers.substring((cardsPlayers.length() / 2) + 1);

		return arbitrate(a, b);
	}

	public int arbitrate(String prayerA, String playerB) {
		Hand handPlayerA = parser.parse(prayerA);
		Hand handPlayerB = parser.parse(playerB);

		int result = 0;

		int score = handPlayerA.compare(handPlayerB);

		if (score > 0) {

			result = 1;
		} else if (score < 0) {

			result = 2;
		}

		return result;

	}

}
