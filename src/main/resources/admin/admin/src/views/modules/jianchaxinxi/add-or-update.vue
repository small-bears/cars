<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row >
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="订单编号" prop="dingdanbianhao">
          <el-input v-model="ruleForm.dingdanbianhao" 
              placeholder="订单编号" clearable  :readonly="ro.dingdanbianhao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="订单编号" prop="dingdanbianhao">
              <el-input v-model="ruleForm.dingdanbianhao" 
                placeholder="订单编号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="汽车编号" prop="qichebianhao">
          <el-input v-model="ruleForm.qichebianhao" 
              placeholder="汽车编号" clearable  :readonly="ro.qichebianhao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="汽车编号" prop="qichebianhao">
              <el-input v-model="ruleForm.qichebianhao" 
                placeholder="汽车编号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="汽车品牌" prop="qichepinpai">
          <el-input v-model="ruleForm.qichepinpai" 
              placeholder="汽车品牌" clearable  :readonly="ro.qichepinpai"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="汽车品牌" prop="qichepinpai">
              <el-input v-model="ruleForm.qichepinpai" 
                placeholder="汽车品牌" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="汽车型号" prop="qichexinghao">
          <el-input v-model="ruleForm.qichexinghao" 
              placeholder="汽车型号" clearable  :readonly="ro.qichexinghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="汽车型号" prop="qichexinghao">
              <el-input v-model="ruleForm.qichexinghao" 
                placeholder="汽车型号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="车牌号" prop="chepaihao">
          <el-input v-model="ruleForm.chepaihao" 
              placeholder="车牌号" clearable  :readonly="ro.chepaihao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="车牌号" prop="chepaihao">
              <el-input v-model="ruleForm.chepaihao" 
                placeholder="车牌号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="颜色" prop="yanse">
          <el-input v-model="ruleForm.yanse" 
              placeholder="颜色" clearable  :readonly="ro.yanse"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="颜色" prop="yanse">
              <el-input v-model="ruleForm.yanse" 
                placeholder="颜色" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="汽车类型" prop="qicheleixing">
          <el-input v-model="ruleForm.qicheleixing" 
              placeholder="汽车类型" clearable  :readonly="ro.qicheleixing"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="汽车类型" prop="qicheleixing">
              <el-input v-model="ruleForm.qicheleixing" 
                placeholder="汽车类型" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="租赁时间" prop="zulinshijian">
          <el-input v-model="ruleForm.zulinshijian" 
              placeholder="租赁时间" clearable  :readonly="ro.zulinshijian"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="租赁时间" prop="zulinshijian">
              <el-input v-model="ruleForm.zulinshijian" 
                placeholder="租赁时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="归还时间" prop="guihaishijian">
          <el-input v-model="ruleForm.guihaishijian" 
              placeholder="归还时间" clearable  :readonly="ro.guihaishijian"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="归还时间" prop="guihaishijian">
              <el-input v-model="ruleForm.guihaishijian" 
                placeholder="归还时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="用户账号" prop="yonghuzhanghao">
          <el-input v-model="ruleForm.yonghuzhanghao" 
              placeholder="用户账号" clearable  :readonly="ro.yonghuzhanghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="用户账号" prop="yonghuzhanghao">
              <el-input v-model="ruleForm.yonghuzhanghao" 
                placeholder="用户账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming" 
              placeholder="姓名" clearable  :readonly="ro.xingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="姓名" prop="xingming">
              <el-input v-model="ruleForm.xingming" 
                placeholder="姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="手机号码" prop="shoujihaoma">
          <el-input v-model="ruleForm.shoujihaoma" 
              placeholder="手机号码" clearable  :readonly="ro.shoujihaoma"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="手机号码" prop="shoujihaoma">
              <el-input v-model="ruleForm.shoujihaoma" 
                placeholder="手机号码" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="身份证号" prop="shenfenzhenghao">
          <el-input v-model="ruleForm.shenfenzhenghao" 
              placeholder="身份证号" clearable  :readonly="ro.shenfenzhenghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="身份证号" prop="shenfenzhenghao">
              <el-input v-model="ruleForm.shenfenzhenghao" 
                placeholder="身份证号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="赔付金额" prop="peifujine">
          <el-input v-model="ruleForm.peifujine" 
              placeholder="赔付金额" clearable  :readonly="ro.peifujine"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="赔付金额" prop="peifujine">
              <el-input v-model="ruleForm.peifujine" 
                placeholder="赔付金额" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="检查时间" prop="jianchashijian">
            <el-date-picker
                value-format="yyyy-MM-dd HH:mm:ss"
                v-model="ruleForm.jianchashijian" 
                type="datetime"
                :readonly="ro.jianchashijian"
                placeholder="检查时间">
            </el-date-picker>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.jianchashijian" label="检查时间" prop="jianchashijian">
              <el-input v-model="ruleForm.jianchashijian" 
                placeholder="检查时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="业务员账号" prop="yewuyuanzhanghao">
          <el-input v-model="ruleForm.yewuyuanzhanghao" 
              placeholder="业务员账号" clearable  :readonly="ro.yewuyuanzhanghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="业务员账号" prop="yewuyuanzhanghao">
              <el-input v-model="ruleForm.yewuyuanzhanghao" 
                placeholder="业务员账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="业务员姓名" prop="yewuyuanxingming">
          <el-input v-model="ruleForm.yewuyuanxingming" 
              placeholder="业务员姓名" clearable  :readonly="ro.yewuyuanxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="业务员姓名" prop="yewuyuanxingming">
              <el-input v-model="ruleForm.yewuyuanxingming" 
                placeholder="业务员姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      </el-row>
          <el-row>
            <el-col :span="24">
              <el-form-item class="textarea" v-if="type!='info'" label="检查结果" prop="jianchajieguo">
                <el-input
                  style="min-width: 200px; max-width: 600px;"
                  type="textarea"
                  :rows="8"
                  placeholder="检查结果"
                  v-model="ruleForm.jianchajieguo" >
                </el-input>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.jianchajieguo" label="检查结果" prop="jianchajieguo">
                    <span>{{ruleForm.jianchajieguo}}</span>
                </el-form-item>
              </div>
            </el-col>
          </el-row>
          <el-row>
            <el-col :span="24">
              <el-form-item class="textarea" v-if="type!='info'" label="存在问题" prop="cunzaiwenti">
                <el-input
                  style="min-width: 200px; max-width: 600px;"
                  type="textarea"
                  :rows="8"
                  placeholder="存在问题"
                  v-model="ruleForm.cunzaiwenti" >
                </el-input>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.cunzaiwenti" label="存在问题" prop="cunzaiwenti">
                    <span>{{ruleForm.cunzaiwenti}}</span>
                </el-form-item>
              </div>
            </el-col>
          </el-row>
      <el-form-item class="btn">
        <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"rgba(0, 0, 0, 1)","selectFontSize":"14px","btnCancelBorderColor":"rgba(193, 193, 193, 1)","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"40px 40px 0 40px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"#606266","addEditBoxColor":"rgba(255, 255, 255, 0)","dateIconFontSize":"14px","btnSaveBgColor":"rgba(227, 201, 176, 1)","uploadIconFontColor":"#8c939d","textareaBorderColor":"#DCDFE6","btnCancelBgColor":"rgba(243, 243, 243, 1)","selectLableColor":"#606266","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"#C0C4CC","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"#606266","dateBorderColor":"#DCDFE6","dateIconFontColor":"#C0C4CC","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"#606266","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"#606266","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"40px 40px 0 40px","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"#606266","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"#DCDFE6","inputBorderColor":"#DCDFE6","uploadBorderColor":"#DCDFE6","textareaFontColor":"#606266","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"4px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"#606266","btnSaveBorderColor":"rgba(194, 161, 49, 1)","btnSaveBorderWidth":"4px"},
      id: '',
      type: '',
      ro:{
	dingdanbianhao : false,
	qichebianhao : false,
	qichepinpai : false,
	qichexinghao : false,
	chepaihao : false,
	yanse : false,
	qicheleixing : false,
	zulinshijian : false,
	guihaishijian : false,
	yonghuzhanghao : false,
	xingming : false,
	shoujihaoma : false,
	shenfenzhenghao : false,
	jianchajieguo : false,
	cunzaiwenti : false,
	peifujine : false,
	jianchashijian : false,
	yewuyuanzhanghao : false,
	yewuyuanxingming : false,
	ispay : false,
      },
      ruleForm: {
        dingdanbianhao: '',
        qichebianhao: '',
        qichepinpai: '',
        qichexinghao: '',
        chepaihao: '',
        yanse: '',
        qicheleixing: '',
        zulinshijian: '',
        guihaishijian: '',
        yonghuzhanghao: '',
        xingming: '',
        shoujihaoma: '',
        shenfenzhenghao: '',
        jianchajieguo: '',
        cunzaiwenti: '',
        peifujine: '',
        jianchashijian: '',
        yewuyuanzhanghao: '',
        yewuyuanxingming: '',
      },
      rules: {
          dingdanbianhao: [
          ],
          qichebianhao: [
          ],
          qichepinpai: [
          ],
          qichexinghao: [
          ],
          chepaihao: [
          ],
          yanse: [
          ],
          qicheleixing: [
          ],
          zulinshijian: [
          ],
          guihaishijian: [
          ],
          yonghuzhanghao: [
          ],
          xingming: [
          ],
          shoujihaoma: [
          ],
          shenfenzhenghao: [
          ],
          jianchajieguo: [
          ],
          cunzaiwenti: [
          ],
          peifujine: [
                { validator: validateIntNumber, trigger: 'blur' },
          ],
          jianchashijian: [
          ],
          yewuyuanzhanghao: [
          ],
          yewuyuanxingming: [
          ],
          ispay: [
          ],
      }
    };
  },
  props: ["parent"],
  computed: {
  },
  created() {
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
    // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='logistics'){
        this.logistics=false;
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          if(o=='dingdanbianhao'){
            this.ruleForm.dingdanbianhao = obj[o];
	    this.ro.dingdanbianhao = true;
            continue;
          }
          if(o=='qichebianhao'){
            this.ruleForm.qichebianhao = obj[o];
	    this.ro.qichebianhao = true;
            continue;
          }
          if(o=='qichepinpai'){
            this.ruleForm.qichepinpai = obj[o];
	    this.ro.qichepinpai = true;
            continue;
          }
          if(o=='qichexinghao'){
            this.ruleForm.qichexinghao = obj[o];
	    this.ro.qichexinghao = true;
            continue;
          }
          if(o=='chepaihao'){
            this.ruleForm.chepaihao = obj[o];
	    this.ro.chepaihao = true;
            continue;
          }
          if(o=='yanse'){
            this.ruleForm.yanse = obj[o];
	    this.ro.yanse = true;
            continue;
          }
          if(o=='qicheleixing'){
            this.ruleForm.qicheleixing = obj[o];
	    this.ro.qicheleixing = true;
            continue;
          }
          if(o=='zulinshijian'){
            this.ruleForm.zulinshijian = obj[o];
	    this.ro.zulinshijian = true;
            continue;
          }
          if(o=='guihaishijian'){
            this.ruleForm.guihaishijian = obj[o];
	    this.ro.guihaishijian = true;
            continue;
          }
          if(o=='yonghuzhanghao'){
            this.ruleForm.yonghuzhanghao = obj[o];
	    this.ro.yonghuzhanghao = true;
            continue;
          }
          if(o=='xingming'){
            this.ruleForm.xingming = obj[o];
	    this.ro.xingming = true;
            continue;
          }
          if(o=='shoujihaoma'){
            this.ruleForm.shoujihaoma = obj[o];
	    this.ro.shoujihaoma = true;
            continue;
          }
          if(o=='shenfenzhenghao'){
            this.ruleForm.shenfenzhenghao = obj[o];
	    this.ro.shenfenzhenghao = true;
            continue;
          }
          if(o=='jianchajieguo'){
            this.ruleForm.jianchajieguo = obj[o];
	    this.ro.jianchajieguo = true;
            continue;
          }
          if(o=='cunzaiwenti'){
            this.ruleForm.cunzaiwenti = obj[o];
	    this.ro.cunzaiwenti = true;
            continue;
          }
          if(o=='peifujine'){
            this.ruleForm.peifujine = obj[o];
	    this.ro.peifujine = true;
            continue;
          }
          if(o=='jianchashijian'){
            this.ruleForm.jianchashijian = obj[o];
	    this.ro.jianchashijian = true;
            continue;
          }
          if(o=='yewuyuanzhanghao'){
            this.ruleForm.yewuyuanzhanghao = obj[o];
	    this.ro.yewuyuanzhanghao = true;
            continue;
          }
          if(o=='yewuyuanxingming'){
            this.ruleForm.yewuyuanxingming = obj[o];
	    this.ro.yewuyuanxingming = true;
            continue;
          }
        }
      }
      // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
		if(json.yewuyuanzhanghao!=''&&json.yewuyuanzhanghao){
                this.ruleForm.yewuyuanzhanghao = json.yewuyuanzhanghao
	    		this.ro.yewuyuanzhanghao = true;
		}
		if(json.yewuyuanxingming!=''&&json.yewuyuanxingming){
                this.ruleForm.yewuyuanxingming = json.yewuyuanxingming
	    		this.ro.yewuyuanxingming = true;
		}
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 多级联动参数
    info(id) {
      this.$http({
        url: `jianchaxinxi/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 提交
    onSubmit() {









































var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(!statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "jianchaxinxi/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `jianchaxinxi/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.jianchaxinxiCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `jianchaxinxi/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.jianchaxinxiCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.jianchaxinxiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
	background-color: transparent;
}
.btn .el-button {
  padding: 0;
}
</style>
