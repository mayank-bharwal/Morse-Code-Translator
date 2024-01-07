# Morse-Code-Translator
The Java program is a Morse Code translator with text-to-Morse Code and Morse Code-to-text conversion options. It uses a predefined map, handles input with a `Scanner`, and ensures case-insensitivity. The program provides a concise and interactive Morse Code conversion tool.


![Screenshot 2024-01-07 at 7 39 24 AM](https://github.com/mayank-bharwal/Morse-Code-Translator/assets/119955673/8f408a3c-42c0-48d7-8615-a897d5906742)


## Features

- **Text to Morse Code Conversion:** Converts input text to Morse Code, preserving spaces between words.
- **Morse Code to Text Conversion:** Translates Morse Code to plain text, considering three consecutive spaces as word separators.

## Technical Details

- **Programming Language:** Java
- **Dependencies:** None
- **Usage:** Run the `MorseCodeTranslator` class, choose an option (1 or 2) for text-to-Morse or Morse-to-text conversion, and follow the prompts.
- **Case Insensitivity:** The program is case-insensitive; it converts all input text to uppercase for uniformity.
- **Data Structure:** Utilizes a `HashMap` for efficient mapping between characters and their Morse Code representations.
- **Input Handling:** Uses a `Scanner` for user input and gracefully handles invalid options.

## How to Run

1. Clone the repository.
2. Compile and run the `MorseCodeTranslator` class.

```bash
javac MorseCodeTranslator.java
java MorseCodeTranslator
```

## Example Usage

```plaintext
Morse Code Translator
1. Text to Morse Code
2. Morse Code to Text
Choose an option (1 or 2): 1
Enter text to translate to Morse Code: Hello World
Morse Code: .... . .-.. .-.. ---   .-- --- .-. .-.. -..
```

Feel free to explore the Morse Code Translator and enhance its features!

## License

This project is licensed under the [ECLIPSE public licenense).


Mayank Bharwal
