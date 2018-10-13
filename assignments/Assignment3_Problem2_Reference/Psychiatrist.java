public class Psychiatrist {

    //asks a moody object about its mood
    public void examine(Moody moodyObject) {
        System.out.println("How are you feeling today?");
        moodyObject.queryMood();
    }

    //a moodyObject is observed to either laugh or cry
    public void observe(Moody moodyObject) {
        moodyObject.expressFeelings();
        System.out.println("Observation: " + moodyObject);
    }

    public static void main(String[] args) {
        Psychiatrist p = new Psychiatrist();
        Moody sad = new Sad();
        Moody happy = new Happy();
        p.examine(sad);
        p.observe(sad);
        p.examine(happy);
        p.observe(happy);
    }

}

abstract class Moody {
    protected abstract String getMood();
    protected abstract void expressFeelings();
    public void queryMood() {
        System.out.println("I feel " + getMood() + " today!");
    }
}

class Sad extends Moody{

    @Override
    protected String getMood() {
        return "sad";
    }

    @Override
    public void expressFeelings() {
        System.out.println("'wah' 'boo hoo' 'weep' 'sob' 'weep'");
    }

    @Override
    public String toString() {
        return "Subject cries a lot";
    }
}

class Happy extends Moody{

    @Override
    protected String getMood() {
        return "happy";
    }

    @Override
    public void expressFeelings() {
        System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");
    }

    @Override
    public String toString() {
        return "Subject laughs a lot";
    }
}