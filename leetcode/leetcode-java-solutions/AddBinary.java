class Solution {
    public String addBinary(String a, String b) {
        ArrayList<String> answerArr = new ArrayList<>();
        int carry = 0;
        if (a.length() > b.length()) {
            String longestString = a.length > b.length ? a : b;
            if (longestString == a) {
                b = "0".repeat(a.length()-b.length()) + b;
            } else {
                a = "0".repeat(b.length()-a.length()) + a;
            }
        }
        System.out.println(a);
        System.out.println(b);
        for (int i = a.length()-1; i>=0; i--) {
            switch(Integer.parseInt(a[i]) + Integer.parseInt(b[i]) {
                case 2:
                    if (carry == 1) {
                        answerArr.add(0, "1");
                        carry = 1
                    } else {
                        carry = 1;
                        answerArr.add(0, "0")
                    }
                    break
                case 0:
                    if (carry == 1) {
                        answerArr.add(0, "1");
                        carry = 0;
                    } else {
                        answerArr.add(0, "0");
                    }
                    break;
                case 1:
                    if (carry == 1) {
                        answerArr.add(0, "0");
                    } else {
                        answerArr.add(0, "1");
                    }
                    break;

            })
            if (i == 0 && carry == 1) {
                answerArr.add(0, "1");
            }
        }
        System.out.println(answerArr.join(""));
        return answerArr.join("");
    }
}