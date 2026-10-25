package app.chalo.multimodalticket.validation;

import defpackage.dd;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/validation/ValidationPayloadIdentity;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ValidationPayloadIdentity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5982a;
    public final String b;
    public final String c;

    public ValidationPayloadIdentity(String bookingId, String str, String str2) {
        Intrinsics.i(bookingId, "bookingId");
        this.f5982a = bookingId;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidationPayloadIdentity)) {
            return false;
        }
        ValidationPayloadIdentity validationPayloadIdentity = (ValidationPayloadIdentity) obj;
        return Intrinsics.d(this.f5982a, validationPayloadIdentity.f5982a) && Intrinsics.d(this.b, validationPayloadIdentity.b) && Intrinsics.d(this.c, validationPayloadIdentity.c);
    }

    public final int hashCode() {
        int iHashCode = this.f5982a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return vo1.p(dd.e("ValidationPayloadIdentity(bookingId=", this.f5982a, ", productType=", this.b, ", productSubType="), this.c, ")");
    }
}
