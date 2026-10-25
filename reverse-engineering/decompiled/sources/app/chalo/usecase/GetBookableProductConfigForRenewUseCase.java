package app.chalo.usecase;

import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase;
import app.chalo.productpurchase.productselection.data.local.ProductPurchaseLocalDataSource;
import app.chalo.productpurchase.utils.BookingHelper;
import app.chalo.providers.CoroutineContextProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/GetBookableProductConfigForRenewUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetBookableProductConfigForRenewUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchCompleteProductConfigByIdUseCase f10177a;
    public final StoreCompleteProductConfigLocallyUseCase b;
    public final CoroutineContextProvider c;
    public final ProductPurchaseLocalDataSource d;
    public final BookingHelper e;

    public GetBookableProductConfigForRenewUseCase(FetchCompleteProductConfigByIdUseCase fetchCompleteProductConfigByIdUseCase, StoreCompleteProductConfigLocallyUseCase storeCompleteProductConfigLocallyUseCase, CoroutineContextProvider coroutineContextProvider, ProductPurchaseLocalDataSource productPurchaseLocalDataSource, BookingHelper bookingHelper) {
        this.f10177a = fetchCompleteProductConfigByIdUseCase;
        this.b = storeCompleteProductConfigLocallyUseCase;
        this.c = coroutineContextProvider;
        this.d = productPurchaseLocalDataSource;
        this.e = bookingHelper;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f1, code lost:
    
        if (r11 == r0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.superpass.data.models.entities.SuperPass r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.usecase.GetBookableProductConfigForRenewUseCase.a(app.chalo.superpass.data.models.entities.SuperPass, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
