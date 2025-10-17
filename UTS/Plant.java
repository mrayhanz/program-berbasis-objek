public class Plant {

    public void doDestroy(Object obj) {
        if (obj instanceof Zombie) {
            Zombie z = (Zombie) obj;
            z.destroyed();
            if (z.health == 0) {
                System.out.println("Zombie kalah!");
            }
        } else if (obj instanceof Barrier) {
            Barrier b = (Barrier) obj;
            b.destroyed();
            if (b.getStrength() == 0) {
                System.out.println("Barrier kalah!");
            }
        }
    }
}
