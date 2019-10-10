## Value

* Basic implementation: 10 points
* Basic unit tests: 5 points
* Extra credit implementation: 5 points
* Extra credit unit tests: 5 points

## Basic task

In this task, you will implement and test a method that constructs and returns an array that contains only those values in an input array that fall between an inclusive lower bound and an exclusive upper bound.

### Implementation

In the `edu.cnm.deepdive.Filter` class, the `bandpass` method is declared with the following signature, return type, and modifiers:

```java
public static int[] bandpass(int[] data, int lowerBound, int upperBound)
```

For more method declaration details, see the [Javadoc documentation](docs/api/edu/cnm/deepdive/Filter.html#bandpass(int%5B%5D,int,int)).

For the basic task, complete the implementation of this method, according to the following specifications:

* The returned array must include _no_ values that are less than `lowerBound`, or greater than or equal to `upperBound`.

* The length of the returned array must be equal to the number of values in `data` that satisfy the filter criteria&mdash;that is, those values in `data` that are greater than or equal to `lowerBound`, and less than `upperBound`.

* The values in the returned array must be in the same order as those in `data`.

For example, the code fragment

```java
int[] filteredData = Filter.bandpass(new int[] {1, 8, 7, 10}, 3, 9);
System.out.println(Arrays.toString(filteredData));
```

would print 

```
[8, 7]
```

(Please do not be confused by the use of the word "print", above. Your task is _not_ to write code that prints anything; instead, your task is to complete the implementation of the `bandpass` method so that it returns the expected result for any given input.)

### Unit tests

For unit testing credit, use JUnit5 to verify your code with the following inputs and expected outputs:

| `data` | `lowerBound` | `upperBound` | Expected return value |
|:------:|:------------:|:------------:|:---------------------:|
| `{1, 10, 2, 9, 3, 8, 4, 7, 5, 6}` | `3` | `7` | `{3, 4, 5, 6}` |
| `{1, 10, 2, 9, 3, 8, 4, 7, 5, 6}` | `4` | `4` | `{}` |
| `{1, 10, 2, 9, 3, 8, 4, 7, 5, 6}` | `Integer.MIN_VALUE` | `Integer.MAX_VALUE` | `{1, 10, 2, 9, 3, 8, 4, 7, 5, 6}` |

In evaluating your implementation, we reserve the right to include additional test cases; code that satisfies the requirements stated above should pass all such additional tests.
 
### Hints 

* The `Filter.bandpass` method to be completed is `static`; there is no need to create instances of `Filter` (and arguably no benefit in doing so). 

* You may find it useful to create one or more additional `static` methods as “helpers”; the problem can be solved without doing so, however.

* Don't hesitate to declare any constants (`static final` fields) that you feel might simplify or clarify your code.

* If you use a `List<Integer>` to keep track of all the values that satisfy the filter criteria, with the intent of constructing an `int[]` from the list contents, and then returning the array, remember that the `List.toArray` method is not capable of creating an array of primitives. However, even without the use of the `List.toArray` method, it is not difficult to construct an `int[]`, and then transfer the contents of a `List<Integer>` to the array.

* Don't forget that `Arrays.copyOf` can be used to create a new array that contains a portion of an existing array. So, for example, if you have an array of length <code>n</code>, but you only want to return the first <code>m</code> values from the array, you can use `Arrays.copyOf` to do so.

* The method to be completed includes a `TODO` comment to that effect.    

* In unit testing, when comparing an array returned from a method to an array of expected values, one of the `assertArrayEquals` methods (in the `org.junit.jupiter.api.Assertions` class) is better suited to the task than any of the `assertEquals` methods.    

## Extra credit 

In this task, you will implement and test a method that smooths an input `int[]`, returning an `int[]` of the same size, where each element (apart from the first and last values) is computed as a weighted average of the corresponding element and adjacent elements in the input data.

### Implementation

For extra credit, complete the implementation of the `smooth` method of the `edu.cnm.deepdive.Filter` class. This method is declared with the following signature, return type, and modifiers:

```java
public static int[] smooth(int[] data)
```

For more method declaration details, see the [Javadoc documentation](docs/api/edu/cnm/deepdive/Filter.html#smooth(int%5B%5D)).

The required functionality of this method is as follows:

* For all `i`, where `0 < i < data.length -1`, the value of element `i` in the returned array must be computed as

    ```java
    Math.round((data[i - 1] + 2 * data[i] + data[i + 1]) / 4f)
    ```

* For `i = 0` and `i = data.length - 1`, the value of element `i` in the returned array is simply the value of `data[i]`.

For example, the code fragment

```java
int[] smoothed = Filter.smooth(new int[] {2, 1, 8, 7, 10});
System.out.println(Arrays.toString(smoothed));
```

would print 

```
[2, 3, 6, 8, 10]
```

(Please do not be confused by the use of the word "print", above. Your task is _not_ to write code that prints anything; instead, your task is to complete the implementation of the `smooth` method so that it returns the expected result for any given input.)

### Unit tests

For unit testing credit on the extra credit portion of the problem, use JUnit5 to verify your code with the following inputs and expected outputs:

| `data` | Expected return value |
|:------:|:---------------------:|
| `{2, 1, 8, 7, 10}` | `{2, 3, 6, 8, 10}` |
| `{1, 8, 7, 10}` | `{1, 6, 8, 10}` |
| `{10, 8, 10}` | `{10, 9, 10}` |

In evaluating your implementation, we reserve the right to include additional test cases; code that satisfies the requirements stated above should pass all such additional tests.

### Hints

* The `Filter.smooth` method to be completed is `static`; there is no need to create instances of `Filter` (and arguably no benefit in doing so). 

* You may find it useful to create one or more additional `static` methods as “helpers”; the problem can be solved without doing so, however.

* Don't hesitate to declare any constants (`static final` fields) that you feel might simplify or clarify your code.

* Since the array returned must have the same length as the input, and has the same first and last values, one simple way to create the output array&mdash;before processing the non-endpoint values&mdash;is to use the `Arrays.copyOf` method.

* The method to be completed includes a `TODO` comment to that effect.    

* In unit testing, when comparing an array returned from a method to an array of expected values, one of the `assertArrayEquals` methods (in the `org.junit.jupiter.api.Assertions` class) is better suited to the task than any of the `assertEquals` methods.    
