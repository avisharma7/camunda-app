print("Printing userObj inside initialize_department.js::"+ JSON.stringify(userObj));
print("Printing userObj2 inside initialize_department.js::"+ JSON.stringify(userObj2));
print("Printing userObj3 inside initialize_department.js::"+ JSON.stringify(userObj3));
print("Printing userObj4 inside initialize_department.js via execution.setVariable()::"+ JSON.stringify(userObj4));
print("Printing userObj4 inside initialize_department.js via execution.getVariable::"+ JSON.stringify(execution.getVariable("userObj4")));
//print("Printing userObj5 inside initialize_department.js::"+ userObj5); gives reference error because userObj5 is localvaraible and we are accesing it as global variable
var obj ={
id: 1,
name: "Aviral",
DepartmentName: "CSE"
}

print("Department Object:: " + JSON.stringify(obj));