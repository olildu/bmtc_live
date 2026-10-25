package app.chalo.validation.superpass;

import app.chalo.contract.BasicInfoContract;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPassUIProperties;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.models.entities.SuperPassProperties;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.superpass.data.models.entities.SuperPassTransactionDetails;
import app.chalo.superpass.data.models.entities.SuperPassUIProperties;
import app.chalo.superpass.utils.MixpanelUtil;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SuperPassProductValidationModelKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(SuperPass superPass, ContinuationImpl continuationImpl) {
        SuperPassProductValidationModelKt$getAnalyticsPropertiesMap$1 superPassProductValidationModelKt$getAnalyticsPropertiesMap$1;
        if (continuationImpl instanceof SuperPassProductValidationModelKt$getAnalyticsPropertiesMap$1) {
            superPassProductValidationModelKt$getAnalyticsPropertiesMap$1 = (SuperPassProductValidationModelKt$getAnalyticsPropertiesMap$1) continuationImpl;
            int i = superPassProductValidationModelKt$getAnalyticsPropertiesMap$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassProductValidationModelKt$getAnalyticsPropertiesMap$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassProductValidationModelKt$getAnalyticsPropertiesMap$1 = new SuperPassProductValidationModelKt$getAnalyticsPropertiesMap$1(continuationImpl);
            }
        } else {
            superPassProductValidationModelKt$getAnalyticsPropertiesMap$1 = new SuperPassProductValidationModelKt$getAnalyticsPropertiesMap$1(continuationImpl);
        }
        Object obj = superPassProductValidationModelKt$getAnalyticsPropertiesMap$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassProductValidationModelKt$getAnalyticsPropertiesMap$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map = (Map) superPassProductValidationModelKt$getAnalyticsPropertiesMap$1.L$0;
            ResultKt.b(obj);
            return map;
        }
        LinkedHashMap linkedHashMapO = d.o(obj);
        MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
        superPassProductValidationModelKt$getAnalyticsPropertiesMap$1.L$0 = linkedHashMapO;
        superPassProductValidationModelKt$getAnalyticsPropertiesMap$1.label = 1;
        return mixpanelUtil.c(linkedHashMapO, superPass, superPassProductValidationModelKt$getAnalyticsPropertiesMap$1) == coroutineSingletons ? coroutineSingletons : linkedHashMapO;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0122  */
    /* JADX WARN: Code duplicated, block: B:29:0x0126  */
    /* JADX WARN: Code duplicated, block: B:31:0x0129  */
    /* JADX WARN: Code duplicated, block: B:32:0x0130  */
    /* JADX WARN: Code duplicated, block: B:34:0x0134  */
    /* JADX WARN: Code duplicated, block: B:35:0x0138  */
    /* JADX WARN: Code duplicated, block: B:41:0x0144  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object b(SuperPass superPass, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract, ContinuationImpl continuationImpl) {
        SuperPassProductValidationModelKt$toSuperPassProductValidationModel$1 superPassProductValidationModelKt$toSuperPassProductValidationModel$1;
        String str;
        String str2;
        String str3;
        long j;
        Long l;
        String str4;
        String str5;
        SuperPass superPass2;
        SuperPassUserDetailsForProducts superPassUserDetailsForProducts;
        int i;
        String str6;
        String str7;
        String str8;
        int iIntValue;
        BasicInfoContract basicInfoContract2;
        int i2;
        long j2;
        String str9;
        SuperPassUserDetailsForProducts superPassUserDetailsForProducts2;
        String str10;
        boolean z;
        RideBasedSuperPass rideBasedSuperPass;
        int iO;
        RideBasedSuperPass rideBasedSuperPass2;
        double d;
        RideBasedSuperPassUIProperties rideBasedSuperPassUIProperties;
        if (continuationImpl instanceof SuperPassProductValidationModelKt$toSuperPassProductValidationModel$1) {
            superPassProductValidationModelKt$toSuperPassProductValidationModel$1 = (SuperPassProductValidationModelKt$toSuperPassProductValidationModel$1) continuationImpl;
            int i3 = superPassProductValidationModelKt$toSuperPassProductValidationModel$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                superPassProductValidationModelKt$toSuperPassProductValidationModel$1.label = i3 - Integer.MIN_VALUE;
            } else {
                superPassProductValidationModelKt$toSuperPassProductValidationModel$1 = new SuperPassProductValidationModelKt$toSuperPassProductValidationModel$1(continuationImpl);
            }
        } else {
            superPassProductValidationModelKt$toSuperPassProductValidationModel$1 = new SuperPassProductValidationModelKt$toSuperPassProductValidationModel$1(continuationImpl);
        }
        Object obj = superPassProductValidationModelKt$toSuperPassProductValidationModel$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = superPassProductValidationModelKt$toSuperPassProductValidationModel$1.label;
        if (i4 == 0) {
            ResultKt.b(obj);
            SuperPassUIProperties c = superPass.getC();
            SuperPassProperties superPassProperties = superPass.f9560a;
            SuperPassUserDetailsForProducts superPassUserDetailsForProducts3 = new SuperPassUserDetailsForProducts(c.c, timeUtilsContract);
            SuperPassTransactionDetails superPassTransactionDetails = superPass.e;
            String str11 = superPassTransactionDetails.f9573a;
            str = superPassTransactionDetails.b;
            str2 = superPassProperties.f;
            str3 = superPassProperties.g;
            j = superPass.getB().c;
            l = new Long(superPass.getB().d);
            int i5 = (int) superPass.getC().f.f9545a;
            str4 = superPassProperties.f9566a;
            str5 = superPassProperties.b;
            SuperPassSubType.Companion companion = SuperPassSubType.INSTANCE;
            SuperPassSubType superPassSubType = superPassProperties.c;
            companion.getClass();
            String strB = SuperPassSubType.Companion.b(superPassSubType);
            String str12 = superPass.getC().g;
            RideBasedSuperPass rideBasedSuperPass3 = superPass instanceof RideBasedSuperPass ? (RideBasedSuperPass) superPass : null;
            if (rideBasedSuperPass3 != null) {
                superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$0 = superPass;
                superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$1 = basicInfoContract;
                superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$2 = str11;
                superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$3 = str;
                superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$4 = str2;
                superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$5 = str3;
                superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$6 = l;
                superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$7 = str4;
                superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$8 = str5;
                superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$9 = strB;
                superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$10 = str12;
                superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$11 = superPassUserDetailsForProducts3;
                superPassProductValidationModelKt$toSuperPassProductValidationModel$1.J$0 = j;
                superPassProductValidationModelKt$toSuperPassProductValidationModel$1.I$0 = i5;
                superPassProductValidationModelKt$toSuperPassProductValidationModel$1.label = 1;
                Object objP = rideBasedSuperPass3.p(superPassProductValidationModelKt$toSuperPassProductValidationModel$1);
                if (objP == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = objP;
                i2 = i5;
                j2 = j;
                str9 = str12;
                superPassUserDetailsForProducts2 = superPassUserDetailsForProducts3;
                superPass2 = superPass;
                str10 = strB;
                str8 = str11;
                basicInfoContract2 = basicInfoContract;
            } else {
                superPass2 = superPass;
                superPassUserDetailsForProducts = superPassUserDetailsForProducts3;
                i = i5;
                str6 = strB;
                str7 = str12;
                str8 = str11;
                iIntValue = -1;
                basicInfoContract2 = basicInfoContract;
            }
            String str13 = str5;
            String str14 = str4;
            Long l2 = l;
            z = superPass2 instanceof RideBasedSuperPass;
            if (z) {
                rideBasedSuperPass = (RideBasedSuperPass) superPass2;
            } else {
                rideBasedSuperPass = null;
            }
            if (rideBasedSuperPass != null) {
                iO = rideBasedSuperPass.o();
            } else {
                iO = -1;
            }
            if (z) {
                rideBasedSuperPass2 = (RideBasedSuperPass) superPass2;
            } else {
                rideBasedSuperPass2 = null;
            }
            if (rideBasedSuperPass2 != null || (rideBasedSuperPassUIProperties = rideBasedSuperPass2.h) == null) {
                d = -1.0d;
            } else {
                d = rideBasedSuperPassUIProperties.m;
            }
            double d2 = d;
            SuperPassProductValidationModelKt$toSuperPassProductValidationModel$2 superPassProductValidationModelKt$toSuperPassProductValidationModel$2 = new SuperPassProductValidationModelKt$toSuperPassProductValidationModel$2(superPass2, basicInfoContract2, null);
            SuperPassProductValidationModelKt$toSuperPassProductValidationModel$3 superPassProductValidationModelKt$toSuperPassProductValidationModel$3 = new SuperPassProductValidationModelKt$toSuperPassProductValidationModel$3(1, superPass2, SuperPass.class, "getLastActivationTimeStamp", "getLastActivationTimeStamp(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            SuperPassProductValidationModelKt$toSuperPassProductValidationModel$4 superPassProductValidationModelKt$toSuperPassProductValidationModel$4 = new SuperPassProductValidationModelKt$toSuperPassProductValidationModel$4(superPass2, basicInfoContract2, null);
            SuperPassProperties superPassProperties2 = superPass2.f9560a;
            return new SuperPassProductValidationModel(str8, str, str2, str3, j, l2, i, str14, str13, str6, str7, superPassUserDetailsForProducts, iIntValue, iO, d2, superPassProductValidationModelKt$toSuperPassProductValidationModel$2, superPassProductValidationModelKt$toSuperPassProductValidationModel$3, superPassProductValidationModelKt$toSuperPassProductValidationModel$4, superPassProperties2.d, superPassProperties2.e, superPass2.getC().i.f5592a);
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i2 = superPassProductValidationModelKt$toSuperPassProductValidationModel$1.I$0;
        j2 = superPassProductValidationModelKt$toSuperPassProductValidationModel$1.J$0;
        superPassUserDetailsForProducts2 = (SuperPassUserDetailsForProducts) superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$11;
        str9 = (String) superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$10;
        str10 = (String) superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$9;
        str5 = (String) superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$8;
        str4 = (String) superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$7;
        l = (Long) superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$6;
        str3 = (String) superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$5;
        str2 = (String) superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$4;
        str = (String) superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$3;
        str8 = (String) superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$2;
        basicInfoContract2 = (BasicInfoContract) superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$1;
        superPass2 = (SuperPass) superPassProductValidationModelKt$toSuperPassProductValidationModel$1.L$0;
        ResultKt.b(obj);
        i = i2;
        iIntValue = ((Number) obj).intValue();
        superPassUserDetailsForProducts = superPassUserDetailsForProducts2;
        str7 = str9;
        str6 = str10;
        j = j2;
        String str15 = str5;
        String str16 = str4;
        Long l3 = l;
        z = superPass2 instanceof RideBasedSuperPass;
        if (z) {
            rideBasedSuperPass = (RideBasedSuperPass) superPass2;
        } else {
            rideBasedSuperPass = null;
        }
        if (rideBasedSuperPass != null) {
            iO = rideBasedSuperPass.o();
        } else {
            iO = -1;
        }
        if (z) {
            rideBasedSuperPass2 = (RideBasedSuperPass) superPass2;
        } else {
            rideBasedSuperPass2 = null;
        }
        if (rideBasedSuperPass2 != null) {
            d = -1.0d;
        } else {
            d = -1.0d;
        }
        double d3 = d;
        SuperPassProductValidationModelKt$toSuperPassProductValidationModel$2 superPassProductValidationModelKt$toSuperPassProductValidationModel$5 = new SuperPassProductValidationModelKt$toSuperPassProductValidationModel$2(superPass2, basicInfoContract2, null);
        SuperPassProductValidationModelKt$toSuperPassProductValidationModel$3 superPassProductValidationModelKt$toSuperPassProductValidationModel$6 = new SuperPassProductValidationModelKt$toSuperPassProductValidationModel$3(1, superPass2, SuperPass.class, "getLastActivationTimeStamp", "getLastActivationTimeStamp(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        SuperPassProductValidationModelKt$toSuperPassProductValidationModel$4 superPassProductValidationModelKt$toSuperPassProductValidationModel$7 = new SuperPassProductValidationModelKt$toSuperPassProductValidationModel$4(superPass2, basicInfoContract2, null);
        SuperPassProperties superPassProperties3 = superPass2.f9560a;
        return new SuperPassProductValidationModel(str8, str, str2, str3, j, l3, i, str16, str15, str6, str7, superPassUserDetailsForProducts, iIntValue, iO, d3, superPassProductValidationModelKt$toSuperPassProductValidationModel$5, superPassProductValidationModelKt$toSuperPassProductValidationModel$6, superPassProductValidationModelKt$toSuperPassProductValidationModel$7, superPassProperties3.d, superPassProperties3.e, superPass2.getC().i.f5592a);
    }
}
