package app.chalo.validation.instantticket;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.instantticket.data.InstantTicketRepository;
import app.chalo.instantticket.data.model.InstantTicketEntity;
import app.chalo.instantticket.data.model.InstantTicketEntityKt;
import app.chalo.instantticket.data.model.InstantTicketReceipt;
import app.chalo.instantticket.data.model.InstantTicketStatus;
import app.chalo.instantticket.validation.InstantTicketProductValidationUIManager;
import app.chalo.instantticket.validation.InstantTicketValidationAnalyticManager;
import app.chalo.instantticket.validation.InstantTicketValidationData;
import app.chalo.instantticket.validation.InstantTicketValidationModel;
import app.chalo.instantticket.validation.InstantTicketValidationNavigationManager;
import app.chalo.instantticket.validation.InstantTicketValidationReportProblemManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.notification.models.AppNotification;
import app.chalo.notification.models.InstantTicketReceiptNotificationEvent;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.validation.superpass.GenerateHashCodeForEasyVerificationUseCase;
import app.chalo.validation.superpass.GetNumDigitsOfHashValueForEasyVerificationUseCase;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationReportProblemManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validation/instantticket/InstantTicketProductValidationConfig;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationConfig;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InstantTicketProductValidationConfig implements ProductValidationConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstantTicketRepository f10457a;
    public final InstantTicketValidationData b;
    public final InstantTicketProductValidationUIManager c;
    public final GetNumDigitsOfHashValueForEasyVerificationUseCase d;
    public final InstantTicketValidationAnalyticManager e;
    public final InstantTicketValidationNavigationManager f;
    public final InstantTicketValidationReportProblemManager g;
    public final ProductsSyncContract h;

    public InstantTicketProductValidationConfig(InstantTicketRepository instantTicketRepository, InstantTicketValidationData instantTicketValidationData, InstantTicketProductValidationUIManager instantTicketProductValidationUIManager, GetNumDigitsOfHashValueForEasyVerificationUseCase getNumDigitsOfHashValueForEasyVerificationUseCase, GenerateHashCodeForEasyVerificationUseCase generateHashCodeForEasyVerificationUseCase, InstantTicketValidationAnalyticManager instantTicketValidationAnalyticManager, InstantTicketValidationNavigationManager instantTicketValidationNavigationManager, InstantTicketValidationReportProblemManager instantTicketValidationReportProblemManager, ProductsSyncContract productsSyncContract) {
        this.f10457a = instantTicketRepository;
        this.b = instantTicketValidationData;
        this.c = instantTicketProductValidationUIManager;
        this.d = getNumDigitsOfHashValueForEasyVerificationUseCase;
        this.e = instantTicketValidationAnalyticManager;
        this.f = instantTicketValidationNavigationManager;
        this.g = instantTicketValidationReportProblemManager;
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
        InstantTicketReceiptNotificationEvent instantTicketReceiptNotificationEvent;
        String str;
        if (!(punchNotification instanceof InstantTicketReceiptNotificationEvent) || (str = (instantTicketReceiptNotificationEvent = (InstantTicketReceiptNotificationEvent) punchNotification).e) == null) {
            return null;
        }
        String strF = Reflection.a(InstantTicketProductValidationConfig.class).f();
        if (strF == null) {
            strF = "InstantTicketProductValidationConfig";
        }
        AnalyticsContract.DefaultImpls.a(this.e, "instantTicket receipt payload", strF, vo1.s(PaymentConstants.PAYLOAD, String.valueOf(instantTicketReceiptNotificationEvent.f)), null, false, 24);
        try {
            String str2 = ((InstantTicketReceiptNotificationEvent) punchNotification).f;
            if (str2 == null) {
                return new InstantTicketReceipt(str, null, null, null, RouteNamingSchemeType.DEFAULT, 1045502);
            }
            JsonObject jsonObjectG = JsonElementKt.g(ChaloJson.b.f(str2));
            String strS = JsonElementExtensionsKt.s(jsonObjectG, "toStop", "");
            String strS2 = JsonElementExtensionsKt.s(jsonObjectG, "toStopId", "");
            String strS3 = JsonElementExtensionsKt.s(jsonObjectG, "via", "");
            RouteNamingSchemeType.Companion companion = RouteNamingSchemeType.INSTANCE;
            String strS4 = JsonElementExtensionsKt.s(jsonObjectG, "routeNamingScheme", "");
            companion.getClass();
            return new InstantTicketReceipt(str, strS, strS2, strS3, RouteNamingSchemeType.Companion.a(strS4), 1045310);
        } catch (Exception unused) {
            return new InstantTicketReceipt(str, null, null, null, RouteNamingSchemeType.DEFAULT, 1045502);
        }
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
        InstantTicketProductValidationConfig$onPunchEvent$1 instantTicketProductValidationConfig$onPunchEvent$1;
        if (continuation instanceof InstantTicketProductValidationConfig$onPunchEvent$1) {
            instantTicketProductValidationConfig$onPunchEvent$1 = (InstantTicketProductValidationConfig$onPunchEvent$1) continuation;
            int i = instantTicketProductValidationConfig$onPunchEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketProductValidationConfig$onPunchEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketProductValidationConfig$onPunchEvent$1 = new InstantTicketProductValidationConfig$onPunchEvent$1(this, (ContinuationImpl) continuation);
            }
        } else {
            instantTicketProductValidationConfig$onPunchEvent$1 = new InstantTicketProductValidationConfig$onPunchEvent$1(this, (ContinuationImpl) continuation);
        }
        Object obj = instantTicketProductValidationConfig$onPunchEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketProductValidationConfig$onPunchEvent$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                if (!(punchNotification instanceof InstantTicketReceiptNotificationEvent)) {
                    return Boolean.FALSE;
                }
                if (!Intrinsics.d(((InstantTicketReceiptNotificationEvent) punchNotification).e, str)) {
                    return Boolean.FALSE;
                }
                ProductsSyncContract productsSyncContract = this.h;
                instantTicketProductValidationConfig$onPunchEvent$1.label = 1;
                if (productsSyncContract.b(instantTicketProductValidationConfig$onPunchEvent$1) == coroutineSingletons) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object l(Product product, ContinuationImpl continuationImpl) {
        InstantTicketProductValidationConfig$getProductData$1 instantTicketProductValidationConfig$getProductData$1;
        if (continuationImpl instanceof InstantTicketProductValidationConfig$getProductData$1) {
            instantTicketProductValidationConfig$getProductData$1 = (InstantTicketProductValidationConfig$getProductData$1) continuationImpl;
            int i = instantTicketProductValidationConfig$getProductData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketProductValidationConfig$getProductData$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketProductValidationConfig$getProductData$1 = new InstantTicketProductValidationConfig$getProductData$1(this, continuationImpl);
            }
        } else {
            instantTicketProductValidationConfig$getProductData$1 = new InstantTicketProductValidationConfig$getProductData$1(this, continuationImpl);
        }
        Object objC = instantTicketProductValidationConfig$getProductData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketProductValidationConfig$getProductData$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            String str = product.f10666a;
            instantTicketProductValidationConfig$getProductData$1.label = 1;
            objC = this.f10457a.c(str, instantTicketProductValidationConfig$getProductData$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        InstantTicketEntity instantTicketEntity = (InstantTicketEntity) objC;
        if (instantTicketEntity == null) {
            return null;
        }
        InstantTicketStatus instantTicketStatus = instantTicketEntity.f;
        String str2 = instantTicketEntity.i;
        String str3 = instantTicketEntity.j;
        Long l = instantTicketEntity.k;
        InstantTicketValidationModel instantTicketValidationModel = new InstantTicketValidationModel(instantTicketStatus, str2, str3, l != null ? l.longValue() : -1L, l != null ? Long.valueOf(l.longValue() - instantTicketEntity.d) : null, (int) instantTicketEntity.e, instantTicketEntity.f3840a, instantTicketEntity.g, instantTicketEntity.c, instantTicketEntity.h, InstantTicketEntityKt.b(instantTicketEntity));
        InstantTicketValidationData instantTicketValidationData = this.b;
        instantTicketValidationData.h = instantTicketValidationModel;
        instantTicketValidationData.i = vo1.s("userPropertyOrderId", instantTicketEntity.f3840a);
        return instantTicketValidationData;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: m */
    public final ProductValidationReportProblemManager getD() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object n(ProductReceiptData productReceiptData, ProductValidationData productValidationData, String str, Continuation continuation) {
        InstantTicketProductValidationConfig$onProductReceiptDataReceived$1 instantTicketProductValidationConfig$onProductReceiptDataReceived$1;
        if (continuation instanceof InstantTicketProductValidationConfig$onProductReceiptDataReceived$1) {
            instantTicketProductValidationConfig$onProductReceiptDataReceived$1 = (InstantTicketProductValidationConfig$onProductReceiptDataReceived$1) continuation;
            int i = instantTicketProductValidationConfig$onProductReceiptDataReceived$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketProductValidationConfig$onProductReceiptDataReceived$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketProductValidationConfig$onProductReceiptDataReceived$1 = new InstantTicketProductValidationConfig$onProductReceiptDataReceived$1(this, (ContinuationImpl) continuation);
            }
        } else {
            instantTicketProductValidationConfig$onProductReceiptDataReceived$1 = new InstantTicketProductValidationConfig$onProductReceiptDataReceived$1(this, (ContinuationImpl) continuation);
        }
        Object obj = instantTicketProductValidationConfig$onProductReceiptDataReceived$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketProductValidationConfig$onProductReceiptDataReceived$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (Intrinsics.d(str, productReceiptData.getF10462a())) {
                instantTicketProductValidationConfig$onProductReceiptDataReceived$1.label = 1;
                if (this.h.b(instantTicketProductValidationConfig$onProductReceiptDataReceived$1) == coroutineSingletons) {
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
