import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import AppComponent from './components/appComponent'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <AppComponent/>
    </>
  )
}

export default App
