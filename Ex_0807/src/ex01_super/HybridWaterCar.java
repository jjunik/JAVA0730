package ex01_super;

public class HybridWaterCar extends HybridCar{
	int waterGauge;
	public HybridWaterCar(int gasGauge, int electricGauge, int waterGauge) {
		super(gasGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("잔여 물 량 : " + waterGauge);
	}
	

}
