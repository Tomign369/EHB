export async function transAsync() {
  try {
    const response = await fetch("https://jsonplaceholder.typicode.com/posts");
    const posts = await response.json();

    // Filter lange posts
    const langePosts = posts.filter((post) => post.body.length > 100);

    // Transformeer lange posts
    const vereenvoudigdePosts = langePosts.map((post) => ({
      titel: post.title.toUpperCase(),
      preview: post.body.slice(0, 50) + "...",
      url: `https://onzesite.com/post/${post.id}`,
    }));

    // HTML lijst opbouwen
    const postList = document.getElementById("post-list");
    postList.innerHTML = ""; // Leegmaken als je herlaadt

    vereenvoudigdePosts.forEach((post) => {
      const li = document.createElement("li");
      li.innerHTML = `
        <h3>${post.titel}</h3>
        <p>${post.preview}</p>
        <a href="${post.url}" target="_blank">Lees meer</a>
      `;
      li.classList.add("post-item");
      postList.appendChild(li);
    });
  } catch (error) {
    console.error("Fout bij het verwerken van de posts:", error);
  }
}
