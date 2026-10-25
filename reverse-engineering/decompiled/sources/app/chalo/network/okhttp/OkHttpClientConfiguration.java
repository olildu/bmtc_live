package app.chalo.network.okhttp;

import defpackage.r30;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/okhttp/OkHttpClientConfiguration;", "", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OkHttpClientConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f6499a;
    public final List b;
    public final List c;
    public final int d;

    public OkHttpClientConfiguration(LinkedHashMap linkedHashMap, List interceptors, List networkInterceptors, int i) {
        Intrinsics.i(interceptors, "interceptors");
        Intrinsics.i(networkInterceptors, "networkInterceptors");
        this.f6499a = linkedHashMap;
        this.b = interceptors;
        this.c = networkInterceptors;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OkHttpClientConfiguration)) {
            return false;
        }
        OkHttpClientConfiguration okHttpClientConfiguration = (OkHttpClientConfiguration) obj;
        return this.f6499a.equals(okHttpClientConfiguration.f6499a) && Intrinsics.d(this.b, okHttpClientConfiguration.b) && Intrinsics.d(this.c, okHttpClientConfiguration.c) && this.d == okHttpClientConfiguration.d;
    }

    public final int hashCode() {
        return (((r30.b(r30.b(this.f6499a.hashCode() * 31, 31, this.b), 31, this.c) + ((int) 60)) * 31) + this.d) * 31;
    }

    public final String toString() {
        return "OkHttpClientConfiguration(patternToPinMap=" + this.f6499a + ", interceptors=" + this.b + ", networkInterceptors=" + this.c + ", keepAliveTime=60, maxIdleConnections=" + this.d + ", authenticator=null)";
    }
}
