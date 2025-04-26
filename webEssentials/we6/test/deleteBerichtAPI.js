fetch("https://jsonplaceholder.typicode.com/posts/1", {
  method: "DELETE",
})
  .then((res) => res.json())
  .catch((error) => console.error("fout:", error));
