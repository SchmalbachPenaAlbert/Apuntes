# Ejercicio tamaño cabeceras

**1- Un sistema tiene una jerarquía de protocolos de n capas. Las aplicaciones generan mensajes de M bytes de longitud. En cada capa se añade una cabecera de h bytes. ¿Qué fracción del ancho de banda de la red se llena con información de la capa de aplicación? Aplique el resultado a una conexión a 400 Kbps con tamaño de datos de 1000 Bytes y 7 capas, cada una de las cuales añade 64 Bytes de cabecera.**

n capas
mensajes M bytes
cabezera h bytes (por cada capa)

La fracción de ancho de banda que nos piden es: datos útiles / datos totales transmitidos

Por tanto -> h*n+M = datos totales y M = datos utiles
fracción del ancho de banda = M / (h*n+M)

Sustituyendo los valores -> 1000 / (7*64+1000) = 69.06% = 69%
Ahora, de esos 400kbps calculamos el tamaño de los datos útiles de aplicación 400*0.69 = 276kbps

**2- Queremos enviar un archivo de 2000 bytes usando paquetes de 1000 bytes por un enlace de 120 Mbps entre dos torres situadas a 15 Km de distancia. Teniendo en cuenta que las cabeceras ocupan 50 bytes también por tanto los paquetes de confirmación, ¿Cuánto tiempo tardaremos en enviar el primer paquete? ¿Cúanto tiempo tardaremos (desde que comienza el primer envío, si no hay errores) en recibir la confirmación del correcto envío de todos los paquetes?**

archivo completo: 2000 bytes -> paquetes 1000 bytes
enlace 120Mbps (megabits por seg) = 120 000 000 bits por seg (*10^6) = 15 000 000 bytes por segundo
cabezeras = 50 bytes
primer paquete = 1000+50 = 1050 bytes -> 1050 / 15 000 000 = 0.00007 segundos = 0.07 ms
primer paquete de confirmación = 50 bytes -> 50 / 15 000 000 = 0.000003 segundos = 0.003 ms
segundo paquete = 1000+50  1050 bytes -> 1050 / 15 000 000 = 0.00007 segundos = 0.07 ms
primer paquete de confirmación = 50 bytes -> 50 / 15 000 000 = 0.000003 segundos = 0.003 ms
total -> 0.07 + 0.07 + 0.003 + 0.003 = 0.146 ms

d = v * t -> tiempo = distancia / velocidad = 15 000 m / 2*10^8 = 0.000075 s = 0.075 ms (tiempo de propagación)

Por tanto, el tiempo total será -> el tiempo de transmisión del primer paquete + el tiempo de transmision del segundo + el tiempo de propagacion del segundo paquete + el tiempo de transmisión de la confirmación del segundo paquete + el tiempo de propagación de la confirmación del segundo paquete (ya que los paquetes se enevian uno detras del otro, sin esperar uno a recibir la confirmacion de que el otro ha llegado) = 0.07 ms + 0.07 ms + 0.075 ms + 0.075 ms + 0.003 ms + 0.075 ms = 0.293 ms

**3- Tengo una red 192.170.0.0 /24 y quiero hacer 3 subredes lo más grandes posible. (minima mascara de red que puedas hacer). Dentro de cada subred que hayas creado, asigna una ip a 3 dispositivos diferentes (9 en total) en una de las 3 subredes que has creado, la que tú quieras, define 2 subredes más.**



**4- Queremos envíar una foto de resolución HD (1020x1080) con una profundidad de color de 32 bits. El protocolo nos permite hacer paquetes de hasta 4MB. Las cabezeras ocupan 50KB. La velocidad de transferencia es de 1Gbps y la distancia entre torres es de 80 Km. Dime el tiempo que transcurre desde que comenzamos a emitir hasta que llega la última confirmación. ¿Qué tiempo mínimo de confirmación antes de reenviar establecerías para cada paquete?**

