package app.chalo.superpass.data.models.entities;

import defpackage.r30;
import defpackage.to0;
import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/superpass/data/models/entities/PassApplicationRejectionReasons;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PassApplicationRejectionReasons {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9547a;
    public final List b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/superpass/data/models/entities/PassApplicationRejectionReasons$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/superpass/data/models/entities/PassApplicationRejectionReasons;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PassApplicationRejectionReasons> serializer() {
            return PassApplicationRejectionReasons$$serializer.f9548a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new to0(12)), LazyKt.a(lazyThreadSafetyMode, new to0(13)), LazyKt.a(lazyThreadSafetyMode, new to0(14))};
    }

    public /* synthetic */ PassApplicationRejectionReasons(int i, List list, List list2, List list3) {
        this.f9547a = (i & 1) == 0 ? new ArrayList() : list;
        if ((i & 2) == 0) {
            this.b = new ArrayList();
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = new ArrayList();
        } else {
            this.c = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassApplicationRejectionReasons)) {
            return false;
        }
        PassApplicationRejectionReasons passApplicationRejectionReasons = (PassApplicationRejectionReasons) obj;
        return Intrinsics.d(this.f9547a, passApplicationRejectionReasons.f9547a) && Intrinsics.d(this.b, passApplicationRejectionReasons.b) && Intrinsics.d(this.c, passApplicationRejectionReasons.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.b(this.f9547a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassApplicationRejectionReasons(proofRejectionReasonsList=");
        sb.append(this.f9547a);
        sb.append(", profileRejectionReasonsList=");
        sb.append(this.b);
        sb.append(", generalRejectionReasonsList=");
        return xs.l(sb, this.c, ")");
    }

    public PassApplicationRejectionReasons(List proofRejectionReasonsList, List profileRejectionReasonsList, List generalRejectionReasonsList) {
        Intrinsics.i(proofRejectionReasonsList, "proofRejectionReasonsList");
        Intrinsics.i(profileRejectionReasonsList, "profileRejectionReasonsList");
        Intrinsics.i(generalRejectionReasonsList, "generalRejectionReasonsList");
        this.f9547a = proofRejectionReasonsList;
        this.b = profileRejectionReasonsList;
        this.c = generalRejectionReasonsList;
    }
}
