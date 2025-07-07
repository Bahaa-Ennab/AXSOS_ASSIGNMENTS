import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import FormComponent from './components/FormComponent'
import DisplayComponent from './components/DisplayComponent'

function App() {
  const [message, setMessage] = useState([])
  const passMessage = (message) => {
    setMessage(message);
  }
  return (
    <>
      <FormComponent passMessage={passMessage} />
      <DisplayComponent  message={message}/>
    </>
  )
}

export default App
