var form = document.getElementById('form');
form.addEventListener('submit', (event) => {
    event.preventDefault();
    var name = document.getElementById('name').value;
    var email = document.getElementById('email').value;

    if (email.indexOf('@') == 0) {
        alert('Invalid Position Of @');
        return false;

    }
    if (email.charAt(email.length - 3) != '.' && email.charAt(email.length - 4) != '.') {
        alert('Invalid Position Of .');
        return false;
    }
    else {
        const obj1 = { "name": name }
        const obj2 = { "email": email }

        sessionStorage.setItem('name', JSON.stringify(obj1));
        sessionStorage.setItem('email', JSON.stringify(obj2));

        alert("Successfully Added...")
        document.getElementById('name').value = ""
        document.getElementById('email').value = "";



    }


})
var showUser = document.getElementById('showuser');
showUser.addEventListener('click', () => {
    $('.table').css("display","inline-block")
    document.getElementById('td1name').innerHTML=sessionStorage.getItem('name')
    document.getElementById('td1email').innerHTML=sessionStorage.getItem('email')
})
