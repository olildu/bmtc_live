package app.chalo.productpurchase.passpurchase.domain;

import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase;
import app.chalo.productpurchase.productselection.data.local.ProductPurchaseLocalDataSource;
import app.chalo.productpurchase.utils.BookingHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/RefreshSelectedBookableSuperPassConfigurationUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RefreshSelectedBookableSuperPassConfigurationUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchCompleteProductConfigByIdUseCase f8339a;
    public final StoreCompleteProductConfigLocallyUseCase b;
    public final ProductPurchaseLocalDataSource c;

    public RefreshSelectedBookableSuperPassConfigurationUseCase(FetchCompleteProductConfigByIdUseCase fetchCompleteProductConfigByIdUseCase, StoreCompleteProductConfigLocallyUseCase storeCompleteProductConfigLocallyUseCase, ProductPurchaseLocalDataSource productPurchaseLocalDataSource, BookingHelper bookingHelper) {
        this.f8339a = fetchCompleteProductConfigByIdUseCase;
        this.b = storeCompleteProductConfigLocallyUseCase;
        this.c = productPurchaseLocalDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        if (r14 == r0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.models.BookableSuperPassConfiguration r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.domain.RefreshSelectedBookableSuperPassConfigurationUseCase.a(app.chalo.models.BookableSuperPassConfiguration, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
