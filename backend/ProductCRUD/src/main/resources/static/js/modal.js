const modalBtn = document.querySelector(".modalBtn");
const modal = document.querySelector(".modal");
const closeBtn = document.querySelector(".closeBtn");

modalBtn.onclick = function () {
    modal.style.display = "flex";
}

closeBtn.onclick = function () {
    modal.style.display = "none";
}

