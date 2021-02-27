/**
 * 
 */
package assignment.ThreadAndJUnit;

/**
 * @author andrewwerling
 *
 */
public class MusicArtist implements Comparable<MusicArtist>{

	private String name;
	private Integer numberOfSongs;
	private Integer netWorth;

	public MusicArtist(String name, Integer numberOfSongs, Integer netWorth) {
		this.name = name;
		this.numberOfSongs = numberOfSongs;
		this.netWorth = netWorth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberOfSongs() {
		return numberOfSongs;
	}

	public void setNumberOfSongs(Integer numberOfSongs) {
		this.numberOfSongs = numberOfSongs;
	}

	public Integer getnetWorth() {
		return netWorth;
	}

	public void setnetWorth(Integer netWorth) {
		this.netWorth = netWorth;
	}

	@Override
	public String toString() {
		return "Recording Artist:" + name + "\nnumberOfSongs:" + numberOfSongs + "\nnetWorth:" + netWorth + "]";
	}

	@Override
	public int compareTo(MusicArtist o) {
		return this.netWorth - o.netWorth;
	}

}
