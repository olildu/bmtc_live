package app.chalo.tito.data.model;

import defpackage.t10;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/tito/data/model/TITONotificationJobConfig;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TITONotificationJobConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9638a;
    public final long b;
    public final int c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/tito/data/model/TITONotificationJobConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/tito/data/model/TITONotificationJobConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TITONotificationJobConfig> serializer() {
            return TITONotificationJobConfig$$serializer.f9639a;
        }
    }

    public TITONotificationJobConfig() {
        this.f9638a = true;
        this.b = 10000L;
        this.c = 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TITONotificationJobConfig)) {
            return false;
        }
        TITONotificationJobConfig tITONotificationJobConfig = (TITONotificationJobConfig) obj;
        return this.f9638a == tITONotificationJobConfig.f9638a && this.b == tITONotificationJobConfig.b && this.c == tITONotificationJobConfig.c;
    }

    public final int hashCode() {
        int i = this.f9638a ? 1231 : 1237;
        long j = this.b;
        return (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TITONotificationJobConfig(isEnabled=");
        sb.append(this.f9638a);
        sb.append(", fetchDelay=");
        sb.append(this.b);
        return t10.k(sb, ", maxRetries=", this.c, ")");
    }

    public /* synthetic */ TITONotificationJobConfig(int i, int i2, long j, boolean z) {
        this.f9638a = (i & 1) == 0 ? true : z;
        this.b = (i & 2) == 0 ? 10000L : j;
        if ((i & 4) == 0) {
            this.c = 6;
        } else {
            this.c = i2;
        }
    }
}
