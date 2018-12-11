# Analysis of Kotlin

- Matt McColeman
- matthew.mccoleman@uoit.net

## About the language

> _Describe the language_
Kotlin is both an object oriented language and a functional programming language. It is an OSS statically typed programming language that targets the JVM, JavaScript, Native and Android. Developed by JetBrains, the project began an open source project very early on in 2010. Kotlin's first official 1.0 release was in February 2016. Kotlin has advantages over Java such as being more concise by estimates of about 40% less lines of code compared to Java when converted. Kotlin is also more type-safe than Java. More interesting features include smart casting, extension functions, higher-order functions and lambdas with receivers provide the ability to write expressive code as well as facilitating creation of domain-specific languages. Also Kotlin is 100% interoperable with Java. There is even a Java-to-Kotlin converter built into the IDE. Kotlin is used for any kind of development. It can be used for server-side, client-side web and Android. Once development of Kotlin/Native finishes, it will support other platforms such as embedded systems, macOS and iOS. The most popular uses of Kotlin is for mobile and server-side applications, client-side with JavaScript or JavaFX, and data science.
>
> - History
> - Some interesting features

## About the syntax

> _give some code snippet of the language_

*function with unit return type and int params*

```Kotlin
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}
```

## About the tools

Kotlin can be used in multiple IDE's such as Android Studio, IntelliJ Idea and Eclipse. Kotlin can also be run from the command line by downloading the standalone compiler. The following commands compile then excute an example.kt file. 
$ kotlinc example.kt
$ kotlin exampleKt
One could also run a REPL by opening the terminal and using the command kotlinc-jvm. Kotlin is also used for scripts when saved with the extension ".kts". 

> _Describe the compiler or interpreter needed_.

## About the standard library

> _Give some examples of the functions and data structures
> offered by the standard library_.
The kotlin standard library offers data structures such as lists, 
mutable lists and hashsets. Kotlin has the function sort() which can be applied to arrays and other data structures by their data type. 

## About open source library

> _Describe at least one contribution by the open source
community written in the language._

Graphql-kotlin is a kotlin open source library. This library has 
features that allow developers to generate all required GraphQL 
information. Because of the similarites between Kotlin and
GraphQL such as the ability to define nullable/non-nullable types.
Graphql-kotlin can be used to generate schemas with the function
toSchema.


# Analysis of the language

> _Organize your report according to the project description
document_.

1. Kotlin is a good programming language because it supports both
functional and procedural programming language. As procedural
language 
2.
3.
4. Kotlin appears as a dynamic scoping language. When declaring
variables one can use either val or var. the use of val creates
an immutable value while using var allows for a mutable object.
Var can be changed within subscopes or the scope it is declared in.
Var or val declarations are also allowed in parrallel scopes.
5. 
6. Kotlin allows for dynamic typing as it does not require a
specification at declaration, but rather attains the type when the 
value with its type is assigned.
7. Kotlin has many strengths since for the most part it can do
everything Java, an industry standard, can do, yet in a more
concise manner.


