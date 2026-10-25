package app.chalo.juspay;

import defpackage.dd;
import defpackage.nf1;
import defpackage.t10;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/juspay/UserUpiAccountDetails;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UserUpiAccountDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4096a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/juspay/UserUpiAccountDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/juspay/UserUpiAccountDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UserUpiAccountDetails> serializer() {
            return UserUpiAccountDetails$$serializer.f4097a;
        }
    }

    public /* synthetic */ UserUpiAccountDetails(int i, String str, String str2, String str3, boolean z, String str4, boolean z2, String str5) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(UserUpiAccountDetails$$serializer.f4097a.getDescriptor(), i, 127);
            throw null;
        }
        this.f4096a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = z2;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserUpiAccountDetails)) {
            return false;
        }
        UserUpiAccountDetails userUpiAccountDetails = (UserUpiAccountDetails) obj;
        return Intrinsics.d(this.f4096a, userUpiAccountDetails.f4096a) && Intrinsics.d(this.b, userUpiAccountDetails.b) && Intrinsics.d(this.c, userUpiAccountDetails.c) && this.d == userUpiAccountDetails.d && Intrinsics.d(this.e, userUpiAccountDetails.e) && this.f == userUpiAccountDetails.f && Intrinsics.d(this.g, userUpiAccountDetails.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((nf1.e((nf1.e(nf1.e(this.f4096a.hashCode() * 31, 31, this.b), 31, this.c) + (this.d ? 1231 : 1237)) * 31, 31, this.e) + (this.f ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UserUpiAccountDetails(bankCode=", this.f4096a, ", bankName=", this.b, ", ifsc=");
        t10.s(this.c, ", isPrimaryAccount=", ", maskedAccountNumber=", sbE, this.d);
        t10.s(this.e, ", mPinSet=", ", referenceId=", sbE, this.f);
        return vo1.p(sbE, this.g, ")");
    }

    public UserUpiAccountDetails(String str, String bankName, String str2, String maskedAccountNumber, boolean z, boolean z2, String referenceId) {
        Intrinsics.i(bankName, "bankName");
        Intrinsics.i(maskedAccountNumber, "maskedAccountNumber");
        Intrinsics.i(referenceId, "referenceId");
        this.f4096a = str;
        this.b = bankName;
        this.c = str2;
        this.d = z;
        this.e = maskedAccountNumber;
        this.f = z2;
        this.g = referenceId;
    }
}
