package app.chalo.multimodalticket.data.model.app;

import app.chalo.instantticket.data.model.app.InstantTicketAppModel;
import app.chalo.ondc.model.app.OndcMetroTicketAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/MultiModalGroupTicketChildAppModel;", "", "InstantTicketChild", "OndcMetroTicketChild", "Lapp/chalo/multimodalticket/data/model/app/MultiModalGroupTicketChildAppModel$InstantTicketChild;", "Lapp/chalo/multimodalticket/data/model/app/MultiModalGroupTicketChildAppModel$OndcMetroTicketChild;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MultiModalGroupTicketChildAppModel {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/MultiModalGroupTicketChildAppModel$InstantTicketChild;", "Lapp/chalo/multimodalticket/data/model/app/MultiModalGroupTicketChildAppModel;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InstantTicketChild extends MultiModalGroupTicketChildAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5876a;
        public final InstantTicketAppModel b;

        public InstantTicketChild(int i, InstantTicketAppModel instantTicketAppModel) {
            this.f5876a = i;
            this.b = instantTicketAppModel;
        }

        @Override // app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketChildAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF5877a() {
            return this.f5876a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstantTicketChild)) {
                return false;
            }
            InstantTicketChild instantTicketChild = (InstantTicketChild) obj;
            return this.f5876a == instantTicketChild.f5876a && Intrinsics.d(this.b, instantTicketChild.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5876a * 31);
        }

        public final String toString() {
            return "InstantTicketChild(sequence=" + this.f5876a + ", ticket=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/MultiModalGroupTicketChildAppModel$OndcMetroTicketChild;", "Lapp/chalo/multimodalticket/data/model/app/MultiModalGroupTicketChildAppModel;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OndcMetroTicketChild extends MultiModalGroupTicketChildAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5877a;
        public final OndcMetroTicketAppModel b;

        public OndcMetroTicketChild(int i, OndcMetroTicketAppModel ticket) {
            Intrinsics.i(ticket, "ticket");
            this.f5877a = i;
            this.b = ticket;
        }

        @Override // app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketChildAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF5877a() {
            return this.f5877a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OndcMetroTicketChild)) {
                return false;
            }
            OndcMetroTicketChild ondcMetroTicketChild = (OndcMetroTicketChild) obj;
            return this.f5877a == ondcMetroTicketChild.f5877a && Intrinsics.d(this.b, ondcMetroTicketChild.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5877a * 31);
        }

        public final String toString() {
            return "OndcMetroTicketChild(sequence=" + this.f5877a + ", ticket=" + this.b + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int getF5877a();
}
