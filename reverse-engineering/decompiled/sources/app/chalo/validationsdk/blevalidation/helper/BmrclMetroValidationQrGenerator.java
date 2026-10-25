package app.chalo.validationsdk.blevalidation.helper;

import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLog;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.validationsdk.blevalidation.data.models.DynamicQrScheme;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BmrclMetroValidationQrGenerator;", "Lapp/chalo/validationsdk/blevalidation/helper/ValidationQrGenerator;", "Lapp/chalo/validationsdk/blevalidation/data/models/DynamicQrScheme$BmrclMetro;", "Companion", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BmrclMetroValidationQrGenerator implements ValidationQrGenerator<DynamicQrScheme.BmrclMetro> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicInfoContract f10554a;
    public final CrashlyticsLogger b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BmrclMetroValidationQrGenerator$Companion;", "", "", "HEX_RADIX", "I", "", "MILLIS_IN_SECOND", "J", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public BmrclMetroValidationQrGenerator(BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger) {
        this.f10554a = basicInfoContract;
        this.b = crashlyticsLogger;
    }

    @Override // app.chalo.validationsdk.blevalidation.helper.ValidationQrGenerator
    public final /* bridge */ /* synthetic */ Object a(ProductValidationData productValidationData, Function1 function1, ValidationProduct validationProduct, Continuation continuation) {
        return b(productValidationData, function1, (DynamicQrScheme.BmrclMetro) DynamicQrScheme.Default.f10473a, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object b(ProductValidationData productValidationData, Function1 function1, DynamicQrScheme.BmrclMetro bmrclMetro, ContinuationImpl continuationImpl) {
        BmrclMetroValidationQrGenerator$generate$1 bmrclMetroValidationQrGenerator$generate$1;
        String str;
        DynamicQrScheme.BmrclMetro bmrclMetro2;
        if (continuationImpl instanceof BmrclMetroValidationQrGenerator$generate$1) {
            bmrclMetroValidationQrGenerator$generate$1 = (BmrclMetroValidationQrGenerator$generate$1) continuationImpl;
            int i = bmrclMetroValidationQrGenerator$generate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bmrclMetroValidationQrGenerator$generate$1.label = i - Integer.MIN_VALUE;
            } else {
                bmrclMetroValidationQrGenerator$generate$1 = new BmrclMetroValidationQrGenerator$generate$1(this, continuationImpl);
            }
        } else {
            bmrclMetroValidationQrGenerator$generate$1 = new BmrclMetroValidationQrGenerator$generate$1(this, continuationImpl);
        }
        Object objInvoke = bmrclMetroValidationQrGenerator$generate$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = bmrclMetroValidationQrGenerator$generate$1.label;
        CrashlyticsLogger crashlyticsLogger = this.b;
        try {
            if (i2 == 0) {
                ResultKt.b(objInvoke);
                bmrclMetroValidationQrGenerator$generate$1.L$0 = productValidationData;
                bmrclMetroValidationQrGenerator$generate$1.L$1 = bmrclMetro;
                bmrclMetroValidationQrGenerator$generate$1.label = 1;
                objInvoke = function1.invoke(bmrclMetroValidationQrGenerator$generate$1);
                if (objInvoke == obj) {
                }
                return obj;
            }
            if (i2 == 1) {
                bmrclMetro = (DynamicQrScheme.BmrclMetro) bmrclMetroValidationQrGenerator$generate$1.L$1;
                productValidationData = (ProductValidationData) bmrclMetroValidationQrGenerator$generate$1.L$0;
                ResultKt.b(objInvoke);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) bmrclMetroValidationQrGenerator$generate$1.L$1;
                bmrclMetro2 = (DynamicQrScheme.BmrclMetro) bmrclMetroValidationQrGenerator$generate$1.L$0;
                ResultKt.b(objInvoke);
            }
            long jLongValue = ((Number) objInvoke).longValue() / 1000;
            CharsKt.b(16);
            String string = Long.toString(jLongValue, 16);
            Intrinsics.h(string, "toString(...)");
            return str + "#{" + string + CLConstants.SALT_DELIMETER + bmrclMetro2.f10472a + CLConstants.SALT_DELIMETER + bmrclMetro2.b + CLConstants.SALT_DELIMETER + bmrclMetro2.c + "|}";
            String str2 = (String) objInvoke;
            if (str2.length() == 0) {
                try {
                    crashlyticsLogger.h(new BmrclMetroQrGenerationIllegalStateException("Empty static QR string received for BMRCL validation"), CollectionsKt.R(new CrashlyticsLog("productInfo", "id: " + productValidationData.getId() + "; subtype: " + productValidationData.b())));
                    return str2;
                } catch (Throwable th) {
                    ResultKt.a(th);
                    return str2;
                }
            }
            BasicInfoContract basicInfoContract = this.f10554a;
            bmrclMetroValidationQrGenerator$generate$1.L$0 = bmrclMetro;
            bmrclMetroValidationQrGenerator$generate$1.L$1 = str2;
            bmrclMetroValidationQrGenerator$generate$1.label = 2;
            objInvoke = basicInfoContract.c(bmrclMetroValidationQrGenerator$generate$1);
            if (objInvoke != obj) {
                str = str2;
                bmrclMetro2 = bmrclMetro;
                long jLongValue2 = ((Number) objInvoke).longValue() / 1000;
                CharsKt.b(16);
                String string2 = Long.toString(jLongValue2, 16);
                Intrinsics.h(string2, "toString(...)");
                return str + "#{" + string2 + CLConstants.SALT_DELIMETER + bmrclMetro2.f10472a + CLConstants.SALT_DELIMETER + bmrclMetro2.b + CLConstants.SALT_DELIMETER + bmrclMetro2.c + "|}";
            }
            return obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            crashlyticsLogger.i(e2);
            return "";
        }
    }
}
