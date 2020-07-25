# Functional Programming using Java

----------

### Lambda Expression:

* It is an Anonymous function (nameless, without return type and without modifiers)

* Uses the symbol called arrow ->

```
public void square (int n) {
	return n*n;
}
```

above method is equivalent to

```
n -> n*n;
```

### Functional Interface

An Interface which contains Single Abstract Method is called Functional Interface. If you want to call or invoke lambda function then functional interface must be required.

### return statement in lambda expression

```
n -> return n*n; ===> invalid
n -> {return n*n;}; ===> valid
n -> {return n*n}; ===> invalid
n -> {n*n;}; ===> invalid
n -> n*n; ===> valid

* Compiler will return the value automatically.
* Without curly braces we cannot use return keyword.
* Within curly braces if we want to return a value compulsorily we should use return statement
```











