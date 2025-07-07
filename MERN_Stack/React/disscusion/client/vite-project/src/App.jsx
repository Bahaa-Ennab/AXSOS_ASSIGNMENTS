import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Main from './assets/components/Main'
import Home from './assets/components/Home'

function App() {
  const [message, setMessage] = useState([])
  const passMessage= (message) =>{
    setMessage(message);
  }
  return (
    <>
    <Main passMessage={passMessage}/>
    <Home message={message}/>
    </>
  )
}

export default App
