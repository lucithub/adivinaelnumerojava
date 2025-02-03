import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int rondas = 0, alMejorde = 0, intentos = 0, turneroJugador = 1, numeroIntentos = 1, rondasGanadasJ1 = 0, rondasGanadasJ2 = 0, ganador = 0;
        double numeroIntentosJ1 = 1.1, numeroIntentosJ2 = 1.1;
        String nivelElegido = null;
        int numeroUsuario;
        Random randomizador = new Random();
        int numeroRandom = randomizador.nextInt(1, 100);
    }
}



        /*int rondas = 0, alMejorDe = 0, intentos = 0, turneroJugador = 1, numeroIntentos = 1, rondasGanadasJ1 = 0, rondasGanadasJ2 = 0, ganador = 0;
        double numeroIntentosJ1 = 1.1, numeroIntentosJ2 = 1.1;
        string nivelElegido = null;
        int numeroUsuario;
        Random randomizador = new Random();
        ACA ESTOY    int numeroRandom = randomizador.Next(1, 100);
        Console.WriteLine("ADIVINA EL NUMERO.\nSi desea jugar con niveles (intentos limitados) INDIQUE 1\nSi desea jugar sin niveles (intentos ilimitados) INDIQUE 2\nSi desea jugar por rondas INDIQUE 3\nSi desea jugar contra otra persona al mejor de x rondas INDIQUE 4");
        int eleccionConSin = Convert.ToInt32(Console.ReadLine());

        while (eleccionConSin < 1 || eleccionConSin > 4)
        {
            Console.WriteLine("No ha apretado un numero valido");
            eleccionConSin = Convert.ToInt32(Console.ReadLine());
        }

        switch (eleccionConSin)
        {
            case 1:
                rondas = -1;
                Console.WriteLine("En que nivel desea jugar?\n1. NIVEL FACIL (10 Intentos)\n2. NIVEL MEDIO (6 Intentos)\n3. NIVEL DIFICIL (3 Intentos)\n4. NIVEL IMPOSIBLE (1 Intento)");
                int eleccionNivel = Convert.ToInt32(Console.ReadLine());
                while (eleccionNivel < 1 || eleccionNivel > 4)
                {
                    Console.WriteLine("No eligio un nivel que se le indico. Vuelva a intentarlo");
                    eleccionNivel = Convert.ToInt32(Console.ReadLine());
                }
                switch (eleccionNivel)
                {
                    case 1:
                        intentos = 10;
                        nivelElegido = "Facil";
                        break;
                    case 2:
                        intentos = 6;
                        nivelElegido = "Medio";
                        break;
                    case 3:
                        intentos = 3;
                        nivelElegido = "Dificil";
                        break;
                    case 4:
                        intentos = 1;
                        nivelElegido = "Imposible";
                        break;
                }
                break;
            case 2:
                rondas = -1;
                intentos = 102;
                nivelElegido = "Sin nivel";
                break;
            case 3:
                Console.WriteLine("Cuantas rondas desea jugar: ");
                rondas = Convert.ToInt32(Console.ReadLine());
                intentos = 102;
                nivelElegido = "Por rondas";
                break;
            case 4:
                Console.WriteLine("Al mejor de cuantas rondas desea jugar: ");
                rondas = Convert.ToInt32(Console.ReadLine());
                alMejorDe = rondas;
                nivelElegido = "Al mejor de " + alMejorDe + " rondas.";
                intentos = 102;
                break;
        }

        while (rondas != 0)
        {
            numeroRandom = randomizador.Next(1, 100);
            numeroIntentos = 1;
            if (eleccionConSin == 4)
            {
                Console.WriteLine("TURNO DEL JUGADOR " + turneroJugador);
                Console.WriteLine("La partida va: Jugador 1 " + rondasGanadasJ1 + " - " + rondasGanadasJ2 + " Jugador 2");
            }
            Console.WriteLine("Bienvenidos a Adivina el Numero. El nivel actual es: " + nivelElegido + ". Ingresa un numero del 1 al 100: ");
            numeroUsuario = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("-----------------------------------------------------------------");
            while (numeroUsuario != numeroRandom)
            {
                if (intentos != 0)
                {
                    intentos--;
                }
                if (intentos == 0)
                {
                    Console.WriteLine("HA PERDIDO. El numero era: "+numeroRandom);
                    Environment.Exit(0);
                }
                if (numeroUsuario > numeroRandom)
                {
                    Console.WriteLine("Numero Incorrecto. Pruebe con uno menor");
                }
                else if (numeroUsuario < numeroRandom)
                {
                    Console.WriteLine("Numero Incorrecto. Pruebe con uno mayor");
                }
                if (eleccionConSin == 1)
                {
                    Console.WriteLine("Quedan " + intentos + " intentos.");
                }
                numeroUsuario = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("-----------------------------------------------------------------");
                numeroIntentos++;
            }
            if (rondas == -1)
            {
                Console.WriteLine("Felicidades. Ha adivinado el numero, el cual era el " + numeroRandom + ", en " + numeroIntentos + " intentos.");
                Environment.Exit(0);
            }
            else if (eleccionConSin == 4)
            {
                Console.WriteLine("Felicidades, jugador " + turneroJugador + ". Ha adivinado el numero, el cual era el " + numeroRandom + ", en " + numeroIntentos + " intentos.");
                if (turneroJugador == 1)
                {
                    numeroIntentosJ1 = numeroIntentos;
                    turneroJugador = 2;
                }
                else
                {
                    numeroIntentosJ2 = numeroIntentos;
                    turneroJugador = 1;
                }
                if (numeroIntentosJ1 < numeroIntentosJ2 && numeroIntentosJ2 != 1.1)
                {
                    rondasGanadasJ1++;
                    numeroIntentosJ1 = 1.1;
                    numeroIntentosJ2 = 1.1;
                }
                else if (numeroIntentosJ1 > numeroIntentosJ2 && numeroIntentosJ2 != 1.1)
                {
                    rondasGanadasJ2++;
                    numeroIntentosJ2 = 1.1;
                    numeroIntentosJ1 = 1.1;
                }
                if (rondasGanadasJ1 == alMejorDe)
                {
                    ganador = 1;
                    Console.WriteLine("Ha ganado el jugador " + ganador + " al mejor de " + alMejorDe + " rondas.");
                    Environment.Exit(0);
                }
                else if (rondasGanadasJ2 == alMejorDe)
                {
                    ganador = 2;
                    Console.WriteLine("Ha ganado el jugador " + ganador + " al mejor de " + alMejorDe + " rondas.");
                    Environment.Exit(0);
                }
                numeroRandom = randomizador.Next(1, 100);
            }
            else
            {
                Console.WriteLine("Felicidades. Ha adivinado el numero, el cual era el " + numeroRandom + ", en " + numeroIntentos + " intentos.");
                rondas--;
                numeroRandom = randomizador.Next(1, 100);
            }
        }*/