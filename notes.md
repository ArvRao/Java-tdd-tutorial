Unit test: Isolates single piece of code and verifies that it is working as expected. It is going to be class or method

Decide what the unit test to be. Test only one thing. test methods don't need to be *public(After jUnit 5) and not return anything. They must be descriptive of what they are doing.
Always add more scenarios to unit test suite

Why important?
 - Make sure system works.
 - Whenver modifying source code, we can keep testing and make sure all test cases pass
 - Working the way it should
 - Refactor code anyway we need it to with absolute confidence


Clean code- uncle Bob
- Distance from sun to earth
- Numbers of processors, single mistake costs everything
- Evolution of computers
- Kent Beck - Implementation  pattern
    - fragile practices
    - Where it goes wrong
    - Good code
    - They go fast and make a mess
    - Adding more people to project and it's effect
    - About old code that trains new people, productivity slows down
    - Desire to go fast makes a mess
Coding is just half the job, once done, we need to clean it
* Don't put nouns and function names, put verbs instead
* Correct scoping
Bjarne StrawStrup - About clean code
-Clean code just does 1 thing well
- Wants his code to be elegent and simple

Grady Booch - Clean code is simple and direct
- written object oriented design
- Clean code is poem

It is more important for others to undertand our code and what it does.

Ward Cunningham - invented wiki
- Clean code: Everything we read is what we expect it to do


Testing code: Take code from every page, find appropriate word, setups, prepend and append them and generate HTML, later feed it to testing engine

Ideal cases:
- Functions shouldn't be over 100 lines long. Must be small as possible
- Functions should do 1 thing
- Extract functions from that code if it does more than 1 task.
- Name functions well, in correct classes, packages
- write proper comments
- Try limiting number of arguments functins can take in. At max 3. Look at type of arguments like boolean.
- indent level must not be greater than 2.
- Set up paradigms
- Make sure code is least suprising. No double take
- avoid switch statements: Look for every switch statements is tedious
- independently deploy GUI with business rule
- they shouldn't change state of system
garbage collection
Pairs of functions must be used together, closed
- prefer exceptions to error codes
- DRY Principle

* JAR file - Java ARchive. Used for aggregating more than multiple files to one.

`new` keyboard: allocates memory at run time
We can demonstrate that software cannot be incorrect by doing tests
Structured programming: By Edsgar Dijkstra 

`static`: is used for memory management

## Naming conventions
Classes: Noun
Interface: Adjective
Method: Verb
Constant: Capitals, meaningful
variables: Lower case letters; shouldn't start with special characters
Packages: Start with lower case letters. Seperated with dots
