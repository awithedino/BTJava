package Home.BTVN.w06.Ex1;
import java.lang.Math.*;

public class fraction {
    private int ts;
    private int ms;

    public fraction() {
        this.ts = 0;
        this.ms = 1;
    }

    public fraction (int ts, int ms) {
        if (ms == 0) System.out.println("Mau so khong hop le");
        else {
            this.ms = ms;
            this.ts = ts;
            smpfy();
        }
    }

    public int getTs() {
        return ts;
    }

    public void setTs (int ts) {
        this.ts = ts;
        smpfy();
    }

    public int getMs() {
        return ms;
    }

    public void setMs (int ms) {
        this.ms = ms;
        smpfy();
    }

    public void smpfy() {
        int gcd = gcd(Math.abs(ts), Math.abs(ms));
        ts /= gcd;
        ms /= gcd;

        if (ms < 0) {
            ts = -ts;
            ms = -ms;
        }
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd (b,a % b);
    }

    @Override
    public String toString() {
        if (ms == 1) return STR."\{ts}";
        return STR."\{ts}/\{ms}";
    }
}
