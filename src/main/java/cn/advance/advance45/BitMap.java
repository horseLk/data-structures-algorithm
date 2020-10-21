package cn.advance.advance45;

/**
 * 位图的数据结构
 */
public class BitMap {
    private byte[] bytes; // 用于保存若干个二进制位
    private int nbits; // 数据范围内数据的总个数

    public BitMap(int nbits) {
        this.nbits = nbits;
        this.bytes = new byte[nbits / 8 + 1];
    }

    public void set(int k) {
        if (k > nbits) throw new IllegalArgumentException();
        int byteIndex = k / 8;
        int bitIndex = k % 8;
        bytes[byteIndex] |= (1 << bitIndex);
    }

    public boolean get(int k) {
        if (k > nbits) throw new NullPointerException();
        int byteIndex = k / 8;
        int bitIndex = k % 8;
        return (bytes[byteIndex] & (1 << bitIndex)) == 1;
    }
}
