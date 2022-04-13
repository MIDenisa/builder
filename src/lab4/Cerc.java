package lab4;

public class Cerc extends FiguraGeometrica {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;
	
	public static class Builder extends FiguraGeometrica.Builder<Cerc, Cerc.Builder>{
		public Builder withHeight(int height) {
			this.objShape.height=height;
			return this.thisBuilderObj;
		}
		
		public Builder withWidth(int width) {
			this.objShape.width=width;
			return this.thisBuilderObj;
		}
		
		protected Cerc createObjShape() {
			return new Cerc();
		}
		
		protected Builder getThisBuilder() {
			return this;
		}
	}
	
	protected Cerc() {
		
	}
	
	public int getHeight() {
		return this.height;
	}
	public int getWidth() {
		return this.width;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}


}
