package Code;

public class Plan_curricular {
    private int Id_Plan_Curricular;
    private int Temario_Id;
    private int Malla_Id;

    public Plan_curricular(int Id_Plan_Curricular, int Temario_Id, int Malla_Id) {
        this.Id_Plan_Curricular = Id_Plan_Curricular;
        this.Temario_Id = Temario_Id;
        this.Malla_Id = Malla_Id;
    }

    public Plan_curricular(int Temario_Id, int Malla_Id) {
        this.Temario_Id = Temario_Id;
        this.Malla_Id = Malla_Id;
    }

    public Plan_curricular() {
    }

	public int getId_Plan_Curricular() {
		return Id_Plan_Curricular;
	}

	public void setId_Plan_Curricular(int id_Plan_Curricular) {
		Id_Plan_Curricular = id_Plan_Curricular;
	}

	public int getTemario_Id() {
		return Temario_Id;
	}

	public void setTemario_Id(int temario_Id) {
		Temario_Id = temario_Id;
	}

	public int getMalla_Id() {
		return Malla_Id;
	}

	public void setMalla_Id(int malla_Id) {
		Malla_Id = malla_Id;
	}
}
