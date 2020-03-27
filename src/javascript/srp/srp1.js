class App extends Component {

    state = {
        users: [{name: 'Jim', surname: 'Smith', age: 33}]
    };

    componentDidMount() {
        this.fetchUsers();
    }

    async fetchUsers() {
        const response = await fetch('http://totallyhardcodedurl.com/users');
        const users = await response.json();
        this.setState({users});
    }

    render() {
        return (
            <div className="App">
            <header className="App-header">
            // huge amount code for header
            </header>
            <table>
            <thead>
            <tr>
            <th>First name</th>
        <th>Last name</th>
        <th>Age</th>
        </tr>
        </thead>
        <tbody>
        {this.state.users.map((user, index) => (
            <tr key={index}>
            <td><input value={user.name} onChange={/* update name in the state */}/></td>
        <td><input value={user.surname} onChange={/* update surname in the state*/}/></td>
        <td><input value={user.age} onChange={/* update age in the state */}/></td>
        </tr>
    ))}
    </tbody>
        </table>
        <button onClick={() => this.saveUsersOnTheBackend()}>Save</button>
        </div>
    );
    }

    saveUsersOnTheBackend(row) {
        fetch('http://totallyhardcodedurl.com/users', {
            method: "POST",
            body: JSON.stringify(this.state.users),
        })
    }
}