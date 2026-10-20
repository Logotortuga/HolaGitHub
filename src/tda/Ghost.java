package tda;

public class Ghost {
     String hechizoLateral;
     String hechizoAbajo;
     String hechizoArriba;
     String amuleto1;
     String amuleto2;


     public Ghost() {

     }

    // Constructor
     
     
    public Ghost(String hechizoLateral, String hechizoAbajo, String hechizoArriba, String amuleto1,String amuleto2) {
        this.hechizoLateral = hechizoLateral;
        this.hechizoAbajo = hechizoAbajo;
        this.hechizoArriba = hechizoArriba;
        this.amuleto1 = amuleto1;
        this.amuleto2 = amuleto2;

    }

    public String getAmuleto1() {
		return amuleto1;
	}

	public void setAmuleto1(String amuleto1) {
		this.amuleto1 = amuleto1;
	}

	public String getAmuleto2() {
		return amuleto2;
	}

	public void setAmuleto2(String amuleto2) {
		this.amuleto2 = amuleto2;
	}

	// Getters and Setters
    public String getHechizoLateral() {
        return hechizoLateral;
    }

    public void setHechizoLateral(String hechizoLateral) {
        this.hechizoLateral = hechizoLateral;
    }

    public String getHechizoAbajo() {
        return hechizoAbajo;
    }

    public void setHechizoAbajo(String hechizoAbajo) {
        this.hechizoAbajo = hechizoAbajo;
    }

    public String getHechizoArriba() {
        return hechizoArriba;
    }

    public void setHechizoArriba(String hechizoArriba) {
        this.hechizoArriba = hechizoArriba;
    }

	@Override
	public String toString() {
		return "Ghost [hechizoLateral=" + hechizoLateral + ", hechizoAbajo=" + hechizoAbajo + ", hechizoArriba="
				+ hechizoArriba + ", amuleto1=" + amuleto1 + ", amuleto2=" + amuleto2 + "]";
	}

	
}
