import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        Ceiling ceiling = new Ceiling(300, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 4, 50, 2, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 75);
        Wardrobe wardrobe = new Wardrobe(120, 200, 75.5);
        Carpet carpet = new Carpet(200, 300, PaintColor.RED);

        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, carpet, bed, lamp, wardrobe);

        System.out.println("Bedroom Name: " + bedroom.getName());
        System.out.println("Wall1 Direction: " + bedroom.getWall1().getDirection());
        System.out.println("Ceiling Height: " + bedroom.getCeiling().getHeight());
        System.out.println("Bed Style: " + bedroom.getBed().getStyle());
        System.out.println("Lamp Type: " + bedroom.getLamp().getStyle());
        System.out.println("Wardrobe Weight: " + bedroom.getWardrobe().getWeight());
        System.out.println("Carpet Color: " + bedroom.getCarpet().getColor());

        bedroom.getBed().make();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();
        bedroom.getWall1().create();
    }
}
