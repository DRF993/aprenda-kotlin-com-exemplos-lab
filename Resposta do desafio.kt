
enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }



 class Usuario{
     
     val nome: String
     var idade: Int
    
     constructor( nome: String,  idade: Int){
      
         this.nome = nome
         this.idade = idade
         
     }
         
         
     override fun toString(): String{
         
         return "Nome: $nome - Idade: $idade"
     }
 }
     
     
     
data class ConteudoEducacional(val nome: String, val duracao: Int  )



data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
   
    fun matricular( usuario: Usuario) { 
       
        inscritos.add(usuario);
    }
}



fun main() {
    
    //Criando Usuários
    val usuario1 = Usuario("Daniel",36)
    val usuario2 = Usuario("Maria",18)
    val usuario3 = Usuario("João",80)
    val usuario4 = Usuario("José",23)
    val usuario5 = Usuario("Brenda",29)
    val usuario6 = Usuario("Batista",42)
    val usuario7 = Usuario("Gabriela",32)
    
   var listarUsuarios = mutableListOf<Usuario>()
   
   // Adicionando todos usuarios numa lista
   listarUsuarios.add(usuario1)
   listarUsuarios.add(usuario2)
   listarUsuarios.add(usuario3)
   listarUsuarios.add(usuario4)
   listarUsuarios.add(usuario5)
   listarUsuarios.add(usuario6)
   listarUsuarios.add(usuario7) 
   
 
                    // Criando Listas de Conteúdos
                    
    
    // 1 - Conteudos WEB
    val conteudoWebHTML = ConteudoEducacional("HTML",10)
    val conteudoWebCSS = ConteudoEducacional("CSS",10)
    val listaDeConteudosWeb = mutableListOf<ConteudoEducacional>()
    
    //Adicionando os conteudos WEB
    listaDeConteudosWeb.add(conteudoWebHTML)
    listaDeConteudosWeb.add(conteudoWebCSS)
    listaDeConteudosWeb.add(ConteudoEducacional("Javascript",20)) // Outra sintaxe pra adicionar
    
    // 2 - Conteudos Java Web
    val conteudoJavaOO = ConteudoEducacional("Java OO",40)
    val conteudoJavaWeb1 = ConteudoEducacional("Servlets",10)
    val conteudoJavaWeb2 = ConteudoEducacional("JSP",10)
    val conteudoJavaWebBD = ConteudoEducacional("Hibernate/JPA",20)
    val conteudoJavaWebSpring = ConteudoEducacional("Spring",10)
    val listaDeConteudosJavaWeb = mutableListOf<ConteudoEducacional>()
    
    //Adicionando os conteudos Java Web
    listaDeConteudosJavaWeb.add(conteudoJavaOO)
    listaDeConteudosJavaWeb.add(conteudoJavaWeb1)
    listaDeConteudosJavaWeb.add(conteudoJavaWeb2)
    listaDeConteudosJavaWeb.add(conteudoJavaWebBD)
    listaDeConteudosJavaWeb.add(conteudoJavaWebSpring)
    
 
    
               //Criando Formações e matriculando usuarios nela
               
    
    // Formação: Criação de Sites
    val formacao1 = Formacao("Criação de Sites",listaDeConteudosWeb,Nivel.BASICO)
    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
    formacao1.matricular(usuario3)
    
    // Formação: Formação Java
    val formacao2 = Formacao("Formação Java",listaDeConteudosJavaWeb,Nivel.AVANÇADO)
    formacao2.matricular(usuario4)
    formacao2.matricular(usuario5)
    formacao2.matricular(usuario6)
    formacao2.matricular(usuario7)
    
    
                     // Testando o código
    
   println("Lista com todos alunos da DIO:\n")
      

   for(s in listarUsuarios){
       
       println(s)
   }
   
   
   println("\n\n")
    
    
   println("Alunos cadastrados na formação: Criação de Sites:\n")
    
    for ( s in formacao1.inscritos ){
        
        println(s)
    }
    
    
    println("\n\n")
    
    
    println("Alunos cadastrados na formação: Formação Java:\n")
    
    for ( s in formacao2.inscritos ){
        
        println(s)
    }
   
}