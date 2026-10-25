package app.chalo.deeplink;

import defpackage.dd;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkResolutionRequest;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeepLinkResolutionRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2460a;
    public final String b;
    public final String c;

    public DeepLinkResolutionRequest(String str, String str2, String str3) {
        this.f2460a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinkResolutionRequest)) {
            return false;
        }
        DeepLinkResolutionRequest deepLinkResolutionRequest = (DeepLinkResolutionRequest) obj;
        return Intrinsics.d(this.f2460a, deepLinkResolutionRequest.f2460a) && Intrinsics.d(this.b, deepLinkResolutionRequest.b) && Intrinsics.d(this.c, deepLinkResolutionRequest.c);
    }

    public final int hashCode() {
        String str = this.f2460a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return vo1.p(dd.e("DeepLinkResolutionRequest(uri=", this.f2460a, ", header=", this.b, ", source="), this.c, ")");
    }
}
