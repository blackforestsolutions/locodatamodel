package de.blackforestsolutions.datamodel;

import de.blackforestsolutions.datamodel.util.objectmothers.ProblemObjectMother;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProblemTest {

    @Test
    void test_Problem_copy_constructor_with_complete_object_returns_copy() {
        Problem testData = ProblemObjectMother.getProblem();

        Problem result = new Problem(testData);

        assertThat(result).isEqualToComparingFieldByField(testData);
    }
}
