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
    /**Copyright (C) <2015> <Matthew Elbing>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
            (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
            return false
                    ;
        
        //For the future

    }


    }

