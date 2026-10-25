package app.chalo.checkout.data.model.app;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/CommonRazorPayData;", "", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CommonRazorPayData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1278a;
    public final String b;
    public final String c;
    public final RazorPayNotes d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/CommonRazorPayData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/CommonRazorPayData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CommonRazorPayData> serializer() {
            return CommonRazorPayData$$serializer.f1279a;
        }
    }

    public /* synthetic */ CommonRazorPayData(int i, String str, String str2, String str3, RazorPayNotes razorPayNotes, String str4, String str5, String str6) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(CommonRazorPayData$$serializer.f1279a.getDescriptor(), i, 127);
            throw null;
        }
        this.f1278a = str;
        this.b = str2;
        this.c = str3;
        this.d = razorPayNotes;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonRazorPayData)) {
            return false;
        }
        CommonRazorPayData commonRazorPayData = (CommonRazorPayData) obj;
        return Intrinsics.d(this.f1278a, commonRazorPayData.f1278a) && Intrinsics.d(this.b, commonRazorPayData.b) && Intrinsics.d(this.c, commonRazorPayData.c) && Intrinsics.d(this.d, commonRazorPayData.d) && Intrinsics.d(this.e, commonRazorPayData.e) && Intrinsics.d(this.f, commonRazorPayData.f) && Intrinsics.d(this.g, commonRazorPayData.g);
    }

    public final int hashCode() {
        int iE = nf1.e((this.d.hashCode() + nf1.e(nf1.e(this.f1278a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
        String str = this.f;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("CommonRazorPayData(amount=", this.f1278a, ", currency=", this.b, ", order_id=");
        sbE.append(this.c);
        sbE.append(", notes=");
        sbE.append(this.d);
        sbE.append(", contact=");
        cb0.t(sbE, this.e, ", customer_id=", this.f, ", account_id=");
        return vo1.p(sbE, this.g, ")");
    }

    public CommonRazorPayData(String amount, String currency, String order_id, RazorPayNotes razorPayNotes, String contact, String str, String str2) {
        Intrinsics.i(amount, "amount");
        Intrinsics.i(currency, "currency");
        Intrinsics.i(order_id, "order_id");
        Intrinsics.i(contact, "contact");
        this.f1278a = amount;
        this.b = currency;
        this.c = order_id;
        this.d = razorPayNotes;
        this.e = contact;
        this.f = str;
        this.g = str2;
    }
}
