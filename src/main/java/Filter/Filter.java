package Filter;

import Models.Kandidat;
import java.util.List;

/*ChatGPT hjälp
Jag visste att jag behöver en interface för att kunna ha möjlighet att lägga till
flera filter klasser. När jag gjorde det så fungerade kod med endast ett Filter klass.

När jag skulle utöka till en filter till blev det error i kod. Med hjälp av Ai sa den att jag
behöver kunna mata in olika typer av parameter då Branch är String medans Experience är Integer.
Så frågade jag Ai hur kan fixa det och då rättade Ai från min kod:

public interface Filter {
List<Kandidat> filter();
}

till denna här*/
public interface Filter <T>{
    List<Kandidat> filter(T parameter);

    List<Kandidat> filter(int yearsExperience);
}
