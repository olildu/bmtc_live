package app.chalo.uistate.image;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/image/ImageUISize;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ImageUISize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dp f10034a;
    public final Dp b;

    public ImageUISize(Dp dp, Dp dp2) {
        this.f10034a = dp;
        this.b = dp2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageUISize)) {
            return false;
        }
        ImageUISize imageUISize = (ImageUISize) obj;
        return Intrinsics.d(this.f10034a, imageUISize.f10034a) && Intrinsics.d(this.b, imageUISize.b);
    }

    public final int hashCode() {
        Dp dp = this.f10034a;
        int iM7284hashCodeimpl = (dp == null ? 0 : Dp.m7284hashCodeimpl(dp.m7292unboximpl())) * 31;
        Dp dp2 = this.b;
        return iM7284hashCodeimpl + (dp2 != null ? Dp.m7284hashCodeimpl(dp2.m7292unboximpl()) : 0);
    }

    public final String toString() {
        return "ImageUISize(height=" + this.f10034a + ", width=" + this.b + ")";
    }

    public /* synthetic */ ImageUISize(Dp dp, Dp dp2, int i) {
        this((i & 1) != 0 ? null : dp, (i & 2) != 0 ? null : dp2);
    }

    public ImageUISize(float f) {
        this(Dp.m7276boximpl(f), Dp.m7276boximpl(f));
    }
}
