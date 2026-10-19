



**dir** ➡️ Muestra una lista de archivos y carpetas en el directorio actual.

**cd** ➡️ Cambia el directorio actual.

&#x09;Ejemplo ➡️ cd CarpetaEjemplo para cambiar al directorio «CarpetaEjemplo».

**cd..** ➡️ Retrocede al directorio raíz del directorio actual.

**md o mkdir** ➡️ Crea un nuevo directorio.

&#x09;Ejemplo ➡️ mkdir NuevaCarpeta para crear una carpeta llamada «NuevaCarpeta».

**rd o rmdir** ➡️ Elimina un directorio.

&#x09;Ejemplo ➡️ rmdir CarpetaAEliminar para eliminar la carpeta «CarpetaAEliminar».

**del** ➡️ Elimina un archivo.

&#x09;Ejemplo ➡️ del archivo.txt para eliminar el archivo «archivo.txt».

copy ➡️ Copia archivos.

&#x09;Ejemplo ➡️ copy archivo1.txt archivo2.txt para copiar «archivo1.txt» como «archivo2.txt».

move ➡️ Mueve archivos o cambia sus nombres.

&#x09;Ejemplo ➡️ move archivo.txt C:\\OtroDirectorio\\archivo.txt para mover «archivo.txt» a otro directorio.

ren ➡️ Cambia el nombre de un archivo o directorio.

&#x09;Ejemplo ➡️ ren archivo.txt nuevoarchivo.txt para cambiar el nombre de «archivo.txt» a «nuevoarchivo.txt».

xcopy ➡️ Copia directorios y archivos con opciones avanzadas.

&#x09;Ejemplo ➡️ xcopy C:\\Origen\\\* C:\\Destino\\ /E /I para copiar todos los archivos y subdirectorios de «Origen» a «Destino».

robocopy ➡️ Copia directorios y archivos con capacidades avanzadas (disponible en versiones más recientes de Windows).

&#x09;Ejemplo ➡️ robocopy C:\\Origen C:\\Destino /E /ZB para copiar con comprobación de archivos y reinicio automático.

attrib ➡️ Cambia los atributos de archivo.

&#x09;Ejemplo ➡️ attrib +h archivo.txt para ocultar el archivo «archivo.txt».

type ➡️ Muestra el contenido de un archivo de texto en la pantalla.

&#x09;Ejemplo ➡️ type archivo.txt para mostrar el contenido de «archivo.txt».

find ➡️ Busca una cadena de texto en un archivo.

&#x09;Ejemplo ➡️ find «textoabuscar» archivo.txt para buscar «textoabuscar» en «archivo.txt».

more ➡️ Muestra el contenido de un archivo de texto de manera paginada.

&#x09;Ejemplo ➡️ more archivo.txt para ver el contenido de «archivo.txt» por páginas.





**HERRAMIENTAS**

tasklist ➡️ Muestra una lista de los procesos en ejecución.

taskkill ➡️ Termina un proceso en ejecución.

&#x09;Ejemplo ➡️ taskkill /F /IM nombre\_proceso.exe para forzar el cierre de un proceso.

systeminfo ➡️ Muestra información detallada sobre la configuración del sistema.

sfc /scannow ➡️ Escanea y repara archivos de sistema corruptos.

chkdsk ➡️ Verifica y repara errores en un disco duro.

&#x09;Ejemplo ➡️ chkdsk C: /f para escanear y reparar el disco C:.

diskpart format ➡️ Formatea una unidad de almacenamiento.

&#x09;Ejemplo ➡️  para formatear la unidad D: con sistema de archivos NTFS.

shutdown ➡️ Apaga o reinicia el sistema.

&#x09;Ejemplo ➡️ shutdown /s para apagar el sistema.

gpupdate ➡️ Actualiza la configuración de directivas de grupo.

&#x09;Ejemplo ➡️ gpupdate /force para forzar una actualización de las directivas de grupo.

assoc ➡️ Muestra o modifica las asociaciones de extensiones de archivo.

&#x09;Ejemplo ➡️ assoc .txt para mostrar la asociación de archivos .txt.

ver ➡️ Muestra la versión de Windows actual.

findstr ➡️ Busca cadenas de texto en archivos.

Ejemplo ➡️ findstr «textoabuscar» archivo.txt para buscar «textoabuscar» en «archivo.txt».

clip ➡️ Copia la salida de un comando al portapapeles.

&#x09;Ejemplo ➡️ dir | clip para copiar la lista de archivos al portapapeles.





**Para administrar redes**

ipconfig ➡️ Muestra la configuración de red actual, incluyendo la dirección IP, la máscara de subred y la puerta de enlace.

&#x09;Ejemplo ➡️ ipconfig

ping ➡️ Envía paquetes ICMP a una dirección IP para comprobar la conectividad de red.

Ejemplo ➡️ ping google.com

netstat ➡️ Muestra estadísticas de red, conexiones activas y puertos abiertos.

Ejemplo ➡️ netstat -an

tracert ➡️ Rastrea la ruta que sigue un paquete desde tu computadora hasta un destino, mostrando cada salto en el camino.

Ejemplo ➡️ tracert google.com

nslookup ➡️ Consulta información de servidores DNS, como la resolución de nombres de dominio.

Ejemplo ➡️ nslookup google.com

arp ➡️ Muestra y manipula la tabla ARP (Address Resolution Protocol), que mapea direcciones IP a direcciones MAC.

Ejemplo ➡️ arp -a

netsh ➡️ Permite configurar y gestionar diversas configuraciones de red, como interfaces, firewall y más.

Ejemplo ➡️ netsh interface show interface



**OTROS**

tree ➡️ Muestra una estructura de árbol de directorios y archivos a partir de un directorio específico.

Ejemplo ➡️ tree C:\\Directorio para mostrar la estructura de árbol de «C:\\Directorio».

ssh ➡️ Permite acceder a otros sistemas mediante SSH (disponible en Windows 10 y versiones posteriores).

Ejemplo ➡️ ssh usuario@host para iniciar una sesión SSH en un servidor remoto.

cipher ➡️ Muestra o cambia la encriptación de archivos y directorios.

Ejemplo ➡️ cipher /e para encriptar archivos y directorios en el directorio actual.

subst ➡️ Crea una unidad virtual que apunta a una carpeta del sistema de archivos.

Ejemplo ➡️ subst X ➡️ C:\\Directorio para asignar la unidad X ➡️ a la carpeta «C:\\Directorio».

wmic ➡️ Permite acceder a la línea de comandos de Windows Management Instrumentation (WMI) para obtener información del sistema.

Ejemplo ➡️ wmic bios get serialnumber para obtener el número de serie de la BIOS.

net user ➡️ Muestra y gestiona cuentas de usuario.

Ejemplo ➡️ net user nombre\_usuario para mostrar información de una cuenta de usuario específica.

sc ➡️ Controla y configura servicios de Windows.

Ejemplo ➡️ sc start nombre\_servicio para iniciar un servicio específico.

wmic diskdrive ➡️ Muestra información detallada sobre unidades de disco duro instaladas en el sistema.

Ejemplo ➡️ wmic diskdrive get caption,size para obtener información sobre el tamaño de las unidades de disco duro.



