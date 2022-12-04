package gamelevel;

public class Player {
	/*
	 * 클래스 설계하기
	 * Player 클래스와 PlayerLevel 클래스는 포함 관계.
	 * 게임에서 모든 Player는 자신의 레벨이 있기 때문에, Player 클래스에서 PlayerLevel을 멤버 변수로 갖는 것이다.
	 * 레벨이 올라갈 수록 수행할 수 있는 기능이 달라진다.
	 * 그러므로 PlayerLevel 클래스를 추상 클래스로 만들어 모든 레벨에서 공통으로 수행하는 기능을 구현하고, 각 레벨마다 달라지는 기능은 추상 메서드로 만들어 둔다.
	 * 그리고 PlayerLevel을 상속받은 하위 클래스 BeginnerLevel, AdvancedLevel, SuperLevel에서 추상 메서드로 선언한 부분을 나름의 필요에 맞게 구체적으로 구현하면 된다. 
	 */
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
