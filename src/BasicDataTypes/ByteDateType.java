package basicdatatypes;

/**
 * Byte data type is an 8-bit signed two's complement integer
 * Binary (0000 0000)
 * Hex (0x00)
 * 
 * Minimum value is -128 (-2^7)
 * 
 * Maximum value is 127 (inclusive)(2^7 -1)
 * 
 * Default value is 0
 * 
 * Byte data type is used to save space in large arrays, mainly in place of
 * integers, since a byte is four times smaller than an integer.
 */
public class ByteDateType {
    private byte one = 127;

    public byte getOne() {
        return one;
    }

    public void setOne(byte one) {
        this.one = one;
    }

    /**
     * Ask yourself why we need to return an int in this case?
     * Why cant we return a byte back?
     * 
     * @param first  num
     * @param second num
     * @return sum of nums
     */
    public int addTwoBytes(byte first, byte second) {
        return first + second;
    }
}
