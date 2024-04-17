//  1) Java est-il a langage compilé ou interprété expliqué ?
Le java est un langage compilé et interprété, on utilise un compilateur Java pour traduire le code source en bytecode Java. Le bytecode est un ensemble d'instructions destinées à être exécutées par la machine virtuelle Java (JVM). Pour compilé on utilise javac ex : javac HelloWorld.java dans le terminal. Ceci fait un HelloWorld.class qui est le fichier byteCode, on fait ensuite java HelloWorld ( pas besoin de mettre .class car il fait que des points class) dans ce meme terminal.

// 2) Creer une class qui contient la méthode main qui exécute automatiquement une application Java (« hello World ») : 
//Creation d'une class HelloWorld
public class Helloworld {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
    }
}

