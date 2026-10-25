package app.chalo.ads;

import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdDebugRenderedContent;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UnifiedAdDebugRenderedContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f838a;
    public final String b;
    public final String c;
    public final Float d;
    public final boolean e;
    public final Float f;

    public UnifiedAdDebugRenderedContent(String str, String str2, String str3, Float f, boolean z, Float f2) {
        this.f838a = str;
        this.b = str2;
        this.c = str3;
        this.d = f;
        this.e = z;
        this.f = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnifiedAdDebugRenderedContent)) {
            return false;
        }
        UnifiedAdDebugRenderedContent unifiedAdDebugRenderedContent = (UnifiedAdDebugRenderedContent) obj;
        return this.f838a.equals(unifiedAdDebugRenderedContent.f838a) && this.b.equals(unifiedAdDebugRenderedContent.b) && Intrinsics.d(this.c, unifiedAdDebugRenderedContent.c) && Intrinsics.d(this.d, unifiedAdDebugRenderedContent.d) && this.e == unifiedAdDebugRenderedContent.e && Intrinsics.d(this.f, unifiedAdDebugRenderedContent.f);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f838a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.d;
        int iHashCode2 = (((iHashCode + (f == null ? 0 : f.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31;
        Float f2 = this.f;
        return iHashCode2 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UnifiedAdDebugRenderedContent(headline=", this.f838a, ", cta=", this.b, ", body=");
        sbE.append(this.c);
        sbE.append(", rating=");
        sbE.append(this.d);
        sbE.append(", hasIcon=");
        sbE.append(this.e);
        sbE.append(", mediaRatio=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
