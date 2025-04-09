package Home.BTVN.w06.Ex3.Paint2D;

import Class.w06.Paint2D.IShapeO;

public interface IShape extends IShapeO, IShapeT {
    public IShape getCenter ();
    public IShape getBoundary ();
}
