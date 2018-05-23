import java.util.*;
private static void validate(Object from, Object to) throws JSONException 
{
    if ((from == null && to == null)
            || (isEmpty(from) && isEmpty(to))) 
            {
        throw new JSONException("\"from\" or \"to\" has to be specified in range filter");
    }
    if (!isEmpty(from)) {
        validateRange(from);
    }
    if (!isEmpty(to)) {
        validateRange(to);
    }
}

private static void validateRange(Object range) throws JSONException
{
 
    if (range instanceof String)
    {
        String input = (String) range;
     
        if (!input.matches("^[0-9]{4}-[0-9]{2}-[0-9]{2}T[0-9]{2}:[0-9]{2}:[0-9]{2}Z$"))
        {
            throw new JSONException("range check field is not a valid date");
        }
    }
}
private static boolean isEmpty(Object range) throws JSONException{
 
    if (!(range instanceof Number) || !(range instanceof String))
    {
        throw new JSONException("From and To in range can be only of type Date or Integer");
    }

    if (range instanceof String) {
        return ((String) range).trim().isEmpty();
    } else 
    { return true();
    }
    
