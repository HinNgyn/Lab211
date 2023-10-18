package repository;

import DataAccess.ShapeDao;

public class ShapeRepository implements IShapeRepository {

    @Override
    public void calculate() {
        ShapeDao.Instance().display(
                ShapeDao.Instance().inputRectangle(),
                ShapeDao.Instance().inputCircle(),
                ShapeDao.Instance().inputTriangle());
    }
}
