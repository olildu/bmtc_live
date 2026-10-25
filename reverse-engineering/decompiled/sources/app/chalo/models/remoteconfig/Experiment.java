package app.chalo.models.remoteconfig;

import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.vz;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/remoteconfig/Experiment;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class Experiment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5684a;
    public final String b;
    public final List c;
    public final List d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/remoteconfig/Experiment$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/remoteconfig/Experiment;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<Experiment> serializer() {
            return Experiment$$serializer.f5685a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new vz(26)), LazyKt.a(lazyThreadSafetyMode, new vz(27))};
    }

    public Experiment(int i, String str, String str2, List list, List list2) {
        if ((i & 1) == 0) {
            this.f5684a = "";
        } else {
            this.f5684a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.f17557a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.f17557a;
        } else {
            this.d = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Experiment)) {
            return false;
        }
        Experiment experiment = (Experiment) obj;
        return Intrinsics.d(this.f5684a, experiment.f5684a) && Intrinsics.d(this.b, experiment.b) && Intrinsics.d(this.c, experiment.c) && Intrinsics.d(this.d, experiment.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.b(nf1.e(this.f5684a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Experiment(expId=", this.f5684a, ", expName=", this.b, ", cities=");
        sbE.append(this.c);
        sbE.append(", language=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }
}
