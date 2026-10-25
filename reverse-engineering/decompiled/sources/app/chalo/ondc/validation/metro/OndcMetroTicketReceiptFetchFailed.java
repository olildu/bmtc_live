package app.chalo.ondc.validation.metro;

import app.chalo.receipt.ReceiptFetchError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/validation/metro/OndcMetroTicketReceiptFetchFailed;", "Lapp/chalo/receipt/ReceiptFetchError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OndcMetroTicketReceiptFetchFailed implements ReceiptFetchError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6810a;

    public OndcMetroTicketReceiptFetchFailed(String msg) {
        Intrinsics.i(msg, "msg");
        this.f6810a = msg;
    }

    @Override // app.chalo.receipt.ReceiptFetchError
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF6810a() {
        return this.f6810a;
    }
}
