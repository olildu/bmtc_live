package app.chalo.validationsdk.blevalidation.domain.validationprocess;

import android.util.Base64;
import androidx.media3.exoplayer.upstream.CmcdData;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.models.validation.RegularBusProductAndValidationMethod;
import app.chalo.models.validation.RegularBusSlBleConfig;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.data.models.DynamicQrScheme;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.ValidationPayloadMetaData;
import app.chalo.validationsdk.blevalidation.domain.configuration.GetRegularBusProductValidationMethodUseCase;
import app.chalo.validationsdk.blevalidation.helper.ValidationQrGenerator;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/domain/validationprocess/DefaultValidationQRGeneratorAndroid;", "Lapp/chalo/validationsdk/blevalidation/helper/ValidationQrGenerator;", "Lapp/chalo/validationsdk/blevalidation/data/models/DynamicQrScheme$Default;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultValidationQRGeneratorAndroid implements ValidationQrGenerator<DynamicQrScheme.Default> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsLogger f10521a;
    public final BasicInfoContract b;
    public final ChaloConfigFeature c;
    public final CityProvider d;
    public final GetRegularBusBLEValidationPayloadUseCase e;
    public final GetRegularBusProductValidationMethodUseCase f;
    public final TimeUtilsContract g;
    public Boolean h;

    public DefaultValidationQRGeneratorAndroid(CrashlyticsLogger crashlyticsLogger, BasicInfoContract basicInfoContract, ChaloConfigFeature chaloConfigFeature, CityProvider cityProvider, GetRegularBusBLEValidationPayloadUseCase getRegularBusBLEValidationPayloadUseCase, GetRegularBusProductValidationMethodUseCase getRegularBusProductValidationMethodUseCase, TimeUtilsContract timeUtilsContract) {
        this.f10521a = crashlyticsLogger;
        this.b = basicInfoContract;
        this.c = chaloConfigFeature;
        this.d = cityProvider;
        this.e = getRegularBusBLEValidationPayloadUseCase;
        this.f = getRegularBusProductValidationMethodUseCase;
        this.g = timeUtilsContract;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // app.chalo.validationsdk.blevalidation.helper.ValidationQrGenerator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(ProductValidationData productValidationData, Function1 function1, ValidationProduct validationProduct, ContinuationImpl continuationImpl) throws Exception {
        DefaultValidationQRGeneratorAndroid$generate$1 defaultValidationQRGeneratorAndroid$generate$1;
        if (continuationImpl instanceof DefaultValidationQRGeneratorAndroid$generate$1) {
            defaultValidationQRGeneratorAndroid$generate$1 = (DefaultValidationQRGeneratorAndroid$generate$1) continuationImpl;
            int i = defaultValidationQRGeneratorAndroid$generate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultValidationQRGeneratorAndroid$generate$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultValidationQRGeneratorAndroid$generate$1 = new DefaultValidationQRGeneratorAndroid$generate$1(this, continuationImpl);
            }
        } else {
            defaultValidationQRGeneratorAndroid$generate$1 = new DefaultValidationQRGeneratorAndroid$generate$1(this, continuationImpl);
        }
        DefaultValidationQRGeneratorAndroid$generate$1 defaultValidationQRGeneratorAndroid$generate$2 = defaultValidationQRGeneratorAndroid$generate$1;
        Object objC = defaultValidationQRGeneratorAndroid$generate$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = defaultValidationQRGeneratorAndroid$generate$2.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            defaultValidationQRGeneratorAndroid$generate$2.L$0 = productValidationData;
            defaultValidationQRGeneratorAndroid$generate$2.L$1 = function1;
            defaultValidationQRGeneratorAndroid$generate$2.L$2 = validationProduct;
            defaultValidationQRGeneratorAndroid$generate$2.label = 1;
            objC = this.b.c(defaultValidationQRGeneratorAndroid$generate$2);
            if (objC != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
            return objC;
        }
        validationProduct = (ValidationProduct) defaultValidationQRGeneratorAndroid$generate$2.L$2;
        function1 = (Function1) defaultValidationQRGeneratorAndroid$generate$2.L$1;
        productValidationData = (ProductValidationData) defaultValidationQRGeneratorAndroid$generate$2.L$0;
        ResultKt.b(objC);
        Function1 function2 = function1;
        ValidationProduct validationProduct2 = validationProduct;
        String strValueOf = String.valueOf(((Number) objC).longValue());
        if (strValueOf.length() > 10) {
            strValueOf = strValueOf.substring(0, 10);
            Intrinsics.h(strValueOf, "substring(...)");
        } else if (strValueOf.length() < 10) {
            int length = 10 - strValueOf.length();
            for (int i3 = 0; i3 < length; i3++) {
                strValueOf = vo1.A(strValueOf, CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT);
            }
        }
        String str = strValueOf;
        defaultValidationQRGeneratorAndroid$generate$2.L$0 = null;
        defaultValidationQRGeneratorAndroid$generate$2.L$1 = null;
        defaultValidationQRGeneratorAndroid$generate$2.L$2 = null;
        defaultValidationQRGeneratorAndroid$generate$2.label = 2;
        Object objC2 = c(productValidationData, str, validationProduct2, function2, defaultValidationQRGeneratorAndroid$generate$2);
        return objC2 == obj ? obj : objC2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:45:0x0115  */
    /* JADX WARN: Code duplicated, block: B:48:0x0129  */
    /* JADX WARN: Code duplicated, block: B:51:0x013b  */
    /* JADX WARN: Code duplicated, block: B:54:0x015a  */
    /* JADX WARN: Code duplicated, block: B:56:0x015e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0172  */
    /* JADX WARN: Code duplicated, block: B:63:0x017d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0183  */
    /* JADX WARN: Code duplicated, block: B:66:0x0188  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x0188, please report this as an issue */
    public final Object c(ProductValidationData productValidationData, String str, ValidationProduct validationProduct, Function1 function1, ContinuationImpl continuationImpl) throws Exception {
        DefaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1 defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1;
        RegularBusSlBleConfig regularBusSlBleConfig;
        String strB;
        ProductValidationData productValidationData2;
        String str2;
        Object objD;
        String str3;
        Object objX;
        String str4;
        String str5;
        String str6;
        long jLongValue;
        String str7;
        DefaultValidationQRGeneratorAndroid defaultValidationQRGeneratorAndroid;
        String str8;
        String str9;
        DefaultValidationQRGeneratorAndroid defaultValidationQRGeneratorAndroid2;
        Boolean bool;
        String strA;
        if (continuationImpl instanceof DefaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1) {
            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1 = (DefaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1) continuationImpl;
            int i = defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1 = new DefaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1(this, continuationImpl);
            }
        } else {
            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1 = new DefaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1(this, continuationImpl);
        }
        Object objB = defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label) {
            case 0:
                ResultKt.b(objB);
                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = productValidationData;
                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = str;
                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = validationProduct;
                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = function1;
                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 1;
                objB = this.f.b(validationProduct, defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                if (objB != coroutineSingletons) {
                    regularBusSlBleConfig = ((RegularBusProductAndValidationMethod) objB).b;
                    if (regularBusSlBleConfig == null && regularBusSlBleConfig.j) {
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = null;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = null;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = null;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = null;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 2;
                        Object objD2 = d(productValidationData, str, validationProduct, defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                        if (objD2 != coroutineSingletons) {
                            return objD2;
                        }
                    } else if (productValidationData.b().equals("premiumReserveTicket")) {
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = null;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = null;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = null;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = null;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 3;
                        objD = d(productValidationData, str, validationProduct, defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                        if (objD != coroutineSingletons) {
                            return objD;
                        }
                    } else {
                        strB = productValidationData.b();
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = productValidationData;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = str;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = strB;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = null;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 4;
                        objB = function1.invoke(defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                        if (objB != coroutineSingletons) {
                            productValidationData2 = productValidationData;
                            str2 = strB;
                            str3 = (String) objB;
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = productValidationData2;
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = str;
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = str2;
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = str3;
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 5;
                            objX = productValidationData2.x(defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                            if (objX != coroutineSingletons) {
                                String str10 = str;
                                str4 = str2;
                                str5 = str3;
                                objB = objX;
                                str6 = str10;
                                jLongValue = ((Number) objB).longValue();
                                if (!Intrinsics.d(str4, "singleJourneyTicket")) {
                                    if (this.h == null) {
                                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = str6;
                                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = str5;
                                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = this;
                                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = null;
                                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.J$0 = jLongValue;
                                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 7;
                                        objB = e(str4, defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                                        if (objB != coroutineSingletons) {
                                            str7 = str5;
                                            defaultValidationQRGeneratorAndroid = this;
                                            defaultValidationQRGeneratorAndroid.h = (Boolean) objB;
                                            str5 = str7;
                                        }
                                    }
                                    bool = this.h;
                                    if (bool != null) {
                                        if (bool.booleanValue()) {
                                            strA = str5 + str6 + "," + this.g.A() + ",1";
                                        } else {
                                            strA = vo1.A(str5, str6);
                                        }
                                        if (strA != null) {
                                            return strA;
                                        }
                                    }
                                    return vo1.A(str5, str6);
                                }
                                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = str5;
                                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = str6;
                                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = this;
                                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = null;
                                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 6;
                                objB = productValidationData2.C(defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                                if (objB != coroutineSingletons) {
                                    str8 = str6;
                                    str9 = str5;
                                    defaultValidationQRGeneratorAndroid2 = this;
                                    boolean zBooleanValue = ((Boolean) objB).booleanValue();
                                    defaultValidationQRGeneratorAndroid2.getClass();
                                    return str9 + str8 + (zBooleanValue ? 1 : 0);
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                function1 = (Function1) defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3;
                validationProduct = (ValidationProduct) defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2;
                str = (String) defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1;
                productValidationData = (ProductValidationData) defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0;
                ResultKt.b(objB);
                regularBusSlBleConfig = ((RegularBusProductAndValidationMethod) objB).b;
                if (regularBusSlBleConfig == null) {
                    if (productValidationData.b().equals("premiumReserveTicket")) {
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = null;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = null;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = null;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = null;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 3;
                        objD = d(productValidationData, str, validationProduct, defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                        if (objD != coroutineSingletons) {
                            return objD;
                        }
                    } else {
                        strB = productValidationData.b();
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = productValidationData;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = str;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = strB;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = null;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 4;
                        objB = function1.invoke(defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                        if (objB != coroutineSingletons) {
                            productValidationData2 = productValidationData;
                            str2 = strB;
                            str3 = (String) objB;
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = productValidationData2;
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = str;
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = str2;
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = str3;
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 5;
                            objX = productValidationData2.x(defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                            if (objX != coroutineSingletons) {
                                String str11 = str;
                                str4 = str2;
                                str5 = str3;
                                objB = objX;
                                str6 = str11;
                                jLongValue = ((Number) objB).longValue();
                                if (!Intrinsics.d(str4, "singleJourneyTicket")) {
                                    if (this.h == null) {
                                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = str6;
                                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = str5;
                                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = this;
                                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = null;
                                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.J$0 = jLongValue;
                                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 7;
                                        objB = e(str4, defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                                        if (objB != coroutineSingletons) {
                                            str7 = str5;
                                            defaultValidationQRGeneratorAndroid = this;
                                            defaultValidationQRGeneratorAndroid.h = (Boolean) objB;
                                            str5 = str7;
                                        }
                                    }
                                    bool = this.h;
                                    if (bool != null) {
                                        if (bool.booleanValue()) {
                                            strA = vo1.A(str5, str6);
                                        } else {
                                            strA = str5 + str6 + "," + this.g.A() + ",1";
                                        }
                                        if (strA != null) {
                                            return strA;
                                        }
                                    }
                                    return vo1.A(str5, str6);
                                }
                                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = str5;
                                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = str6;
                                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = this;
                                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = null;
                                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 6;
                                objB = productValidationData2.C(defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                                if (objB != coroutineSingletons) {
                                    str8 = str6;
                                    str9 = str5;
                                    defaultValidationQRGeneratorAndroid2 = this;
                                    boolean zBooleanValue2 = ((Boolean) objB).booleanValue();
                                    defaultValidationQRGeneratorAndroid2.getClass();
                                    return str9 + str8 + (zBooleanValue2 ? 1 : 0);
                                }
                            }
                        }
                    }
                } else if (productValidationData.b().equals("premiumReserveTicket")) {
                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = null;
                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = null;
                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = null;
                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = null;
                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 3;
                    objD = d(productValidationData, str, validationProduct, defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                    if (objD != coroutineSingletons) {
                        return objD;
                    }
                } else {
                    strB = productValidationData.b();
                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = productValidationData;
                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = str;
                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = strB;
                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = null;
                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 4;
                    objB = function1.invoke(defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                    if (objB != coroutineSingletons) {
                        productValidationData2 = productValidationData;
                        str2 = strB;
                        str3 = (String) objB;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = productValidationData2;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = str;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = str2;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = str3;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 5;
                        objX = productValidationData2.x(defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                        if (objX != coroutineSingletons) {
                            String str12 = str;
                            str4 = str2;
                            str5 = str3;
                            objB = objX;
                            str6 = str12;
                            jLongValue = ((Number) objB).longValue();
                            if (!Intrinsics.d(str4, "singleJourneyTicket")) {
                                if (this.h == null) {
                                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = str6;
                                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = str5;
                                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = this;
                                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = null;
                                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.J$0 = jLongValue;
                                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 7;
                                    objB = e(str4, defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                                    if (objB != coroutineSingletons) {
                                        str7 = str5;
                                        defaultValidationQRGeneratorAndroid = this;
                                        defaultValidationQRGeneratorAndroid.h = (Boolean) objB;
                                        str5 = str7;
                                    }
                                }
                                bool = this.h;
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        strA = vo1.A(str5, str6);
                                    } else {
                                        strA = str5 + str6 + "," + this.g.A() + ",1";
                                    }
                                    if (strA != null) {
                                        return strA;
                                    }
                                }
                                return vo1.A(str5, str6);
                            }
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = str5;
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = str6;
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = this;
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = null;
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 6;
                            objB = productValidationData2.C(defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                            if (objB != coroutineSingletons) {
                                str8 = str6;
                                str9 = str5;
                                defaultValidationQRGeneratorAndroid2 = this;
                                boolean zBooleanValue3 = ((Boolean) objB).booleanValue();
                                defaultValidationQRGeneratorAndroid2.getClass();
                                return str9 + str8 + (zBooleanValue3 ? 1 : 0);
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                ResultKt.b(objB);
                return objB;
            case 3:
                ResultKt.b(objB);
                return objB;
            case 4:
                str2 = (String) defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2;
                str = (String) defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1;
                ProductValidationData productValidationData3 = (ProductValidationData) defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0;
                ResultKt.b(objB);
                productValidationData2 = productValidationData3;
                str3 = (String) objB;
                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = productValidationData2;
                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = str;
                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = str2;
                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = str3;
                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 5;
                objX = productValidationData2.x(defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                if (objX != coroutineSingletons) {
                    String str13 = str;
                    str4 = str2;
                    str5 = str3;
                    objB = objX;
                    str6 = str13;
                    jLongValue = ((Number) objB).longValue();
                    if (!Intrinsics.d(str4, "singleJourneyTicket")) {
                        if (this.h == null) {
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = str6;
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = str5;
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = this;
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = null;
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.J$0 = jLongValue;
                            defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 7;
                            objB = e(str4, defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                            if (objB != coroutineSingletons) {
                                str7 = str5;
                                defaultValidationQRGeneratorAndroid = this;
                                defaultValidationQRGeneratorAndroid.h = (Boolean) objB;
                                str5 = str7;
                            }
                        }
                        bool = this.h;
                        if (bool != null) {
                            if (bool.booleanValue()) {
                                strA = vo1.A(str5, str6);
                            } else {
                                strA = str5 + str6 + "," + this.g.A() + ",1";
                            }
                            if (strA != null) {
                                return strA;
                            }
                        }
                        return vo1.A(str5, str6);
                    }
                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = str5;
                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = str6;
                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = this;
                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = null;
                    defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 6;
                    objB = productValidationData2.C(defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                    if (objB != coroutineSingletons) {
                        str8 = str6;
                        str9 = str5;
                        defaultValidationQRGeneratorAndroid2 = this;
                        boolean zBooleanValue4 = ((Boolean) objB).booleanValue();
                        defaultValidationQRGeneratorAndroid2.getClass();
                        return str9 + str8 + (zBooleanValue4 ? 1 : 0);
                    }
                }
                return coroutineSingletons;
            case 5:
                str5 = (String) defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3;
                str4 = (String) defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2;
                str6 = (String) defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1;
                productValidationData2 = (ProductValidationData) defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0;
                ResultKt.b(objB);
                jLongValue = ((Number) objB).longValue();
                if (!Intrinsics.d(str4, "singleJourneyTicket")) {
                    if (this.h == null) {
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = str6;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = str5;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = this;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = null;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.J$0 = jLongValue;
                        defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 7;
                        objB = e(str4, defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                        if (objB != coroutineSingletons) {
                            str7 = str5;
                            defaultValidationQRGeneratorAndroid = this;
                            defaultValidationQRGeneratorAndroid.h = (Boolean) objB;
                            str5 = str7;
                        }
                    }
                    bool = this.h;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            strA = vo1.A(str5, str6);
                        } else {
                            strA = str5 + str6 + "," + this.g.A() + ",1";
                        }
                        if (strA != null) {
                            return strA;
                        }
                    }
                    return vo1.A(str5, str6);
                }
                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0 = str5;
                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1 = str6;
                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2 = this;
                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$3 = null;
                defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.label = 6;
                objB = productValidationData2.C(defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1);
                if (objB != coroutineSingletons) {
                    str8 = str6;
                    str9 = str5;
                    defaultValidationQRGeneratorAndroid2 = this;
                    boolean zBooleanValue5 = ((Boolean) objB).booleanValue();
                    defaultValidationQRGeneratorAndroid2.getClass();
                    return str9 + str8 + (zBooleanValue5 ? 1 : 0);
                }
                return coroutineSingletons;
            case 6:
                defaultValidationQRGeneratorAndroid2 = (DefaultValidationQRGeneratorAndroid) defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2;
                str8 = (String) defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1;
                str9 = (String) defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0;
                ResultKt.b(objB);
                boolean zBooleanValue6 = ((Boolean) objB).booleanValue();
                defaultValidationQRGeneratorAndroid2.getClass();
                return str9 + str8 + (zBooleanValue6 ? 1 : 0);
            case 7:
                defaultValidationQRGeneratorAndroid = (DefaultValidationQRGeneratorAndroid) defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$2;
                str7 = (String) defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$1;
                str6 = (String) defaultValidationQRGeneratorAndroid$getQrCodeStringToShow$1.L$0;
                ResultKt.b(objB);
                defaultValidationQRGeneratorAndroid.h = (Boolean) objB;
                str5 = str7;
                bool = this.h;
                if (bool != null) {
                    if (bool.booleanValue()) {
                        strA = vo1.A(str5, str6);
                    } else {
                        strA = str5 + str6 + "," + this.g.A() + ",1";
                    }
                    if (strA != null) {
                        return strA;
                    }
                }
                return vo1.A(str5, str6);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ProductValidationData productValidationData, String str, ValidationProduct validationProduct, ContinuationImpl continuationImpl) {
        DefaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1 defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1;
        GetRegularBusBLEValidationPayloadUseCase getRegularBusBLEValidationPayloadUseCase;
        ProductValidationData productValidationData2;
        GetRegularBusBLEValidationPayloadUseCase getRegularBusBLEValidationPayloadUseCase2;
        String str2;
        long j;
        String str3;
        if (continuationImpl instanceof DefaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1) {
            defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1 = (DefaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1) continuationImpl;
            int i = defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1 = new DefaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1(this, continuationImpl);
            }
        } else {
            defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1 = new DefaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1(this, continuationImpl);
        }
        Object objO = defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.label;
        if (i2 == 0) {
            ResultKt.b(objO);
            defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.L$0 = productValidationData;
            defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.L$1 = str;
            GetRegularBusBLEValidationPayloadUseCase getRegularBusBLEValidationPayloadUseCase3 = this.e;
            defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.L$2 = getRegularBusBLEValidationPayloadUseCase3;
            defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.L$3 = validationProduct;
            defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.label = 1;
            Object objX = productValidationData.x(defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1);
            if (objX != coroutineSingletons) {
                getRegularBusBLEValidationPayloadUseCase = getRegularBusBLEValidationPayloadUseCase3;
                objO = objX;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            validationProduct = (ValidationProduct) defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.L$3;
            GetRegularBusBLEValidationPayloadUseCase getRegularBusBLEValidationPayloadUseCase4 = (GetRegularBusBLEValidationPayloadUseCase) defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.L$2;
            str = (String) defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.L$1;
            ProductValidationData productValidationData3 = (ProductValidationData) defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.L$0;
            ResultKt.b(objO);
            getRegularBusBLEValidationPayloadUseCase = getRegularBusBLEValidationPayloadUseCase4;
            productValidationData = productValidationData3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.J$0;
            validationProduct = (ValidationProduct) defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.L$3;
            getRegularBusBLEValidationPayloadUseCase2 = (GetRegularBusBLEValidationPayloadUseCase) defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.L$2;
            str2 = (String) defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.L$1;
            productValidationData2 = (ProductValidationData) defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.L$0;
            ResultKt.b(objO);
        }
        str3 = (String) objO;
        if (str3 == null) {
            str3 = "";
        }
        ValidationPayloadMetaData validationPayloadMetaDataE = productValidationData2.e();
        getRegularBusBLEValidationPayloadUseCase2.getClass();
        return nf1.l(Base64.encodeToString(GetRegularBusBLEValidationPayloadUseCase.a(validationProduct, j, str3, validationPayloadMetaDataE), 0), ",", str2, ",2");
        long jLongValue = ((Number) objO).longValue();
        defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.L$0 = productValidationData;
        defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.L$1 = str;
        defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.L$2 = getRegularBusBLEValidationPayloadUseCase;
        defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.L$3 = validationProduct;
        defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.J$0 = jLongValue;
        defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1.label = 2;
        objO = productValidationData.o(defaultValidationQRGeneratorAndroid$getQrCodeStringToShowForNewPayloadScheme$1);
        if (objO != coroutineSingletons) {
            productValidationData2 = productValidationData;
            getRegularBusBLEValidationPayloadUseCase2 = getRegularBusBLEValidationPayloadUseCase;
            str2 = str;
            j = jLongValue;
            str3 = (String) objO;
            if (str3 == null) {
                str3 = "";
            }
            ValidationPayloadMetaData validationPayloadMetaDataE2 = productValidationData2.e();
            getRegularBusBLEValidationPayloadUseCase2.getClass();
            return nf1.l(Base64.encodeToString(GetRegularBusBLEValidationPayloadUseCase.a(validationProduct, j, str3, validationPayloadMetaDataE2), 0), ",", str2, ",2");
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r7 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.domain.validationprocess.DefaultValidationQRGeneratorAndroid.e(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
