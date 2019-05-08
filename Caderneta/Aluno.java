public class Aluno {
	private double p1,p2,p3,p4,NotaFinal;
	private String nome;
	
	public Aluno(String nome, double p1, double p2, double p3, double p4,double NotaFinal) {
		this.nome = nome;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
    this.NotaFinal = NotaFinal;
	}
	
	public double getMedia() {
		double media;
		media = (p1+p2+p3)/3;
		return media;
	}
	
	public String getSituacao() {
		String situacao;
		double menor;
		if(getMedia()>=7) {
			situacao = "aprovado";
		}else {
			menor = p1;
			if(menor>p2) {
				menor = p2;
			}
			if(menor>p3) {
				menor = p3;
			}
			if(p1==menor) {
				this.p1 = p4;
			}
			if(p2==menor) {
				this.p2 = p4;
			}
			if(p3==menor) {
				this.p3 = p4;
			}
			if(getMedia()>=7) {
				situacao = "aprovado";
			}else {
				if(((getMedia()+NotaFinal)/2)>=6) {
					situacao = "aprovado";
				}else {
					situacao = "reprovado";
				}
			}
			
		}
		return situacao;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		System.out.println(this.nome);
	}
	
	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public double getP2() {
		return p2;
	}

	public void setP2(double p2) {
		this.p2 = p2;
	}

	public double getP3() {
		return p3;
	}

	public void setP3(double p3) {
		this.p3 = p3;
	}

	public double getP4() {
		return p4;
	}

	public void setP4(double p4) {
		this.p4 = p4;
	}

	public double getNotaFinal() {
		return NotaFinal;
	}

	public void setNotaFinal(double NotaFinal) {
		this.NotaFinal = NotaFinal;
	}
	
	
}
