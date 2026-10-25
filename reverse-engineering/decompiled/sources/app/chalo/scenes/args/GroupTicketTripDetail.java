package app.chalo.scenes.args;

import defpackage.a70;
import defpackage.dd;
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
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/scenes/args/GroupTicketTripDetail;", "", "Companion", "Bus", "Metro", "Lapp/chalo/scenes/args/GroupTicketTripDetail$Bus;", "Lapp/chalo/scenes/args/GroupTicketTripDetail$Metro;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class GroupTicketTripDetail {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f9262a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a70(0));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/GroupTicketTripDetail$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/GroupTicketTripDetail;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<GroupTicketTripDetail> serializer() {
            return (KSerializer) GroupTicketTripDetail.f9262a.getValue();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract GroupTicketStop getC();

    /* JADX INFO: renamed from: b */
    public abstract GroupTicketStop getB();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/GroupTicketTripDetail$Bus;", "Lapp/chalo/scenes/args/GroupTicketTripDetail;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Bus extends GroupTicketTripDetail {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final String c;
        public final GroupTicketStop d;
        public final GroupTicketStop e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/GroupTicketTripDetail$Bus$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/GroupTicketTripDetail$Bus;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Bus> serializer() {
                return GroupTicketTripDetail$Bus$$serializer.f9263a;
            }
        }

        public /* synthetic */ Bus(int i, String str, String str2, GroupTicketStop groupTicketStop, GroupTicketStop groupTicketStop2) {
            if (13 != (i & 13)) {
                PluginExceptionsKt.b(GroupTicketTripDetail$Bus$$serializer.f9263a.getDescriptor(), i, 13);
                throw null;
            }
            this.b = str;
            if ((i & 2) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            this.d = groupTicketStop;
            this.e = groupTicketStop2;
        }

        @Override // app.chalo.scenes.args.GroupTicketTripDetail
        /* JADX INFO: renamed from: a, reason: from getter */
        public final GroupTicketStop getC() {
            return this.e;
        }

        @Override // app.chalo.scenes.args.GroupTicketTripDetail
        /* JADX INFO: renamed from: b, reason: from getter */
        public final GroupTicketStop getB() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bus)) {
                return false;
            }
            Bus bus = (Bus) obj;
            return Intrinsics.d(this.b, bus.b) && Intrinsics.d(this.c, bus.c) && Intrinsics.d(this.d, bus.d) && Intrinsics.d(this.e, bus.e);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            String str = this.c;
            return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("Bus(routeId=", this.b, ", routeName=", this.c, ", startStop=");
            sbE.append(this.d);
            sbE.append(", endStop=");
            sbE.append(this.e);
            sbE.append(")");
            return sbE.toString();
        }

        public Bus(String routeId, String str, GroupTicketStop groupTicketStop, GroupTicketStop groupTicketStop2) {
            Intrinsics.i(routeId, "routeId");
            this.b = routeId;
            this.c = str;
            this.d = groupTicketStop;
            this.e = groupTicketStop2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/GroupTicketTripDetail$Metro;", "Lapp/chalo/scenes/args/GroupTicketTripDetail;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Metro extends GroupTicketTripDetail {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] e = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a70(1))};
        public final GroupTicketStop b;
        public final GroupTicketStop c;
        public final List d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/GroupTicketTripDetail$Metro$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/GroupTicketTripDetail$Metro;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Metro> serializer() {
                return GroupTicketTripDetail$Metro$$serializer.f9264a;
            }
        }

        public /* synthetic */ Metro(int i, GroupTicketStop groupTicketStop, GroupTicketStop groupTicketStop2, List list) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(GroupTicketTripDetail$Metro$$serializer.f9264a.getDescriptor(), i, 7);
                throw null;
            }
            this.b = groupTicketStop;
            this.c = groupTicketStop2;
            this.d = list;
        }

        @Override // app.chalo.scenes.args.GroupTicketTripDetail
        /* JADX INFO: renamed from: a, reason: from getter */
        public final GroupTicketStop getC() {
            return this.c;
        }

        @Override // app.chalo.scenes.args.GroupTicketTripDetail
        /* JADX INFO: renamed from: b, reason: from getter */
        public final GroupTicketStop getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metro)) {
                return false;
            }
            Metro metro = (Metro) obj;
            return Intrinsics.d(this.b, metro.b) && Intrinsics.d(this.c, metro.c) && Intrinsics.d(this.d, metro.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Metro(startStop=");
            sb.append(this.b);
            sb.append(", endStop=");
            sb.append(this.c);
            sb.append(", journeyOverview=");
            return xs.l(sb, this.d, ")");
        }

        public Metro(GroupTicketStop groupTicketStop, GroupTicketStop groupTicketStop2, ArrayList arrayList) {
            this.b = groupTicketStop;
            this.c = groupTicketStop2;
            this.d = arrayList;
        }
    }
}
