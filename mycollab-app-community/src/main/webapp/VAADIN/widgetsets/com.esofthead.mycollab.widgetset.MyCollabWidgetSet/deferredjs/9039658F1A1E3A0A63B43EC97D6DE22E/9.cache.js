$wnd.com_esofthead_mycollab_widgetset_MyCollabWidgetSet.runAsyncCallback9("function eCb(a){return a.i}\nfunction gCb(a,b){mBb(a,b);--a.j}\nfunction I2c(){Pb.call(this)}\nfunction Xw(a){return (fu(),eu).Pe(a,'col')}\nfunction gld(){Ec.call(this);this.G=wle;this.d=false;this.b=null}\nfunction Vec(a,b){c$b(a.b,new Nnc(new boc(Jgb),'openPopup'),OM(xpb,DYd,1,3,[(mxd(),b?lxd:kxd)]))}\nfunction fCb(a,b){if(b<0){throw new Dyd('Cannot access a row with a negative index: '+b)}if(b>=a.j){throw new Dyd(W0d+b+X0d+a.j)}}\nfunction jCb(a,b){WAb();tBb.call(this);nBb(this,new PBb(this));qBb(this,new ZCb(this));oBb(this,new NCb(this));hCb(this,b);iCb(this,a)}\nfunction MCb(a,b,c){var d,e;b=b>1?b:1;e=a.b.childNodes.length;if(e<b){for(d=e;d<b;d++){at(a.b,Xw($doc))}}else if(!c&&e>b){for(d=e;d>b;d--){jt(a.b,a.b.lastChild)}}}\nfunction iCb(a,b){if(a.j==b){return}if(b<0){throw new Dyd('Cannot set number of rows to '+b)}if(a.j<b){kCb((rub(),a.H),b-a.j,a.i);a.j=b}else{while(a.j>b){gCb(a,a.j-1)}}}\nfunction kCb(a,b,c){var d=$doc.createElement('td');d.innerHTML=M3d;var e=$doc.createElement('tr');for(var f=0;f<c;f++){var g=d.cloneNode(true);e.appendChild(g)}a.appendChild(e);for(var i=1;i<b;i++){a.appendChild(e.cloneNode(true))}}\nfunction H2c(a){if((!a.U&&(a.U=Y(a)),ZM(ZM(a.U,5),85)).e&&((!a.U&&(a.U=Y(a)),ZM(ZM(a.U,5),85)).w==null||Dzd('',(!a.U&&(a.U=Y(a)),ZM(ZM(a.U,5),85)).w))){return (!a.U&&(a.U=Y(a)),ZM(ZM(a.U,5),85)).b}return (!a.U&&(a.U=Y(a)),ZM(ZM(a.U,5),85)).w}\nfunction hCb(a,b){var c,d,e,f;if(a.i==b){return}if(b<0){throw new Dyd('Cannot set number of columns to '+b)}if(a.i>b){for(c=0;c<a.j;c++){for(d=a.i-1;d>=b;d--){YAb(a,c,d);e=$Ab(a,c,d,false);f=VCb(a.H,c);f.removeChild(e)}}}else{for(c=0;c<a.j;c++){for(d=a.i;d<b;d++){iBb(a,c,d)}}}a.i=b;MCb(a.J,b,false)}\nvar zke={545:1,363:1,6:1,73:1,1653:1,162:1,217:1,139:1,3:1},Ake='background',Bke='com.vaadin.client.ui.colorpicker.',Cke='showDefaultCaption',Dke='setOpen',Eke='setColor',wle='v-colorpicker';jqb(1,null,{});_.gC=function T(){return this.cZ};jqb(468,17,WYd);_.ke=function zj(a){return xd(this,a,(yE(),yE(),xE))};jqb(541,289,Y0d);_.ke=function uBb(a){return xd(this,a,(yE(),yE(),xE))};jqb(722,mYd,_0d);_.ke=function aCb(a){return xd(this,a,(yE(),yE(),xE))};jqb(1038,541,Y0d,jCb);_.jh=function lCb(){var a;a=(rub(),xx($doc));Rt(a,M3d);return a};_.kh=function mCb(a){return eCb(this)};_.lh=function nCb(){return this.j};_.mh=function oCb(a,b){fCb(this,a);if(b<0){throw new Dyd('Cannot access a column with a negative index: '+b)}if(b>=this.i){throw new Dyd(U0d+b+V0d+this.i)}};_.nh=function pCb(a){fCb(this,a)};_.i=0;_.j=0;jqb(296,1231,a1d);_.ke=function vCb(a){return xd(this,a,(yE(),yE(),xE))};jqb(1367,17,h1d);_.ke=function vDb(a){return yd(this,a,(yE(),yE(),xE))};jqb(2055,162,zke);_.xc=function J2c(){return false};_.Ac=function K2c(){return !this.U&&(this.U=Y(this)),ZM(ZM(this.U,5),85)};_.mc=function L2c(){return !this.U&&(this.U=Y(this)),ZM(ZM(this.U,5),85)};_.oc=function M2c(){_M(this.Cc(),391)&&ZM(this.Cc(),391).ke(this)};_.qc=function N2c(a){Ib(this,a);if(a._i(B3d)){this.wl();(!this.U&&(this.U=Y(this)),ZM(ZM(this.U,5),85)).e&&((!this.U&&(this.U=Y(this)),ZM(ZM(this.U,5),85)).w==null||Dzd('',(!this.U&&(this.U=Y(this)),ZM(ZM(this.U,5),85)).w))&&this.xl((!this.U&&(this.U=Y(this)),ZM(ZM(this.U,5),85)).b)}(a._i(K2d)||a._i(P8d)||a._i(Cke))&&this.xl(H2c(this))};jqb(85,5,{5:1,372:1,85:1,3:1},gld);_.c=false;_.d=false;_.e=false;var Kgb=Yxd(Rje,'ColorPickerState',85),Qcb=Yxd(Bke,'AbstractColorPickerConnector',2055),kV=Yxd(Ghe,'Grid',1038);FXd(Wq)(9);\n//# sourceURL=com.esofthead.mycollab.widgetset.MyCollabWidgetSet-9.js\n")