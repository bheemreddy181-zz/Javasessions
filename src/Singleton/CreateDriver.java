package Singleton;


public class CreateDriver {

    private static CreateDriver instance;

	// constructor
    private CreateDriver() {
    }

    /**
     * getInstance method to retrieve active driver instance
     *
     * @return CreateDriver
     */
    public static CreateDriver getInstance() {
        if ( instance == null ) {
            instance = new CreateDriver();
        }

        return instance;
    }
}
