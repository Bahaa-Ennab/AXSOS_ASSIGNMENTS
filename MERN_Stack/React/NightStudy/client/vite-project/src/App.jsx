import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import UserForm from './components/UserForm'
import Groceries from './components/Groceries'

function App() {

  return (
    <>
      <UserForm/>
      <Groceries/>
    </>
  )
}

export default App
