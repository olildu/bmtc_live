package app.chalo.deeplink;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkParseResult;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeepLinkParseResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeepLinkUri f2459a;
    public final DeepLinkAction b;

    public DeepLinkParseResult(DeepLinkUri deepLinkUri, DeepLinkAction deepLinkAction) {
        this.f2459a = deepLinkUri;
        this.b = deepLinkAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinkParseResult)) {
            return false;
        }
        DeepLinkParseResult deepLinkParseResult = (DeepLinkParseResult) obj;
        return Intrinsics.d(this.f2459a, deepLinkParseResult.f2459a) && Intrinsics.d(this.b, deepLinkParseResult.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2459a.hashCode() * 31);
    }

    public final String toString() {
        return "DeepLinkParseResult(uri=" + this.f2459a + ", action=" + this.b + ")";
    }
}
