package daily;

public class DailyReversalEntity {

	private String reversalType;

	public DailyReversalEntity() {
	}
	public DailyReversalEntity( String reversalType) {
		this.reversalType = reversalType;
	}

	public String getReversalType() {
		return reversalType;
	}

	public void setReversalType(String reversalType) {
		this.reversalType = reversalType;
	}

}
