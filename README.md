# Project Name: Caesar Cipher


### Project Description
This is a Java implementation of the Command Line Caesar Cipher which is a form of substitution in which each letter is shifted a certain number of places also known as a key, down the alphabet.

<img src="images/caesar-cipher.png">

### Setup Instructions
This is a simple Cipher tool written in JAVA to encrypt a string of text. This tool also take in an encrpted string of text and decrypts it too. This was written in response to the Terragon Ife Group questions to join the team.

The Caesar Cipher is a famous implementation of early day encryption. It would take a sentence and reorganize it based on a key that is enacted upon the alphabet. This makes it difficult to read and allows messages to be passed undetected.

The steps used in the program:

Step 1: Identify the character within the sentence.

Step 2: Find that character’s location within the alphabet.

Step 3: Identify that characters location + the key in the alphabet.

Step 4: Build a new sentence using the new characters in place of the original characters.

Step 5: repeat until sentence length is reached. (For loop).

Step 6: return result.

# BDD

# | Encoding |  Decoding |

A String of lower case letters, called Text. An Integer between 0-25 denoting the required shift. Procedure:

Traverse the given text one character at a time . For each character, transform the given character as per the rule, depending on whether we’re encrypting or decrypting the text. Return the new string generated. Program that receives a Text (string) and Shift value( integer) and returns the encrypted text.

We can either write another function decrypt similar to encrypt, that’ll apply the given shift in the opposite direction to decrypt the original text. However we can use the cyclic property of the cipher under modulo , hence we can simply observe

Cipher(n) = De-cipher(26-n)


# Contact Infomation:
### Author: [DENNIS NJENGA](https://github.com/deepeters)

         Email: dennis@dennis.com
         Phone: +254712345678

### Technology Used
1. Java

### Frameworks Used
1. Gradle

### LICENSE: [MIT LICENSE](https://raw.githubusercontent.com/deepeters/caesar-cipher/master/LICENSE)