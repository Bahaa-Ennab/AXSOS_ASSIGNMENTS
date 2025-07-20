// // Client - components/ChatApp.jsx
// import { useState, useEffect, useRef } from 'react';
// import io from 'socket.io-client';

// const socket = io('http://localhost:8000');

// const ChatApp = () => {
//   const [name, setName] = useState(localStorage.getItem('name') || '');
//   const [input, setInput] = useState('');
//   const [messages, setMessages] = useState([]);
//   const [joined, setJoined] = useState(false);
//   const messagesEndRef = useRef(null);

//   useEffect(() => {
//     socket.on('message', msg => {
//       setMessages(prev => [...prev, msg]);
//     });

//     socket.on('chatHistory', history => {
//       setMessages(history);
//     });

//     return () => {
//       socket.off('message');
//       socket.off('chatHistory');
//     };
//   }, []);

//   useEffect(() => {
//     messagesEndRef.current?.scrollIntoView({ behavior: 'smooth' });
//   }, [messages]);

//   const handleJoin = () => {
//     if (!name) return;
//     localStorage.setItem('name', name);
//     socket.emit('join', name);
//     setJoined(true);
//   };

//   const sendMessage = () => {
//     if (input.trim()) {
//       socket.emit('sendMessage', input);
//       setInput('');
//     }
//   };

//   if (!joined) {
//     return (
//       <div style={{ textAlign: 'center', marginTop: '100px' }}>
//         <h1>MERN Chat</h1>
//         <p>Get started right now!</p>
//         <input
//           type="text"
//           placeholder="My name..."
//           value={name}
//           onChange={e => setName(e.target.value)}
//         />
//         <button onClick={handleJoin}>Start Chatting</button>
//       </div>
//     );
//   }

//   return (
//     <div style={{ width: '50%', margin: 'auto', marginTop: '30px' }}>
//       <h1>MERN Chat</h1>
//       <div style={{ border: '1px solid #ccc', height: '300px', overflowY: 'scroll', padding: '10px' }}>
//         {messages.map((msg, idx) => (
//           <div key={idx} style={{ textAlign: msg.user === name ? 'right' : 'left' }}>
//             <strong>{msg.user === name ? 'You' : msg.user} said:</strong>
//             <div>{msg.text}</div>
//           </div>
//         ))}
//         <div ref={messagesEndRef} />
//       </div>
//       <input
//         style={{ width: '80%', marginTop: '10px' }}
//         value={input}
//         onChange={e => setInput(e.target.value)}
//         onKeyDown={e => e.key === 'Enter' && sendMessage()}
//       />
//       <button onClick={sendMessage}>Send</button>
//     </div>
//   );
// };

// export default ChatApp;
