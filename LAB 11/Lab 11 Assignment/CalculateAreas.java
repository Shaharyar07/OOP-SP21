
public  class CalculateAreas {

	static double[] areaShapes;

	

	public static double[] totalArea(Shape[] obj) {
		areaShapes = new double[obj.length];
		for (int i = 0; i < areaShapes.length; i++) {
			areaShapes[i] = obj[i].area();
		}
		return areaShapes;

	}


	public void show() {

		System.out.println("Total Area:" + areaShapes);
	}

}
