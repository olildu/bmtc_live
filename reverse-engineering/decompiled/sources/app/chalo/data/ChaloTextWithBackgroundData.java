package app.chalo.data;

import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/ChaloTextWithBackgroundData;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloTextWithBackgroundData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2337a;
    public final BackgroundShape b;
    public final PaddingAppModel c;
    public final IconType d;
    public final int e;
    public final IconType f;
    public final int g;
    public final TextStyleAppModel h;

    public ChaloTextWithBackgroundData(String backgroundColor, BackgroundShape backgroundShape, PaddingAppModel backgroundPadding, IconType iconType, int i, IconType iconType2, int i2, TextStyleAppModel textStyle) {
        Intrinsics.i(backgroundColor, "backgroundColor");
        Intrinsics.i(backgroundPadding, "backgroundPadding");
        Intrinsics.i(textStyle, "textStyle");
        this.f2337a = backgroundColor;
        this.b = backgroundShape;
        this.c = backgroundPadding;
        this.d = iconType;
        this.e = i;
        this.f = iconType2;
        this.g = i2;
        this.h = textStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloTextWithBackgroundData)) {
            return false;
        }
        ChaloTextWithBackgroundData chaloTextWithBackgroundData = (ChaloTextWithBackgroundData) obj;
        return Intrinsics.d(this.f2337a, chaloTextWithBackgroundData.f2337a) && Intrinsics.d(this.b, chaloTextWithBackgroundData.b) && Intrinsics.d(this.c, chaloTextWithBackgroundData.c) && this.d == chaloTextWithBackgroundData.d && this.e == chaloTextWithBackgroundData.e && this.f == chaloTextWithBackgroundData.f && this.g == chaloTextWithBackgroundData.g && Intrinsics.d(this.h, chaloTextWithBackgroundData.h);
    }

    public final int hashCode() {
        int iHashCode = this.f2337a.hashCode() * 31;
        BackgroundShape backgroundShape = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (backgroundShape == null ? 0 : backgroundShape.hashCode())) * 31)) * 31;
        IconType iconType = this.d;
        int iHashCode3 = (((iHashCode2 + (iconType == null ? 0 : iconType.hashCode())) * 31) + this.e) * 31;
        IconType iconType2 = this.f;
        return this.h.hashCode() + ((((iHashCode3 + (iconType2 != null ? iconType2.hashCode() : 0)) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "ChaloTextWithBackgroundData(backgroundColor=" + this.f2337a + ", backgroundShape=" + this.b + ", backgroundPadding=" + this.c + ", endIcon=" + this.d + ", endIconTextPadding=" + this.e + ", startIcon=" + this.f + ", startIconTextPadding=" + this.g + ", textStyle=" + this.h + ")";
    }

    public /* synthetic */ ChaloTextWithBackgroundData() {
        this("#00000000", null, new PaddingAppModel(0, 0, 0, 0), null, 0, null, 0, new TextStyleAppModel());
    }
}
