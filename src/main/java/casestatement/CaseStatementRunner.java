package casestatement;

/**
 * This mini-design pattern helps find programmer errors when the default section of a case statement is executed.
 * Most often case statements have a list of valid inputs then a default section. If the code/reviewer missing one
 * section on the case statement then the default section is called (and there is nothing entered in that part)
 * This can cause hard to find bugs later on.
 *
 * I recommend throwing an exception rather than having a blank default statement. If the case statement can be
 * extended then this is a better pattern than relying on default
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
