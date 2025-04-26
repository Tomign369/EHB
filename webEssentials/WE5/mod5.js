"use strict";

function laadAfbeeldingen(url) {
  return new Promise((resovle, reject) => {
    const img = new Image();
    img.onlaod = () => {
      console.log("Afbeelding is geladen!");
      resovle(img);
    };
    img.onerror = (error) => {
      console.log("Er ging iets mis, sorry!");
      reject(error);
    };
    img.src = url;
  });   
}
