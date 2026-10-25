package app.chalo.mticket.ui.tripinfo;

import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoResultStateMeta;", "Lapp/chalo/resultstatemanager/ResultStateKeeperMeta;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MTicketTripInfoResultStateMeta extends ResultStateKeeperMeta {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final Boolean b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoResultStateMeta$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoResultStateMeta;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MTicketTripInfoResultStateMeta> serializer() {
            return MTicketTripInfoResultStateMeta$$serializer.f5777a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MTicketTripInfoResultStateMeta(int i, Boolean bool, String str, String str2) {
        super(i, str);
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(MTicketTripInfoResultStateMeta$$serializer.f5777a.getDescriptor(), i, 7);
            throw null;
        }
        this.b = bool;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketTripInfoResultStateMeta)) {
            return false;
        }
        MTicketTripInfoResultStateMeta mTicketTripInfoResultStateMeta = (MTicketTripInfoResultStateMeta) obj;
        return Intrinsics.d(this.b, mTicketTripInfoResultStateMeta.b) && Intrinsics.d(this.c, mTicketTripInfoResultStateMeta.c);
    }

    public final int hashCode() {
        Boolean bool = this.b;
        return this.c.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31);
    }

    public final String toString() {
        return "MTicketTripInfoResultStateMeta(isFromStopSelection=" + this.b + ", searchRequestId=" + this.c + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketTripInfoResultStateMeta(String searchRequestId, Boolean bool) {
        super(searchRequestId);
        Intrinsics.i(searchRequestId, "searchRequestId");
        this.b = bool;
        this.c = searchRequestId;
    }
}
