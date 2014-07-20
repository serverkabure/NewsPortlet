package newsportlet.links;

import java.io.Serializable;

public class TreeItem implements Serializable {
	/**
	 * serial id for serialisation versioning
	 */
	private static final long serialVersionUID = 1L;

	private int id;

	private String name;

	private String isoCode;

	private String description;

	/**
	 * @param id
	 *            The id.
	 * @param name
	 *            The name.
	 * @param isoCode
	 *            The isoCode.
	 * @param description
	 *            The description.
	 */
	public TreeItem(int id, String name, String isoCode, String description) {
		this.id = id;
		this.name = name;
		this.isoCode = isoCode;
		this.description = description;
	}

	/**
	 * @return Returns the description.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            The description to set.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return Returns the id.
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            The id to set.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return Returns the isoCode.
	 */
	public String getIsoCode() {
		return isoCode;
	}

	/**
	 * @param isoCode
	 *            The isoCode to set.
	 */
	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}

	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}
}