package app.chalo.premiumbus.data;

import app.chalo.features.checkout.CheckoutIntentModel;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/PassUpsellOrderResult;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassUpsellOrderResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6956a;
    public final String b;
    public final CheckoutIntentModel c;

    public PassUpsellOrderResult(String orderId, String passId, CheckoutIntentModel checkoutIntentModel) {
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(passId, "passId");
        this.f6956a = orderId;
        this.b = passId;
        this.c = checkoutIntentModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassUpsellOrderResult)) {
            return false;
        }
        PassUpsellOrderResult passUpsellOrderResult = (PassUpsellOrderResult) obj;
        return Intrinsics.d(this.f6956a, passUpsellOrderResult.f6956a) && Intrinsics.d(this.b, passUpsellOrderResult.b) && Intrinsics.d(this.c, passUpsellOrderResult.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f6956a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PassUpsellOrderResult(orderId=", this.f6956a, ", passId=", this.b, ", checkoutIntentModel=");
        sbE.append(this.c);
        sbE.append(")");
        return sbE.toString();
    }
}
