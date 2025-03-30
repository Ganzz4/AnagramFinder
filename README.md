# Anagram Finder

This project contains a Java program that identifies and groups anagrams from a given input file.

## Definition
Two words are considered anagrams if they contain the same letters but in a different order. For example, "race" and "care" are anagrams.

## Requirements
- Java Development Kit (JDK) 8 or higher

## Building the Program
Compile the Java source file:
```
javac AnagramFinder.java
```

## Running the Program
Execute the compiled class with the input file as argument:
```
java AnagramFinder sample.txt
```

Note: The input file should be in the same directory where you run the command or you should provide the full path to the file.

## Input & Output

### Input
The input file should contain one word per line.

### Output
The program outputs groups of anagrams—words that share the same letters are printed on the same line.

### Example

Input file (sample.txt):
```
act
cat
tree
race
care
acre
bee
```

Expected Output:
```
act cat
acre care race
tree
bee
```

## Project Structure
- `AnagramFinder.java`: Java implementation of the anagram finder
- `README.md`: This file with instructions
- `design_decisions.md`: Document outlining design decisions and scalability considerations
