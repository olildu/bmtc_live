package app.chalo.home.ui.common;

import defpackage.pk0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/common/InlineUnifiedAdLoadedSize;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InlineUnifiedAdLoadedSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3380a;
    public final int b;

    public InlineUnifiedAdLoadedSize(int i, int i2) {
        this.f3380a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineUnifiedAdLoadedSize)) {
            return false;
        }
        InlineUnifiedAdLoadedSize inlineUnifiedAdLoadedSize = (InlineUnifiedAdLoadedSize) obj;
        return this.f3380a == inlineUnifiedAdLoadedSize.f3380a && this.b == inlineUnifiedAdLoadedSize.b;
    }

    public final int hashCode() {
        return (this.f3380a * 31) + this.b;
    }

    public final String toString() {
        return pk0.f(this.f3380a, this.b, "InlineUnifiedAdLoadedSize(widthDp=", ", heightDp=", ")");
    }
}
