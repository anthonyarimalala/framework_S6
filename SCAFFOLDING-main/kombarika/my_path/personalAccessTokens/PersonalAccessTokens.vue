<template>
    <header>
        <title>Vue 3</title>
        <link type="text/css" rel="stylesheet" href="https://unpkg.com/bootstrap/dist/css/bootstrap.min.css" />
        <link type="text/css" rel="stylesheet" href="https://unpkg.com/bootstrap-vue@latest/dist/bootstrap-vue.min.css" />
    </header>
    <div class="container">
        <div v-if="loading">
            Loading ...
        </div>
        <!-- Insert start -->
        <div class="row">
            <div class="row justify-content-end">
                <div class="col">
                    <div class="row">
                        <Button variant="primary" class="btn btn-primary" @click="insertForm = !insertForm">
                            Add Personal Access Tokens
                        </Button>
                    </div>
                    <Modal id='insert' v-model:visible="insertForm">
                        <div id="body">
                            <form id="insert" @submit="e => insert(e)">
                                	<div className="mb-3"> 
	 	<label className="form-label">Abilities</label> 
	 	<input className="form-control" type="text" name="abilities" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Last Used At</label> 
	 	<input className="form-control" type="date-time local" name="lastUsedAt" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Tokenable Type</label> 
	 	<input className="form-control" type="text" name="tokenableType" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Tokenable Id</label> 
	 	<input className="form-control" type="number" name="tokenableId" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Expires At</label> 
	 	<input className="form-control" type="date-time local" name="expiresAt" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Updated At</label> 
	 	<input className="form-control" type="date-time local" name="updatedAt" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Name</label> 
	 	<input className="form-control" type="text" name="name" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Created At</label> 
	 	<input className="form-control" type="date-time local" name="createdAt" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Token</label> 
	 	<input className="form-control" type="text" name="token" />
	</div>
	
                                <div className="mb-3">
                                    <Button variant="primary" type= "submit" >
                                        Insert
                                    </Button>
                                </div>
                            </form>
                        </div>
                    </Modal>
                </div>
            </div>
        </div>
        <!-- Insert end -->
        <!-- List start -->
        <div class="row">
            <table class="table">
                <thead>
                    <tr>
                        			<th> Abilities </th>
			<th> Last Used At </th>
			<th> Tokenable Type </th>
			<th> Tokenable Id </th>
			<th> Expires At </th>
			<th> Updated At </th>
			<th> Name </th>
			<th> Created At </th>
			<th> Id </th>
			<th> Token </th>

                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="item in personalAccessTokens" :key="item.id">
                        		<td>{{item.abilities}}</td>
		<td>{{item.lastUsedAt}}</td>
		<td>{{item.tokenableType}}</td>
		<td>{{item.tokenableId}}</td>
		<td>{{item.expiresAt}}</td>
		<td>{{item.updatedAt}}</td>
		<td>{{item.name}}</td>
		<td>{{item.createdAt}}</td>
		<td>{{item.id}}</td>
		<td>{{item.token}}</td>

                        <td>
                            <Button variant="primary" class="btn btn-warning" @click="targetItem = item; updateForm = !updateForm">
                                Edit
                            </Button>
                        </td>
                        <td>
                            <Button variant="danger" class="btn btn-danger" @click="targetItem = item; deleteForm = !deleteForm">
                                Delete
                            </Button>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
        <!-- List end -->
        <!-- Update start -->
        <Modal id="update" v-model:visible="updateForm">
            <h2>Update Personal Access Tokens</h2>
            <div id="body">
                <form id="update" @submit="e => update(e)" v-if="updateForm">
                    	<div className="mb-3"> 
	 	<label className="form-label">Abilities</label> 
	 	<input className="form-control" type="text" name="abilities" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Last Used At</label> 
	 	<input className="form-control" type="date-time local" name="lastUsedAt" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Tokenable Type</label> 
	 	<input className="form-control" type="text" name="tokenableType" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Tokenable Id</label> 
	 	<input className="form-control" type="number" name="tokenableId" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Expires At</label> 
	 	<input className="form-control" type="date-time local" name="expiresAt" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Updated At</label> 
	 	<input className="form-control" type="date-time local" name="updatedAt" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Name</label> 
	 	<input className="form-control" type="text" name="name" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Created At</label> 
	 	<input className="form-control" type="date-time local" name="createdAt" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label"></label> 
	 	<input className="form-control" type="hidden" name="id" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Token</label> 
	 	<input className="form-control" type="text" name="token" />
	</div>
	
                    <div className="mb-3">
                        <Button class="btn btn-primary" type= "submit" >
                            Update
                        </Button>
                      </div>
                </form>
            </div>
        </Modal>
        <!-- Update end -->
        <!-- Delete start -->
        <Modal id="delete" v-model:visible="deleteForm">
            <h2>Delete Personal Access Tokens</h2>
            <div id="body">
                <form id="delete" @submit="del()" v-if="deleteForm">
                    <div className="mb-3">
                        <Button class="btn btn-danger" type= "submit" >
                            Delete
                        </Button>
                      </div>
                </form>
            </div>
        </Modal>
        <!-- Delete end -->
    </div>
