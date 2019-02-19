package models.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.Assert.assertEquals;

/*
 * Test example for Inversion of control for configuration.
 */
public class TestIoc {

    @Test
    public void testIoc() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        //Company is a @Component
        Company company = context.getBean("company", Company.class);

        assertEquals("High Street", company.getAddress().getStreet());
        assertEquals(1000, company.getAddress().getNumber());
        assertEquals("Tom's Hardware", company.getName());
    }
}
