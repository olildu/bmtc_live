package app.chalo.deeplink;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkResumeCondition;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeepLinkResumeCondition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2462a;
    public final Flow b;

    public DeepLinkResumeCondition(String str, Flow isSatisfied) {
        Intrinsics.i(isSatisfied, "isSatisfied");
        this.f2462a = str;
        this.b = isSatisfied;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinkResumeCondition)) {
            return false;
        }
        DeepLinkResumeCondition deepLinkResumeCondition = (DeepLinkResumeCondition) obj;
        return Intrinsics.d(this.f2462a, deepLinkResumeCondition.f2462a) && Intrinsics.d(this.b, deepLinkResumeCondition.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2462a.hashCode() * 31);
    }

    public final String toString() {
        return "DeepLinkResumeCondition(key=" + this.f2462a + ", isSatisfied=" + this.b + ")";
    }
}