</template>

<script>
    import { Modal } from 'usemodal-vue3';
    
    export default{
        data(){
            return {
                url: 'http://localhost:8080',
                items: null,
                targetItem: null,
                insertForm: false,
                deleteForm: false,
                updateForm: false,
                loading: false,
                	personal_access_tokens: null,
	
	
            }
        },
        // eslint-disable-next-line vue/multi-word-component-names
        name: 'Personal Access Tokens',
        components: {
            Modal
        },
        mounted(){
            this.getAll();
        },
        methods: {
            async getAll() {
                /*try {
                    this.loading = true;
                    const response = await fetch(this.url + 'personalAccessTokens');
                    if (!response.ok) {
                        throw new Error('Erreur réseau');
                    }
                    const data = await response.json();
                    this.items = data;
                    this.loading = false;
                } catch (error) {
                    if(this.loading) this.loading = false;
                    alert(error);
                }*/
                try{
                    	fetch(this.url + 'personal_access_tokens') 
	 .then(response => response.json()) 
	.then(data => { this.personal_access_tokens = data; }) 
	 .catch(error => alert(error)); 
	
                }catch (error) {
                    if(this.loading) this.loading = false;
                    alert(error);
                }   
            },
            async update(event) {
                event.preventDefault();
                const updateData = this.fetchFormData(event.target);
                try {
                    const response = await fetch(this.url + 'personalAccessTokens', {
                        method: 'PUT',
                        headers: {
                            'Content-Type': 'application/json'
                        },
                        body: JSON.stringify(updateData)
                    });
                    if (!response.ok) {
                        throw new Error('Erreur réseau');
                    }
                    this.updateForm = false;
                    this.getAll(); // reload local data
                } catch (error) {
                    alert(error);
                }
            },
            async del() {
                try {
                    const response = await fetch(this.url + 'personalAccessTokens', {
                        method: 'DELETE',
                        headers: {
                            'Content-Type': 'application/json',
                        },
                        body: JSON.stringify(this.targetItem)
                    });
                    if (!response.ok) {
                        throw new Error('Erreur réseau');
                    }
                    this.deleteForm = false;
                    this.getAll(); // reload local data
                } catch (error) {
                    alert(error);
                }
            },
            async insert(event) {
                event.preventDefault();
                const insertData = this.fetchFormData(event.target);
                try {
                    const response = await fetch(this.url + 'personalAccessTokens', {
                        method: 'POST',
                        headers: {
                            'Content-Type': 'application/json'
                        },
                        body: JSON.stringify(insertData)
                    });
                    if (!response.ok) {
                        throw new Error('Erreur réseau');
                    }
                    console.log("Réponse", response);
                    this.insertForm = false;
                    this.getAll(); // reload local data
                } catch (error) {
                    alert(error);
                }
            },
            fetchFormData(dataForm) {
                var data = {};
                for (var i = 0; i < dataForm.length; i++) {
                    if (dataForm[i].type !== "submit") {
                        data[dataForm[i].name] = dataForm[i].value;
                    }
                }
                return data;
            }
        }

    }
</script>
