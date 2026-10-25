package app.chalo.metro.validation;

import app.chalo.metro.data.app.MetroTicketAppModel;
import app.chalo.metro.data.app.MetroTicketStatus;
import app.chalo.metro.data.app.MetroTicketStopDetails;
import app.chalo.metro.repository.MetroRepository;
import app.chalo.notification.models.AppNotification;
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
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/validation/MetroTicketProductValidationConfig;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationConfig;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MetroTicketProductValidationConfig implements ProductValidationConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetroRepository f5558a;
    public final MetroTicketValidationData b;
    public final MetroTicketProductValidationUIManager c;
    public final GetNumDigitsOfHashValueForEasyVerificationUseCase d;
    public final MetroTicketValidationAnalyticManager e;
    public final MetroTicketValidationNavigationManager f;
    public final MetroTicketValidationReportProblemManager g;

    public MetroTicketProductValidationConfig(MetroRepository metroRepository, MetroTicketValidationData metroTicketValidationData, MetroTicketProductValidationUIManager metroTicketProductValidationUIManager, GetNumDigitsOfHashValueForEasyVerificationUseCase getNumDigitsOfHashValueForEasyVerificationUseCase, GenerateHashCodeForEasyVerificationUseCase generateHashCodeForEasyVerificationUseCase, MetroTicketValidationAnalyticManager metroTicketValidationAnalyticManager, MetroTicketValidationNavigationManager metroTicketValidationNavigationManager, MetroTicketValidationReportProblemManager metroTicketValidationReportProblemManager) {
        this.f5558a = metroRepository;
        this.b = metroTicketValidationData;
        this.c = metroTicketProductValidationUIManager;
        this.d = getNumDigitsOfHashValueForEasyVerificationUseCase;
        this.e = metroTicketValidationAnalyticManager;
        this.f = metroTicketValidationNavigationManager;
        this.g = metroTicketValidationReportProblemManager;
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
    public final ProductValidationUIManager e() {
        return this.c;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object f(AppNotification.PunchNotification punchNotification, ProductValidationData productValidationData, ContinuationImpl continuationImpl) {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final /* bridge */ boolean g() {
        return false;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final ProductValidationAnalyticManager h() {
        return this.e;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object i(ProductPunchDataFromPolling productPunchDataFromPolling, ProductValidationData productValidationData, String str, ContinuationImpl continuationImpl) {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final ProductValidationNavigationManager j() {
        return this.f;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object k(AppNotification.PunchNotification punchNotification, ProductValidationData productValidationData, String str, Continuation continuation) {
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object l(Product product, ContinuationImpl continuationImpl) {
        MetroTicketProductValidationConfig$getProductData$1 metroTicketProductValidationConfig$getProductData$1;
        if (continuationImpl instanceof MetroTicketProductValidationConfig$getProductData$1) {
            metroTicketProductValidationConfig$getProductData$1 = (MetroTicketProductValidationConfig$getProductData$1) continuationImpl;
            int i = metroTicketProductValidationConfig$getProductData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroTicketProductValidationConfig$getProductData$1.label = i - Integer.MIN_VALUE;
            } else {
                metroTicketProductValidationConfig$getProductData$1 = new MetroTicketProductValidationConfig$getProductData$1(this, continuationImpl);
            }
        } else {
            metroTicketProductValidationConfig$getProductData$1 = new MetroTicketProductValidationConfig$getProductData$1(this, continuationImpl);
        }
        Object objL = metroTicketProductValidationConfig$getProductData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroTicketProductValidationConfig$getProductData$1.label;
        if (i2 == 0) {
            ResultKt.b(objL);
            String str = product.f10666a;
            metroTicketProductValidationConfig$getProductData$1.label = 1;
            objL = this.f5558a.l(str, metroTicketProductValidationConfig$getProductData$1);
            if (objL == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objL);
        }
        MetroTicketAppModel metroTicketAppModel = (MetroTicketAppModel) objL;
        if (metroTicketAppModel == null) {
            return null;
        }
        MetroTicketStatus metroTicketStatus = metroTicketAppModel.e;
        String str2 = metroTicketAppModel.h;
        List list = metroTicketAppModel.i;
        String str3 = metroTicketAppModel.j;
        long j = metroTicketAppModel.k;
        long j2 = metroTicketAppModel.c;
        Long lValueOf = Long.valueOf(j - j2);
        int i3 = (int) metroTicketAppModel.d;
        String str4 = metroTicketAppModel.f5431a;
        Long l = metroTicketAppModel.f;
        Map map = metroTicketAppModel.l;
        MetroTicketStopDetails metroTicketStopDetails = metroTicketAppModel.n;
        String str5 = metroTicketStopDetails != null ? metroTicketStopDetails.f5434a : null;
        String str6 = metroTicketStopDetails != null ? metroTicketStopDetails.b : null;
        String str7 = str5;
        MetroTicketStopDetails metroTicketStopDetails2 = metroTicketAppModel.o;
        MetroTicketValidationModel metroTicketValidationModel = new MetroTicketValidationModel(metroTicketStatus, str2, str3, j, lValueOf, i3, str4, l, Long.valueOf(j2), map, str7, str6, metroTicketStopDetails2 != null ? metroTicketStopDetails2.f5434a : null, metroTicketStopDetails2 != null ? metroTicketStopDetails2.b : null, list);
        MetroTicketValidationData metroTicketValidationData = this.b;
        metroTicketValidationData.m(metroTicketValidationModel);
        metroTicketValidationData.f = vo1.s("userPropertyOrderId", metroTicketAppModel.f5431a);
        return metroTicketValidationData;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final ProductValidationReportProblemManager m() {
        return this.g;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig
    public final Object n(ProductReceiptData productReceiptData, ProductValidationData productValidationData, String str, Continuation continuation) {
        return Boolean.valueOf(Intrinsics.d(productReceiptData.getF7487a(), str));
    }
}
