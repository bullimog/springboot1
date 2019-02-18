package controllers;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import connectors.MongoConnection;
import connectors.DatabaseConnection;

import org.junit.Test;

public class TestGreetingsMockito {

    @Test
    public void testFindTheGreatestFromAllData() {
        DatabaseConnection dataServiceMock = mock(DatabaseConnection.class);
        when(dataServiceMock.getData("my query")).thenReturn("Test Data");
        GreetingController gc = new GreetingController(dataServiceMock);
        String result = gc.getSomeData("my query");
        assertEquals("Test Data", result);
    }

}