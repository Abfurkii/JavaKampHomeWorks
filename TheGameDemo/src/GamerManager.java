public class GamerManager implements GamerService{
	private EDevletSystem eDevletSystem;
	public GamerManager(EDevletSystem eDevletSystem) {
		this.eDevletSystem=eDevletSystem;
	}
	@Override
	public void add(Gamer gamer) {
		if (eDevletSystem.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName()+" ki�isi eklendi.");
		}else {
			System.out.println("B�yle bir ki�i bulunmamaktad�r.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		if(eDevletSystem.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName()+" ki�isi silindi.");
		}else {
			System.out.println("B�yle bir ki�i bulunmamaktad�r.");
		}
	}

	@Override
	public void update(Gamer gamer) {
		if(eDevletSystem.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName()+" ki�isi g�ncellendi.");
		}else {
			System.out.println("B�yle bir ki�i bulunmamaktad�r.");
		}
	}

}
