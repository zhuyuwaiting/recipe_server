(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[18],{"3iv9":function(e,t,a){"use strict";a.r(t);var n,i,l,r,c=a("jehZ"),d=a.n(c),o=(a("IzEo"),a("bx4M")),s=(a("g9YV"),a("wCAj")),m=(a("/zsF"),a("PArb")),p=(a("Pwec"),a("CtXQ")),u=(a("giR+"),a("fyUT")),h=(a("5Dmo"),a("3S7+")),f=(a("miYZ"),a("tsqr")),E=a("p0pE"),y=a.n(E),g=a("2Taf"),N=a.n(g),b=a("vZ4D"),S=a.n(b),T=a("l4Ni"),C=a.n(T),I=a("ujKo"),M=a.n(I),v=a("MhPg"),V=a.n(v),w=(a("2qtc"),a("kLXV")),R=(a("14J3"),a("BMrR")),D=(a("+L6B"),a("2/Rp")),F=(a("jCWc"),a("kPKH")),x=(a("7Kak"),a("9yH6")),k=(a("OaEy"),a("2fM7")),H=(a("5NDa"),a("5rEg")),O=(a("FJo9"),a("L41K")),W=(a("y8nQ"),a("Vl3Y")),A=a("q1tI"),Y=a.n(A),B=a("MuoO"),_=a("wd/R"),q=a.n(_),L=a("3a4m"),j=a.n(L),K=a("CkN6"),z=a("zHco"),P=a("SWcT"),U=a.n(P),J=W["a"].Item,Z=(O["a"].Step,H["a"].TextArea,k["a"].Option),Q=(x["a"].Group,W["a"].create()(function(e){var t=e.modalVisible,a=e.form,n=e.handleMedicineAdd,i=e.handleModalVisible,l=e.selectedRows,r=e.handleSelectRows,c=e.loading,d=e.medicines,o=e.handleStandardTableChange,s=e.recipeType,m=e.handleMedicineSearch,p=e.handleMedicineFormReset,u=e.getColumns,h=function(){a.validateFields(function(e,t){e||(a.resetFields(),n(t))})};console.log(d);var f=u(s);console.log(f);var E=function(){var t=e.form.getFieldDecorator;return Y.a.createElement(W["a"],{onSubmit:function(e){return m(e,a)},layout:"inline"},Y.a.createElement(R["a"],{gutter:{md:8,lg:24,xl:48}},Y.a.createElement(F["a"],{md:8,sm:24},Y.a.createElement(J,{label:"\u836f\u54c1\u7f16\u53f7"},t("medicineNo")(Y.a.createElement(H["a"],{placeholder:"\u8bf7\u8f93\u5165"})))),Y.a.createElement(F["a"],{md:8,sm:24},Y.a.createElement(J,{label:"\u836f\u54c1\u540d\u79f0"},t("name")(Y.a.createElement(H["a"],{placeholder:"\u8bf7\u8f93\u5165"})))),Y.a.createElement(F["a"],{md:8,sm:24},Y.a.createElement("span",{className:U.a.submitButtons},Y.a.createElement(D["a"],{type:"primary",htmlType:"submit"},"\u67e5\u8be2"),Y.a.createElement(D["a"],{style:{marginLeft:8},onClick:function(){return p(a)}},"\u91cd\u7f6e")))))};return Y.a.createElement(w["a"],{destroyOnClose:!0,title:"\u836f\u54c1\u9009\u62e9",visible:t,style:{top:0},width:1e3,onOk:h,onCancel:function(){return i(!1)}},Y.a.createElement("div",{className:U.a.tableListForm},E()),Y.a.createElement(K["a"],{selectedRows:l,loading:c,data:d,columns:f,onSelectRow:r,onChange:o}))})),X=(n=Object(B["connect"])(function(e){var t=e.recipeTemplate,a=e.loading,n=e.medicine;return{recipeTemplate:t,loading:a.models.recipeTemplate,medicine:n,medicineLoading:a.models.medicine}}),i=W["a"].create(),n(l=i((r=function(e){function t(){var e,a;N()(this,t);for(var n=arguments.length,i=new Array(n),l=0;l<n;l++)i[l]=arguments[l];return a=C()(this,(e=M()(t)).call.apply(e,[this].concat(i))),a.state={modalVisible:!1,updateModalVisible:!1,expandForm:!1,selectedRows:[],formValues:{},stepFormValues:{},updateRow:{},recipeType:void 0,selectedMedicines:[]},a.handleStandardTableChange=function(e,t,n){var i=a.props.dispatch,l=a.state,r=l.formValues,c=l.recipeType,d=Object.keys(t).reduce(function(e,a){var n=y()({},e);return n[a]=getValue(t[a]),n},{}),o=y()({current:e.current,pageSize:e.pageSize},r,d);n.field&&(o.sorter="".concat(n.field,"_").concat(n.order)),i({type:"medicine/fetch",payload:y()({},o,{type:"CHINESE"==c?"CHINESE_MEDICINE":"WESTERN_MEDICINE"}),callback:function(e){a.setState({selectedRows:[]})}})},a.handleFormReset=function(){var e=a.props,t=e.form,n=e.dispatch;t.resetFields(),a.setState({formValues:{}}),n({type:"recipeTemplate/fetch",payload:{}})},a.handleBack=function(){j.a.push("/recipe/template")},a.handleMedicineFormReset=function(e){var t=a.props.dispatch,n=a.state.recipeType;e.resetFields(),a.setState({formValues:{}}),t({type:"medicine/fetch",payload:{type:"CHINESE"==n?"CHINESE_MEDICINE":"WESTERN_MEDICINE"}})},a.onMedicineNumChange=function(e,t){var n=a.state.selectedMedicines;n[t].medicineNum=e,a.setState({selectedMedicines:n})},a.onMedicineDel=function(e){var t=a.state.selectedMedicines;t=t.filter(function(t){return t.medicineNo!=e.medicineNo}),a.setState({selectedMedicines:t})},a.handleSelectRows=function(e){var t=a.state.selectedMedicines,n=e.filter(function(e){for(var a=0;a<t.length;a++)if(e.medicineNo==t[a].medicineNo)return!1;return!0}).map(function(e){return e.medicineNum=1,e});t=t.concat(n),a.setState({selectedRows:e,selectedMedicines:t})},a.handleSearch=function(e){e.preventDefault();var t=a.props,n=t.dispatch,i=t.form;i.validateFields(function(e,t){if(!e){var i=y()({},t,{updatedAt:t.updatedAt&&t.updatedAt.valueOf()});a.setState({formValues:i}),n({type:"recipeTemplate/fetch",payload:i})}})},a.handleModalVisible=function(e){var t=a.props.dispatch;if(!e)return t({type:"medicine/flush"}),void a.setState({modalVisible:!1});var n=a.state.recipeType;n?(t({type:"medicine/fetch",payload:{type:"CHINESE"==n?"CHINESE_MEDICINE":"WESTERN_MEDICINE"}}),a.setState({modalVisible:!!e})):f["a"].error("\u8bf7\u5148\u9009\u62e9\u5904\u65b9\u7c7b\u578b")},a.handleRecipeTypeChange=function(e){a.setState({recipeType:e,selectedRows:[]})},a.handleOK=function(){var e=a.props,t=e.dispatch,n=e.form,i=a.state.selectedMedicines;if(!i||i.length<=0)f["a"].error("\u836f\u54c1\u4fe1\u606f\u4e0d\u53ef\u4e3a\u7a7a\uff0c\u8bf7\u6dfb\u52a0\u836f\u54c1\u4fe1\u606f");else{var l=i.map(function(e){return{medicineNo:e.medicineNo,medicineNum:e.medicineNum}});n.validateFields(function(e,i){e||(console.log(l),console.log(i),t({type:"recipeTemplate/update",payload:y()({},i,{recipeTemplateDetailVOS:l}),callback:function(e){e&&(f["a"].success("\u4fee\u6539\u6210\u529f"),n.resetFields(),a.setState({selectedRows:[],selectedMedicines:[]}),j.a.push("/recipe/template"))}}))})}},a.handleMedicineAdd=function(e){a.handleModalVisible(!1)},a.getColumns=function(e){var t=[{title:"\u836f\u54c1\u7f16\u53f7",dataIndex:"medicineNo"},{title:"\u836f\u54c1\u540d\u79f0",dataIndex:"name"},{title:"\u82f1\u6587\u540d\u79f0",dataIndex:"englishName"},{title:"\u836f\u54c1\u5355\u4f4d",dataIndex:"unitInfo",render:function(e,t){return e?e.name:t.unit}},{title:"\u670d\u7528\u65b9\u5f0f",dataIndex:"takingWayInfo",render:function(e,t){return e?e.name:t.takingWay}},{title:"\u521b\u5efa\u65f6\u95f4",dataIndex:"createTime",key:"createTime",render:function(e,t){var a=q()(new Date(e)).format("YYYY-MM-DD HH:mm:ss");return a}}];return"WESTERN"==e&&(t=[{title:"\u836f\u54c1\u7f16\u53f7",dataIndex:"medicineNo",render:function(e,t){return Y.a.createElement(h["a"],{placement:"rightTop",title:e},e.substring(0,5)+"...")}},{title:"\u836f\u54c1\u540d\u79f0",dataIndex:"name"},{title:"\u82f1\u6587\u540d\u79f0",dataIndex:"englishName"},{title:"\u5355\u5143\u7ec4\u6210",dataIndex:"cellWeight",render:function(e,t){return(t.cellWeight/100).toFixed(2)+""+(t.cellUnitInfo?t.cellUnitInfo.name:"")+"*"+t.cellNum+"/"+t.unitInfo.name}},{title:"\u6bcf\u6b21\u5242\u91cf",dataIndex:"eachDose",render:function(e,t){return(t.eachDose/100).toFixed(2)+(t.cellUnitInfo?t.cellUnitInfo.name:"")}},{title:"\u6bcf\u65e5\u6b21\u6570",dataIndex:"dailyTimes",render:function(e,t){return t.dailyTimes+"\u6b21"}},{title:"\u670d\u7528\u65b9\u5f0f",dataIndex:"takingWayInfo",render:function(e,t){return e?e.name:t.unit}},{title:"\u521b\u5efa\u65f6\u95f4",dataIndex:"createTime",key:"createTime",render:function(e,t){var a=q()(new Date(e)).format("YYYY-MM-DD HH:mm:ss");return a}}]),t},a.handleMedicineSearch=function(e,t){e.preventDefault();var n=a.props.dispatch,i=a.state.recipeType;t.validateFields(function(e,t){if(!e){var l=y()({},t,{type:"CHINESE"==i?"CHINESE_MEDICINE":"WESTERN_MEDICINE"});a.setState({formValues:l}),n({type:"medicine/fetch",payload:l})}})},a}return V()(t,e),S()(t,[{key:"componentDidMount",value:function(){var e=this,t=this.props.dispatch,a=this.props.match.params.recipeTemplateNo;t({type:"recipeTemplate/query",payload:{recipeTemplateNo:a},callback:function(t,a){if(t){var n=a.recipeTemplateVO.recipeTemplateDetailVOS.map(function(e){var t=e.medicineVO;return t["medicineNum"]=e.medicineNum,t});e.setState({selectedMedicines:n,recipeType:a.recipeTemplateVO.recipeType})}}})}},{key:"renderSimpleForm",value:function(){var e=this,t=this.props.form.getFieldDecorator;return Y.a.createElement(W["a"],{onSubmit:this.handleSearch,layout:"inline"},Y.a.createElement(R["a"],{gutter:{md:8,lg:24,xl:48}},Y.a.createElement(F["a"],{md:8,sm:24},Y.a.createElement(J,{label:"\u5904\u65b9\u7f16\u53f7"},t("recipeTemplateNo")(Y.a.createElement(H["a"],{placeholder:"\u8bf7\u8f93\u5165"})))),Y.a.createElement(F["a"],{md:8,sm:24},Y.a.createElement(J,{label:"\u75be\u75c5"},t("disease")(Y.a.createElement(H["a"],{placeholder:"\u8bf7\u8f93\u5165"})))),Y.a.createElement(F["a"],{md:8,sm:24},Y.a.createElement("a",{onClick:function(){return e.test(!0)}},"dddd"))),Y.a.createElement(R["a"],{gutter:{md:8,lg:24,xl:48}},Y.a.createElement(F["a"],{md:8,sm:24},Y.a.createElement(J,{label:"\u5904\u65b9\u7c7b\u578b"},t("recipeType")(Y.a.createElement(k["a"],{placeholder:"\u8bf7\u9009\u62e9",style:{width:"100%"}},[{type:"",name:"\u6240\u6709"},{type:"CHINESE",name:"\u4e2d\u836f\u5904\u65b9"},{type:"WESTERN",name:"\u897f\u836f\u5904\u65b9"}].map(function(e){return Y.a.createElement(Z,{value:e.type},e.name)}))))),Y.a.createElement(F["a"],{md:8,sm:24},Y.a.createElement(J,{label:"\u79d1\u522b"},t("classfication")(Y.a.createElement(H["a"],{placeholder:"\u8bf7\u8f93\u5165"})))),Y.a.createElement(F["a"],{md:8,sm:24},Y.a.createElement("span",{className:U.a.submitButtons},Y.a.createElement(D["a"],{type:"primary",htmlType:"submit"},"\u67e5\u8be2"),Y.a.createElement(D["a"],{style:{marginLeft:8},onClick:this.handleFormReset},"\u91cd\u7f6e")))))}},{key:"renderForm",value:function(){this.state.expandForm;return this.renderSimpleForm()}},{key:"render",value:function(){var e=this,t=this.props,a=t.recipeTemplate,n=(a.list,a.pagination,a.enumInfos,a.queryObject),i=(t.loading,t.form),l=t.medicineLoading,r=t.medicine,c=this.state,h=c.selectedRows,f=c.modalVisible,E=(c.updateModalVisible,c.stepFormValues,c.updateRow,c.selectedMedicines),y=c.recipeType,g=this.getColumns(y),N=this.onMedicineNumChange,b=this.onMedicineDel;g.pop(),g.push({title:"\u6570\u91cf",dataIndex:"medicineNum",render:function(e,t,a){return Y.a.createElement(u["a"],{min:1,max:1e3,defaultValue:e,onChange:function(e){return N(e,a)}})}}),g.push({title:"",dataIndex:"operator",render:function(e,t,a){return Y.a.createElement(p["a"],{type:"delete",onClick:function(){return b(t)}})}}),console.log(g);var S={handleMedicineAdd:this.handleMedicineAdd,handleModalVisible:this.handleModalVisible,handleSelectRows:this.handleSelectRows,handleStandardTableChange:this.handleStandardTableChange,handleMedicineSearch:this.handleMedicineSearch,handleMedicineFormReset:this.handleMedicineFormReset,getColumns:this.getColumns};return Y.a.createElement(z["a"],null,Y.a.createElement(o["a"],{bordered:!1},Y.a.createElement(W["a"],null,Y.a.createElement(J,{labelCol:{span:5},wrapperCol:{span:15},label:"\u6a21\u677f\u7f16\u53f7"},i.getFieldDecorator("recipeTemplateNo",{rules:[{required:!0,message:"\u6a21\u677f\u7f16\u53f7\u4e0d\u53ef\u4ee5\u4e3a\u7a7a"}],initialValue:n?n.recipeTemplateNo:""})(Y.a.createElement(H["a"],{placeholder:"\u8bf7\u8f93\u5165\u75be\u75c5\u540d\u79f0",disabled:!0}))),Y.a.createElement(J,{labelCol:{span:5},wrapperCol:{span:15},label:"\u5904\u65b9\u7c7b\u578b"},i.getFieldDecorator("recipeType",{rules:[{required:!0,message:"\u5904\u65b9\u7c7b\u578b\u4e0d\u53ef\u4ee5\u4e3a\u7a7a"}],initialValue:n?n.recipeType:""})(Y.a.createElement(k["a"],{disabled:!0,placeholder:"\u8bf7\u9009\u62e9",style:{width:"100%"},onChange:function(t){return e.handleRecipeTypeChange(t)}},[{type:"CHINESE",name:"\u4e2d\u836f\u5904\u65b9"},{type:"WESTERN",name:"\u897f\u836f\u5904\u65b9"}].map(function(e){return Y.a.createElement(Z,{value:e.type},e.name)})))),Y.a.createElement(J,{labelCol:{span:5},wrapperCol:{span:15},label:"\u75be\u75c5\u540d\u79f0"},i.getFieldDecorator("disease",{rules:[{required:!0,message:"\u75be\u75c5\u540d\u79f0\u4e0d\u53ef\u4ee5\u4e3a\u7a7a"}],initialValue:n?n.disease:""})(Y.a.createElement(H["a"],{placeholder:"\u8bf7\u8f93\u5165\u75be\u75c5\u540d\u79f0"}))),Y.a.createElement(J,{labelCol:{span:5},wrapperCol:{span:15},label:"\u79d1\u522b"},i.getFieldDecorator("classfication",{initialValue:n?n.classfication:""})(Y.a.createElement(H["a"],{placeholder:"\u8bf7\u8f93\u5165\u79d1\u522b"}))),E&&E.length>0?Y.a.createElement(m["a"],{style:{margin:"40px 0 24px"}}):"",E&&E.length>0?Y.a.createElement(s["a"],{columns:g,dataSource:E}):"",Y.a.createElement(m["a"],{style:{margin:"40px 0 24px"}}),Y.a.createElement(R["a"],{gutter:{md:8,lg:24,xl:48}},Y.a.createElement(F["a"],{md:4,offset:8,sm:24},Y.a.createElement("span",{className:U.a.submitButtons},Y.a.createElement(D["a"],{type:"primary",onClick:function(){return e.handleModalVisible(!0)},disabled:!y},"\u6dfb\u52a0\u836f\u54c1"))),Y.a.createElement(F["a"],{md:4,sm:24},Y.a.createElement("span",{className:U.a.submitButtons},Y.a.createElement(D["a"],{type:"primary",onClick:function(){return e.handleOK()},disabled:!y},"\u63d0\u4ea4\u8868\u5355"))),Y.a.createElement(F["a"],{md:4,offset:4,sm:24},Y.a.createElement("span",{className:U.a.submitButtons},Y.a.createElement(D["a"],{type:"primary",onClick:function(){return e.handleBack()}},"\u8fd4\u56de")))))),Y.a.createElement(Q,d()({},S,{modalVisible:f,selectedRows:h,loading:l,medicines:r,recipeType:y})))}}]),t}(A["PureComponent"]),l=r))||l)||l);t["default"]=X}}]);