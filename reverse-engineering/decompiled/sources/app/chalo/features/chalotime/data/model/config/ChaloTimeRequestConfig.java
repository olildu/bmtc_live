package app.chalo.features.chalotime.data.model.config;

import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/chalotime/data/model/config/ChaloTimeRequestConfig;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloTimeRequestConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2677a;
    public final int b;

    public ChaloTimeRequestConfig(String path, int i) {
        Intrinsics.i(path, "path");
        this.f2677a = path;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloTimeRequestConfig)) {
            return false;
        }
        ChaloTimeRequestConfig chaloTimeRequestConfig = (ChaloTimeRequestConfig) obj;
        return Intrinsics.d(this.f2677a, chaloTimeRequestConfig.f2677a) && this.b == chaloTimeRequestConfig.b;
    }

    public final int hashCode() {
        return (this.f2677a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return xs.i(this.b, "ChaloTimeRequestConfig(path=", this.f2677a, ", requestTimeout=", ")");
    }
}
