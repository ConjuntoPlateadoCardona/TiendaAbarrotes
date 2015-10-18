//Instancia un nuevo objeto XMLHttpRequest
function obtenerXHR(){
    req = false;
    if(window.XMLHttpRequest){
        req = new XMLHttpRequest();
    }else{
        if(ActiveXObject){
            //Definimos un vector con las distintas posibilidades
            var vectorVersiones = ["MSXML2.XMLHttp.5.0", "MSXML2.XMLHttp.4.0", "MSXML2.XMLHttp.3.0", "MSXML2.XMLHttp", "Microsoft.XMLHttp"];
            //Lo recorremos e intentamos instanciar cada uno
            for(var i=0; i<vectorVersiones.length; i++){
                try{
                    req = new ActiveXObject(vectorVersiones[i]);
                    return req;
                }catch(e){}
            }
        }
    }
    return req;
}