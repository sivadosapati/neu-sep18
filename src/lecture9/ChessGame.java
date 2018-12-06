package lecture9;

public class ChessGame {

	public static void main(String[] args) {
		ChessPlayer yuwei = new ChessPlayer("Yuwei");
		ChessPlayer kathy = new ChessPlayer("Kathy");
		kathy.setOpponent(yuwei);
		yuwei.setOpponent(kathy);
		kathy.setMove(true);
		new Thread(() -> kathy.play()).start();
		new Thread(() -> yuwei.play()).start();

	}

}

class ChessPlayer extends Person {

	boolean move = false;
	ChessPlayer opponent;

	ChessPlayer(String name) {
		super(name);

	}

	public void setMove(boolean b) {
		this.move = b;
	}

	public boolean isMove() {
		return move;
	}

	public void setOpponent(ChessPlayer opponent) {
		this.opponent = opponent;
	}

	private int counter = 0;

	private boolean isCheckMate() {
		counter++;
		if (counter == 5)
			return true;
		else
			return false;
	}

	public void play() {
		while (true) {
			if (isCheckMate()) {
				System.out.println("Game is done");
				break;
			}
			if (isMove() == true) {
				int x = random(3000);
				//System.out.println(name + " is thinking about a move for " + x + " millis");
				pause(x);
				System.out.println(name + " has made a move");
				move = false;
				opponent.setMove(true);
				synchronized (opponent) {
					opponent.notify();
				}
			} else {
				try {
					synchronized (this) {
						//System.out.println(name + " is waiting for her move");
						this.wait();
					}
				} catch (InterruptedException e) {
				}
			}
		}

	}

}
