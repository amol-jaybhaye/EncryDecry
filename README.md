## EncryDecry

This project implements a simple encryption and decryption tool using the DES algorithm. It allows users to encrypt and decrypt text data using a secret key.

## Core Concepts of the DES Algorithm
The Data Encryption Standard (DES) is a symmetric-key block cipher that was adopted as a Federal Information Processing Standard (FIPS) in 1976. It is a widely used algorithm for encrypting and decrypting data, but it has been superseded by more secure algorithms such as AES.

##Key Concepts of DES:

<li>Symmetric-key algorithm: DES uses the same key for both encryption and decryption. This means that the sender and receiver of the data must share the same secret key.</li>

<li>Block cipher: DES operates on blocks of data of a fixed size (64 bits in this case). This means that a large message must be broken down into smaller blocks before it can be encrypted or decrypted.</li>

<li>Feistel cipher: DES is a Feistel cipher, which means that it consists of multiple rounds of the same basic operation. Each round consists of a substitution function and a permutation function.</li>

<li>Substitution function: The substitution function replaces each 4-bit input with a different 4-bit output. This is done by using a lookup table called an S-box.</li>

<li>Permutation function: The permutation function rearranges the order of the bits in the input. This is done by using a fixed permutation table.</li>

### Usage

To encrypt text data, run the program and enter the text you want to encrypt. The program will encrypt the text and print the encrypted text to the console.

To decrypt encrypted text data, run the program and enter the encrypted text. The program will decrypt the text and print the decrypted text to the console.

### Example

```
Enter User Text: Hello, World
6C1166D0681C9F2742B64244188915A9
Hello, World
```

### Dependencies

The program requires the following dependencies:

* Java Development Kit (JDK) 11 or higher

### Building and Running

To build and run the program, follow these steps:

1. Clone the repository:

```bash
git clone https://github.com/username/EncryDecry.git
```

2. Change directory to the project directory:

```bash
cd EncryDecry
```

3. Compile the program:

```bash
javac *.java
```

4. Run the program:

```bash
java coolApps.EncryDecry
```

### License

This project is licensed under the MIT License.
