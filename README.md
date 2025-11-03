Promt: 
If use different classes for filters and interface to be able to have OCP. Now after adding second class that uses Integer as input I get error. My first class uses String as input. 
What would you do in interface, this is how it looks. 
public interface Filter{ 
    List<Kandidat> filter(); 
}

Answer from ChatGPT:
Good question — this is about Open/Closed Principle (OCP) and making your Filter interface flexible enough to handle different filtering criteria or data types (like String vs Integer).

Right now your interface is:
public interface Filter {
    List<Kandidat> filter();
}

This is too rigid — it doesn’t accept any input, so every implementing class has to hardcode what it filters by (e.g. a specific String or Integer).
To make it open for extension but closed for modification, you can make the interface generic.

Use a Generic Parameter for Input Type
Make the interface generic so that each implementation can define what type of input it filters by:
public interface Filter<T> {
    List<Kandidat> filter(T parameter);
}
Then your implementations can look like:
// Filters Kandidat by a String (e.g., name)
public class StringFilter implements Filter<String> {}
// Filters Kandidat by an Integer (e.g., age)
public class IntegerFilter implements Filter<Integer> {}

