package ro.ase.csie.cts.seminar7.factorymethod;

import ro.ase.csie.cts.seminar7.simplefactory.SuperErouAbstract;
import ro.ase.csie.cts.seminar7.simplefactory.TipErou;

public abstract class FactoryAbstract {
    public abstract SuperErouAbstract getSuperErou(TipErou tip, String nume);
}
