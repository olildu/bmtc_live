package app.chalo.ads;

import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/HomeInlineTemplateLayoutConfig;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HomeInlineTemplateLayoutConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f787a;
    public final int b;
    public final Integer c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final Integer g;
    public final Float h;

    public /* synthetic */ HomeInlineTemplateLayoutConfig(int i, int i2, Integer num, int i3) {
        this(i, i2, (i3 & 4) != 0 ? null : num, (i3 & 8) == 0, (i3 & 16) == 0, true, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeInlineTemplateLayoutConfig)) {
            return false;
        }
        HomeInlineTemplateLayoutConfig homeInlineTemplateLayoutConfig = (HomeInlineTemplateLayoutConfig) obj;
        return this.f787a == homeInlineTemplateLayoutConfig.f787a && this.b == homeInlineTemplateLayoutConfig.b && Intrinsics.d(this.c, homeInlineTemplateLayoutConfig.c) && this.d == homeInlineTemplateLayoutConfig.d && this.e == homeInlineTemplateLayoutConfig.e && this.f == homeInlineTemplateLayoutConfig.f && Intrinsics.d(this.g, homeInlineTemplateLayoutConfig.g) && Intrinsics.d(this.h, homeInlineTemplateLayoutConfig.h);
    }

    public final int hashCode() {
        int i = ((this.f787a * 31) + this.b) * 31;
        Integer num = this.c;
        int iHashCode = (((((((i + (num == null ? 0 : num.hashCode())) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31;
        Integer num2 = this.g;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.h;
        return iHashCode2 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = uf0.s(this.f787a, this.b, "HomeInlineTemplateLayoutConfig(layoutResId=", ", heightDp=", ", mediaHeightDp=");
        sbS.append(this.c);
        sbS.append(", aspectSizedMediaWidthEnabled=");
        sbS.append(this.d);
        sbS.append(", ctaHasAffordanceSuffix=");
        z40.r(sbS, this.e, ", secondaryContentEnabled=", this.f, ", minimumMediaWidthDp=");
        sbS.append(this.g);
        sbS.append(", maximumMediaWidthFraction=");
        sbS.append(this.h);
        sbS.append(")");
        return sbS.toString();
    }

    public HomeInlineTemplateLayoutConfig(int i, int i2, Integer num, boolean z, boolean z2, boolean z3, Integer num2, Float f) {
        this.f787a = i;
        this.b = i2;
        this.c = num;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = num2;
        this.h = f;
    }
}
