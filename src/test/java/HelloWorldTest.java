import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HelloWorldTest {

    @Test
    public void greetingShouldBeHelloWorld() {
        HelloWorld greeter = new HelloWorld();
        String greeting = greeter.getGreeting();
        assertThat(greeting, equalTo("Hello world!"));
    }
}
