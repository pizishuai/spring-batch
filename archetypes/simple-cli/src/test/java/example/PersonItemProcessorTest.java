/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * <p>
 * Example test case processing a {@link Person} using the {@link PersonItemProcessor}.
 * </p>
 */
public class PersonItemProcessorTest {
    @Test
    public void testProcessedPersonRecord() throws Exception {
        final Person person = new Person();
        person.setFirstName("Jane");
        person.setLastName("Doe");

        final Person processedPerson = new PersonItemProcessor().process(person);

        assertEquals("First name does not match expected value.", "JANE", processedPerson.getFirstName());
        assertEquals("Last name does not match expected value.", "DOE", processedPerson.getLastName());
    }
}
