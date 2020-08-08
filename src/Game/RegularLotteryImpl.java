package Game;

import java.io.IOException;

interface RegularLotteryImpl {

	public default void regularLottery() throws IOException {
	}

}

interface JackpotPrimaryImpl {

	public default void jackpotPrimary() throws IOException {
	}

}

interface JackpotSecondaryImpl extends JackpotPrimaryImpl {

	public default void jackpotSecondary() throws IOException {
	}

}