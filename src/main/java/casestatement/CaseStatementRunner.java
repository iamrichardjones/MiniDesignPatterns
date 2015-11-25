package casestatement;

/**
 * Most often case statements have a list of valid inputs then a default section. If there is a programmer error
 * and the default section is called (and there is nothing entered in that part) then it can cause hard to find
 * bugs later on.
 * I recommend throwing an exception rather than having a blank default statement
 */
public class CaseStatementRunner {


    public static Integer callCaseStatement(Integer input) {
        if (input == null) {
            IllegalArgumentException iae = new IllegalArgumentException();
            iae.initCause(new NullPointerException());
            throw iae;
        }
        switch(input) {
            case 1: return 1;
            case 2: return 2;
            default : throw new IllegalArgumentException(String.format("Input not valid %s", input));
        }
    }

}
