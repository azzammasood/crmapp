
package com.web.appts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(
		name = "wheel_color"
)
@Cache(
		usage = CacheConcurrencyStrategy.READ_WRITE
)
public class WheelColor {
	@Id
	private long id;
	@Column(
			name = "Kleurnaam"
	)
	private String colorName;
	@Column(
			name = "codevert"
	)
	private String codeVert;
	@Column(
			name = "codepoeder"
	)
	private String codePoeder;
	@Column(
			name = "red"
	)
	private int red;
	@Column(
			name = "green"
	)
	private int green;
	@Column(
			name = "blue"
	)
	private int blue;

	public WheelColor() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getColorName() {
		return this.colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public String getCodeVert() {
		return this.codeVert;
	}

	public void setCodeVert(String codeVert) {
		this.codeVert = codeVert;
	}

	public String getCodePoeder() {
		return this.codePoeder;
	}

	public void setCodePoeder(String codePoeder) {
		this.codePoeder = codePoeder;
	}

	public int getRed() {
		return this.red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return this.green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getBlue() {
		return this.blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}
}
