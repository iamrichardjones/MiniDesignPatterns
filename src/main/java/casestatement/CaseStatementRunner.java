package casestatement;

/**
 * Created by jones on 24/11/2015.
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
