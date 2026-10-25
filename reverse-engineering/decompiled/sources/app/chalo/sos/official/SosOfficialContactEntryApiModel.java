package app.chalo.sos.official;

import defpackage.hq0;
import defpackage.ra1;
import defpackage.xs;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/sos/official/SosOfficialContactEntryApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SosOfficialContactEntryApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h = {null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ra1(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9454a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final SosOfficialContactEligibilityApiModel f;
    public final List g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/sos/official/SosOfficialContactEntryApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/sos/official/SosOfficialContactEntryApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SosOfficialContactEntryApiModel> serializer() {
            return SosOfficialContactEntryApiModel$$serializer.f9455a;
        }
    }

    public SosOfficialContactEntryApiModel(int i, String str, boolean z, int i2, int i3, int i4, SosOfficialContactEligibilityApiModel sosOfficialContactEligibilityApiModel, List list) {
        if ((i & 1) == 0) {
            this.f9454a = null;
        } else {
            this.f9454a = str;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = Integer.MAX_VALUE;
        } else {
            this.d = i3;
        }
        if ((i & 16) == 0) {
            this.e = Integer.MAX_VALUE;
        } else {
            this.e = i4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = sosOfficialContactEligibilityApiModel;
        }
        if ((i & 64) == 0) {
            this.g = EmptyList.f17557a;
        } else {
            this.g = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SosOfficialContactEntryApiModel)) {
            return false;
        }
        SosOfficialContactEntryApiModel sosOfficialContactEntryApiModel = (SosOfficialContactEntryApiModel) obj;
        return Intrinsics.d(this.f9454a, sosOfficialContactEntryApiModel.f9454a) && this.b == sosOfficialContactEntryApiModel.b && this.c == sosOfficialContactEntryApiModel.c && this.d == sosOfficialContactEntryApiModel.d && this.e == sosOfficialContactEntryApiModel.e && Intrinsics.d(this.f, sosOfficialContactEntryApiModel.f) && Intrinsics.d(this.g, sosOfficialContactEntryApiModel.g);
    }

    public final int hashCode() {
        String str = this.f9454a;
        int iHashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + (this.b ? 1231 : 1237)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31;
        SosOfficialContactEligibilityApiModel sosOfficialContactEligibilityApiModel = this.f;
        return this.g.hashCode() + ((iHashCode + (sosOfficialContactEligibilityApiModel != null ? sosOfficialContactEligibilityApiModel.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("SosOfficialContactEntryApiModel(id=", this.f9454a, ", enabled=", ", minAppVer=", this.b);
        hq0.p(this.c, this.d, ", maxAppVer=", ", priority=", sbM);
        sbM.append(this.e);
        sbM.append(", eligibility=");
        sbM.append(this.f);
        sbM.append(", numbers=");
        return xs.l(sbM, this.g, ")");
    }
}
