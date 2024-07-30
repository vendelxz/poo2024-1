package br.ufpb.banco.uml;
import java.lang.Comparable;

public interface ComparableB extends Comparable<ComparableB> {
    public int CompareTo(ComparableB other);
}
