package app.chalo.deeplink;

import defpackage.dd;
import defpackage.nf1;
import defpackage.xs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkUri;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeepLinkUri {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2470a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final MapBuilder e;

    public DeepLinkUri(String raw, String scheme, String host, ArrayList arrayList, MapBuilder mapBuilder) {
        Intrinsics.i(raw, "raw");
        Intrinsics.i(scheme, "scheme");
        Intrinsics.i(host, "host");
        this.f2470a = raw;
        this.b = scheme;
        this.c = host;
        this.d = arrayList;
        this.e = mapBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinkUri)) {
            return false;
        }
        DeepLinkUri deepLinkUri = (DeepLinkUri) obj;
        return Intrinsics.d(this.f2470a, deepLinkUri.f2470a) && Intrinsics.d(this.b, deepLinkUri.b) && Intrinsics.d(this.c, deepLinkUri.c) && this.d.equals(deepLinkUri.d) && this.e.equals(deepLinkUri.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xs.e(this.d, nf1.e(nf1.e(this.f2470a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("DeepLinkUri(raw=", this.f2470a, ", scheme=", this.b, ", host=");
        sbE.append(this.c);
        sbE.append(", pathSegments=");
        sbE.append(this.d);
        sbE.append(", queryParameters=");
        sbE.append(this.e);
        sbE.append(")");
        return sbE.toString();
    }
}
