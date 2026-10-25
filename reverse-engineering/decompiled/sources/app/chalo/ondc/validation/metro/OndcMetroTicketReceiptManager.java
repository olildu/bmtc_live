package app.chalo.ondc.validation.metro;

import app.chalo.data.BookingsRequestType;
import app.chalo.ondc.data.OndcMetroTicketReceiptData;
import app.chalo.ondc.domain.FetchOndcMetroTicketUseCase;
import app.chalo.ondc.domain.GetOndcMetroTicketAppModelFromApiUseCase;
import app.chalo.ondc.model.api.OndcMetroTicketApiModel;
import app.chalo.ondc.model.app.OndcMetroTicketAppModel;
import app.chalo.productbooking.common.domain.MobileTicketByIdFetchFailedReason;
import app.chalo.receipt.ProductReceiptManager;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/ondc/validation/metro/OndcMetroTicketReceiptManager;", "Lapp/chalo/receipt/ProductReceiptManager;", "Lapp/chalo/data/BookingsRequestType$OndcMetroTicketType;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OndcMetroTicketReceiptManager implements ProductReceiptManager<BookingsRequestType.OndcMetroTicketType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchOndcMetroTicketUseCase f6811a;
    public final OndcMetroTicketUserDetailsForProducts b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/chalo/ondc/validation/metro/OndcMetroTicketReceiptManager$Companion;", "", "", "RECEIPT_NOT_AVAILABLE", "Ljava/lang/String;", "RECEIPT_FETCH_TIMEOUT", "", "RECEIPT_FETCH_TIMEOUT_MILLIS", "J", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public OndcMetroTicketReceiptManager(FetchOndcMetroTicketUseCase fetchOndcMetroTicketUseCase, GetOndcMetroTicketAppModelFromApiUseCase getOndcMetroTicketAppModelFromApiUseCase, OndcMetroTicketUserDetailsForProducts ondcMetroTicketUserDetailsForProducts) {
        this.f6811a = fetchOndcMetroTicketUseCase;
        this.b = ondcMetroTicketUserDetailsForProducts;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(BookingsRequestType.OndcMetroTicketType ondcMetroTicketType, ContinuationImpl continuationImpl) {
        OndcMetroTicketReceiptManager$getReceipt$1 ondcMetroTicketReceiptManager$getReceipt$1;
        if (continuationImpl instanceof OndcMetroTicketReceiptManager$getReceipt$1) {
            ondcMetroTicketReceiptManager$getReceipt$1 = (OndcMetroTicketReceiptManager$getReceipt$1) continuationImpl;
            int i = ondcMetroTicketReceiptManager$getReceipt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketReceiptManager$getReceipt$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketReceiptManager$getReceipt$1 = new OndcMetroTicketReceiptManager$getReceipt$1(this, continuationImpl);
            }
        } else {
            ondcMetroTicketReceiptManager$getReceipt$1 = new OndcMetroTicketReceiptManager$getReceipt$1(this, continuationImpl);
        }
        Object objC = ondcMetroTicketReceiptManager$getReceipt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcMetroTicketReceiptManager$getReceipt$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            OndcMetroTicketReceiptManager$getReceipt$result$1 ondcMetroTicketReceiptManager$getReceipt$result$1 = new OndcMetroTicketReceiptManager$getReceipt$result$1(this, ondcMetroTicketType, null);
            ondcMetroTicketReceiptManager$getReceipt$1.label = 1;
            objC = TimeoutKt.c(5000L, ondcMetroTicketReceiptManager$getReceipt$result$1, ondcMetroTicketReceiptManager$getReceipt$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objC;
        if (chaloUseCaseResult == null) {
            return new ChaloUseCaseResult.Failure(new OndcMetroTicketReceiptFetchFailed("Receipt fetch timeout"));
        }
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            OndcMetroTicketAppModel ondcMetroTicketAppModelA = GetOndcMetroTicketAppModelFromApiUseCase.a((OndcMetroTicketApiModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
            return ondcMetroTicketAppModelA == null ? new ChaloUseCaseResult.Failure(new OndcMetroTicketReceiptFetchFailed("Receipt not available")) : new ChaloUseCaseResult.Success(new OndcMetroTicketReceiptData(ondcMetroTicketAppModelA));
        }
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            return new ChaloUseCaseResult.Failure(new OndcMetroTicketReceiptFetchFailed(((MobileTicketByIdFetchFailedReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).name()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
