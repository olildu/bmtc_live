package app.chalo.ads;

import defpackage.b3;
import defpackage.uf0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/MediaBoxSpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MediaBoxSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f796a;
    public final int b;
    public final boolean c;

    public MediaBoxSpec(int i, int i2, boolean z) {
        this.f796a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaBoxSpec)) {
            return false;
        }
        MediaBoxSpec mediaBoxSpec = (MediaBoxSpec) obj;
        return this.f796a == mediaBoxSpec.f796a && this.b == mediaBoxSpec.b && this.c == mediaBoxSpec.c;
    }

    public final int hashCode() {
        return (((this.f796a * 31) + this.b) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        return b3.g(")", uf0.s(this.f796a, this.b, "MediaBoxSpec(widthPx=", ", heightPx=", ", ready="), this.c);
    }
}
