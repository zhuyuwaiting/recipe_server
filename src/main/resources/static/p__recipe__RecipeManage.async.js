(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[15],{avra:function(e,a,t){"use strict";t.r(a);t("+L6B");var n,r,l,c,i=t("2/Rp"),o=(t("miYZ"),t("tsqr")),p=t("p0pE"),m=t.n(p),s=(t("/zsF"),t("PArb")),d=t("2Taf"),u=t.n(d),f=t("vZ4D"),E=t.n(f),h=t("l4Ni"),y=t.n(h),g=t("ujKo"),b=t.n(g),v=t("MhPg"),w=t.n(v),k=(t("IzEo"),t("bx4M")),S=(t("14J3"),t("BMrR")),I=(t("jCWc"),t("kPKH")),N=(t("Pwec"),t("CtXQ")),T=(t("2qtc"),t("kLXV")),x=(t("7Kak"),t("9yH6")),V=(t("OaEy"),t("2fM7")),F=(t("5NDa"),t("5rEg")),R=(t("FJo9"),t("L41K")),C=(t("y8nQ"),t("Vl3Y")),D=t("q1tI"),M=t.n(D),L=t("MuoO"),O=t("wd/R"),A=t.n(O),H=t("3a4m"),B=t.n(H),q=t("CkN6"),z=t("zHco"),Y=t("nEHf"),P=t.n(Y),W=C["a"].Item,j=(R["a"].Step,F["a"].TextArea,V["a"].Option);x["a"].Group;function J(){window.document.body.innerHTML=window.document.getElementById("recipeDetail").innerHTML,window.print(),window.location.reload()}function K(e){console.log("---",e);for(var a=e.recipeDetailVOS.map(function(e){var a=e.medicineVO;return a.medicineNum=e.medicineNum,a}),t=[],n=0;n<parseInt((a.length+1)/2);n++)2*n+1>=a.length?t.push([a[2*n]]):t.push([a[2*n],a[2*n+1]]);console.log(t),T["a"].confirm({title:"\u5904\u65b9\u8be6\u60c5",width:1e3,okText:"\u6253\u5370",onOk:function(){J()},content:M.a.createElement(k["a"],{bordered:!1,id:"recipeDetail"},M.a.createElement("table",{style:{width:750},border:"1"},M.a.createElement("tr",null,M.a.createElement("th",null,"\u59d3\u540d:",e.patientName),M.a.createElement("th",null,"\u6027\u522b:",0==e.patientSex?"\u7537":"\u5973"),M.a.createElement("th",null,"\u5e74\u9f84:",e.patientAge),M.a.createElement("th",null,"\u5904\u65b9\u7c7b\u522b:","CHINESE"==e.recipeType?"\u4e2d\u836f\u5904\u65b9":"\u897f\u836f\u5904\u65b9")),M.a.createElement("tr",null,M.a.createElement("th",{colSpan:"2"},"\u4e34\u5e8a\u8bca\u65ad:",e.disease),M.a.createElement("th",{colSpan:"2"},"\u79d1\u522b:",e.classfication))),M.a.createElement("h2",{style:{marginTop:5,marginBottom:5}},"Rp"),"CHINESE"==e.recipeType?M.a.createElement(k["a"],{bordered:!1},a.map(function(e){return M.a.createElement(S["a"],{style:{marginTop:40}},M.a.createElement(I["a"],{span:3},M.a.createElement(N["a"],{type:"star",theme:"filled"}),"\xa0 ",e.name),M.a.createElement(I["a"],{span:3},e.takingWayInfo.name),M.a.createElement(I["a"],{span:3},e.medicineNum+" "+e.unitInfo.name),M.a.createElement(I["a"],{span:3},e.medicalAdviceInfo?e.medicalAdviceInfo.name:""))})):M.a.createElement(k["a"],{bordered:!1},a.map(function(e){return M.a.createElement(S["a"],{style:{marginTop:40}},M.a.createElement(I["a"],{span:4},e.name),M.a.createElement(I["a"],{span:6},"("+(e.spec?e.spec:"\u672a\u77e5\u89c4\u683c")+")  X "+e.medicineNum),M.a.createElement(I["a"],{span:5},"\u6bcf\u6b21\u5242\u91cf\uff1a "+(e.eachDose/100).toFixed(2)+e.cellUnitInfo.name),M.a.createElement(I["a"],{span:2},e.takingWayInfo?e.takingWayInfo.name:""),M.a.createElement(I["a"],{span:2},e.frequencyInfo?e.frequencyInfo.name:""),M.a.createElement(I["a"],{span:5},e.medicalAdviceInfo?e.medicalAdviceInfo.name:""))})),M.a.createElement(S["a"],{style:{marginTop:40}},"CHINESE"==e.recipeType?M.a.createElement(I["a"],{span:12},"\u4ed8\u6570\uff1a ",M.a.createElement("strong",{style:{fontSize:20}},e.num),"\xa0\u4ed8"):M.a.createElement(I["a"],{span:12})))})}var U=(n=Object(L["connect"])(function(e){var a=e.recipe,t=e.loading;return{recipe:a,loading:t.models.recipe}}),r=C["a"].create(),n(l=r((c=function(e){function a(){var e,t;u()(this,a);for(var n=arguments.length,r=new Array(n),l=0;l<n;l++)r[l]=arguments[l];return t=y()(this,(e=b()(a)).call.apply(e,[this].concat(r))),t.state={modalVisible:!1,updateModalVisible:!1,expandForm:!1,selectedRows:[],formValues:{},stepFormValues:{},updateRow:{}},t.columns=[{title:"\u59d3\u540d",dataIndex:"patientName"},{title:"\u6027\u522b",dataIndex:"patientSex",render:function(e,a){return"0"==e?"\u7537":"\u5973"}},{title:"\u5e74\u9f84",dataIndex:"patientAge"},{title:"\u5904\u65b9\u7c7b\u578b",dataIndex:"recipeType",render:function(e,a){return"CHINESE"==e?"\u4e2d\u836f\u5904\u65b9":"\u897f\u836f\u5904\u65b9"}},{title:"\u75be\u75c5",dataIndex:"disease"},{title:"\u79d1\u522b",dataIndex:"classfication"},{title:"\u521b\u5efa\u65f6\u95f4",dataIndex:"createTime",key:"createTime",render:function(e,a){var t=A()(new Date(e)).format("YYYY-MM-DD HH:mm:ss");return t}},{title:"\u64cd\u4f5c",render:function(e,a,n){return M.a.createElement(D["Fragment"],null,M.a.createElement("a",{onClick:function(){return t.handleView(!0,a,n)}},"\u67e5\u770b"),M.a.createElement(s["a"],{type:"vertical"}),M.a.createElement("a",{onClick:function(){return t.handleUpdate(!0,a,n)}},"\u4fee\u6539"),M.a.createElement(s["a"],{type:"vertical"}),M.a.createElement("a",{onClick:function(){return T["a"].confirm({title:"\u5220\u9664\u5904\u65b9",content:"\u786e\u5b9a\u5220\u9664\u8be5\u5904\u65b9\u6570\u636e\u5417\uff1f",okText:"\u786e\u8ba4",cancelText:"\u53d6\u6d88",onOk:function(){return t.handleDelete(a,n)}})}},"\u5220\u9664"))}}],t.handleModalVisible=function(e){t.setState({modalVisible:!!e})},t.handleStandardTableChange=function(e,a,n){var r=t.props.dispatch,l=t.state.formValues,c=Object.keys(a).reduce(function(e,t){var n=m()({},e);return n[t]=getValue(a[t]),n},{}),i=m()({current:e.current,pageSize:e.pageSize},l,c);n.field&&(i.sorter="".concat(n.field,"_").concat(n.order)),r({type:"recipe/fetch",payload:i,callback:function(e){t.setState({selectedRows:[]})}})},t.handleFormReset=function(){var e=t.props,a=e.form,n=e.dispatch;a.resetFields(),t.setState({formValues:{}}),n({type:"recipe/fetch",payload:{}})},t.handleSelectRows=function(e){t.setState({selectedRows:e})},t.handleSearch=function(e){e.preventDefault();var a=t.props,n=a.dispatch,r=a.form;r.validateFields(function(e,a){if(!e){var r=m()({},a,{updatedAt:a.updatedAt&&a.updatedAt.valueOf()});t.setState({formValues:r}),n({type:"recipe/fetch",payload:r})}})},t.handleAdd=function(){B.a.push("/recipe/recipeManage/edit/add/null")},t.handleDelete=function(e,a){var n=t.props.dispatch;n({type:"recipe/remove",payload:{recipeNos:[e.recipeNo],index:a},callback:function(e){e&&o["a"].success("\u5220\u9664\u6210\u529f")}})},t.handleBatchDelete=function(e,a){var n=t.props.dispatch;n({type:"recipe/batchRemove",payload:{recipeNos:e.map(function(e){return e.recipeNo})},callback:function(e){t.setState({selectedRows:[]})}})},t.handleUpdate=function(e,a){B.a.push("/recipe/recipeManage/edit/update/".concat(a.recipeNo))},t.handleView=function(e,a){console.log(a);var n=t.props.dispatch;n({type:"recipe/query",payload:{recipeNo:a.recipeNo},callback:function(e,a){K(a.recipeInfoVO)}})},t}return w()(a,e),E()(a,[{key:"componentDidMount",value:function(){var e=this.props.dispatch;e({type:"recipe/fetch",payload:{}})}},{key:"renderSimpleForm",value:function(){var e=this.props.form.getFieldDecorator;return M.a.createElement(C["a"],{onSubmit:this.handleSearch,layout:"inline"},M.a.createElement(S["a"],{gutter:{md:8,lg:24,xl:48}},M.a.createElement(I["a"],{md:8,sm:24},M.a.createElement(W,{label:"\u5904\u65b9\u7f16\u53f7"},e("recipeNo")(M.a.createElement(F["a"],{placeholder:"\u8bf7\u8f93\u5165"})))),M.a.createElement(I["a"],{md:8,sm:24},M.a.createElement(W,{label:"\u75c5\u4eba\u59d3\u540d"},e("patientName")(M.a.createElement(F["a"],{placeholder:"\u8bf7\u8f93\u5165"}))))),M.a.createElement(S["a"],{gutter:{md:8,lg:24,xl:48}},M.a.createElement(I["a"],{md:8,sm:24},M.a.createElement(W,{label:"\u5904\u65b9\u7c7b\u578b"},e("recipeType")(M.a.createElement(V["a"],{placeholder:"\u8bf7\u9009\u62e9",style:{width:"100%"}},[{type:"",name:"\u6240\u6709"},{type:"CHINESE",name:"\u4e2d\u836f\u5904\u65b9"},{type:"WESTERN",name:"\u897f\u836f\u5904\u65b9"}].map(function(e){return M.a.createElement(j,{value:e.type},e.name)}))))),M.a.createElement(I["a"],{md:8,sm:24},M.a.createElement(W,{label:"\u75be\u75c5\u540d\u79f0"},e("classfication")(M.a.createElement(F["a"],{placeholder:"\u8bf7\u8f93\u5165"})))),M.a.createElement(I["a"],{md:8,sm:24},M.a.createElement("span",{className:P.a.submitButtons},M.a.createElement(i["a"],{type:"primary",htmlType:"submit"},"\u67e5\u8be2"),M.a.createElement(i["a"],{style:{marginLeft:8},onClick:this.handleFormReset},"\u91cd\u7f6e")))))}},{key:"renderForm",value:function(){this.state.expandForm;return this.renderSimpleForm()}},{key:"render",value:function(){var e=this,a=this.props,t=a.recipe,n=t.list,r=t.pagination,l=(t.enumInfos,a.loading),c={list:n,pagination:r},o=this.state,p=o.selectedRows;o.modalVisible,o.updateModalVisible,o.stepFormValues,o.updateRow,this.handleModalVisible;return M.a.createElement(z["a"],null,M.a.createElement(k["a"],{bordered:!1},M.a.createElement("div",{className:P.a.tableList},M.a.createElement("div",{className:P.a.tableListForm},this.renderForm()),M.a.createElement("div",{className:P.a.tableListOperator},M.a.createElement(i["a"],{icon:"plus",type:"primary",onClick:function(){return e.handleAdd()}},"\u65b0\u5efa"),p.length>0&&M.a.createElement("span",null,M.a.createElement(i["a"],{onClick:function(){return T["a"].confirm({title:"\u5220\u9664\u836f\u54c1",content:"\u786e\u5b9a\u5220\u9664\u8fd9\u4e9b\u6a21\u677f\u5417\uff1f",okText:"\u786e\u8ba4",cancelText:"\u53d6\u6d88",onOk:function(){return e.handleBatchDelete(p)}})}},"\u6279\u91cf\u5220\u9664"))),M.a.createElement(q["a"],{selectedRows:p,loading:l,data:c,columns:this.columns,onSelectRow:this.handleSelectRows,onChange:this.handleStandardTableChange}))))}}]),a}(D["PureComponent"]),l=c))||l)||l);a["default"]=U},nEHf:function(e,a,t){e.exports={tableList:"antd-pro-pages-recipe-recipe-manage-tableList",tableListOperator:"antd-pro-pages-recipe-recipe-manage-tableListOperator",tableListForm:"antd-pro-pages-recipe-recipe-manage-tableListForm",submitButtons:"antd-pro-pages-recipe-recipe-manage-submitButtons"}}}]);