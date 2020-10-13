package cn.base.base32;

public class RabinKarp {
    public int indexOf(String s, String t) {
        int resHash = t.hashCode();
        int len = t.length();
        for (int i = 0; i <= s.length() - len; i++) {
            String tmp = s.substring(i, i + len);
            if (tmp.hashCode() == resHash && tmp.equals(t))
                return i;
        }
        return -1;
    }
}
