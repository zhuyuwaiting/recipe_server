(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[18],{"3iv9":function(e,t,a){"use strict";a.r(t);var n,i,l,r,c=a("jehZ"),d=a.n(c),s=(a("IzEo"),a("bx4M")),o=(a("g9YV"),a("wCAj")),m=(a("/zsF"),a("PArb")),p=(a("Pwec"),a("CtXQ")),u=(a("giR+"),a("fyUT")),h=(a("miYZ"),a("tsqr")),E=a("p0pE"),f=a.n(E),y=a("2Taf"),g=a.n(y),S=a("vZ4D"),N=a.n(S),T=a("l4Ni"),M=a.n(T),v=a("ujKo"),C=a.n(v),b=a("MhPg"),I=a.n(b),R=(a("2qtc"),a("kLXV")),V=(a("14J3"),a("BMrR")),w=(a("+L6B"),a("2/Rp")),k=(a("jCWc"),a("kPKH")),F=(a("7Kak"),a("9yH6")),D=(a("OaEy"),a("2fM7")),x=(a("5NDa"),a("5rEg")),H=(a("FJo9"),a("L41K")),O=(a("y8nQ"),a("Vl3Y")),W=a("q1tI"),A=a.n(W),Y=a("MuoO"),B=a("wd/R"),_=a.n(B),L=a("3a4m"),j=a.n(L),q=a("CkN6"),K=a("zHco"),z=a("SWcT"),P=a.n(z),J=O["a"].Item,Z=(H["a"].Step,x["a"].TextArea,D["a"].Option),Q=(F["a"].Group,O["a"].create()(function(e){var t=e.modalVisible,a=e.form,n=e.handleMedicineAdd,i=e.handleModalVisible,l=e.selectedRows,r=e.handleSelectRows,c=e.loading,d=e.medicines,s=e.handleStandardTableChange,o=e.recipeType,m=e.handleMedicineSearch,p=e.handleMedicineFormReset,u=e.getColumns,h=function(){a.validateFields(function(e,t){e||(a.resetFields(),n(t))})};console.log(d);var E=u(o);console.log(E);var f=function(){var t=e.form.getFieldDecorator;return A.a.createElement(O["a"],{onSubmit:function(e){return m(e,a)},layout:"inline"},A.a.createElement(V["a"],{gutter:{md:8,lg:24,xl:48}},A.a.createElement(k["a"],{md:8,sm:24},A.a.createElement(J,{label:"\u836f\u54c1\u540d\u79f0"},t("name")(A.a.createElement(x["a"],{placeholder:"\u8bf7\u8f93\u5165"})))),A.a.createElement(k["a"],{md:8,sm:24},A.a.createElement("span",{className:P.a.submitButtons},A.a.createElement(w["a"],{type:"primary",htmlType:"submit"},"\u67e5\u8be2"),A.a.createElement(w["a"],{style:{marginLeft:8},onClick:function(){return p(a)}},"\u91cd\u7f6e")))))};return A.a.createElement(R["a"],{destroyOnClose:!0,title:"\u836f\u54c1\u9009\u62e9",visible:t,style:{top:0},width:1e3,onOk:h,onCancel:function(){return i(!1)}},A.a.createElement("div",{className:P.a.tableListForm},f()),A.a.createElement(q["a"],{selectedRows:l,loading:c,data:d,columns:E,onSelectRow:r,onChange:s}))})),X=(n=Object(Y["connect"])(function(e){var t=e.recipeTemplate,a=e.loading,n=e.medicine;return{recipeTemplate:t,loading:a.models.recipeTemplate,medicine:n,medicineLoading:a.models.medicine}}),i=O["a"].create(),n(l=i((r=function(e){function t(){var e,a;g()(this,t);for(var n=arguments.length,i=new Array(n),l=0;l<n;l++)i[l]=arguments[l];return a=M()(this,(e=C()(t)).call.apply(e,[this].concat(i))),a.state={modalVisible:!1,updateModalVisible:!1,expandForm:!1,selectedRows:[],formValues:{},stepFormValues:{},updateRow:{},recipeType:void 0,selectedMedicines:[]},a.handleStandardTableChange=function(e,t,n){var i=a.props.dispatch,l=a.state,r=l.formValues,c=l.recipeType,d=Object.keys(t).reduce(function(e,a){var n=f()({},e);return n[a]=getValue(t[a]),n},{}),s=f()({current:e.current,pageSize:e.pageSize},r,d);n.field&&(s.sorter="".concat(n.field,"_").concat(n.order)),i({type:"medicine/fetch",payload:f()({},s,{type:"CHINESE"==c?"CHINESE_MEDICINE":"WESTERN_MEDICINE"}),callback:function(e){a.setState({selectedRows:[]})}})},a.handleFormReset=function(){var e=a.props,t=e.form,n=e.dispatch;t.resetFields(),a.setState({formValues:{}}),n({type:"recipeTemplate/fetch",payload:{}})},a.handleBack=function(){j.a.push("/recipe/template")},a.handleMedicineFormReset=function(e){var t=a.props.dispatch,n=a.state.recipeType;e.resetFields(),a.setState({formValues:{}}),t({type:"medicine/fetch",payload:{type:"CHINESE"==n?"CHINESE_MEDICINE":"WESTERN_MEDICINE"}})},a.onMedicineNumChange=function(e,t){var n=a.state.selectedMedicines;n[t].medicineNum=e,a.setState({selectedMedicines:n})},a.onMedicineDel=function(e){var t=a.state.selectedMedicines;t=t.filter(function(t){return t.medicineNo!=e.medicineNo}),a.setState({selectedMedicines:t})},a.handleSelectRows=function(e){var t=a.state.selectedMedicines,n=e.filter(function(e){for(var a=0;a<t.length;a++)if(e.medicineNo==t[a].medicineNo)return!1;return!0}).map(function(e){return e.medicineNum=1,e});t=t.concat(n),a.setState({selectedRows:e,selectedMedicines:t})},a.handleSearch=function(e){e.preventDefault();var t=a.props,n=t.dispatch,i=t.form;i.validateFields(function(e,t){if(!e){var i=f()({},t,{updatedAt:t.updatedAt&&t.updatedAt.valueOf()});a.setState({formValues:i}),n({type:"recipeTemplate/fetch",payload:i})}})},a.handleModalVisible=function(e){var t=a.props.dispatch;if(!e)return t({type:"medicine/flush"}),void a.setState({modalVisible:!1});var n=a.state.recipeType;n?(t({type:"medicine/fetch",payload:{type:"CHINESE"==n?"CHINESE_MEDICINE":"WESTERN_MEDICINE"}}),a.setState({modalVisible:!!e})):h["a"].error("\u8bf7\u5148\u9009\u62e9\u5904\u65b9\u7c7b\u578b")},a.handleRecipeTypeChange=function(e){a.setState({recipeType:e,selectedRows:[]})},a.handleOK=function(){var e=a.props,t=e.dispatch,n=e.form,i=a.state.selectedMedicines;if(!i||i.length<=0)h["a"].error("\u836f\u54c1\u4fe1\u606f\u4e0d\u53ef\u4e3a\u7a7a\uff0c\u8bf7\u6dfb\u52a0\u836f\u54c1\u4fe1\u606f");else{var l=i.map(function(e){return{medicineNo:e.medicineNo,medicineNum:e.medicineNum}});n.validateFields(function(e,i){e||(console.log(l),console.log(i),t({type:"recipeTemplate/update",payload:f()({},i,{recipeTemplateDetailVOS:l,recipeTemplateNo:a.props.match.params.recipeTemplateNo}),callback:function(e){e&&(h["a"].success("\u4fee\u6539\u6210\u529f"),n.resetFields(),a.setState({selectedRows:[],selectedMedicines:[]}),j.a.push("/recipe/template"))}}))})}},a.handleMedicineAdd=function(e){a.handleModalVisible(!1)},a.getColumns=function(e){var t=[{title:"\u836f\u54c1\u540d\u79f0",dataIndex:"name"},{title:"\u836f\u54c1\u5355\u4f4d",dataIndex:"unitStr"},{title:"\u670d\u7528\u65b9\u5f0f",dataIndex:"takingWayInfo",render:function(e,t){return e?e.name:t.takingWay}},{title:"\u5907\u6ce8",dataIndex:"memo"},{title:"\u521b\u5efa\u65f6\u95f4",dataIndex:"createTime",key:"createTime",render:function(e,t){var a=_()(new Date(e)).format("YYYY-MM-DD HH:mm:ss");return a}}];return"WESTERN"==e&&(t=[{title:"\u836f\u54c1\u540d\u79f0",dataIndex:"name"},{title:"\u89c4\u683c",dataIndex:"spec"},{title:"\u670d\u7528\u65b9\u5f0f",dataIndex:"takingWayInfo",render:function(e,t){return e?e.name:t.unit}},{title:"\u521b\u5efa\u65f6\u95f4",dataIndex:"createTime",key:"createTime",render:function(e,t){var a=_()(new Date(e)).format("YYYY-MM-DD HH:mm:ss");return a}}]),t},a.handleMedicineSearch=function(e,t){e.preventDefault();var n=a.props.dispatch,i=a.state.recipeType;t.validateFields(function(e,t){if(!e){var l=f()({},t,{type:"CHINESE"==i?"CHINESE_MEDICINE":"WESTERN_MEDICINE"});a.setState({formValues:l}),n({type:"medicine/fetch",payload:l})}})},a}return I()(t,e),N()(t,[{key:"componentDidMount",value:function(){var e=this,t=this.props.dispatch,a=this.props.match.params.recipeTemplateNo;t({type:"recipeTemplate/query",payload:{recipeTemplateNo:a},callback:function(t,a){if(t){var n=a.recipeTemplateVO.recipeTemplateDetailVOS.map(function(e){var t=e.medicineVO;return t["medicineNum"]=e.medicineNum,t});e.setState({selectedMedicines:n,recipeType:a.recipeTemplateVO.recipeType})}}})}},{key:"renderSimpleForm",value:function(){var e=this,t=this.props.form.getFieldDecorator;return A.a.createElement(O["a"],{onSubmit:this.handleSearch,layout:"inline"},A.a.createElement(V["a"],{gutter:{md:8,lg:24,xl:48}},A.a.createElement(k["a"],{md:8,sm:24},A.a.createElement(J,{label:"\u5904\u65b9\u7f16\u53f7"},t("recipeTemplateNo")(A.a.createElement(x["a"],{placeholder:"\u8bf7\u8f93\u5165"})))),A.a.createElement(k["a"],{md:8,sm:24},A.a.createElement(J,{label:"\u75be\u75c5"},t("disease")(A.a.createElement(x["a"],{placeholder:"\u8bf7\u8f93\u5165"})))),A.a.createElement(k["a"],{md:8,sm:24},A.a.createElement("a",{onClick:function(){return e.test(!0)}},"dddd"))),A.a.createElement(V["a"],{gutter:{md:8,lg:24,xl:48}},A.a.createElement(k["a"],{md:8,sm:24},A.a.createElement(J,{label:"\u5904\u65b9\u7c7b\u578b"},t("recipeType")(A.a.createElement(D["a"],{placeholder:"\u8bf7\u9009\u62e9",style:{width:"100%"}},[{type:"",name:"\u6240\u6709"},{type:"CHINESE",name:"\u4e2d\u836f\u5904\u65b9"},{type:"WESTERN",name:"\u897f\u836f\u5904\u65b9"}].map(function(e){return A.a.createElement(Z,{value:e.type},e.name)}))))),A.a.createElement(k["a"],{md:8,sm:24},A.a.createElement("span",{className:P.a.submitButtons},A.a.createElement(w["a"],{type:"primary",htmlType:"submit"},"\u67e5\u8be2"),A.a.createElement(w["a"],{style:{marginLeft:8},onClick:this.handleFormReset},"\u91cd\u7f6e")))))}},{key:"renderForm",value:function(){this.state.expandForm;return this.renderSimpleForm()}},{key:"render",value:function(){var e=this,t=this.props,a=t.recipeTemplate,n=(a.list,a.pagination,a.enumInfos,a.queryObject),i=(t.loading,t.form),l=t.medicineLoading,r=t.medicine,c=this.state,h=c.selectedRows,E=c.modalVisible,f=(c.updateModalVisible,c.stepFormValues,c.updateRow,c.selectedMedicines),y=c.recipeType,g=this.getColumns(y),S=this.onMedicineNumChange,N=this.onMedicineDel;g.pop(),g.push({title:"\u6570\u91cf",dataIndex:"medicineNum",render:function(e,t,a){return A.a.createElement(u["a"],{min:1,max:1e3,defaultValue:e,onChange:function(e){return S(e,a)}})}},{title:"\u5355\u4f4d",dataIndex:"unitStr"}),g.splice(1,1),g.push({title:"",dataIndex:"operator",render:function(e,t,a){return A.a.createElement(p["a"],{type:"delete",onClick:function(){return N(t)}})}}),console.log(g);var T={handleMedicineAdd:this.handleMedicineAdd,handleModalVisible:this.handleModalVisible,handleSelectRows:this.handleSelectRows,handleStandardTableChange:this.handleStandardTableChange,handleMedicineSearch:this.handleMedicineSearch,handleMedicineFormReset:this.handleMedicineFormReset,getColumns:this.getColumns};return A.a.createElement(K["a"],null,A.a.createElement(s["a"],{bordered:!1},A.a.createElement(O["a"],null,A.a.createElement(J,{labelCol:{span:5},wrapperCol:{span:15},label:"\u5904\u65b9\u7c7b\u578b"},i.getFieldDecorator("recipeType",{rules:[{required:!0,message:"\u5904\u65b9\u7c7b\u578b\u4e0d\u53ef\u4ee5\u4e3a\u7a7a"}],initialValue:n?n.recipeType:""})(A.a.createElement(D["a"],{disabled:!0,placeholder:"\u8bf7\u9009\u62e9",style:{width:"100%"},onChange:function(t){return e.handleRecipeTypeChange(t)}},[{type:"CHINESE",name:"\u4e2d\u836f\u5904\u65b9"},{type:"WESTERN",name:"\u897f\u836f\u5904\u65b9"}].map(function(e){return A.a.createElement(Z,{value:e.type},e.name)})))),A.a.createElement(J,{labelCol:{span:5},wrapperCol:{span:15},label:"\u75be\u75c5\u540d\u79f0"},i.getFieldDecorator("disease",{rules:[{required:!0,message:"\u75be\u75c5\u540d\u79f0\u4e0d\u53ef\u4ee5\u4e3a\u7a7a"}],initialValue:n?n.disease:""})(A.a.createElement(x["a"],{placeholder:"\u8bf7\u8f93\u5165\u75be\u75c5\u540d\u79f0"}))),f&&f.length>0?A.a.createElement(m["a"],{style:{margin:"40px 0 24px"}}):"",f&&f.length>0?A.a.createElement(o["a"],{columns:g,dataSource:f}):"",A.a.createElement(m["a"],{style:{margin:"40px 0 24px"}}),A.a.createElement(V["a"],{gutter:{md:8,lg:24,xl:48}},A.a.createElement(k["a"],{md:4,offset:8,sm:24},A.a.createElement("span",{className:P.a.submitButtons},A.a.createElement(w["a"],{type:"primary",onClick:function(){return e.handleModalVisible(!0)},disabled:!y},"\u6dfb\u52a0\u836f\u54c1"))),A.a.createElement(k["a"],{md:4,sm:24},A.a.createElement("span",{className:P.a.submitButtons},A.a.createElement(w["a"],{type:"primary",onClick:function(){return e.handleOK()},disabled:!y},"\u63d0\u4ea4\u8868\u5355"))),A.a.createElement(k["a"],{md:4,offset:4,sm:24},A.a.createElement("span",{className:P.a.submitButtons},A.a.createElement(w["a"],{type:"primary",onClick:function(){return e.handleBack()}},"\u8fd4\u56de")))))),A.a.createElement(Q,d()({},T,{modalVisible:E,selectedRows:h,loading:l,medicines:r,recipeType:y})))}}]),t}(W["PureComponent"]),l=r))||l)||l);t["default"]=X}}]);