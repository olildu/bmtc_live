package app.chalo.network.mock;

import app.chalo.network.rest.request.HttpRequestType;
import defpackage.cb0;
import defpackage.nf1;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/network/mock/NormalizedRequestDescriptor;", "", "Companion", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NormalizedRequestDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpRequestType f6492a;
    public final String b;
    public final String c;
    public final String d;
    public final LinkedHashMap e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/mock/NormalizedRequestDescriptor$Companion;", "", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public NormalizedRequestDescriptor(HttpRequestType httpRequestType, String str, String str2, String path, LinkedHashMap linkedHashMap, String logIdentity) {
        Intrinsics.i(path, "path");
        Intrinsics.i(logIdentity, "logIdentity");
        this.f6492a = httpRequestType;
        this.b = str;
        this.c = str2;
        this.d = path;
        this.e = linkedHashMap;
        this.f = logIdentity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NormalizedRequestDescriptor)) {
            return false;
        }
        NormalizedRequestDescriptor normalizedRequestDescriptor = (NormalizedRequestDescriptor) obj;
        return this.f6492a == normalizedRequestDescriptor.f6492a && this.b.equals(normalizedRequestDescriptor.b) && this.c.equals(normalizedRequestDescriptor.c) && Intrinsics.d(this.d, normalizedRequestDescriptor.d) && this.e.equals(normalizedRequestDescriptor.e) && Intrinsics.d(this.f, normalizedRequestDescriptor.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + nf1.e(nf1.e(nf1.e(this.f6492a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NormalizedRequestDescriptor(method=");
        sb.append(this.f6492a);
        sb.append(", fullUrl=");
        sb.append(this.b);
        sb.append(", host=");
        cb0.t(sb, this.c, ", path=", this.d, ", queryParams=");
        sb.append(this.e);
        sb.append(", logIdentity=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
