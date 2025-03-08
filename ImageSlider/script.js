let images = ["./assests/nature1.jpg", "./assests/nature2.jpg", "./assests/nature3.jpg"];
let index = 0; 

function nextImage() {
    console.log("Next Button Clicked, Current Index:", index); // Debugging
    index = (index + 1) % images.length; 
    document.getElementById("slider").src = images[index];
}

function prevImage() {
    console.log("Prev Button Clicked, Current Index:", index); // Debugging
    index = (index - 1 + images.length) % images.length;
    document.getElementById("slider").src = images[index];
}

