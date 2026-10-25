package app.chalo.tito.data.model;

import androidx.compose.material3.internal.CalendarModelKt;
import defpackage.t10;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/tito/data/model/TitoValidationConstraint;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TitoValidationConstraint {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9646a;
    public final long b;
    public final long c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/tito/data/model/TitoValidationConstraint$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/tito/data/model/TitoValidationConstraint;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TitoValidationConstraint> serializer() {
            return TitoValidationConstraint$$serializer.f9647a;
        }
    }

    public TitoValidationConstraint() {
        this.f9646a = false;
        this.b = 10000L;
        this.c = CalendarModelKt.MillisecondsIn24Hours;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitoValidationConstraint)) {
            return false;
        }
        TitoValidationConstraint titoValidationConstraint = (TitoValidationConstraint) obj;
        return this.f9646a == titoValidationConstraint.f9646a && this.b == titoValidationConstraint.b && this.c == titoValidationConstraint.c;
    }

    public final int hashCode() {
        int i = this.f9646a ? 1231 : 1237;
        long j = this.b;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TitoValidationConstraint(isTapInPollingEnabled=");
        sb.append(this.f9646a);
        sb.append(", titoPollingDelay=");
        sb.append(this.b);
        return t10.g(this.c, ", titoRideTimeout=", ")", sb);
    }

    public /* synthetic */ TitoValidationConstraint(long j, int i, long j2, boolean z) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(TitoValidationConstraint$$serializer.f9647a.getDescriptor(), i, 7);
            throw null;
        }
        this.f9646a = z;
        this.b = j;
        this.c = j2;
    }
}
