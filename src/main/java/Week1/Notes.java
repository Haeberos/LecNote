package Week1;

public record Notes() {
    // A Maven is a "Build tool" helps compile code, fetch code and incorporate it
    // The file pom.xml controls how the project is compiled and designates any extra needed directories
    // The xml is made up of "elements" with their own formatting <element>content<element>
    // elements can contain other elements
    // Adding a dependency, which is a directory we want to add, uses this formatting:

    // <dependencies>
        // <dependency>
            // <groupId>edu.minneapolis</groupId>
            // <artifactId>input-utils</artifactId>
            // <version>1.0.2</version>
    // <dependencies>

    // Update maven changes as you add or change the xml file
    // The new directory will equip your project with new and exciting functions and utilities


    // If statements operate similarly to Python, and operators are also similar, like '=='
    // If statements use boolean data types
    // Conditional code only runs if the boolean is True
    // This also applies to booleans like =! which will only return as TRUE if the condition is NOT TRUE

    // Remember that == is not always the correct comparison operator, because they ask if two strings are exactly alike
    // Sometimes we want to probe for similar strings. use example.equals() in this case

    // Sometimes you want to test for other answers, multiple answers, and give different responses for those answers
    // Else / Elseif / && are useful tools for more complicated queries
    // '||' is the same as 'OR' for conditional code
}
