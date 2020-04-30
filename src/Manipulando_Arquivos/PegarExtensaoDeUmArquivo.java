/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manipulando_Arquivos;

/**
 *
 * @author Samuel
 */
public class PegarExtensaoDeUmArquivo {
    
    
    public static void main(String[] args) {

///////////////////////////////////////////////////Biiblioteca Apache Commons IO.//////////////////////////////////        
        
        /* //Exemplo de arquivo do Windows
        String nomeCompletoDoArquivo = "C:\\temp\\arquivo de teste.txt";
        String extensaoDoArquivo = FilenameUtils.getExtension(nomeCompletoDoArquivo);
        System.out.println(extensaoDoArquivo);
        
        //Exemplo de arquivo sem extensão
        nomeCompletoDoArquivo = "C:\\temp\\arquivo sem extensao";
        extensaoDoArquivo = FilenameUtils.getExtension(nomeCompletoDoArquivo);
        System.out.println(extensaoDoArquivo);
        
        //Exemplo de arquivo do Linux/Unix/OSX
        nomeCompletoDoArquivo = "/home/gustavo/arquivo de imagem.png";
        extensaoDoArquivo = FilenameUtils.getExtension(nomeCompletoDoArquivo);
        System.out.println(extensaoDoArquivo);*/
      
  ///////////////////////////////////////////////////Java Puro//////////////////////////////////              
        
        
     //Exemplo de arquivo do Windows
        String nomeCompletoDoArquivo = "C:\\temp\\arquivo de teste.docx";
        String extensaoDoArquivo = getFileExtension(nomeCompletoDoArquivo);
        System.out.println(extensaoDoArquivo);

        //Exemplo de arquivo sem extensão
        nomeCompletoDoArquivo = "C:\\temp\\arquivo sem extensao";
        extensaoDoArquivo = getFileExtension(nomeCompletoDoArquivo);
        System.out.println(extensaoDoArquivo);

        //Exemplo de arquivo do Linux/Unix/OSX
        nomeCompletoDoArquivo = "/home/gustavo/arquivo de imagem.jpg";
        extensaoDoArquivo = getFileExtension(nomeCompletoDoArquivo);
        System.out.println(extensaoDoArquivo);
  
  
  
    }
    
    
      static String getFileExtension(String filename) {
        if (filename.contains("."))
            return filename.substring(filename.lastIndexOf(".") + 1);
        else
            return "";
    
    
}
      
}
