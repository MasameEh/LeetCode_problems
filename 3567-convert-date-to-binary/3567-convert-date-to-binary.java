class Solution {
    public String convertDateToBinary(String date) {
        String y = date.substring(0,4);
        String m = date.substring(5,7);
        String d = date.substring(8,10);

        StringBuilder stringBinary = new StringBuilder();

        stringBinary.append(Integer.toBinaryString(Integer.parseInt(y)));
        stringBinary.append("-");
        stringBinary.append(Integer.toBinaryString(Integer.parseInt(m)));
        stringBinary.append("-");
        stringBinary.append(Integer.toBinaryString(Integer.parseInt(d)));

        return stringBinary.toString();

    }
}