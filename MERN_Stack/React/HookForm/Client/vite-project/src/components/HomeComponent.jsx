import React, { useState } from "react";

const HomeComponent = (probs) => {
    const [firstname, setFirstname] = useState("")
    const [lastname, setLastname] = useState("")
    const [email, setEmail] = useState("")
    const [password, setPassword] = useState("")
    const [confirm, setConfirm] = useState("")
    const [firstnameError, setFirstnameError] = useState("");
    const [lastnameError, setLastnameError] = useState("");
    const [emailError, setEmailError] = useState("");
    const [passwordError, setPasswordError] = useState("");
    const [confirmError, setConfirmError] = useState("");
    const [hasBeenSubmitted, setHasBeenSubmitted] = useState(false);

    const createUser = (e) => {
        e.preventDefault()

        const newUser = { firstname, lastname, email, password, confirm }
        setFirstname("")
        setLastname("")
        setEmail("")
        setPassword("")
        setConfirm("")
        setHasBeenSubmitted(true)
        console.log(newUser);
    }

    const handleFirstname = (e) => {
        setFirstname(e.target.value);
        if (e.target.value.length > 10 || e.target.value.length < 3) {
            setFirstnameError("firstname should be between 3 - 10 letters ")
        } else {
            setFirstnameError("")
        }
    }

    const handleLastname = (e) => {
        setLastname(e.target.value);
        if (e.target.value.length > 10 || e.target.value.length < 3) {
            setLastnameError("lastname should be between 3 - 10 letters ")
        } else {
            setLastnameError("")
        }
    }

    const handleEmail = (e) => {
        setEmail(e.target.value);
        const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (!emailRegex.test(e.target.value)) {
            setEmailError("email is invalid")
        } else {
            setEmailError("")
        }
    }

    const handlePassword = (e) => {
        setPassword(e.target.value);
        if (e.target.value.length > 10 || e.target.value.length < 3) {
            setPasswordError("password should be between 3 - 10 letters")
        } else {
            setPasswordError("")
        }
    }

    const handleConfirm = (e) => {
        setConfirm(e.target.value);
        if (e.target.value != password) {
            setConfirmError("the confirmation should match the password")
        } else {
            setConfirmError("")
        }
    }

    return (
        <main>
            <form onSubmit={createUser}>
                {
                    hasBeenSubmitted ?
                        <h3>thank for registering</h3> :
                        <h3>Please Register</h3>
                }
                <div>
                    <label>first name : </label>
                    <input type="text" onChange={handleFirstname} />
                    {
                        firstnameError ?
                            <p>{firstnameError}</p> : ''
                    }
                </div>
                <div>
                    <label>last name : </label>
                    <input type="text" onChange={handleLastname} />
                    {
                        lastnameError ?
                            <p>{lastnameError}</p> : ''
                    }
                </div>
                <div>
                    <label> Email : </label>
                    <input type="email" onChange={handleEmail} />
                    {
                        emailError ?
                            <p>{emailError}</p> : ''
                    }
                </div>
                <div>
                    <label> password : </label>
                    <input type="password" onChange={handlePassword} />
                    {
                        passwordError ?
                            <p>{passwordError}</p> : ''
                    }
                </div>
                <div>
                    <label>Confirm Password : </label>
                    <input type="password" onChange={handleConfirm} />
                    {
                        confirmError ?
                            <p>{confirmError}</p> : ''
                    }
                    {
                    firstnameError || lastnameError || emailError || passwordError || confirmError ?
                    <input type="submit" value="Create Movie" disabled /> :
                    <input type="submit" value="Create Movie" />
                }
                </div>

            </form>

            <p>your form data</p>
            <p>First name: {firstname}</p>
            <p>Last name: {lastname}</p>
            <p>Email : {email}</p>
            <p>Password : {password}</p>
            <p>Confrim Password: {confirm}</p>
        </main>
    )
}
export default HomeComponent