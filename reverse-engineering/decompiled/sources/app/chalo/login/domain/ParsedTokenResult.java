package app.chalo.login.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/ParsedTokenResult;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ParsedTokenResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f5244a;
    public final Long b;

    public ParsedTokenResult(Long l, Long l2) {
        this.f5244a = l;
        this.b = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParsedTokenResult)) {
            return false;
        }
        ParsedTokenResult parsedTokenResult = (ParsedTokenResult) obj;
        return Intrinsics.d(this.f5244a, parsedTokenResult.f5244a) && Intrinsics.d(this.b, parsedTokenResult.b);
    }

    public final int hashCode() {
        Long l = this.f5244a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "ParsedTokenResult(expiryTime=" + this.f5244a + ", issuedAt=" + this.b + ")";
    }
}
