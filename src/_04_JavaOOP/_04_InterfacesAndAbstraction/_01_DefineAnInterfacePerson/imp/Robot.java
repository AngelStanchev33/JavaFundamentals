package _04_JavaOOP._04_InterfacesAndAbstraction._01_DefineAnInterfacePerson.imp;

import _04_JavaOOP._04_InterfacesAndAbstraction._01_DefineAnInterfacePerson.Inferfaces.Identifiable;

public class Robot implements Identifiable {

    private String id;
    private String model;

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
