package pairandtriplet;

/**
 * Util class used as a mini-design pattern.
 *
 * The purpose of this class is pure laziness. You may have method that you want to return three values from. Do you
 * really want to return a new object or even worse an array? With this class you can return any values you want
 * in a simple manor. The one anti-pattern I see here is the fact that the getters and the parameters are not named
 * in a more "coder friendly" way. They are simple one, two, and three.
 *
 * Here I am making the parameters public so the coder can access them in a simpler form. It may go against convention
 * but they are final so I feel this is ok (although feel free to disagree ;) )
 */
public class Triplet<K, U, V> {

    public final K one;
    public final U two;
    public final V three;

    public Triplet(K one, U two, V three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    public K getOne() {
        return one;
    }

    public U getTwo() {
        return two;
    }

    public V getThree() {
        return three;
    }
}
