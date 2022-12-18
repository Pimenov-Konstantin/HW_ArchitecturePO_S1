package ModelElements;

import Stuff.Point3D;

public class PoligonaModel {
    public Poligon pologons;
    public Texture textures;

    // конструктор

    public PoligonaModel(Texture inputTexture) {
        pologons = new Poligon(new Point3D());
        textures = inputTexture;
    }
}
