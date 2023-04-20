package com.develogical;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutPlato() throws Exception {
        assertThat(queryProcessor.process("Plato"), containsString("philosopher"));

    }

    @Test
    public void whatIsYourName() {
        assertThat(queryProcessor.process("What is your name?"), containsString("late-snow-2938"));
    }
    @Test
    public void largestNumber(){
        assertThat(queryProcessor.process("What is the largest number: 29,39,44?"), containsString("44"));

    }

    @Test
    public void largestNumber2(){
        assertThat(queryProcessor.process("What is the largest number: 39,29,44?"), containsString("44"));

    }

    @Test
    public void multiplication(){
        assertThat(queryProcessor.process("What is 8 multiplied by 42?"), containsString("336"));
    }
}
