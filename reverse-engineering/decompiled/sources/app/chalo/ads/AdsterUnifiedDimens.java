package app.chalo.ads;

import defpackage.hq0;
import defpackage.uf0;
import defpackage.xs;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/AdsterUnifiedDimens;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AdsterUnifiedDimens {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f741a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public AdsterUnifiedDimens(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f741a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsterUnifiedDimens)) {
            return false;
        }
        AdsterUnifiedDimens adsterUnifiedDimens = (AdsterUnifiedDimens) obj;
        return this.f741a == adsterUnifiedDimens.f741a && this.b == adsterUnifiedDimens.b && this.c == adsterUnifiedDimens.c && this.d == adsterUnifiedDimens.d && this.e == adsterUnifiedDimens.e && this.f == adsterUnifiedDimens.f && this.g == adsterUnifiedDimens.g && this.h == adsterUnifiedDimens.h;
    }

    public final int hashCode() {
        return (((((((((((((this.f741a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h;
    }

    public final String toString() {
        StringBuilder sbS = uf0.s(this.f741a, this.b, "AdsterUnifiedDimens(anchoredHeightDp=", ", homeInlineBannerHeightDp=", ", homeInlineNativeWideMediaHeightDp=");
        hq0.p(this.c, this.d, ", homeInlineNativeSplitMediaHeightDp=", ", homeInlineNativeSplitHeightDp=", sbS);
        hq0.p(this.e, this.f, ", homeInlineNativeWideHeightDp=", ", mediumFixedHeightDp=", sbS);
        return xs.h(this.g, this.h, ", mediumFixedHeightMediaHeightDp=", ")", sbS);
    }
}
