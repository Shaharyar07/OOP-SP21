package lab8;

public class computer {
	int wordSize, memorySize, storageSize, speed;

	public computer() {
		wordSize = 1;
		memorySize = 1;
		storageSize = 1;
		speed = 1;
	}

	public computer(int wordSize, int memorySize, int storageSize, int speed) {
		this.wordSize = wordSize;
		this.memorySize = memorySize;
		this.storageSize = storageSize;
		this.speed = speed;

	}

	String display() {

		return "WordSize in bits: " + wordSize + " MemorySize in megabytes: " + memorySize
				+ "\nStorageSize in megabytes: " + " Speed in megahertz: " + speed;
	}

}
