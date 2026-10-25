package app.chalo.ads;

import defpackage.b3;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/HomeInlineTemplateContent;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HomeInlineTemplateContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f786a;
    public final String b;
    public final String c;
    public final Float d;
    public final boolean e;

    public HomeInlineTemplateContent(String headline, String cta, String str, Float f, boolean z) {
        Intrinsics.i(headline, "headline");
        Intrinsics.i(cta, "cta");
        this.f786a = headline;
        this.b = cta;
        this.c = str;
        this.d = f;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeInlineTemplateContent)) {
            return false;
        }
        HomeInlineTemplateContent homeInlineTemplateContent = (HomeInlineTemplateContent) obj;
        return Intrinsics.d(this.f786a, homeInlineTemplateContent.f786a) && Intrinsics.d(this.b, homeInlineTemplateContent.b) && Intrinsics.d(this.c, homeInlineTemplateContent.c) && Intrinsics.d(this.d, homeInlineTemplateContent.d) && this.e == homeInlineTemplateContent.e;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f786a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.d;
        return ((iHashCode + (f != null ? f.hashCode() : 0)) * 31) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("HomeInlineTemplateContent(headline=", this.f786a, ", cta=", this.b, ", body=");
        sbE.append(this.c);
        sbE.append(", rating=");
        sbE.append(this.d);
        sbE.append(", hasIcon=");
        return b3.g(")", sbE, this.e);
    }
}
