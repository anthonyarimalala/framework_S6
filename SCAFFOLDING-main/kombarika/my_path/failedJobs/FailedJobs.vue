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
                            Add Failed Jobs
                        </Button>
                    </div>
                    <Modal id='insert' v-model:visible="insertForm">
                        <div id="body">
                            <form id="insert" @submit="e => insert(e)">
                                	<div className="mb-3"> 
	 	<label className="form-label">Exception</label> 
	 	<input className="form-control" type="text" name="exception" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Payload</label> 
	 	<input className="form-control" type="text" name="payload" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Connection</label> 
	 	<input className="form-control" type="text" name="connection" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Failed At</label> 
	 	<input className="form-control" type="date-time local" name="failedAt" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Uuid</label> 
	 	<input className="form-control" type="text" name="uuid" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Queue</label> 
	 	<input className="form-control" type="text" name="queue" />
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
                        			<th> Exception </th>
			<th> Payload </th>
			<th> Connection </th>
			<th> Id </th>
			<th> Failed At </th>
			<th> Uuid </th>
			<th> Queue </th>

                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="item in failedJobs" :key="item.id">
                        		<td>{{item.exception}}</td>
		<td>{{item.payload}}</td>
		<td>{{item.connection}}</td>
		<td>{{item.id}}</td>
		<td>{{item.failedAt}}</td>
		<td>{{item.uuid}}</td>
		<td>{{item.queue}}</td>

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
            <h2>Update Failed Jobs</h2>
            <div id="body">
                <form id="update" @submit="e => update(e)" v-if="updateForm">
                    	<div className="mb-3"> 
	 	<label className="form-label">Exception</label> 
	 	<input className="form-control" type="text" name="exception" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Payload</label> 
	 	<input className="form-control" type="text" name="payload" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Connection</label> 
	 	<input className="form-control" type="text" name="connection" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label"></label> 
	 	<input className="form-control" type="hidden" name="id" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Failed At</label> 
	 	<input className="form-control" type="date-time local" name="failedAt" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Uuid</label> 
	 	<input className="form-control" type="text" name="uuid" />
	</div>
	<div className="mb-3"> 
	 	<label className="form-label">Queue</label> 
	 	<input className="form-control" type="text" name="queue" />
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
            <h2>Delete Failed Jobs</h2>
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
                	failed_jobs: null,
	
	
            }
        },
        // eslint-disable-next-line vue/multi-word-component-names
        name: 'Failed Jobs',
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
                    const response = await fetch(this.url + 'failedJobs');
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
                    	fetch(this.url + 'failed_jobs') 
	 .then(response => response.json()) 
	.then(data => { this.failed_jobs = data; }) 
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
                    const response = await fetch(this.url + 'failedJobs', {
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
                    const response = await fetch(this.url + 'failedJobs', {
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
                    const response = await fetch(this.url + 'failedJobs', {
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
