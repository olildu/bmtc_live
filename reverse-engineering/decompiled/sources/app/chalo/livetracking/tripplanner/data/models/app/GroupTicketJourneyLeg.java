package app.chalo.livetracking.tripplanner.data.models.app;

import defpackage.l60;
import defpackage.xs;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/GroupTicketJourneyLeg;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GroupTicketJourneyLeg {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new l60(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4651a;
    public final int b;
    public final int c;
    public final TripPlannerLegAppModel d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/data/models/app/GroupTicketJourneyLeg$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/GroupTicketJourneyLeg;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GroupTicketJourneyLeg> serializer() {
            return GroupTicketJourneyLeg$$serializer.f4652a;
        }
    }

    public GroupTicketJourneyLeg(int i, int i2, TripPlannerLegAppModel tripPlannerLegAppModel, String str) {
        this.f4651a = str;
        this.b = i;
        this.c = i2;
        this.d = tripPlannerLegAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketJourneyLeg)) {
            return false;
        }
        GroupTicketJourneyLeg groupTicketJourneyLeg = (GroupTicketJourneyLeg) obj;
        return Intrinsics.d(this.f4651a, groupTicketJourneyLeg.f4651a) && this.b == groupTicketJourneyLeg.b && this.c == groupTicketJourneyLeg.c && Intrinsics.d(this.d, groupTicketJourneyLeg.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (((((this.f4651a.hashCode() * 31) + this.b) * 31) + this.c) * 31);
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "GroupTicketJourneyLeg(configId=", this.f4651a, ", sequenceNumber=", ", sharedTicketGroupIndex=");
        sbM.append(this.c);
        sbM.append(", leg=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }

    public /* synthetic */ GroupTicketJourneyLeg(int i, String str, int i2, int i3, TripPlannerLegAppModel tripPlannerLegAppModel) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(GroupTicketJourneyLeg$$serializer.f4652a.getDescriptor(), i, 15);
            throw null;
        }
        this.f4651a = str;
        this.b = i2;
        this.c = i3;
        this.d = tripPlannerLegAppModel;
    }
}
