public class CaesarCipherFinal {

	// use the encodeMessage and decodeMessage methods that you wrote below to
	// obfuscate messages
	public static void main(String[] args) throws Exception {
		System.out.println(encryptMessage("Hello, can you read this?", 5));
		System.out.println(decryptMessage("Mjqqt, hfs dtz wjfi ymnx?", -5));
	}

	// use the applyOffsetToInputString method and your offset to encrypt the
	// message
	public static String encryptMessage(String unencryptedMessage, int offset) throws Exception {
		return applyOffsetToInputString(unencryptedMessage, offset);
	}

	// use the applyOffsetToInputString method and your offset to decrypt the
	// message
	public static String decryptMessage(String encryptedMessage, int offset) throws Exception {
		return applyOffsetToInputString(encryptedMessage, offset);
	}

	// this method works; don't modify it
	// call this method to implement your encrypt and decrypt methods
	// remember that you don't need to fully understand how the code works to use it
	public static String applyOffsetToInputString(String input, int offset) throws Exception {
		if (offset < -26 || offset > 26) {
			throw new Exception("Remember, I said that the offset had to be between -26 and 26 inclusive...");
		}
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			output += applyOffsetToIndividualCharacter(input.charAt(index), offset);
		}
		return output;
	}

	// this method works; don't modify it
	// you won't need to call this method at all
	// feel free to peek at this code, but it's not apparent at a glance how it
	// works
	public static char applyOffsetToIndividualCharacter(char character, int offset) throws Exception {
		if (offset < -26 || offset > 26) {
			throw new Exception("Remember, I said that the offset had to be between -26 and 26 inclusive...");
		}
		int asciiNumber = (int) character;
		if (asciiNumber >= 65 && asciiNumber <= 90) {
			if (asciiNumber + offset > 90) {
				return (char) (65 + (asciiNumber + offset - 91));
			} else if (asciiNumber + offset < 65) {
				return (char) (90 + (asciiNumber + offset - 64));
			} else {
				return (char) (asciiNumber + offset);
			}
		}
		if (asciiNumber >= 97 && asciiNumber <= 122) {
			if (asciiNumber + offset > 122) {
				return (char) (97 + (asciiNumber + offset - 123));
			} else if (asciiNumber + offset < 97) {
				return (char) (122 + (asciiNumber + offset - 96));
			} else {
				return (char) (asciiNumber + offset);
			}
		}
		return character;
	}
}
