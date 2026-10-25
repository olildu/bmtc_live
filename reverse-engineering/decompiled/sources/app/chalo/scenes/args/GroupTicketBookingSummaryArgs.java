package app.chalo.scenes.args;

import app.chalo.scenes.ChaloScenes;
import defpackage.dd;
import defpackage.l60;
import defpackage.nf1;
import defpackage.r30;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/GroupTicketBookingSummaryArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GroupTicketBookingSummaryArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final List f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/GroupTicketBookingSummaryArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/GroupTicketBookingSummaryArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GroupTicketBookingSummaryArgs> serializer() {
            return GroupTicketBookingSummaryArgs$$serializer.f9254a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new l60(9)), LazyKt.a(lazyThreadSafetyMode, new l60(10)), LazyKt.a(lazyThreadSafetyMode, new l60(11)), null};
    }

    public GroupTicketBookingSummaryArgs(int i, String str, String str2, List list, List list2, List list3, String str3) {
        if (47 != (i & 47)) {
            PluginExceptionsKt.b(GroupTicketBookingSummaryArgs$$serializer.f9254a.getDescriptor(), i, 47);
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = list2;
        if ((i & 16) == 0) {
            this.f = EmptyList.f17557a;
        } else {
            this.f = list3;
        }
        this.g = str3;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.GroupTicketBookingSummary;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketBookingSummaryArgs)) {
            return false;
        }
        GroupTicketBookingSummaryArgs groupTicketBookingSummaryArgs = (GroupTicketBookingSummaryArgs) obj;
        return Intrinsics.d(this.b, groupTicketBookingSummaryArgs.b) && Intrinsics.d(this.c, groupTicketBookingSummaryArgs.c) && Intrinsics.d(this.d, groupTicketBookingSummaryArgs.d) && Intrinsics.d(this.e, groupTicketBookingSummaryArgs.e) && Intrinsics.d(this.f, groupTicketBookingSummaryArgs.f) && Intrinsics.d(this.g, groupTicketBookingSummaryArgs.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + r30.b(r30.b(r30.b(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("GroupTicketBookingSummaryArgs(journeyConfigId=", this.b, ", transactionId=", this.c, ", passengerDetails=");
        dd.o(sbE, this.d, ", legs=", this.e, ", tncList=");
        sbE.append(this.f);
        sbE.append(", agency=");
        sbE.append(this.g);
        sbE.append(")");
        return sbE.toString();
    }

    public GroupTicketBookingSummaryArgs(String journeyConfigId, String transactionId, List passengerDetails, List legs, List tncList, String str) {
        Intrinsics.i(journeyConfigId, "journeyConfigId");
        Intrinsics.i(transactionId, "transactionId");
        Intrinsics.i(passengerDetails, "passengerDetails");
        Intrinsics.i(legs, "legs");
        Intrinsics.i(tncList, "tncList");
        this.b = journeyConfigId;
        this.c = transactionId;
        this.d = passengerDetails;
        this.e = legs;
        this.f = tncList;
        this.g = str;
    }
}
