// JavaScript Vanilla
// function Account(name, document) {
//     this.id;
//     this.name = name;
//     this.document = document;
//     this.email;
//     this.password;
// }

// ES6
class Account {
    constructor(name, document, email, password){
        this.id;
        this.name = name;
        this.document = document;
        this.email = email;
        this.password = password;
    }
    printDataAccount = () => {
        console.log("__ACCOUNT__");
        console.log(this.name);
        console.log(this.document);
        console.log(this.email);
        console.log(this.password);
        console.log("____");
    };
}