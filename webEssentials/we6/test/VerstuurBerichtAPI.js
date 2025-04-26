export async function verzendBerichtAsync() {
  try {
    const response = await fetch("https://jsonplaceholder.typicode.com/posts", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({
        naam: "Zane",
        bericht: "Ik oefen fetch!",
      }),
    });

    const data = await response.json();
    console.log("Reactie van de API:", data);
  } catch (error) {
    console.error("Fout:", error);
  }
}
