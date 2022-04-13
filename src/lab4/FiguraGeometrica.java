package lab4;
import java.awt.Canvas;

public abstract class FiguraGeometrica extends Canvas implements Observer {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	double opacity;
	protected static abstract class Builder<T extends FiguraGeometrica, B extends Builder<T,B>>{
		protected T objShape;
		protected B thisBuilderObj;
		
		public Builder() {
			this.objShape=this.createObjShape();
			this.thisBuilderObj=this.getThisBuilder();
		}
		
		public B withOpacity(double opacity) {
			this.objShape.opacity=opacity;;
			return this.thisBuilderObj;
		}
		
		public T build() {
			return this.objShape;
		}
		
		protected abstract T createObjShape();
		protected abstract B getThisBuilder();
	}
	
	protected FiguraGeometrica()
	{
		this.opacity = 0;
		
	}
	
	public double getOpacity() {
		return this.opacity;
	}

}
