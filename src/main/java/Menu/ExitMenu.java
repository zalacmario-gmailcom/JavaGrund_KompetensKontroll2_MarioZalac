package Menu;

public class ExitMenu implements Entry {
    @Override
    public String description() {
        return "Avsluta";
    }

    @Override
    public void execute() {
        System.out.println("Avslutas...");
        System.exit(0);
    }
}
