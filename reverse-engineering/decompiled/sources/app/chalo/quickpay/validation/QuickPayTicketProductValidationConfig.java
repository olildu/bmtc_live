package app.chalo.quickpay.validation;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.network.config.ChaloJson;
import app.chalo.notification.models.AppNotification;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.utils.ChaloWalletOrderIdUtils;
import app.chalo.utils.WalletUtilsExtensionsKt;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationReportProblemManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.app.ProductPunchDataFromPolling;
import app.chalo.validationsdk.blevalidation.data.models.app.ProductValidationDataReceivedOverBle;
import app.chalo.validationsdk.legacy.Product;
import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
import app.chalo.walletframework.quickpay.data.repository.entity.QuickPayReceipt;
import app.chalo.walletframework.wallet.domain.ResolveQuickPayProductNameUseCase;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/quickpay/validation/QuickPayTicketProductValidationConfig;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationConfig;", "Companion", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickPayTicketProductValidationConfig implements ProductValidationConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductValidationAnalyticManager f8908a;
    public final ProductValidationNavigationManager b;
    public final ProductValidationUIManager c;
    public final ProductValidationReportProblemManager d;
    public final ProductValidationData e;
    public final QuickPayRepository f;
    public final ChaloConfigFeature g;
    public final CoroutineContextProvider h;
    public final ResolveQuickPayProductNameUseCase i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/quickpay/validation/QuickPayTicketProductValidationConfig$Companion;", "", "", "DEFAULT_NUM_DIGITS_OF_HASH_VALUE", "I", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public QuickPayTicketProductValidationConfig(ProductValidationAnalyticManager productValidationAnalyticManager, ProductValidationNavigationManager productValidationNavigationManager, ProductValidationUIManager productValidationUIManager, ProductValidationReportProblemManager productValidationReportProblemManager, ProductValidationData productValidationData, QuickPayRepository quickPayRepository, ChaloConfigFeature chaloConfigFeature, CoroutineContextProvider coroutineContextProvider, ResolveQuickPayProductNameUseCase resolveQuickPayProductNameUseCase) {
        this.f8908a = productValidationAnalyticManager;
        this.b = productValidationNavigationManager;
        this.c = productValidationUIManager;
        this.d = productValidationReportProblemManager;
        this.e = productValidationData;
        this.f = quickPayRepository;
        this.g = chaloConfigFeature;
        this.h = coroutineContextProvider;
        this.i = resolveQuickPayProductNameUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object o(QuickPayTicketProductValidationConfig quickPayTicketProductValidationConfig, String str, ContinuationImpl continuationImpl) {
        QuickPayTicketProductValidationConfig$resolveByOrderId$1 quickPayTicketProductValidationConfig$resolveByOrderId$1;
        QuickPayRepository quickPayRepository = quickPayTicketProductValidationConfig.f;
        if (continuationImpl instanceof QuickPayTicketProductValidationConfig$resolveByOrderId$1) {
            quickPayTicketProductValidationConfig$resolveByOrderId$1 = (QuickPayTicketProductValidationConfig$resolveByOrderId$1) continuationImpl;
            int i = quickPayTicketProductValidationConfig$resolveByOrderId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayTicketProductValidationConfig$resolveByOrderId$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayTicketProductValidationConfig$resolveByOrderId$1 = new QuickPayTicketProductValidationConfig$resolveByOrderId$1(quickPayTicketProductValidationConfig, continuationImpl);
            }
        } else {
            quickPayTicketProductValidationConfig$resolveByOrderId$1 = new QuickPayTicketProductValidationConfig$resolveByOrderId$1(quickPayTicketProductValidationConfig, continuationImpl);
        }
        Object objJ = quickPayTicketProductValidationConfig$resolveByOrderId$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayTicketProductValidationConfig$resolveByOrderId$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            quickPayTicketProductValidationConfig$resolveByOrderId$1.label = 1;
            objJ = quickPayRepository.j(str, quickPayTicketProductValidationConfig$resolveByOrderId$1);
            if (objJ != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objJ);
            return objJ;
        }
        ResultKt.b(objJ);
        QuickPayAppModel quickPayAppModel = (QuickPayAppModel) CollectionsKt.H((List) objJ);
        if (quickPayAppModel == null) {
            return null;
        }
        String str2 = quickPayAppModel.b;
        quickPayTicketProductValidationConfig$resolveByOrderId$1.label = 2;
        Object objQ = quickPayRepository.q(str2, quickPayTicketProductValidationConfig$resolveByOrderId$1);
        return objQ == obj ? obj : objQ;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final String a(int i, String strToHash) {
        Intrinsics.i(strToHash, "strToHash");
        return String.valueOf((Math.abs(strToHash.hashCode()) % (((int) Math.pow(10.0d, i)) - 1)) + 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object c(Continuation continuation) {
        QuickPayTicketProductValidationConfig$numDigitsOfHashValue$1 quickPayTicketProductValidationConfig$numDigitsOfHashValue$1;
        int iC;
        if (continuation instanceof QuickPayTicketProductValidationConfig$numDigitsOfHashValue$1) {
            quickPayTicketProductValidationConfig$numDigitsOfHashValue$1 = (QuickPayTicketProductValidationConfig$numDigitsOfHashValue$1) continuation;
            int i = quickPayTicketProductValidationConfig$numDigitsOfHashValue$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayTicketProductValidationConfig$numDigitsOfHashValue$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayTicketProductValidationConfig$numDigitsOfHashValue$1 = new QuickPayTicketProductValidationConfig$numDigitsOfHashValue$1(this, (ContinuationImpl) continuation);
            }
        } else {
            quickPayTicketProductValidationConfig$numDigitsOfHashValue$1 = new QuickPayTicketProductValidationConfig$numDigitsOfHashValue$1(this, (ContinuationImpl) continuation);
        }
        Object objA = quickPayTicketProductValidationConfig$numDigitsOfHashValue$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayTicketProductValidationConfig$numDigitsOfHashValue$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            quickPayTicketProductValidationConfig$numDigitsOfHashValue$1.label = 1;
            objA = this.g.a("easyConductorVerification", quickPayTicketProductValidationConfig$numDigitsOfHashValue$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        String str = (String) objA;
        int i3 = 2;
        if (str.length() > 0) {
            try {
                JsonObject jsonObjectG = JsonElementKt.g(ChaloJson.b.f(str));
                if (JsonElementExtensionsKt.l("numDigits", jsonObjectG) && (iC = JsonElementExtensionsKt.c(jsonObjectG, "numDigits")) > 2) {
                    i3 = iC;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new Integer(i3);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object d(ProductValidationDataReceivedOverBle.ConductorValidationPunchData conductorValidationPunchData, ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ProductValidationUIManager getD() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object f(AppNotification.PunchNotification punchNotification, ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        AppNotification.PunchNotification.QuickPayNotificationEvent quickPayNotificationEvent;
        String str;
        Object objB;
        if ((punchNotification instanceof AppNotification.PunchNotification.QuickPayNotificationEvent) && (str = (quickPayNotificationEvent = (AppNotification.PunchNotification.QuickPayNotificationEvent) punchNotification).g) != null) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str, QuickPayReceiptInfo.INSTANCE.serializer());
            } catch (Exception unused) {
                objB = null;
            }
            QuickPayReceiptInfo quickPayReceiptInfo = (QuickPayReceiptInfo) objB;
            if (quickPayReceiptInfo != null) {
                String strF = Reflection.a(QuickPayTicketProductValidationConfig.class).f();
                if (strF == null) {
                    strF = "QuickPayTicketProductValidationConfig";
                }
                AnalyticsContract.DefaultImpls.a(this.f8908a, "quickpay receipt payload", strF, MapsKt.i(new Pair(PaymentConstants.PAYLOAD, quickPayReceiptInfo.toString()), new Pair("agency", String.valueOf(quickPayNotificationEvent.d))), null, false, 24);
                String str2 = quickPayNotificationEvent.e;
                String str3 = quickPayNotificationEvent.f;
                String str4 = quickPayNotificationEvent.c;
                if (QuickPayTicketProductValidationConfigKt.a(new QuickPayPunchDetails(str2, str3, str4, quickPayReceiptInfo, quickPayNotificationEvent.d))) {
                    String str5 = quickPayReceiptInfo.b;
                    Intrinsics.f(str5);
                    Intrinsics.f(str4);
                    Long l = quickPayReceiptInfo.f8906a;
                    Intrinsics.f(l);
                    return new QuickPayReceipt(str5, WalletUtilsExtensionsKt.a(l.longValue(), str4), 0L, 0L, "", "", "", quickPayReceiptInfo.e, "", quickPayReceiptInfo.d, null, quickPayReceiptInfo.f, quickPayReceiptInfo.g, null, null, null, null, null, null, null, null);
                }
            }
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final /* bridge */ boolean g() {
        return false;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: h, reason: from getter */
    public final ProductValidationAnalyticManager getB() {
        return this.f8908a;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object i(ProductPunchDataFromPolling productPunchDataFromPolling, ProductValidationData productValidationData, String str, ContinuationImpl continuationImpl) {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: j, reason: from getter */
    public final ProductValidationNavigationManager getC() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object k(AppNotification.PunchNotification punchNotification, ProductValidationData productValidationData, String str, Continuation continuation) {
        boolean zD;
        Long l;
        if (!(punchNotification instanceof AppNotification.PunchNotification.QuickPayNotificationEvent)) {
            return Boolean.FALSE;
        }
        AppNotification.PunchNotification.QuickPayNotificationEvent quickPayNotificationEvent = (AppNotification.PunchNotification.QuickPayNotificationEvent) punchNotification;
        String str2 = quickPayNotificationEvent.g;
        Object objB = null;
        if (str2 != null) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str2, QuickPayReceiptInfo.INSTANCE.serializer());
            } catch (Exception unused) {
            }
            objB = (QuickPayReceiptInfo) objB;
        }
        QuickPayReceiptInfo quickPayReceiptInfo = objB;
        String str3 = quickPayNotificationEvent.e;
        String str4 = quickPayNotificationEvent.f;
        String str5 = quickPayNotificationEvent.c;
        if (QuickPayTicketProductValidationConfigKt.a(new QuickPayPunchDetails(str3, str4, str5, quickPayReceiptInfo, quickPayNotificationEvent.d))) {
            if (str5 == null) {
                str5 = "";
            }
            zD = Intrinsics.d(str, ChaloWalletOrderIdUtils.a((quickPayReceiptInfo == 0 || (l = quickPayReceiptInfo.f8906a) == null) ? -1L : l.longValue(), str5));
        } else {
            zD = false;
        }
        return Boolean.valueOf(zD);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object l(Product product, ContinuationImpl continuationImpl) {
        return BuildersKt.g(this.h.b(), new QuickPayTicketProductValidationConfig$getProductData$2(this, product, null), continuationImpl);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    /* JADX INFO: renamed from: m, reason: from getter */
    public final ProductValidationReportProblemManager getE() {
        return this.d;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object n(ProductReceiptData productReceiptData, ProductValidationData productValidationData, String str, Continuation continuation) {
        return Boolean.valueOf(Intrinsics.d(productReceiptData.getB(), "quickpay"));
    }
}
