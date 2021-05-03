
public class StudentCampaign implements CampaignBase{
	private double rate;
	public StudentCampaign(double rate) {
		this.rate=rate;
	}
	
	@Override
	public void applyCampaign(Game game) {
		System.out.println(game.getName()+" oyununa "+"%"+rate+" indirim uyguland� yeni fiyat: "+(game.getPrice()-game.getPrice()*rate/100));
	}
}
