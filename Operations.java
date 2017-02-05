import java.util.Scanner;
import java.util.ArrayList;
public class Operations{

    int a,b,c,caso;
    String solucion;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caso = 0;

		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			Operations o = new Operations(a,b,c,++caso);
			o.findSol();
			System.out.println(o.solucion);
		}
	}

	public Operations(int a,int b,int c, int caso){
		this.a = a;
		this.b = b;
		this.c = c;
		this.caso = caso;
	}

	public void findSol(){
		if(sumOpFirst()){
			this.solucion= "Case "+this.caso+": "+this.a+"+"+this.b+"="+this.c;
			return;
		}
		if(sumOpSnd()){
			this.solucion= "Case "+this.caso+": "+this.a+"="+this.b+"+"+this.c;
			return;
		}
		if(subOpFirst()){
			this.solucion= "Case "+this.caso+": "+this.a+"-"+this.b+"="+this.c;
			return;
		}
		if(subOpSnd()){
			this.solucion= "Case "+this.caso+": "+this.a+"="+this.b+"-"+this.c;
			return;
		}
		if(mulOpFirst()){
			this.solucion= "Case "+this.caso+": "+this.a+"*"+this.b+"="+this.c;
			return;
		}
		if(mulOpSnd()){
			this.solucion= "Case "+this.caso+": "+this.a+"="+this.b+"*"+this.c;
			return;
		}
		if(divOpFirst()){
			this.solucion= "Case "+this.caso+": "+this.a+"/"+this.b+"="+this.c;
			return;
		}
		if(divOpSnd()){
			this.solucion= "Case "+this.caso+": "+this.a+"="+this.b+"/"+this.c;
			return;
		}
	}



	public boolean sumOpFirst(){
		if((a+b)==c){
			return true;
		}else{
			return false;
		}
	}

	public boolean subOpFirst(){
		if((a-b)==c){
			return true;
		}else{
			return false;
		}
	}

	public boolean mulOpFirst(){
		if((a*b)==c){
			return true;
		}else{
			return false;
		}
	}

	public boolean divOpFirst(){
		if((a/b)==c){
			return true;
		}else{
			return false;
		}
	}


	/////


	public boolean sumOpSnd(){
		if(a==(b+c)){
			return true;
		}else{
			return false;
		}
	}

	public boolean subOpSnd(){
		if(a==(b-c)){
			return true;
		}else{
			return false;
		}
	}

	public boolean mulOpSnd(){
		if(a==(b*c)){
			return true;
		}else{
			return false;
		}
	}

	public boolean divOpSnd(){
		if(a==(b/c)){
			return true;
		}else{
			return false;
		}
	}
}		