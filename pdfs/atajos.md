docker 
cear un cntenedor nginx de la version latest con un volumen local

docker run
    -d              (se ejecuta en segundo plano)
    --name nombre_del_contenedor    (asigna el nombre)
    -p8080:80   (puerto_local:80 redirige al puerto local del anfitrion)
    -v ~/html: 