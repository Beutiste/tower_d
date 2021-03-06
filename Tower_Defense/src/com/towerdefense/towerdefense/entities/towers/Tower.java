package com.towerdefense.towerdefense.entities.towers;

import com.towerdefense.towerdefense.entities.EntityType;

public abstract class Tower {

	private int cost;

	private int damageValue;

	private int reloadCooldown;

	private int rangeValue;

	private int healthPoints;

	private EntityType damageType;

	public int getCost() {
		return cost;
	}

	public EntityType getDamageType() {
		return damageType;
	}

	public int getDamageValue() {
		return damageValue;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public int getRangeValue() {
		return rangeValue;
	}

	public int getReloadCooldown() {
		return reloadCooldown;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setDamageType(EntityType damageType) {
		this.damageType = damageType;
	}

	public void setDamageValue(int damageValue) {
		this.damageValue = damageValue;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public void setRangeValue(int rangeValue) {
		this.rangeValue = rangeValue;
	}

	public void setReloadCooldown(int reloadCooldown) {
		this.reloadCooldown = reloadCooldown;
	}

}
