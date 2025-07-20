const PersonController = require('../controllers/person.controller');
module.exports= function (app){
    app.post('/api/new',PersonController.createPerson);
}
