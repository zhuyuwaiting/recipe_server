(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[14],{"5aI5":function(e,a,t){e.exports={tableList:"antd-pro-pages-recipe-recipe-edit-tableList",tableListOperator:"antd-pro-pages-recipe-recipe-edit-tableListOperator",tableListForm:"antd-pro-pages-recipe-recipe-edit-tableListForm",submitButtons:"antd-pro-pages-recipe-recipe-edit-submitButtons"}},oVo7:function(e,a,t){"use strict";t.r(a);var n,l,i,r,c=t("zAuD"),d=t.n(c),o=(t("CZL8"),t("Ujq2")),s=(t("KA4w"),t("m55T")),m=(t("+lKC"),t("yZ8h")),p=(t("EUzZ"),t("Xf8t")),u=(t("8Au1"),t("tfie")),E=t("mK77"),h=t.n(E),f=t("43Yg"),y=t.n(f),g=t("/tCh"),S=t.n(g),T=t("8aBX"),b=t.n(T),N=t("scpF"),C=t.n(N),v=t("O/V9"),I=t.n(v),M=(t("vx8d"),t("MTy7")),V=(t("qgcB"),t("vRoj")),R=(t("kcJG"),t("XBJ2")),D=(t("BLL0"),t("Os1Z")),x=(t("sR1m"),t("4PY0")),w=(t("2Oel"),t("R5/u")),F=(t("ie9k"),t("EvS/")),k=(t("CH3h"),t("oomf")),H=(t("Eu87"),t("QfkW")),O=(t("tW+f"),t("fZ2R")),A=t("ZZRV"),L=t.n(A),_=t("LneV"),Y=t("NfTp"),B=t.n(Y),W=t("Sr5h"),q=t.n(W),z=t("CkN6"),Z=t("zHco"),j=t("5aI5"),K=t.n(j);function J(e){var a=U();return function(){var t,n=I()(e);if(a){var l=I()(this).constructor;t=Reflect.construct(n,arguments,l)}else t=n.apply(this,arguments);return C()(this,t)}}function U(){if("undefined"===typeof Reflect||!Reflect.construct)return!1;if(Reflect.construct.sham)return!1;if("function"===typeof Proxy)return!0;try{return Date.prototype.toString.call(Reflect.construct(Date,[],function(){})),!0}catch(e){return!1}}var G=O["a"].Item,P=(H["a"].Step,k["a"].TextArea,F["a"].Option),X=(w["a"].Group,O["a"].create()(function(e){var a=e.modalVisible,t=e.form,n=e.handleMedicineAdd,l=e.handleModalVisible,i=e.selectedRows,r=e.handleSelectRows,c=e.loading,d=e.medicines,o=e.handleStandardTableChange,s=e.recipeType,m=e.handleMedicineSearch,p=e.handleMedicineFormReset,u=e.getColumns,E=function(){t.validateFields(function(e,a){e||(t.resetFields(),n(a))})};console.log(d);var h=u(s);console.log(h);var f=function(){var a=e.form.getFieldDecorator;return L.a.createElement(O["a"],{onSubmit:function(e){return m(e,t)},layout:"inline"},L.a.createElement(R["a"],{gutter:{md:8,lg:24,xl:48}},L.a.createElement(x["a"],{md:8,sm:24},L.a.createElement(G,{label:"\u836f\u54c1\u7f16\u53f7"},a("medicineNo")(L.a.createElement(k["a"],{placeholder:"\u8bf7\u8f93\u5165"})))),L.a.createElement(x["a"],{md:8,sm:24},L.a.createElement(G,{label:"\u836f\u54c1\u540d\u79f0"},a("name")(L.a.createElement(k["a"],{placeholder:"\u8bf7\u8f93\u5165"})))),L.a.createElement(x["a"],{md:8,sm:24},L.a.createElement("span",{className:K.a.submitButtons},L.a.createElement(D["a"],{type:"primary",htmlType:"submit"},"\u67e5\u8be2"),L.a.createElement(D["a"],{style:{marginLeft:8},onClick:function(){return p(t)}},"\u91cd\u7f6e")))))};return L.a.createElement(V["a"],{destroyOnClose:!0,title:"\u836f\u54c1\u9009\u62e9",visible:a,style:{top:0},width:1e3,onOk:E,onCancel:function(){return l(!1)}},L.a.createElement("div",{className:K.a.tableListForm},f()),L.a.createElement(z["a"],{selectedRows:i,loading:c,data:d,columns:h,onSelectRow:r,onChange:o}))})),Q=O["a"].create()(function(e){var a=e.templateModalVisible,t=e.form,n=(e.handleMedicineAdd,e.handleTemplateModalVisible),l=(e.templateSelectedRows,e.handleSelectRows,e.loading),i=e.templates,r=e.handleTemplateTableChange,c=(e.recipeType,e.handleTemplateSearch),d=e.handleTemplateFormReset,o=e.handleTempalteSelects,s=function(){var a=e.form.getFieldDecorator;return L.a.createElement(O["a"],{onSubmit:function(e){return c(e,t)},layout:"inline"},L.a.createElement(R["a"],{gutter:{md:8,lg:24,xl:48}},L.a.createElement(x["a"],{md:8,sm:24},L.a.createElement(G,{label:"\u6a21\u677f\u7f16\u53f7"},a("recipeTemplateNo")(L.a.createElement(k["a"],{placeholder:"\u8bf7\u8f93\u5165"})))),L.a.createElement(x["a"],{md:8,sm:24},L.a.createElement(G,{label:"\u75be\u75c5\u540d\u79f0"},a("disease")(L.a.createElement(k["a"],{placeholder:"\u8bf7\u8f93\u5165\u75be\u75c5\u540d\u79f0"})))),L.a.createElement(x["a"],{md:8,sm:24},L.a.createElement("span",{className:K.a.submitButtons},L.a.createElement(D["a"],{type:"primary",htmlType:"submit"},"\u67e5\u8be2"),L.a.createElement(D["a"],{style:{marginLeft:8},onClick:function(){return d(t)}},"\u91cd\u7f6e")))))},m=[{title:"\u5904\u65b9\u7c7b\u578b",dataIndex:"recipeType",render:function(e,a){return"CHINESE"==e?"\u4e2d\u836f\u5904\u65b9":"\u897f\u836f\u5904\u65b9"}},{title:"\u75be\u75c5",dataIndex:"disease"},{title:"\u79d1\u522b",dataIndex:"classfication"},{title:"\u521b\u5efa\u65f6\u95f4",dataIndex:"createTime",key:"createTime",render:function(e,a){var t=B()(new Date(e)).format("YYYY-MM-DD HH:mm:ss");return t}},{title:"\u64cd\u4f5c",dataIndex:"operation",key:"operation",render:function(e,a,t){return L.a.createElement("span",{className:"table-operation"},L.a.createElement("a",{onClick:function(){return o(a)}},"\u4f7f\u7528\u6a21\u677f"))}}],p=function(e,a){console.log(e,a);var t=e.recipeTemplateDetailVOS,n=[{title:"\u836f\u54c1\u540d\u79f0",dataIndex:"medicineVO.name",key:"name"},{title:"\u6570\u91cf",dataIndex:"medicineNum",key:"medicineNum"},{title:"\u5355\u4f4d",dataIndex:"medicineVO.type",key:"type",render:function(e,a){return"CHINESE_MEDICINE"==e?a.medicineVO.unitInfo.name:a.medicineVO.spec}}];return L.a.createElement(M["a"],{columns:n,dataSource:t,pagination:!1})};return L.a.createElement(V["a"],{destroyOnClose:!0,title:"\u6a21\u677f\u9009\u62e9",visible:a,style:{top:0},width:1e3,onOk:function(){return n(!1)},onCancel:function(){return n(!1)}},L.a.createElement("div",{className:K.a.tableListForm},s()),L.a.createElement(M["a"],{className:"components-table-demo-nested",columns:m,loading:l,expandedRowRender:p,dataSource:i.list,pagination:i.pagination,onChange:r}))}),$=(n=Object(_["connect"])(function(e){var a=e.recipe,t=e.loading,n=e.medicine,l=e.recipeTemplate;return{recipe:a,loading:t.models.recipe,medicine:n,medicineLoading:t.models.medicine,recipeTemplate:l,templateLoading:t.models.recipeTemplate}}),l=O["a"].create(),n(i=l((r=function(e){b()(t,e);var a=J(t);function t(){var e;y()(this,t);for(var n=arguments.length,l=new Array(n),i=0;i<n;i++)l[i]=arguments[i];return e=a.call.apply(a,[this].concat(l)),e.state={modalVisible:!1,updateModalVisible:!1,expandForm:!1,selectedRows:[],formValues:{},stepFormValues:{},updateRecipe:{},recipeType:void 0,selectedMedicines:[],templateModalVisible:!1,templateSelectedRow:void 0,selectedTemplate:void 0},e.handleStandardTableChange=function(a,t,n){var l=e.props.dispatch,i=e.state,r=i.formValues,c=i.recipeType,d=Object.keys(t).reduce(function(e,a){var n=h()({},e);return n[a]=getValue(t[a]),n},{}),o=h()({current:a.current,pageSize:a.pageSize},r,d);n.field&&(o.sorter="".concat(n.field,"_").concat(n.order)),l({type:"medicine/fetch",payload:h()({},o,{type:"CHINESE"==c?"CHINESE_MEDICINE":"WESTERN_MEDICINE"}),callback:function(a){e.setState({selectedRows:[]})}})},e.handleTemplateTableChange=function(a,t,n){var l=e.props.dispatch,i=e.state,r=i.formValues,c=i.recipeType,d=Object.keys(t).reduce(function(e,a){var n=h()({},e);return n[a]=getValue(t[a]),n},{}),o=h()({current:a.current,pageSize:a.pageSize},r,d);n.field&&(o.sorter="".concat(n.field,"_").concat(n.order)),l({type:"recipeTemplate/fetch",payload:h()({},o,{type:"CHINESE"==c?"CHINESE_MEDICINE":"WESTERN_MEDICINE"})})},e.handleFormReset=function(){var a=e.props,t=a.form,n=a.dispatch;t.resetFields(),e.setState({formValues:{}}),n({type:"recipe/fetch",payload:{}})},e.handleMedicineFormReset=function(a){var t=e.props.dispatch,n=e.state.recipeType;a.resetFields(),e.setState({formValues:{}}),t({type:"medicine/fetch",payload:{type:"CHINESE"==n?"CHINESE_MEDICINE":"WESTERN_MEDICINE"}})},e.handleTemplateFormReset=function(a){var t=e.props.dispatch,n=e.state.recipeType;a.resetFields(),e.setState({formValues:{}}),t({type:"recipeTemplate/fetch",payload:{type:"CHINESE"==n?"CHINESE_MEDICINE":"WESTERN_MEDICINE"}})},e.onMedicineNumChange=function(a,t){var n=e.state.selectedMedicines;n[t].medicineNum=a,e.setState({selectedMedicines:n})},e.onMedicineDel=function(a){var t=e.state.selectedMedicines;t=t.filter(function(e){return e.medicineNo!=a.medicineNo}),e.setState({selectedMedicines:t})},e.handleSelectRows=function(a){var t=e.state.selectedMedicines,n=a.filter(function(e){for(var a=0;a<t.length;a++)if(e.medicineNo==t[a].medicineNo)return!1;return!0}).map(function(e){return e.medicineNum=e.medicineNum?e.medicineNum:"CHINESE_MEDICINE"==e.type?e.eachDose:1,e});t=t.concat(n),e.setState({selectedRows:a,selectedMedicines:t})},e.handleSearch=function(a){a.preventDefault();var t=e.props,n=t.dispatch,l=t.form;l.validateFields(function(a,t){if(!a){var l=h()({},t,{updatedAt:t.updatedAt&&t.updatedAt.valueOf()});e.setState({formValues:l}),n({type:"recipe/fetch",payload:l,callback:function(e){}})}})},e.handleModalVisible=function(a){var t=e.props.dispatch;if(!a)return t({type:"medicine/flush"}),void e.setState({modalVisible:!1});var n=e.state.recipeType;n?(t({type:"medicine/fetch",payload:{type:"CHINESE"==n?"CHINESE_MEDICINE":"WESTERN_MEDICINE"}}),e.setState({modalVisible:!!a})):u["a"].error("\u8bf7\u5148\u9009\u62e9\u5904\u65b9\u7c7b\u578b")},e.handleTemplateModalVisible=function(a){var t=e.props.dispatch;if(!a)return t({type:"recipeTemplate/flush"}),void e.setState({templateModalVisible:!1});var n=e.state.recipeType;n?(t({type:"recipeTemplate/fetch",payload:{recipeType:n,needDetails:!0}}),e.setState({templateModalVisible:!!a})):u["a"].error("\u8bf7\u5148\u9009\u62e9\u5904\u65b9\u7c7b\u578b")},e.handleMedicineSearch=function(a,t){a.preventDefault();var n=e.props.dispatch,l=e.state.recipeType;t.validateFields(function(a,t){if(!a){var i=h()({},t,{type:"CHINESE"==l?"CHINESE_MEDICINE":"WESTERN_MEDICINE"});e.setState({formValues:i}),n({type:"medicine/fetch",payload:i})}})},e.handleTemplateSearch=function(a,t){a.preventDefault();var n=e.props.dispatch,l=e.state.recipeType;t.validateFields(function(a,t){if(!a){var i=h()({},t,{type:"CHINESE"==l?"CHINESE_MEDICINE":"WESTERN_MEDICINE"});e.setState({formValues:i}),n({type:"recipeTemplate/fetch",payload:i})}})},e.handleTempalteSelects=function(a){e.props.dispatch;console.log("template:",a,e.state.selectedMedicines);var t=a.recipeTemplateDetailVOS.map(function(e){var a=e.medicineVO;return a.medicineNum=e.medicineNum,a});e.setState({selectedTemplate:a,selectedMedicines:t,templateModalVisible:!1})},e.handleRecipeTypeChange=function(a){e.setState({recipeType:a,selectedRows:[],selectedMedicines:[]})},e.handleBack=function(){q.a.push("/recipe/recipeManage")},e.handleOK=function(){var a=e.props,t=a.dispatch,n=a.form,l=e.props.match.params.operator,i=e.state.selectedMedicines;if(!i||i.length<=0)u["a"].error("\u836f\u54c1\u4fe1\u606f\u4e0d\u53ef\u4e3a\u7a7a\uff0c\u8bf7\u6dfb\u52a0\u836f\u54c1\u4fe1\u606f");else{var r=i.map(function(e){return{medicineNo:e.medicineNo,medicineNum:e.medicineNum}});n.validateFields(function(a,i){a||(console.log(r),console.log(i),t({type:"recipe/"+l,payload:h()({},i,{recipeDetailVOS:r,recipeNo:e.state.updateRecipe.recipeNo}),callback:function(a){a&&("add"==l?u["a"].success("\u6dfb\u52a0\u6210\u529f"):u["a"].success("\u4fee\u6539\u6210\u529f"),n.resetFields(),e.setState({selectedRows:[]}),q.a.push("/recipe/recipeManage"))}}))})}},e.handleMedicineAdd=function(a){e.handleModalVisible(!1)},e.getColumns=function(e){var a=[{title:"\u836f\u54c1\u540d\u79f0",dataIndex:"name"},{title:"\u836f\u54c1\u5355\u4f4d",dataIndex:"unitInfo",render:function(e,a){return e?e.name:a.unit}},{title:"\u7528\u836f\u65b9\u5f0f",dataIndex:"takingWayInfo",render:function(e,a){return e?e.name:a.takingWay}},{title:"\u533b\u5631",dataIndex:"medicalAdvice"},{title:"\u521b\u5efa\u65f6\u95f4",dataIndex:"createTime",key:"createTime",render:function(e,a){var t=B()(new Date(e)).format("YYYY-MM-DD HH:mm:ss");return t}}];return"WESTERN"==e&&(a=[{title:"\u836f\u54c1\u540d\u79f0",dataIndex:"name"},{title:"\u89c4\u683c",dataIndex:"spec"},{title:"\u6bcf\u6b21\u5242\u91cf",dataIndex:"eachDose",render:function(e,a){return(a.eachDose/100).toFixed(2)+(a.cellUnitInfo?a.cellUnitInfo.name:"")}},{title:"\u7528\u836f\u9891\u6b21",dataIndex:"frequencyInfo",render:function(e,a){return e?e.name:""}},{title:"\u7528\u836f\u65b9\u5f0f",dataIndex:"takingWayInfo",render:function(e,a){return e?e.name:a.unit}},{title:"\u533b\u5631",dataIndex:"medicalAdvice"},{title:"\u521b\u5efa\u65f6\u95f4",dataIndex:"createTime",key:"createTime",render:function(e,a){var t=B()(new Date(e)).format("YYYY-MM-DD HH:mm:ss");return t}}]),a},e}return S()(t,[{key:"componentDidMount",value:function(){var e=this,a=this.props.dispatch,t=this.props.match.params.recipeNo;"null"!=t&&a({type:"recipe/query",payload:{recipeNo:t},callback:function(a,t){if(a){var n=t.recipeInfoVO.recipeDetailVOS.map(function(e){var a=e.medicineVO;return a["medicineNum"]=e.medicineNum,a});e.setState({selectedMedicines:n,recipeType:t.recipeInfoVO.recipeType,updateRecipe:t.recipeInfoVO})}}})}},{key:"renderSimpleForm",value:function(){var e=this,a=this.props.form.getFieldDecorator;return L.a.createElement(O["a"],{onSubmit:this.handleSearch,layout:"inline"},L.a.createElement(R["a"],{gutter:{md:8,lg:24,xl:48}},L.a.createElement(x["a"],{md:8,sm:24},L.a.createElement(G,{label:"\u5904\u65b9\u7f16\u53f7"},a("recipeNo")(L.a.createElement(k["a"],{placeholder:"\u8bf7\u8f93\u5165"})))),L.a.createElement(x["a"],{md:8,sm:24},L.a.createElement(G,{label:"\u75be\u75c5"},a("disease")(L.a.createElement(k["a"],{placeholder:"\u8bf7\u8f93\u5165"})))),L.a.createElement(x["a"],{md:8,sm:24},L.a.createElement("a",{onClick:function(){return e.test(!0)}},"dddd"))),L.a.createElement(R["a"],{gutter:{md:8,lg:24,xl:48}},L.a.createElement(x["a"],{md:8,sm:24},L.a.createElement(G,{label:"\u5904\u65b9\u7c7b\u578b"},a("recipeType")(L.a.createElement(F["a"],{placeholder:"\u8bf7\u9009\u62e9",style:{width:"100%"}},[{type:"",name:"\u6240\u6709"},{type:"CHINESE",name:"\u4e2d\u836f\u5904\u65b9"},{type:"WESTERN",name:"\u897f\u836f\u5904\u65b9"}].map(function(e){return L.a.createElement(P,{value:e.type},e.name)}))))),L.a.createElement(x["a"],{md:8,sm:24},L.a.createElement(G,{label:"\u79d1\u522b"},a("classfication")(L.a.createElement(k["a"],{placeholder:"\u8bf7\u8f93\u5165"})))),L.a.createElement(x["a"],{md:8,sm:24},L.a.createElement("span",{className:K.a.submitButtons},L.a.createElement(D["a"],{type:"primary",htmlType:"submit"},"\u67e5\u8be2"),L.a.createElement(D["a"],{style:{marginLeft:8},onClick:this.handleFormReset},"\u91cd\u7f6e")))))}},{key:"renderForm",value:function(){this.state.expandForm;return this.renderSimpleForm()}},{key:"render",value:function(){var e=this,a=this.props,t=a.recipe,n=(t.list,t.pagination,t.enumInfos,a.loading,a.form),l=a.medicineLoading,i=a.medicine,r=a.templateLoading,c=a.recipeTemplate,u=this.state,E=u.selectedRows,h=u.modalVisible,f=(u.updateModalVisible,u.stepFormValues,u.updateRecipe),y=u.selectedMedicines,g=u.recipeType,S=u.templateModalVisible,T=u.templateSelectedRow,b=u.selectedTemplate,N=this.getColumns(g),C=this.onMedicineNumChange,v=this.onMedicineDel;N.pop(),N.push({title:"\u6570\u91cf",dataIndex:"medicineNum",render:function(e,a,t){return L.a.createElement(p["a"],{min:1,max:1e3,defaultValue:a.medicineNum?a.medicineNum:"CHINESE"==g?a.eachDose:1,onChange:function(e){return C(e,t)}})}}),N.push({title:"",dataIndex:"operator",render:function(e,a,t){return L.a.createElement(m["a"],{type:"delete",onClick:function(){return v(a)}})}}),console.log(N);var I={handleMedicineAdd:this.handleMedicineAdd,handleModalVisible:this.handleModalVisible,handleSelectRows:this.handleSelectRows,handleStandardTableChange:this.handleStandardTableChange,handleMedicineSearch:this.handleMedicineSearch,handleMedicineFormReset:this.handleMedicineFormReset,getColumns:this.getColumns},V={handleTempalteSelects:this.handleTempalteSelects,handleTemplateModalVisible:this.handleTemplateModalVisible,handleTemplateTableChange:this.handleTemplateTableChange,handleTemplateSearch:this.handleTemplateSearch,handleTemplateFormReset:this.handleTemplateFormReset};return L.a.createElement(Z["a"],null,L.a.createElement(o["a"],{bordered:!1},L.a.createElement(O["a"],null,L.a.createElement(s["a"],null),L.a.createElement(R["a"],{gutter:{md:8,lg:24,xl:48}},L.a.createElement(x["a"],{md:8,sm:24},L.a.createElement(G,{labelCol:{span:8},wrapperCol:{span:15},label:"\u59d3\u540d"},n.getFieldDecorator("patientName",{rules:[{required:!0,message:"\u59d3\u540d\u4e0d\u53ef\u4ee5\u4e3a\u7a7a"}],initialValue:f?f.patientName:""})(L.a.createElement(k["a"],{placeholder:"\u8bf7\u8f93\u5165\u60a3\u8005\u59d3\u540d"})))),L.a.createElement(x["a"],{md:8,sm:24},L.a.createElement(G,{labelCol:{span:8},wrapperCol:{span:15},label:"\u6027\u522b"},n.getFieldDecorator("patientSex",{rules:[{required:!0,message:"\u6027\u522b\u4e0d\u53ef\u4ee5\u4e3a\u7a7a"}],initialValue:f&&void 0!=f.patientSex?f.patientSex+"":"0"})(L.a.createElement(F["a"],{placeholder:"\u8bf7\u9009\u62e9",style:{width:"100%"}},[{value:"0",name:"\u7537"},{value:"1",name:"\u5973"}].map(function(e){return L.a.createElement(P,{value:e.value},e.name)}))))),L.a.createElement(x["a"],{md:8,sm:24},L.a.createElement(k["a"].Group,{compact:!0},L.a.createElement(G,{labelCol:{span:8},wrapperCol:{span:15},label:"\u5e74\u9f84"},n.getFieldDecorator("patientAge",{rules:[{required:!0,message:"\u5e74\u9f84\u4e0d\u53ef\u4ee5\u4e3a\u7a7a"}],initialValue:f?f.patientAge:""})(L.a.createElement(p["a"],{placeholder:"\u8bf7\u8f93\u5165\u60a3\u8005\u5e74\u9f84"}))),L.a.createElement(G,null,n.getFieldDecorator("ageType",{rules:[{required:!0,message:"\u5e74\u9f84\u5355\u4f4d\u4e0d\u53ef\u4ee5\u4e3a\u7a7a"}],initialValue:f&&void 0!=f.ageType?f.ageType+"":"YEAR"})(L.a.createElement(F["a"],{placeholder:"\u8bf7\u9009\u62e9",style:{width:"100%"}},[{value:"YEAR",name:"\u5c81"},{value:"MONTH",name:"\u6708"},{value:"DAY",name:"\u5929"}].map(function(e){return L.a.createElement(P,{value:e.value},e.name)}))))))),L.a.createElement(R["a"],{gutter:{md:8,lg:24,xl:48}},L.a.createElement(x["a"],{md:8,sm:24},L.a.createElement(G,{labelCol:{span:8},wrapperCol:{span:15},label:"\u5904\u65b9\u7c7b\u578b"},n.getFieldDecorator("recipeType",{rules:[{required:!0,message:"\u5904\u65b9\u7c7b\u578b\u4e0d\u53ef\u4ee5\u4e3a\u7a7a"}],initialValue:f?f.recipeType:""})(L.a.createElement(F["a"],{placeholder:"\u8bf7\u9009\u62e9",style:{width:"100%"},onChange:function(a){return e.handleRecipeTypeChange(a)}},[{type:"CHINESE",name:"\u4e2d\u836f\u5904\u65b9"},{type:"WESTERN",name:"\u897f\u836f\u5904\u65b9"}].map(function(e){return L.a.createElement(P,{value:e.type},e.name)}))))),L.a.createElement(x["a"],{md:8,sm:24},L.a.createElement(G,{labelCol:{span:8},wrapperCol:{span:15},label:"\u75be\u75c5\u540d\u79f0"},n.getFieldDecorator("disease",{rules:[{required:!0,message:"\u75be\u75c5\u540d\u79f0\u4e0d\u53ef\u4ee5\u4e3a\u7a7a"}],initialValue:f?f.disease:b?b.disease:""})(L.a.createElement(k["a"],{placeholder:"\u8bf7\u8f93\u5165\u60a3\u8005\u6240\u60a3\u75be\u75c5"})))),L.a.createElement(x["a"],{md:8,sm:24},L.a.createElement(G,{labelCol:{span:8},wrapperCol:{span:15},label:"\u79d1\u522b"},n.getFieldDecorator("classfication",{initialValue:f?f.classfication:b?b.classfication:""})(L.a.createElement(k["a"],{placeholder:"\u8bf7\u8f93\u5165\u79d1\u522b"}))))),y&&y.length>0?L.a.createElement(s["a"],{style:{margin:"40px 0 24px"}}):"",y&&y.length>0?L.a.createElement(M["a"],{columns:N,dataSource:y,pagination:!1}):"",y&&y.length>0&&"CHINESE"==g?L.a.createElement(R["a"],{gutter:{md:8,lg:24,xl:48}},L.a.createElement(x["a"],{md:24,offset:4,sm:24},L.a.createElement(G,{labelCol:{span:8},wrapperCol:{span:15},label:"\u4ed8\u6570"},n.getFieldDecorator("num",{rules:[{required:!0,message:"\u4e2d\u836f\u4ed8\u6570\u4e0d\u53ef\u4ee5\u4e3a\u7a7a"}],initialValue:f?f.num:""})(L.a.createElement(p["a"],{placeholder:"\u8bf7\u8f93\u5165\u4ed8\u6570"}))))):"",L.a.createElement(s["a"],{style:{margin:"40px 0 24px"}}),L.a.createElement(R["a"],{gutter:{md:8,lg:24,xl:48}},L.a.createElement(x["a"],{md:4,offset:6,sm:24},L.a.createElement("span",{className:K.a.submitButtons},L.a.createElement(D["a"],{type:"primary",onClick:function(){return e.handleTemplateModalVisible(!0)}},"\u9009\u62e9\u6a21\u677f"))),L.a.createElement(x["a"],{md:4,sm:24},L.a.createElement("span",{className:K.a.submitButtons},L.a.createElement(D["a"],{type:"primary",onClick:function(){return e.handleModalVisible(!0)}},"\u6dfb\u52a0\u836f\u54c1"))),L.a.createElement(x["a"],{md:4,sm:24},L.a.createElement("span",{className:K.a.submitButtons},L.a.createElement(D["a"],{type:"primary",onClick:function(){return e.handleOK()}},"\u63d0\u4ea4\u8868\u5355"))),L.a.createElement(x["a"],{md:4,sm:24},L.a.createElement("span",{className:K.a.submitButtons},L.a.createElement(D["a"],{type:"primary",onClick:function(){return e.handleBack()}},"\u8fd4\u56de")))))),L.a.createElement(X,d()({},I,{modalVisible:h,selectedRows:E,loading:l,medicines:i,recipeType:g})),L.a.createElement(Q,d()({},V,{templateModalVisible:S,templateSelectedRow:T,loading:r,templates:c,recipeType:g})))}}]),t}(A["PureComponent"]),i=r))||i)||i);a["default"]=$}}]);