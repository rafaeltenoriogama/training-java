# Introduction

## Chars

The Java `char` type represents the smallest addressable components of text. Multiple `char`s can comprise a string such as `"word"` or `char`s can be processed independently. Their literals have single quotes e.g. `'A'`.

There are many built-in library methods to inspect and manipulate `char`s. These can be found as static methods of the `java.lang.Character` class.

`char`s are sometimes used in conjunction with a `StringBuilder` object. This object has methods that allow a string to be constructed character by character and manipulated. At the end of the process, `toString` can be called on it to output a complete string.

# Instructions

In this exercise, you will implement a partial set of utility routines to help a developer clean up SqueakyClean names.

In the 4 tasks, you will gradually build up the `clean` method. A valid SqueakyClean name is comprised of zero or more letters and underscores.

In all cases, the input string is guaranteed to be non-null. Note that the `clean` method should treat an empty string as valid.

```java
// Replace any spaces encountered with underscores
SqueakyClean.clean("my   Id");
// => "my___Id"

// Convert kebab-case to camelCase
SqueakyClean.clean("a-bc");
// => "aBc"

// Convert leetspeak to normal text
SqueakyClean.clean("H3ll0 W0rld");
// => "Hello_World"

// Omit characters that are not letters
SqueakyClean.clean("a$#.b");
// => "ab"
```
