package app.chalo.ondc.validation;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.network.config.ChaloJson;
import app.chalo.notification.models.AppNotification;
import app.chalo.ondc.model.app.OndcTicketAppModel;
import app.chalo.ondc.model.app.OndcTicketStatus;
import app.chalo.ondc.model.app.OndcTicketValidationReceiptData;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.validation.superpass.GenerateHashCodeForEasyVerificationUseCase;
import app.chalo.validation.superpass.GetNumDigitsOfHashValueForEasyVerificationUseCase;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationReportProblemManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel;
import app.chalo.validationsdk.blevalidation.data.models.app.ProductPunchDataFromPolling;
import app.chalo.validationsdk.blevalidation.data.models.app.ProductValidationDataReceivedOverBle;
import app.chalo.validationsdk.legacy.Product;
import defpackage.vo1;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ondc/validation/OndcTicketProductValidationConfig;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationConfig;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OndcTicketProductValidationConfig implements ProductValidationConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OndcRepository f6799a;
    public final OndcTicketValidationData b;
    public final OndcTicketProductValidationUIManager c;
    public final GetNumDigitsOfHashValueForEasyVerificationUseCase d;
    public final OndcTicketValidationAnalyticManager e;
    public final OndcTicketValidationNavigationManager f;
    public final OndcTicketValidationReportProblemManager g;
    public final ProductsSyncContract h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lapp/chalo/ondc/validation/OndcTicketProductValidationConfig$Companion;", "", "", "KEY_VEHICLE_NO", "Ljava/lang/String;", "KEY_CONDUCTOR_ID", "KEY_START_STOP", "KEY_END_STOP", "KEY_ROUTE_NAME", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public OndcTicketProductValidationConfig(OndcRepository ondcRepository, OndcTicketValidationData ondcTicketValidationData, OndcTicketProductValidationUIManager ondcTicketProductValidationUIManager, GetNumDigitsOfHashValueForEasyVerificationUseCase getNumDigitsOfHashValueForEasyVerificationUseCase, GenerateHashCodeForEasyVerificationUseCase generateHashCodeForEasyVerificationUseCase, OndcTicketValidationAnalyticManager ondcTicketValidationAnalyticManager, OndcTicketValidationNavigationManager ondcTicketValidationNavigationManager, OndcTicketValidationReportProblemManager ondcTicketValidationReportProblemManager, ProductsSyncContract productsSyncContract) {
        this.f6799a = ondcRepository;
        this.b = ondcTicketValidationData;
        this.c = ondcTicketProductValidationUIManager;
        this.d = getNumDigitsOfHashValueForEasyVerificationUseCase;
        this.e = ondcTicketValidationAnalyticManager;
        this.f = ondcTicketValidationNavigationManager;
        this.g = ondcTicketValidationReportProblemManager;
        this.h = productsSyncContract;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final String a(int i, String strToHash) {
        Intrinsics.i(strToHash, "strToHash");
        return GenerateHashCodeForEasyVerificationUseCase.a(i, strToHash);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object c(Continuation continuation) {
        return this.d.a(2, (ContinuationImpl) continuation);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object d(ProductValidationDataReceivedOverBle.ConductorValidationPunchData conductorValidationPunchData, ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: e */
    public final ProductValidationUIManager getC() {
        return this.c;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object f(AppNotification.PunchNotification punchNotification, ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        JsonObject jsonObjectG;
        if (!(punchNotification instanceof AppNotification.PunchNotification.OndcTicketPunchEvent)) {
            return null;
        }
        ProductValidationModel h = productValidationData.getK();
        if (!(h instanceof OndcTicketValidationModel)) {
            return null;
        }
        String strF = Reflection.a(OndcTicketProductValidationConfig.class).f();
        if (strF == null) {
            strF = "OndcTicketProductValidationConfig";
        }
        String str = strF;
        AppNotification.PunchNotification.OndcTicketPunchEvent ondcTicketPunchEvent = (AppNotification.PunchNotification.OndcTicketPunchEvent) punchNotification;
        AnalyticsContract.DefaultImpls.a(this.e, "ondc ticket receipt payload", str, vo1.s(PaymentConstants.PAYLOAD, String.valueOf(ondcTicketPunchEvent.g)), null, false, 24);
        try {
            String str2 = ((AppNotification.PunchNotification.OndcTicketPunchEvent) punchNotification).g;
            jsonObjectG = str2 != null ? JsonElementKt.g(ChaloJson.b.f(str2)) : ChaloJson.c;
        } catch (Exception unused) {
            jsonObjectG = ChaloJson.c;
        }
        String str3 = ondcTicketPunchEvent.c;
        String str4 = ondcTicketPunchEvent.d;
        String str5 = ondcTicketPunchEvent.e;
        long j = ondcTicketPunchEvent.f;
        OndcTicketValidationModel ondcTicketValidationModel = (OndcTicketValidationModel) h;
        long j2 = ondcTicketValidationModel.f;
        String strS = ondcTicketValidationModel.l;
        if (strS == null) {
            strS = JsonElementExtensionsKt.s(jsonObjectG, "startStop", "");
        }
        String str6 = strS;
        String strS2 = ondcTicketValidationModel.m;
        if (strS2 == null) {
            strS2 = JsonElementExtensionsKt.s(jsonObjectG, "endStop", "");
        }
        String str7 = strS2;
        String strS3 = ondcTicketValidationModel.k;
        if (strS3 == null) {
            strS3 = JsonElementExtensionsKt.s(jsonObjectG, "routeName", "");
        }
        return new OndcTicketValidationReceiptData(str3, j, j2, JsonElementExtensionsKt.s(jsonObjectG, "vehicleNo", ""), JsonElementExtensionsKt.s(jsonObjectG, "conductorId", ""), str6, str7, strS3, str4, str5, ondcTicketValidationModel.j);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final /* bridge */ boolean g() {
        return false;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: h */
    public final ProductValidationAnalyticManager getF8908a() {
        return this.e;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object i(ProductPunchDataFromPolling productPunchDataFromPolling, ProductValidationData productValidationData, String str, ContinuationImpl continuationImpl) {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: j */
    public final ProductValidationNavigationManager getB() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object k(AppNotification.PunchNotification punchNotification, ProductValidationData productValidationData, String str, Continuation continuation) {
        OndcTicketProductValidationConfig$onPunchEvent$1 ondcTicketProductValidationConfig$onPunchEvent$1;
        if (continuation instanceof OndcTicketProductValidationConfig$onPunchEvent$1) {
            ondcTicketProductValidationConfig$onPunchEvent$1 = (OndcTicketProductValidationConfig$onPunchEvent$1) continuation;
            int i = ondcTicketProductValidationConfig$onPunchEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcTicketProductValidationConfig$onPunchEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcTicketProductValidationConfig$onPunchEvent$1 = new OndcTicketProductValidationConfig$onPunchEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcTicketProductValidationConfig$onPunchEvent$1 = new OndcTicketProductValidationConfig$onPunchEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = ondcTicketProductValidationConfig$onPunchEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcTicketProductValidationConfig$onPunchEvent$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                if (!(punchNotification instanceof AppNotification.PunchNotification.OndcTicketPunchEvent)) {
                    return Boolean.FALSE;
                }
                if (!((AppNotification.PunchNotification.OndcTicketPunchEvent) punchNotification).c.equals(str)) {
                    return Boolean.FALSE;
                }
                ProductsSyncContract productsSyncContract = this.h;
                ondcTicketProductValidationConfig$onPunchEvent$1.label = 1;
                if (productsSyncContract.b(ondcTicketProductValidationConfig$onPunchEvent$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Boolean.TRUE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object l(Product product, ContinuationImpl continuationImpl) {
        OndcTicketProductValidationConfig$getProductData$1 ondcTicketProductValidationConfig$getProductData$1;
        if (continuationImpl instanceof OndcTicketProductValidationConfig$getProductData$1) {
            ondcTicketProductValidationConfig$getProductData$1 = (OndcTicketProductValidationConfig$getProductData$1) continuationImpl;
            int i = ondcTicketProductValidationConfig$getProductData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcTicketProductValidationConfig$getProductData$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcTicketProductValidationConfig$getProductData$1 = new OndcTicketProductValidationConfig$getProductData$1(this, continuationImpl);
            }
        } else {
            ondcTicketProductValidationConfig$getProductData$1 = new OndcTicketProductValidationConfig$getProductData$1(this, continuationImpl);
        }
        Object objK = ondcTicketProductValidationConfig$getProductData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcTicketProductValidationConfig$getProductData$1.label;
        if (i2 == 0) {
            ResultKt.b(objK);
            String str = product.f10666a;
            ondcTicketProductValidationConfig$getProductData$1.label = 1;
            objK = this.f6799a.k(str, ondcTicketProductValidationConfig$getProductData$1);
            if (objK == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objK);
        }
        OndcTicketAppModel ondcTicketAppModel = (OndcTicketAppModel) objK;
        if (ondcTicketAppModel == null) {
            return null;
        }
        OndcTicketStatus ondcTicketStatus = ondcTicketAppModel.e;
        String str2 = ondcTicketAppModel.h;
        String str3 = ondcTicketAppModel.i;
        long j = ondcTicketAppModel.j;
        long j2 = ondcTicketAppModel.c;
        OndcTicketValidationModel ondcTicketValidationModel = new OndcTicketValidationModel(ondcTicketStatus, str2, str3, j, Long.valueOf(j - j2), (int) ondcTicketAppModel.d, ondcTicketAppModel.f6771a, ondcTicketAppModel.f, Long.valueOf(j2), ondcTicketAppModel.k, ondcTicketAppModel.l, ondcTicketAppModel.m, ondcTicketAppModel.n, ondcTicketAppModel.p, ondcTicketAppModel.r);
        OndcTicketValidationData ondcTicketValidationData = this.b;
        ondcTicketValidationData.m(ondcTicketValidationModel);
        ondcTicketValidationData.g = vo1.s("userPropertyOrderId", ondcTicketAppModel.f6771a);
        return ondcTicketValidationData;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: m */
    public final ProductValidationReportProblemManager getD() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object n(ProductReceiptData productReceiptData, ProductValidationData productValidationData, String str, Continuation continuation) {
        OndcTicketProductValidationConfig$onProductReceiptDataReceived$1 ondcTicketProductValidationConfig$onProductReceiptDataReceived$1;
        if (continuation instanceof OndcTicketProductValidationConfig$onProductReceiptDataReceived$1) {
            ondcTicketProductValidationConfig$onProductReceiptDataReceived$1 = (OndcTicketProductValidationConfig$onProductReceiptDataReceived$1) continuation;
            int i = ondcTicketProductValidationConfig$onProductReceiptDataReceived$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcTicketProductValidationConfig$onProductReceiptDataReceived$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcTicketProductValidationConfig$onProductReceiptDataReceived$1 = new OndcTicketProductValidationConfig$onProductReceiptDataReceived$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcTicketProductValidationConfig$onProductReceiptDataReceived$1 = new OndcTicketProductValidationConfig$onProductReceiptDataReceived$1(this, (ContinuationImpl) continuation);
        }
        Object obj = ondcTicketProductValidationConfig$onProductReceiptDataReceived$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcTicketProductValidationConfig$onProductReceiptDataReceived$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (Intrinsics.d(str, productReceiptData.getF10462a())) {
                ondcTicketProductValidationConfig$onProductReceiptDataReceived$1.label = 1;
                if (this.h.b(ondcTicketProductValidationConfig$onProductReceiptDataReceived$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                z = false;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Boolean.valueOf(z);
    }
}
