package lecture3;

public class Laptop {
	Keyboard keyBoard;
	MotherBoard motherBoard;
	Screen screen;
	Memory memory;
	CPU cpu;
	Modem modem;
	void browseInternent(){
		modem.connectToRemoteMachine();
		modem.exchangeData();
	}

}

class Screen{}
class Memory{}
class Modem{
	public void connectToRemoteMachine() {}
	void exchangeData() {}
}
class CPU{}

