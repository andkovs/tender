import React from 'react';
import request from 'superagent';
import logo from './logo.svg';
import './App.css';

function testRequest() {
    request('get', '/api/test').send().then(res => {
        alert(JSON.stringify(res.body))
    })
}

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <button onClick={testRequest}>test controller invoke</button>
      </header>
    </div>
  );
}

export default App;
