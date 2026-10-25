package app.chalo.multimodalticket.data.model;

import defpackage.ti0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/multimodalticket/data/model/MultiModalGroupTicketSequenceInfo;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MultiModalGroupTicketSequenceInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ti0(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5796a;
    public final MultiModalGroupTransportType b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/data/model/MultiModalGroupTicketSequenceInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/multimodalticket/data/model/MultiModalGroupTicketSequenceInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MultiModalGroupTicketSequenceInfo> serializer() {
            return MultiModalGroupTicketSequenceInfo$$serializer.f5797a;
        }
    }

    public /* synthetic */ MultiModalGroupTicketSequenceInfo(int i, int i2, MultiModalGroupTransportType multiModalGroupTransportType) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(MultiModalGroupTicketSequenceInfo$$serializer.f5797a.getDescriptor(), i, 3);
            throw null;
        }
        this.f5796a = i2;
        this.b = multiModalGroupTransportType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiModalGroupTicketSequenceInfo)) {
            return false;
        }
        MultiModalGroupTicketSequenceInfo multiModalGroupTicketSequenceInfo = (MultiModalGroupTicketSequenceInfo) obj;
        return this.f5796a == multiModalGroupTicketSequenceInfo.f5796a && this.b == multiModalGroupTicketSequenceInfo.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5796a * 31);
    }

    public final String toString() {
        return "MultiModalGroupTicketSequenceInfo(sequence=" + this.f5796a + ", transportMode=" + this.b + ")";
    }

    public MultiModalGroupTicketSequenceInfo(int i, MultiModalGroupTransportType multiModalGroupTransportType) {
        this.f5796a = i;
        this.b = multiModalGroupTransportType;
    }
}
