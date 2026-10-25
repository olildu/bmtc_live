package app.chalo.ondc.validation.metro;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.data.RefundInfoAppModel;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.network.config.ChaloJson;
import app.chalo.notification.models.AppNotification;
import app.chalo.ondc.model.app.OndcMetroTicketAppModel;
import app.chalo.ondc.model.app.OndcMetroTicketStatus;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.utils.ChaloUseCaseResult;
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
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/validation/metro/OndcMetroTicketProductValidationConfig;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationConfig;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OndcMetroTicketProductValidationConfig implements ProductValidationConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OndcRepository f6807a;
    public final OndcMetroTicketValidationData b;
    public final OndcMetroTicketProductValidationUIManager c;
    public final GetNumDigitsOfHashValueForEasyVerificationUseCase d;
    public final OndcMetroTicketValidationAnalyticManager e;
    public final OndcMetroTicketValidationNavigationManager f;
    public final OndcMetroTicketValidationReportProblemManager g;
    public final ProductsSyncContract h;

    public OndcMetroTicketProductValidationConfig(OndcRepository ondcRepository, OndcMetroTicketValidationData ondcMetroTicketValidationData, OndcMetroTicketProductValidationUIManager ondcMetroTicketProductValidationUIManager, GetNumDigitsOfHashValueForEasyVerificationUseCase getNumDigitsOfHashValueForEasyVerificationUseCase, GenerateHashCodeForEasyVerificationUseCase generateHashCodeForEasyVerificationUseCase, OndcMetroTicketValidationAnalyticManager ondcMetroTicketValidationAnalyticManager, OndcMetroTicketValidationNavigationManager ondcMetroTicketValidationNavigationManager, OndcMetroTicketValidationReportProblemManager ondcMetroTicketValidationReportProblemManager, ProductsSyncContract productsSyncContract) {
        this.f6807a = ondcRepository;
        this.b = ondcMetroTicketValidationData;
        this.c = ondcMetroTicketProductValidationUIManager;
        this.d = getNumDigitsOfHashValueForEasyVerificationUseCase;
        this.e = ondcMetroTicketValidationAnalyticManager;
        this.f = ondcMetroTicketValidationNavigationManager;
        this.g = ondcMetroTicketValidationReportProblemManager;
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
    public final Object f(final AppNotification.PunchNotification punchNotification, ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        final JsonObject jsonObjectG;
        JsonElement jsonElementF;
        if (!(punchNotification instanceof AppNotification.PunchNotification.OndcMetroPunchEvent)) {
            return null;
        }
        ProductValidationModel h = productValidationData.getK();
        if (!(h instanceof OndcMetroTicketValidationModel)) {
            return null;
        }
        final OndcMetroTicketValidationModel ondcMetroTicketValidationModel = (OndcMetroTicketValidationModel) h;
        AppNotification.PunchNotification.OndcMetroPunchEvent ondcMetroPunchEvent = (AppNotification.PunchNotification.OndcMetroPunchEvent) punchNotification;
        if (!Intrinsics.d(ondcMetroTicketValidationModel.g, ondcMetroPunchEvent.c) || !ondcMetroTicketValidationModel.d()) {
            return null;
        }
        String strF = Reflection.a(OndcMetroTicketProductValidationConfig.class).f();
        if (strF == null) {
            strF = "OndcMetroTicketProductValidationConfig";
        }
        AnalyticsContract.DefaultImpls.a(this.e, "ondc metro ticket receipt payload", strF, vo1.s(PaymentConstants.PAYLOAD, String.valueOf(ondcMetroPunchEvent.g)), null, false, 24);
        try {
            String str = ((AppNotification.PunchNotification.OndcMetroPunchEvent) punchNotification).g;
            jsonObjectG = (str == null || (jsonElementF = ChaloJson.b.f(str)) == null) ? ChaloJson.c : JsonElementKt.g(jsonElementF);
        } catch (Exception unused) {
            jsonObjectG = ChaloJson.c;
        }
        return new ProductReceiptData() { // from class: app.chalo.ondc.validation.metro.OndcMetroTicketProductValidationConfig$getReceiptDataFromPunchEvent$2
            @Override // app.chalo.receipt.ProductReceiptData
            /* JADX INFO: renamed from: b */
            public final String getB() {
                return ((AppNotification.PunchNotification.OndcMetroPunchEvent) punchNotification).e;
            }

            @Override // app.chalo.receipt.ProductReceiptData
            /* JADX INFO: renamed from: e */
            public final long getC() {
                return ((AppNotification.PunchNotification.OndcMetroPunchEvent) punchNotification).f;
            }

            @Override // app.chalo.receipt.ProductReceiptData
            /* JADX INFO: renamed from: f */
            public final /* bridge */ String getS() {
                return null;
            }

            @Override // app.chalo.receipt.ProductReceiptData
            /* JADX INFO: renamed from: g */
            public final /* bridge */ String getM() {
                return null;
            }

            @Override // app.chalo.receipt.ProductReceiptData
            public final Long getAmount() {
                return Long.valueOf(ondcMetroTicketValidationModel.f);
            }

            @Override // app.chalo.receipt.ProductReceiptData
            /* JADX INFO: renamed from: h */
            public final /* bridge */ String getP() {
                return null;
            }

            @Override // app.chalo.receipt.ProductReceiptData
            /* JADX INFO: renamed from: i */
            public final /* bridge */ String getQ() {
                return null;
            }

            @Override // app.chalo.receipt.ProductReceiptData
            public final /* bridge */ String j() {
                return null;
            }

            @Override // app.chalo.receipt.ProductReceiptData
            /* JADX INFO: renamed from: k */
            public final /* bridge */ String getR() {
                return null;
            }

            @Override // app.chalo.receipt.ProductReceiptData
            /* JADX INFO: renamed from: l */
            public final String getE() {
                return "";
            }

            @Override // app.chalo.receipt.ProductReceiptData
            public final /* bridge */ String m() {
                return null;
            }

            @Override // app.chalo.receipt.ProductReceiptData
            /* JADX INFO: renamed from: n */
            public final /* bridge */ String getN() {
                return null;
            }

            @Override // app.chalo.receipt.ProductReceiptData
            /* JADX INFO: renamed from: o */
            public final /* bridge */ String getM() {
                return "";
            }

            @Override // app.chalo.receipt.ProductReceiptData
            /* JADX INFO: renamed from: p */
            public final String getF10462a() {
                return ((AppNotification.PunchNotification.OndcMetroPunchEvent) punchNotification).c;
            }

            @Override // app.chalo.receipt.ProductReceiptData
            /* JADX INFO: renamed from: q */
            public final /* bridge */ /* synthetic */ RefundInfoAppModel getO() {
                return null;
            }

            @Override // app.chalo.receipt.ProductReceiptData
            public final /* bridge */ String r() {
                return "";
            }

            @Override // app.chalo.receipt.ProductReceiptData
            /* JADX INFO: renamed from: s */
            public final String getF() {
                return "";
            }

            @Override // app.chalo.receipt.ProductReceiptData
            /* JADX INFO: renamed from: t */
            public final String getG() {
                String strS = JsonElementExtensionsKt.s(jsonObjectG, "startStop", "");
                if (strS.length() <= 0) {
                    strS = null;
                }
                return (strS == null && (strS = ondcMetroTicketValidationModel.l) == null) ? "" : strS;
            }

            @Override // app.chalo.receipt.ProductReceiptData
            /* JADX INFO: renamed from: u */
            public final String getI() {
                String strS = JsonElementExtensionsKt.s(jsonObjectG, "routeName", "");
                if (strS.length() <= 0) {
                    strS = null;
                }
                return (strS == null && (strS = ondcMetroTicketValidationModel.k) == null) ? "" : strS;
            }

            @Override // app.chalo.receipt.ProductReceiptData
            /* JADX INFO: renamed from: v */
            public final /* bridge */ String getO() {
                return null;
            }

            @Override // app.chalo.receipt.ProductReceiptData
            public final /* bridge */ String w() {
                return null;
            }

            @Override // app.chalo.receipt.ProductReceiptData
            /* JADX INFO: renamed from: x */
            public final Map getJ() {
                return ondcMetroTicketValidationModel.j;
            }

            @Override // app.chalo.receipt.ProductReceiptData
            /* JADX INFO: renamed from: y */
            public final String getH() {
                String strS = JsonElementExtensionsKt.s(jsonObjectG, "endStop", "");
                if (strS.length() <= 0) {
                    strS = null;
                }
                return (strS == null && (strS = ondcMetroTicketValidationModel.m) == null) ? "" : strS;
            }

            @Override // app.chalo.receipt.ProductReceiptData
            public final /* bridge */ List z() {
                return null;
            }
        };
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final boolean g() {
        return true;
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
        OndcMetroTicketProductValidationConfig$onPunchEvent$1 ondcMetroTicketProductValidationConfig$onPunchEvent$1;
        boolean zBooleanValue;
        if (continuation instanceof OndcMetroTicketProductValidationConfig$onPunchEvent$1) {
            ondcMetroTicketProductValidationConfig$onPunchEvent$1 = (OndcMetroTicketProductValidationConfig$onPunchEvent$1) continuation;
            int i = ondcMetroTicketProductValidationConfig$onPunchEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketProductValidationConfig$onPunchEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketProductValidationConfig$onPunchEvent$1 = new OndcMetroTicketProductValidationConfig$onPunchEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcMetroTicketProductValidationConfig$onPunchEvent$1 = new OndcMetroTicketProductValidationConfig$onPunchEvent$1(this, (ContinuationImpl) continuation);
        }
        Object objB = ondcMetroTicketProductValidationConfig$onPunchEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcMetroTicketProductValidationConfig$onPunchEvent$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objB);
                if (!(punchNotification instanceof AppNotification.PunchNotification.OndcMetroPunchEvent)) {
                    return Boolean.FALSE;
                }
                if (!((AppNotification.PunchNotification.OndcMetroPunchEvent) punchNotification).c.equals(str)) {
                    return Boolean.FALSE;
                }
                ProductsSyncContract productsSyncContract = this.h;
                ondcMetroTicketProductValidationConfig$onPunchEvent$1.label = 1;
                objB = productsSyncContract.b(ondcMetroTicketProductValidationConfig$onPunchEvent$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objB);
            }
            ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objB;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                zBooleanValue = false;
            } else {
                if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                zBooleanValue = ((Boolean) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object l(Product product, ContinuationImpl continuationImpl) {
        OndcMetroTicketProductValidationConfig$getProductData$1 ondcMetroTicketProductValidationConfig$getProductData$1;
        if (continuationImpl instanceof OndcMetroTicketProductValidationConfig$getProductData$1) {
            ondcMetroTicketProductValidationConfig$getProductData$1 = (OndcMetroTicketProductValidationConfig$getProductData$1) continuationImpl;
            int i = ondcMetroTicketProductValidationConfig$getProductData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketProductValidationConfig$getProductData$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketProductValidationConfig$getProductData$1 = new OndcMetroTicketProductValidationConfig$getProductData$1(this, continuationImpl);
            }
        } else {
            ondcMetroTicketProductValidationConfig$getProductData$1 = new OndcMetroTicketProductValidationConfig$getProductData$1(this, continuationImpl);
        }
        Object objV = ondcMetroTicketProductValidationConfig$getProductData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcMetroTicketProductValidationConfig$getProductData$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            String str = product.f10666a;
            ondcMetroTicketProductValidationConfig$getProductData$1.label = 1;
            objV = this.f6807a.v(str, ondcMetroTicketProductValidationConfig$getProductData$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        OndcMetroTicketAppModel ondcMetroTicketAppModel = (OndcMetroTicketAppModel) objV;
        if (ondcMetroTicketAppModel == null) {
            return null;
        }
        OndcMetroTicketStatus ondcMetroTicketStatus = ondcMetroTicketAppModel.e;
        String str2 = ondcMetroTicketAppModel.h;
        List list = ondcMetroTicketAppModel.i;
        String str3 = ondcMetroTicketAppModel.j;
        long j = ondcMetroTicketAppModel.k;
        long j2 = ondcMetroTicketAppModel.c;
        OndcMetroTicketValidationModel ondcMetroTicketValidationModel = new OndcMetroTicketValidationModel(ondcMetroTicketStatus, str2, str3, j, Long.valueOf(j - j2), (int) ondcMetroTicketAppModel.d, ondcMetroTicketAppModel.f6769a, ondcMetroTicketAppModel.f, Long.valueOf(j2), ondcMetroTicketAppModel.l, ondcMetroTicketAppModel.m, ondcMetroTicketAppModel.n, ondcMetroTicketAppModel.o, list, ondcMetroTicketAppModel.q);
        OndcMetroTicketValidationData ondcMetroTicketValidationData = this.b;
        ondcMetroTicketValidationData.m(ondcMetroTicketValidationModel);
        ondcMetroTicketValidationData.g = vo1.s("userPropertyOrderId", ondcMetroTicketAppModel.f6769a);
        return ondcMetroTicketValidationData;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: m */
    public final ProductValidationReportProblemManager getD() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object n(ProductReceiptData productReceiptData, ProductValidationData productValidationData, String str, Continuation continuation) {
        OndcMetroTicketProductValidationConfig$onProductReceiptDataReceived$1 ondcMetroTicketProductValidationConfig$onProductReceiptDataReceived$1;
        if (continuation instanceof OndcMetroTicketProductValidationConfig$onProductReceiptDataReceived$1) {
            ondcMetroTicketProductValidationConfig$onProductReceiptDataReceived$1 = (OndcMetroTicketProductValidationConfig$onProductReceiptDataReceived$1) continuation;
            int i = ondcMetroTicketProductValidationConfig$onProductReceiptDataReceived$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketProductValidationConfig$onProductReceiptDataReceived$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketProductValidationConfig$onProductReceiptDataReceived$1 = new OndcMetroTicketProductValidationConfig$onProductReceiptDataReceived$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcMetroTicketProductValidationConfig$onProductReceiptDataReceived$1 = new OndcMetroTicketProductValidationConfig$onProductReceiptDataReceived$1(this, (ContinuationImpl) continuation);
        }
        Object objB = ondcMetroTicketProductValidationConfig$onProductReceiptDataReceived$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcMetroTicketProductValidationConfig$onProductReceiptDataReceived$1.label;
        boolean zBooleanValue = false;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (Intrinsics.d(str, productReceiptData.getF10462a())) {
                ondcMetroTicketProductValidationConfig$onProductReceiptDataReceived$1.label = 1;
                objB = this.h.b(ondcMetroTicketProductValidationConfig$onProductReceiptDataReceived$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objB);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objB;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            zBooleanValue = ((Boolean) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
