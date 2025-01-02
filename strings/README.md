# Strings.

- Strings in java are the types of objects which can store characters as elements.

- String objects are immutable in java because java uses the concept of string literals. This allows for safe multithreading as no single reference can alter the value of the object.

- Java uses the concep of string literals as it is more memory efficient.

- They are immutable.

- They sre stored in the String Constant Pool which is a special memory area within the heap where String literals are stores. It optimizes memory usage by storing only one copy of each distinct literal.

- Strings created with the new Keyword are not stored in the pool but in the heap, unless explicitly interened.

- String pool was moved form the PermGen to the normal heap area as the PermGen has a limited space of 64MBs.

- Strings are used for small and unchanging strings.
- StringBuffer are mutable, synchronized(for thread safety) used in multi-threaded envronments when thread safety is needed.
- StringBuilder are mutable and not threa-safe used in single-threaded environments for better performance.