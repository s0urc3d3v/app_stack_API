/**
 * Created by matthewelbing on 5/28/15.
 */
public class stack {
    /**
     * Not that this currently is only for use with Integers and will be
     * expanded soon.  This means that null is replaced by
     * 0 as the
     * denotation
     *
     */

    int[] stack = new int[512];

    public boolean pop(int pos)
    {
        stack[pos] = 0;
        if (stack[pos] == 0) {
            return true;
        }
        else {
            return false
                    ;
        }

    }
    public boolean add(int pos, int value){
        stack[pos] = value;
        if (stack[pos] == value) {
            return true;
        }
        else {
            return false;
        }

    }
    public boolean mod(
            int[] values, int[] posistions, int types[]){

        //For the future

    }


    }

}
