package app.chalo.premiumbus.prebookedtickets.domain;

import app.chalo.productbooking.common.data.models.app.ProductConfigForUiAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import app.chalo.productbooking.common.data.models.app.ProductsConfigListForUiAppModel;
import app.chalo.productbooking.common.domain.FetchProductConfigForUiErrorReason;
import app.chalo.productbooking.common.domain.FetchProductConfigsForUiUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/GetProductConfigInfoForPremiumBusProductIfActiveUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetProductConfigInfoForPremiumBusProductIfActiveUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchProductConfigsForUiUseCase f7315a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7316a;

        static {
            int[] iArr = new int[FetchProductConfigForUiErrorReason.values().length];
            try {
                iArr[FetchProductConfigForUiErrorReason.INVALID_CITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FetchProductConfigForUiErrorReason.SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FetchProductConfigForUiErrorReason.LOCAL_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FetchProductConfigForUiErrorReason.UNKNOWN_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FetchProductConfigForUiErrorReason.PARSE_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FetchProductConfigForUiErrorReason.USER_DATA_NOT_AVAILABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f7316a = iArr;
        }
    }

    public GetProductConfigInfoForPremiumBusProductIfActiveUseCase(FetchProductConfigsForUiUseCase fetchProductConfigsForUiUseCase) {
        this.f7315a = fetchProductConfigsForUiUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        GetProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$1 getProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$1;
        Object next;
        if (continuationImpl instanceof GetProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$1) {
            getProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$1 = (GetProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$1) continuationImpl;
            int i = getProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$1 = new GetProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$1 = new GetProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$1(this, continuationImpl);
        }
        GetProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$1 getProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$2 = getProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$1;
        Object objC = getProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$2.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            List listR = CollectionsKt.R("premiumReserveTicket");
            List listR2 = CollectionsKt.R(ProductConfigServiceType.PREMIUM);
            getProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$2.L$0 = str;
            getProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$2.label = 1;
            objC = this.f7315a.c((252 & 1) != 0 ? null : listR, (252 & 2) != 0 ? null : listR2, (252 & 4) != 0 ? null : null, (252 & 8) != 0 ? null : null, (252 & 16) != 0 ? null : null, null, null, null, getProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$2);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) getProductConfigInfoForPremiumBusProductIfActiveUseCase$invoke$2.L$0;
            ResultKt.b(objC);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objC;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            switch (WhenMappings.f7316a[((FetchProductConfigForUiErrorReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return new ChaloUseCaseResult.Failure(PremiumBusProductConfigForRepurchaseFailureReason.CONFIG_FETCH_FAILED);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        Iterator it = ((ProductsConfigListForUiAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f8226a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((ProductConfigForUiAppModel) next).f8217a, str));
        ProductConfigForUiAppModel productConfigForUiAppModel = (ProductConfigForUiAppModel) next;
        if (productConfigForUiAppModel == null) {
            return new ChaloUseCaseResult.Failure(PremiumBusProductConfigForRepurchaseFailureReason.CONFIG_NOT_AVAILABLE);
        }
        return (productConfigForUiAppModel.i && productConfigForUiAppModel.n.contains(ProductConfigServiceType.PREMIUM)) ? new ChaloUseCaseResult.Success(productConfigForUiAppModel) : new ChaloUseCaseResult.Failure(PremiumBusProductConfigForRepurchaseFailureReason.CONFIG_NOT_ACTIVE);
    }
}
