package introTask;

import java.util.regex.Matcher;

public class OutOfRangeOfDataTypeException extends Exception {

    OutOfRangeOfDataTypeException () {}

    OutOfRangeOfDataTypeException (String exceptionMessage){
        super(exceptionMessage);
    }

    public static OutOfRangeOfDataTypeException none() {
        return new OutOfRangeOfDataTypeException();
    }
}
