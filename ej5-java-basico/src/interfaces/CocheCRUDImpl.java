package interfaces;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Estoy llamando al método save");
    }

    @Override
    public void findAll() {
        System.out.println("Estoy llamando al método findAll");
    }

    @Override
    public void delete() {
        System.out.println("Estoy llamando al método delete");
    }
}
