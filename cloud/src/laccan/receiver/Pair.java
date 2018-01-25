package laccan.receiver;

public class Pair<F, S> {

	protected F f;
    protected S s;

    public Pair(F f, S s){
        this.f = f;
        this.s = s;
    }

    public F getFirst(){ return f; }
    public S getSecond(){ return s; }
    public void setFirst(F f){ this.f = f; }
    public void setSecond(S s){ this.s = s; }
}
