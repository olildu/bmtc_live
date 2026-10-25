package app.chalo.quickpay.validation;

import defpackage.dd;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/quickpay/validation/QuickPayPunchDetails;", "", "Companion", "$serializer", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class QuickPayPunchDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8904a;
    public final String b;
    public final String c;
    public final QuickPayReceiptInfo d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/quickpay/validation/QuickPayPunchDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/quickpay/validation/QuickPayPunchDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<QuickPayPunchDetails> serializer() {
            return QuickPayPunchDetails$$serializer.f8905a;
        }
    }

    public /* synthetic */ QuickPayPunchDetails(int i, String str, String str2, String str3, QuickPayReceiptInfo quickPayReceiptInfo, String str4) {
        if (19 != (i & 19)) {
            PluginExceptionsKt.b(QuickPayPunchDetails$$serializer.f8905a.getDescriptor(), i, 19);
            throw null;
        }
        this.f8904a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = quickPayReceiptInfo;
        }
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickPayPunchDetails)) {
            return false;
        }
        QuickPayPunchDetails quickPayPunchDetails = (QuickPayPunchDetails) obj;
        return Intrinsics.d(this.f8904a, quickPayPunchDetails.f8904a) && Intrinsics.d(this.b, quickPayPunchDetails.b) && Intrinsics.d(this.c, quickPayPunchDetails.c) && Intrinsics.d(this.d, quickPayPunchDetails.d) && Intrinsics.d(this.e, quickPayPunchDetails.e);
    }

    public final int hashCode() {
        String str = this.f8904a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        QuickPayReceiptInfo quickPayReceiptInfo = this.d;
        int iHashCode4 = (iHashCode3 + (quickPayReceiptInfo == null ? 0 : quickPayReceiptInfo.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("QuickPayPunchDetails(productType=", this.f8904a, ", productSubType=", this.b, ", walletId=");
        sbE.append(this.c);
        sbE.append(", quickPayReceiptInfo=");
        sbE.append(this.d);
        sbE.append(", walletAgency=");
        return vo1.p(sbE, this.e, ")");
    }

    public QuickPayPunchDetails(String str, String str2, String str3, QuickPayReceiptInfo quickPayReceiptInfo, String str4) {
        this.f8904a = str;
        this.b = str2;
        this.c = str3;
        this.d = quickPayReceiptInfo;
        this.e = str4;
    }
}
