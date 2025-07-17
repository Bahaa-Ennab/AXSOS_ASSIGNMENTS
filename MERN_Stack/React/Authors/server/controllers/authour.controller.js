const Authour = require('../models/authour.model')

module.exports.getAllAuthour = (request, response) => {
    Authour.find({})
        .then(authour => response.json(authour))
        .catch(err => response.status(400).json(err))
}

module.exports.getAuthour = (request, response) => {
    Authour.findOne({_id:request.params.id})
        .then(authour => response.json(authour))
        .catch(err => response.status(400).json(err))
}

module.exports.createAuthour = (request, response) => {
    const { name } = request.body;
    Authour.create({
        name
    })
        .then(authour => response.json(authour))
        .catch(err => response.status(400).json(err))
}

module.exports.updateAuthour = (request, response) => {
    Authour.findOneAndUpdate({_id: request.params.id}, request.body, {new:true})
        .then(updatedAuthour => response.json(updatedAuthour))
        .catch(err => response.status(400).json(err))
}

module.exports.deleteAuthour = (request, response) => {
    Authour.deleteOne({ _id: request.params.id })
        .then(deleteConfirmation => response.json(deleteConfirmation))
        .catch(err =>  response.status(400).json(err))
}
