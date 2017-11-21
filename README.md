# JUnit 5 training

This is starter project for after course tasks on JUnit 5 training.

## Tasks

1. Test BookService class. Use Mockito to mock BookDAO that is not implemented yet.

2. Write tests that will use 2 separate threads. Each thread should call many BookService operations. Annotate test to be executed 10 times. Annotate test so that by default it will not be executed because it takes too much time to complete.

3. Write MockitoInitializer class that when used as extension like below:
```
@ExtendWith(MockitoInitializer.class)
public someClass {

}
```
Will initialized all mocks inside that class.

4. Write annotation @Timeout and it's implementation, that when added to test, it will fail if test will take more that 100 ms. For example:
```
@ExtendWith(...)
public class Example

...

@Test
@Timeout
public void testSomething() {
 // Test will fail if takes longer that 100 ms because of @Timeout annotation.
}
```

## Solution
https://github.com/piotrwdowiak/junit5-training-solution
