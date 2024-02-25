package prueba.crud_spring.interfaceService;

public interface isGalpon {
    public List<mGalpon>listsa();
    public Optional<mGalpon>listaid(int id);
    public int save(mGalpon mG);
    public void delete (int id);
}
