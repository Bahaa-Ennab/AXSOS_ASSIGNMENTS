import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import PersonComponent from './components/PersonCard'

function App() {
  const [count, setCount] = useState(0)

  return ( 
    <>
      <PersonComponent firstname = "sami" lastname = "btata" age = {20} haircolor = "Brown"/>
      <PersonComponent firstname = "sami" lastname = "btata" age = {20} haircolor = "Brown"/>
      <PersonComponent firstname = "sami" lastname = "btata" age = {20} haircolor = "Brown"/>
      <PersonComponent firstname = "sami" lastname = "btata" age = {20} haircolor = "Brown"/>
    </>
  )
}

export default App
