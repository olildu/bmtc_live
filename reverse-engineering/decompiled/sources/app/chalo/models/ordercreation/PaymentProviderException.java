package app.chalo.models.ordercreation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/models/ordercreation/PaymentProviderException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaymentProviderException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentProviderException(String msg) {
        super(msg);
        Intrinsics.i(msg, "msg");
    }
}
