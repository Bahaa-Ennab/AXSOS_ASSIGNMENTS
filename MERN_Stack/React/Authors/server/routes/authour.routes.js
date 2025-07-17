const AuthourController = require('../controllers/authour.controller');
module.exports= function (app){
    app.get('/api', AuthourController.getAllAuthour);
    app.get('/api/:id',AuthourController.getAuthour);
    app.post('/api/new',AuthourController.createAuthour);
    app.patch('/api/edit/:id',AuthourController.updateAuthour);
    app.delete('/api/delete/:id',AuthourController.deleteAuthour)
}
