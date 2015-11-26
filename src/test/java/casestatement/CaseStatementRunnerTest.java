package casestatement;

import org.junit.Test;

public class CaseStatementRunnerTest {

    @Test (expected = IllegalArgumentException.class)
    public void test_ThrowsExceptionIfNullInput() {
        CaseStatementRunner.callCaseStatement(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void test_ThrowsExceptionIfInvalidInput() {
        CaseStatementRunner.callCaseStatement(3);
    }

    @Test
    public void test_DoesNotThrowsExceptionIfValidInput() {
        CaseStatementRunner.callCaseStatement(1);
        CaseStatementRunner.callCaseStatement(2);
    }
}
