const jsonString = `{
  "naam": "Mia",
  "leeftijd": 29,
  "interesses": ["design", "fotografie", "reizen"],
  "contactInfo": {
    "email": "mia@voorbeeld.be",
    "telefoon": "+32 123 456 789"
  },
  "actief": true
}`;

const gebruiker = JSON.parse(jsonString);
console.log(gebruiker.naam);
console.log(gebruiker.interesses[1]);

const nieuObject = {
  titel: "Web explorer",
  auteur: "Mike",
  jaar: "2024",
};

const nieuwJson = JSON.stringify(nieuwObject);
console.log(nieuwJson);
