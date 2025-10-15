
package problem2;

public class IntegerList
{
    private static int currentSize;
    private static int currentNumberInt;
    int[] list; //values in the list
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {

        list = new int[size];
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    public int[] increaseSize(){
        int[] intList = new int[2*list.length];
        for(int i = 0;i<list.length;i++){
            intList[i] = list[i];
        }
        return intList;
    }
    public void addElement(int newVal){
        if (list.length <= currentSize){
            list = increaseSize();

        }
        list[currentSize] = newVal;
        currentSize++;

    }
    public void removeAll(int newVal){
        int i = 0;
        while(i<currentSize){
            if(list[i] == newVal){
                for(int j = i;j<currentSize-1;j++){
                    list[j] = list[j+1];

                }
                currentSize--;
            }
            else{i++;}
        }
        for(int k = currentSize;k<list.length;k++){
            list[k] = 0;

        }
    }
    public void removeFirst(int newVal){
        for(int i = 0;i<currentSize;i++){
            if (list[i] == newVal){
                for(int j = i;j<currentSize-1;j++){
                    list[j] = list[j+1];

                }
                currentSize--;
                break;
            }
        }
        for(int k = currentSize;k<list.length;k++){
            list[k] = 0;

        }

    }
}

