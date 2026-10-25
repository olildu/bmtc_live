package app.chalo.sos.official;

import defpackage.r1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/sos/official/SosOfficialContactConfigApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SosOfficialContactConfigApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] b = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new z61(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9450a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/sos/official/SosOfficialContactConfigApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/sos/official/SosOfficialContactConfigApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SosOfficialContactConfigApiModel> serializer() {
            return SosOfficialContactConfigApiModel$$serializer.f9451a;
        }
    }

    public SosOfficialContactConfigApiModel(int i, List list) {
        if ((i & 1) == 0) {
            this.f9450a = EmptyList.f17557a;
        } else {
            this.f9450a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SosOfficialContactConfigApiModel) && Intrinsics.d(this.f9450a, ((SosOfficialContactConfigApiModel) obj).f9450a);
    }

    public final int hashCode() {
        return this.f9450a.hashCode();
    }

    public final String toString() {
        return r1.d("SosOfficialContactConfigApiModel(officialContacts=", ")", this.f9450a);
    }
}
