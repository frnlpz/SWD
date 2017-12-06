# Lab work #2

### Exercise 1

Design a class called _Employee_ which has to have:

  **Employeeid** : Integer

  **LoginName**  : String
  
  **Password**   : String
  
  **Department** : String
  
  **FirstName**  : String
  
  **LastName**   : String

Fields should be encapsulated. Test the Employee class.

### Exercise 2

Supplement designed class with the code that ensures Password lenght to be more than 8 characters long.

### Exercise 3

Design a class called _Stopwatch_. The job of this class is to simulate a stopwatch.
It should provide two methods: **Start** and **Stop**.

We call the start method first, and the stop method next.
Then we ask the stopwatch about the duration between start and stop.
Duration should be a value in **TimeSpan**.
Display the duration on the console.

We should also be able to use a stopwatch multiple times. So we may start and stop it and then start and stop it again.
Make sure the duration value each time is calculated properly.

We should not be able to start a stopwatch twice in a row (because that may overwrite the initial start time).
