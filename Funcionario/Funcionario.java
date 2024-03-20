package PO;

public class Funcionario {
	private String Name ;
	private String Sexo ;
	private  int Data_Nacs;

//CONSTORTOC PADRÃO
Funcionario(){
	
	}
//1
Funcionario(String name){
	this.Name = name;
	}
//2
Funcionario(String name , String sexo  ){
	this.Name = name;
	this.Sexo = sexo;
	}

//3
Funcionario(String name, String sexo, int data_Nacs) {
	Name = name;
	Sexo = sexo;
	Data_Nacs = data_Nacs;
	}
//metudos
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getSexo() {
	return Sexo;
}
public void setSexo(String sexo) {
	Sexo = sexo;
}
public int getData_Nacs() {
	return Data_Nacs;
}
public void setData_Nacs(int data_Nacs) {
	Data_Nacs = data_Nacs;
}
//METUDOS


}
