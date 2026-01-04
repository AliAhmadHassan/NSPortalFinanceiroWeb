package br.com.aevee.nsPortFinanc.web;

public class MenuItem {
	
	public MenuItem(){
		
	}
	
	public MenuItem(String titulo, String imagem, String url){
		this.titulo = titulo;
		this.imagem = imagem;
		this.url = url;
	}
	
	private String titulo;
	
	private String imagem;
	
	private String url;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
