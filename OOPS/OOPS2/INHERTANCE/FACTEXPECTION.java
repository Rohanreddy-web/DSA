package OOPS2.INHERTANCE;

public class FACTEXPECTION extends Exception {
public FACTEXPECTION(String string) {
        super(string);
    }

private static final long expectionid=12345678910l;

public static long getExpectionid() {
    return expectionid;
}

}
