public class Adapter extends complexActions implements simpleActions{
    @Override
    public void talk() {
        talkLoud();
    }

    @Override
    public void walk() {
        walkSlow();
    }
}
