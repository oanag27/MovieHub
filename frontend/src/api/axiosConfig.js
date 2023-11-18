import axios from 'axios';
export default axios.create(
    {
        baseURL:'http://localhost:8080',
        headers:{"ngrok-skip-browser-warning":"true"} //client http requests to not be blocked by cause
    }
);
