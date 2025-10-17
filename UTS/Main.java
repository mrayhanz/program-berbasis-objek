public class Main {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();

        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println(b.getBarrierInfo());
        System.out.println("-----------------------");

        int i = 1;
        while (true) {
            System.out.println("=== Penghancuran ke-" + i + " ===");
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);

            System.out.println(wz.getZombieInfo());
            System.out.println(jz.getZombieInfo());
            System.out.println(b.getBarrierInfo());
            System.out.println();

            if (wz.health <= 0 || jz.health <= 0 || b.getStrength() <= 0) {
                break;
            }
            i++;
        }    
    }
}
