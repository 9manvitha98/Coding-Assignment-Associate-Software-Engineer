function addTask(){
    let taskInput = document.getElementById("taskInput");
    let taskList = document.getElementById("taskList");
    let li = document.createElement("li");
    li.innerHTML = taskInput.value + ' <button onclick="removeTask(this)">Remove</button>';
    taskList.appendChild(li);
    taskInput.value = "";
}
function removeTask(button) {
    button.parentElement.remove();
}
