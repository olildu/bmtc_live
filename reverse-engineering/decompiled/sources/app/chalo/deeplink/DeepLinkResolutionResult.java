package app.chalo.deeplink;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkResolutionResult;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeepLinkResolutionResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeepLinkResolutionRequest f2461a;
    public final DeepLinkUri b;
    public final DeepLinkAction c;

    public DeepLinkResolutionResult(DeepLinkResolutionRequest deepLinkResolutionRequest, DeepLinkUri deepLinkUri, DeepLinkAction deepLinkAction) {
        this.f2461a = deepLinkResolutionRequest;
        this.b = deepLinkUri;
        this.c = deepLinkAction;
    }

    public static DeepLinkResolutionResult a(DeepLinkResolutionResult deepLinkResolutionResult, DeepLinkAction deepLinkAction) {
        DeepLinkResolutionRequest deepLinkResolutionRequest = deepLinkResolutionResult.f2461a;
        DeepLinkUri deepLinkUri = deepLinkResolutionResult.b;
        deepLinkResolutionResult.getClass();
        return new DeepLinkResolutionResult(deepLinkResolutionRequest, deepLinkUri, deepLinkAction);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinkResolutionResult)) {
            return false;
        }
        DeepLinkResolutionResult deepLinkResolutionResult = (DeepLinkResolutionResult) obj;
        return Intrinsics.d(this.f2461a, deepLinkResolutionResult.f2461a) && Intrinsics.d(this.b, deepLinkResolutionResult.b) && Intrinsics.d(this.c, deepLinkResolutionResult.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f2461a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DeepLinkResolutionResult(request=" + this.f2461a + ", parsedUri=" + this.b + ", action=" + this.c + ")";
    }
}
