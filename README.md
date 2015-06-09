# RandomGeneration 

This piece of code can be ran as a command line interface to repeatedly generate a random alphanumeric key of N characters length, M times.

`java -jar TheExportedJar.jar [key_length] [times]`

##Examples

```
java -jar TestRepetitions.jar 6 15000
RUNNING 15000 times for keylen 6
TOTAL REPETITIONS: 0
```


```
java -jar TestRepetitions.jar 6 150000
RUNNING 150000 times for keylen 6
REPETITION: 1AL5LT appears 2 times
REPETITION: SPTW4Y appears 2 times
REPETITION: FUZD37 appears 2 times
TOTAL REPETITIONS: 3
```

##Meaning
Nothing that can't be precisely calculated by using probability theory.
As a matter of fact, this is not calculating, this is emulating. Probability theory will be precise and 
throws the same result for the same parameters. This doesn't.
So, it's a nice and practical (empirical) approximation. 

It means that:
- Generating 15000 random alphanumerical keys has a really low probability of getting repeated keys.
- Generating 150000 random alphanumerical keys has a probability of repetition close to 3/150000 (0.00002).

**You may want to run some simulations when needing to generate almost univocal keys (if you have constrains that don't allow you to implement a 100% unambiguous algorithm).**

You can also check the code and extract the key generation logic. It's for free!
