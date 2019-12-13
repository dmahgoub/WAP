let main = (function () {
    debugger;
    let btnCreate = document.getElementById('btnCreate');
    const accName = document.getElementById('accName');
    const deposite = document.getElementById('deposite');
    let txtArea = document.getElementById('accounts');
    let accountList = [];

    btnCreate.onclick = function () {
        debugger;
        accountList.push({
            name: accName.value,
            deposit: deposite.value
        });
        accountList.forEach(acc => {
            txtArea.append("Account Name: " + acc.name + ", Balance: " + acc.deposit)
        });
    }

})();