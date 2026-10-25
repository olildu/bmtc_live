package app.chalo.instantticket.domain;

import app.chalo.receipt.ReceiptFetchError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/domain/InstantTicketReceiptFetchFailed;", "Lapp/chalo/receipt/ReceiptFetchError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InstantTicketReceiptFetchFailed implements ReceiptFetchError {
    public InstantTicketReceiptFetchFailed(InstantTicketReceiptFetchFailedErrorReason instantTicketReceiptFetchFailedErrorReason) {
        Intrinsics.i(instantTicketReceiptFetchFailedErrorReason, "instantTicketReceiptFetchFailedErrorReason");
    }

    @Override // app.chalo.receipt.ReceiptFetchError
    /* JADX INFO: renamed from: a */
    public final /* bridge */ String getF6810a() {
        return null;
    }
}
