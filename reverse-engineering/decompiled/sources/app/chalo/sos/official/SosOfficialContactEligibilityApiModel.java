package app.chalo.sos.official;

import defpackage.r30;
import defpackage.ra1;
import defpackage.xs;
import defpackage.z61;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/sos/official/SosOfficialContactEligibilityApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SosOfficialContactEligibilityApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9452a;
    public final List b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/sos/official/SosOfficialContactEligibilityApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/sos/official/SosOfficialContactEligibilityApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SosOfficialContactEligibilityApiModel> serializer() {
            return SosOfficialContactEligibilityApiModel$$serializer.f9453a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new z61(28)), LazyKt.a(lazyThreadSafetyMode, new z61(29)), LazyKt.a(lazyThreadSafetyMode, new ra1(0))};
    }

    public SosOfficialContactEligibilityApiModel(int i, List list, List list2, List list3) {
        this.f9452a = (i & 1) == 0 ? EmptyList.f17557a : list;
        if ((i & 2) == 0) {
            this.b = EmptyList.f17557a;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.f17557a;
        } else {
            this.c = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SosOfficialContactEligibilityApiModel)) {
            return false;
        }
        SosOfficialContactEligibilityApiModel sosOfficialContactEligibilityApiModel = (SosOfficialContactEligibilityApiModel) obj;
        return Intrinsics.d(this.f9452a, sosOfficialContactEligibilityApiModel.f9452a) && Intrinsics.d(this.b, sosOfficialContactEligibilityApiModel.b) && Intrinsics.d(this.c, sosOfficialContactEligibilityApiModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.b(this.f9452a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SosOfficialContactEligibilityApiModel(cityIds=");
        sb.append(this.f9452a);
        sb.append(", clusterIds=");
        sb.append(this.b);
        sb.append(", clusterFlags=");
        return xs.l(sb, this.c, ")");
    }
}
