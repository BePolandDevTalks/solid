export class UserList extends Component {

    static propTypes = {
        fetchUsers: PropTypes.func.isRequired,
        saveUsers: PropTypes.func.isRequired
    };

    state = {
        users: [{id: 1, name: 'Jim', surname: 'Smith', age: 33}]
    };

    componentDidMount() {
        const users = this.props.fetchUsers();
        this.setState({users});
    }

    render() {
        return (
            <div>
            {this.props.children({
                users: this.state.users,
                saveUsers: this.saveUsers,
                onUserChange: this.onUserChange
            })}
    </div>
    );
    }

    saveUsers = () => {
        this.props.saveUsers(this.state.users);
    };

    onUserChange = (user) => {
        // change user in the state
    };
}