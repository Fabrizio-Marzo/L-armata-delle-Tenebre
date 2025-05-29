package model.armory.weapon;

import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class FactoryWeapon {
    
    public Weapon createPistol(final Pair<Double,Double> posWeapon){
        final double cooldownMillis = 450; 
        final int shotsPerFire = 1;
        return new Pistol(new MutablePair<>(posWeapon.getLeft(), posWeapon.getRight()), 
                          cooldownMillis,
                          shotsPerFire);
    }

}
