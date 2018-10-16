import Vue from 'vue'
import Vuex from 'vuex'
Vue.use(Vuex)

export default new Vuex.Store({
	
state:{
	Category:''
},
mutations:{
	changecategory(state,Category){
		state.Category=Category
	
	}
}

})