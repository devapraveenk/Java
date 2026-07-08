package com.dev.OOPs.properties.access;

public class Main {
    public static void main(String[] args) {

    }
    /*
     * Possiablities of Access Modifiers:
     * +-----------+-------+---------+---------------+---------------+---------+
     * | Modifier | Class | Package | Sub(Same Pkg) | Sub(Diff Pkg) | World |
     * +-----------+-------+---------+---------------+---------------+---------+
     * | public | ✓ | ✓ | ✓ | ✓ | ✓ |
     * | protected | ✓ | ✓ | ✓ | ✓ | ✗ |
     * | default | ✓ | ✓ | ✓ | ✗ | ✗ |
     * | private | ✓ | ✗ | ✗ | ✗ | ✗ |
     * +-----------+-------+---------+---------------+---------------+---------+
     */

    // public

    // Everyone can access.

    // protected

    // Same package + subclasses.

    // default (no modifier)

    // Same package only.

    // private

    // Same class only.

    Example val = new Example();

    // int access = val.getPrivateValue;// throws error

    // -> protected in diff package subclass
    // In another package, a protected member can only be accessed through this
    // class or one of its subclasses, not through an arbitrary superclass/subclass
    // object.

}
