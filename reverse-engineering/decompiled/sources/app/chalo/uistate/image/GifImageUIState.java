package app.chalo.uistate.image;

import app.chalo.providers.lottieassetprovider.LottieType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/image/GifImageUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GifImageUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieType f10033a;
    public final int b;
    public final ImageUISize c;

    public GifImageUIState(LottieType gifType, int i, ImageUISize imageUISize) {
        Intrinsics.i(gifType, "gifType");
        this.f10033a = gifType;
        this.b = i;
        this.c = imageUISize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GifImageUIState)) {
            return false;
        }
        GifImageUIState gifImageUIState = (GifImageUIState) obj;
        return this.f10033a == gifImageUIState.f10033a && this.b == gifImageUIState.b && Intrinsics.d(this.c, gifImageUIState.c);
    }

    public final int hashCode() {
        int iHashCode = ((this.f10033a.hashCode() * 31) + this.b) * 31;
        ImageUISize imageUISize = this.c;
        return iHashCode + (imageUISize == null ? 0 : imageUISize.hashCode());
    }

    public final String toString() {
        return "GifImageUIState(gifType=" + this.f10033a + ", iterations=" + this.b + ", size=" + this.c + ")";
    }

    public /* synthetic */ GifImageUIState(LottieType lottieType, ImageUISize imageUISize, int i) {
        this(lottieType, (i & 2) != 0 ? Integer.MAX_VALUE : 1, (i & 4) != 0 ? null : imageUISize);
    }
}
