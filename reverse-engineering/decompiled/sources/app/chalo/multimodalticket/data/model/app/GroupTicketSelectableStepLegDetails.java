package app.chalo.multimodalticket.data.model.app;

import app.chalo.livetracking.tripplanner.data.models.app.GroupTicketJourneyLeg;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.gf;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketSelectableStepLegDetails;", "", "Bus", "Metro", "Lapp/chalo/multimodalticket/data/model/app/GroupTicketSelectableStepLegDetails$Bus;", "Lapp/chalo/multimodalticket/data/model/app/GroupTicketSelectableStepLegDetails$Metro;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class GroupTicketSelectableStepLegDetails {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketSelectableStepLegDetails$Bus;", "Lapp/chalo/multimodalticket/data/model/app/GroupTicketSelectableStepLegDetails;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Bus extends GroupTicketSelectableStepLegDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GroupTicketJourneyLeg f5865a;
        public final ChaloTransitMode b = ChaloTransitMode.BUS;

        static {
            GroupTicketJourneyLeg.Companion companion = GroupTicketJourneyLeg.INSTANCE;
        }

        public Bus(GroupTicketJourneyLeg groupTicketJourneyLeg) {
            this.f5865a = groupTicketJourneyLeg;
        }

        @Override // app.chalo.multimodalticket.data.model.app.GroupTicketSelectableStepLegDetails
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ChaloTransitMode getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Bus) && Intrinsics.d(this.f5865a, ((Bus) obj).f5865a);
        }

        public final int hashCode() {
            return this.f5865a.hashCode();
        }

        public final String toString() {
            return "Bus(sourceLeg=" + this.f5865a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketSelectableStepLegDetails$Metro;", "Lapp/chalo/multimodalticket/data/model/app/GroupTicketSelectableStepLegDetails;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Metro extends GroupTicketSelectableStepLegDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f5866a;
        public final ChaloTransitMode b = ChaloTransitMode.METRO;

        public Metro(ArrayList arrayList) {
            this.f5866a = arrayList;
        }

        @Override // app.chalo.multimodalticket.data.model.app.GroupTicketSelectableStepLegDetails
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ChaloTransitMode getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Metro) && this.f5866a.equals(((Metro) obj).f5866a);
        }

        public final int hashCode() {
            return this.f5866a.hashCode();
        }

        public final String toString() {
            return gf.i("Metro(sourceLegs=", ")", this.f5866a);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract ChaloTransitMode getB();
}
