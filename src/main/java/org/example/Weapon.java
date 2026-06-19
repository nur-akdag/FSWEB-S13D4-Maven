package org.example;

public enum Weapon {
        SWORD(10, 1.5),
        SHIELD(5, 1.0),
        AXE(15, 0.8);

        private final int damage;
        private final double attackSpeed;

        Weapon(int damage, double attackSpeed) {
            this.damage = damage;
            this.attackSpeed = attackSpeed;
        }

        public int getDamage() {
            return this.damage;
        }

        public double getAttackSpeed() {
            return this.attackSpeed;
        }

    }

