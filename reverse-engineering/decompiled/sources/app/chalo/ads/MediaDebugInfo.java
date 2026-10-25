package app.chalo.ads;

import defpackage.uf0;
import defpackage.xs;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/MediaDebugInfo;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class MediaDebugInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f797a;
    public final int b;
    public final int c;
    public final int d;

    public MediaDebugInfo(int i, int i2, int i3, int i4) {
        this.f797a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static MediaDebugInfo a(MediaDebugInfo mediaDebugInfo, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = mediaDebugInfo.f797a;
        }
        if ((i5 & 2) != 0) {
            i2 = mediaDebugInfo.b;
        }
        if ((i5 & 4) != 0) {
            i3 = mediaDebugInfo.c;
        }
        if ((i5 & 8) != 0) {
            i4 = mediaDebugInfo.d;
        }
        return new MediaDebugInfo(i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaDebugInfo)) {
            return false;
        }
        MediaDebugInfo mediaDebugInfo = (MediaDebugInfo) obj;
        return this.f797a == mediaDebugInfo.f797a && this.b == mediaDebugInfo.b && this.c == mediaDebugInfo.c && this.d == mediaDebugInfo.d;
    }

    public final int hashCode() {
        return (((((this.f797a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return xs.h(this.c, this.d, ", actualHeightPx=", ")", uf0.s(this.f797a, this.b, "MediaDebugInfo(targetWidthPx=", ", targetHeightPx=", ", actualWidthPx="));
    }
}
