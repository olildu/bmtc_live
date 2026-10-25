package app.chalo.login.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/SendOtpErrorMsgAndReason;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SendOtpErrorMsgAndReason {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendOtpForLoginErrorReason f5247a;
    public final String b;

    public SendOtpErrorMsgAndReason(SendOtpForLoginErrorReason reason, String str) {
        Intrinsics.i(reason, "reason");
        this.f5247a = reason;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendOtpErrorMsgAndReason)) {
            return false;
        }
        SendOtpErrorMsgAndReason sendOtpErrorMsgAndReason = (SendOtpErrorMsgAndReason) obj;
        return this.f5247a == sendOtpErrorMsgAndReason.f5247a && Intrinsics.d(this.b, sendOtpErrorMsgAndReason.b);
    }

    public final int hashCode() {
        int iHashCode = this.f5247a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SendOtpErrorMsgAndReason(reason=" + this.f5247a + ", msg=" + this.b + ")";
    }
}
