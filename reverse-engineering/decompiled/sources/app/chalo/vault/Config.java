package app.chalo.vault;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/vault/Config;", "", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Config {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10745a;
    public final String b;

    public Config(String key, String value_) {
        Intrinsics.i(key, "key");
        Intrinsics.i(value_, "value_");
        this.f10745a = key;
        this.b = value_;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        return Intrinsics.d(this.f10745a, config.f10745a) && Intrinsics.d(this.b, config.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10745a.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("Config(key=", this.f10745a, ", value_=", this.b, ")");
    }
}
