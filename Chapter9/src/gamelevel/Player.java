package gamelevel;

public class Player {
	/*
	 * Ŭ���� �����ϱ�
	 * Player Ŭ������ PlayerLevel Ŭ������ ���� ����.
	 * ���ӿ��� ��� Player�� �ڽ��� ������ �ֱ� ������, Player Ŭ�������� PlayerLevel�� ��� ������ ���� ���̴�.
	 * ������ �ö� ���� ������ �� �ִ� ����� �޶�����.
	 * �׷��Ƿ� PlayerLevel Ŭ������ �߻� Ŭ������ ����� ��� �������� �������� �����ϴ� ����� �����ϰ�, �� �������� �޶����� ����� �߻� �޼���� ����� �д�.
	 * �׸��� PlayerLevel�� ��ӹ��� ���� Ŭ���� BeginnerLevel, AdvancedLevel, SuperLevel���� �߻� �޼���� ������ �κ��� ������ �ʿ信 �°� ��ü������ �����ϸ� �ȴ�. 
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
