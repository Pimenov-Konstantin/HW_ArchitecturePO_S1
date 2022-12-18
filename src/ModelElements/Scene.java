package ModelElements;

import java.util.ArrayList;

public class Scene<Type1, Type2> {

    public int Id;
    public ArrayList<PoligonaModel> models = new ArrayList<>();
    public ArrayList<Flash> flashes = new ArrayList<>();
    public ArrayList<Camera> cameras = new ArrayList<>();

    public Scene(PoligonaModel inputModels, Camera inputCameras) {
        models.add(inputModels);
        cameras.add(inputCameras);
    }

    public Type1 method1(Type1 t) {
        return t;
    }

    public Type1 method1(Type1 t1, Type2 t2) {
        return t1;
    }
}
