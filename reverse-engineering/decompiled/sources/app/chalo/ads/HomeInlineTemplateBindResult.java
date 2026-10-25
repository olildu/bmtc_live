package app.chalo.ads;

import defpackage.b3;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/HomeInlineTemplateBindResult;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HomeInlineTemplateBindResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f785a;
    public final HomeInlineTemplateViews b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public HomeInlineTemplateBindResult(boolean z, HomeInlineTemplateViews homeInlineTemplateViews, boolean z2, boolean z3, int i) {
        this.f785a = z;
        this.b = homeInlineTemplateViews;
        this.c = z2;
        this.d = z3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeInlineTemplateBindResult)) {
            return false;
        }
        HomeInlineTemplateBindResult homeInlineTemplateBindResult = (HomeInlineTemplateBindResult) obj;
        return this.f785a == homeInlineTemplateBindResult.f785a && Intrinsics.d(this.b, homeInlineTemplateBindResult.b) && this.c == homeInlineTemplateBindResult.c && this.d == homeInlineTemplateBindResult.d && this.e == homeInlineTemplateBindResult.e;
    }

    public final int hashCode() {
        int i = (this.f785a ? 1231 : 1237) * 31;
        HomeInlineTemplateViews homeInlineTemplateViews = this.b;
        return ((((((i + (homeInlineTemplateViews == null ? 0 : homeInlineTemplateViews.hashCode())) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeInlineTemplateBindResult(isBound=");
        sb.append(this.f785a);
        sb.append(", views=");
        sb.append(this.b);
        sb.append(", hasSecondary=");
        z40.r(sb, this.c, ", hasIcon=", this.d, ", heightDp=");
        return b3.f(")", this.e, sb);
    }
}
