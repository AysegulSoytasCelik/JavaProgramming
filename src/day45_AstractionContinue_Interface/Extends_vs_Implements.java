package day45_AstractionContinue_Interface;

//extends:
class C{

}

class A{

}

class B extends A{

}


interface Z{

}

interface X{

}

interface Y extends X, Z{

}


//implements

class D implements X,Y,Z{

}



public class Extends_vs_Implements extends A implements X, Y, Z{


}