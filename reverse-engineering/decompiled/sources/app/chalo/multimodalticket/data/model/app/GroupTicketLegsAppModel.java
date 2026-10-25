package app.chalo.multimodalticket.data.model.app;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketLegsAppModel;", "", "GroupTicketBusLegsAppModel", "GroupTicketMetroLegsAppModel", "Lapp/chalo/multimodalticket/data/model/app/GroupTicketLegsAppModel$GroupTicketBusLegsAppModel;", "Lapp/chalo/multimodalticket/data/model/app/GroupTicketLegsAppModel$GroupTicketMetroLegsAppModel;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class GroupTicketLegsAppModel {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketLegsAppModel$GroupTicketBusLegsAppModel;", "Lapp/chalo/multimodalticket/data/model/app/GroupTicketLegsAppModel;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GroupTicketBusLegsAppModel extends GroupTicketLegsAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5861a;
        public final String b;
        public final GroupTicketBusTripDetailsAppModel c;
        public final ChaloTransitMode d = ChaloTransitMode.BUS;

        public GroupTicketBusLegsAppModel(int i, String str, GroupTicketBusTripDetailsAppModel groupTicketBusTripDetailsAppModel) {
            this.f5861a = i;
            this.b = str;
            this.c = groupTicketBusTripDetailsAppModel;
        }

        @Override // app.chalo.multimodalticket.data.model.app.GroupTicketLegsAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // app.chalo.multimodalticket.data.model.app.GroupTicketLegsAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getF5862a() {
            return this.f5861a;
        }

        @Override // app.chalo.multimodalticket.data.model.app.GroupTicketLegsAppModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final ChaloTransitMode getD() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupTicketBusLegsAppModel)) {
                return false;
            }
            GroupTicketBusLegsAppModel groupTicketBusLegsAppModel = (GroupTicketBusLegsAppModel) obj;
            return this.f5861a == groupTicketBusLegsAppModel.f5861a && Intrinsics.d(this.b, groupTicketBusLegsAppModel.b) && Intrinsics.d(this.c, groupTicketBusLegsAppModel.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + nf1.e(this.f5861a * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbP = nf1.p(this.f5861a, "GroupTicketBusLegsAppModel(sequenceNumber=", ", configurationId=", this.b, ", tripDetails=");
            sbP.append(this.c);
            sbP.append(")");
            return sbP.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketLegsAppModel$GroupTicketMetroLegsAppModel;", "Lapp/chalo/multimodalticket/data/model/app/GroupTicketLegsAppModel;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GroupTicketMetroLegsAppModel extends GroupTicketLegsAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5862a;
        public final String b;
        public final GroupTicketMetroTripDetailsAppModel c;
        public final ChaloTransitMode d = ChaloTransitMode.METRO;

        public GroupTicketMetroLegsAppModel(int i, String str, GroupTicketMetroTripDetailsAppModel groupTicketMetroTripDetailsAppModel) {
            this.f5862a = i;
            this.b = str;
            this.c = groupTicketMetroTripDetailsAppModel;
        }

        @Override // app.chalo.multimodalticket.data.model.app.GroupTicketLegsAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // app.chalo.multimodalticket.data.model.app.GroupTicketLegsAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getF5862a() {
            return this.f5862a;
        }

        @Override // app.chalo.multimodalticket.data.model.app.GroupTicketLegsAppModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final ChaloTransitMode getD() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupTicketMetroLegsAppModel)) {
                return false;
            }
            GroupTicketMetroLegsAppModel groupTicketMetroLegsAppModel = (GroupTicketMetroLegsAppModel) obj;
            return this.f5862a == groupTicketMetroLegsAppModel.f5862a && Intrinsics.d(this.b, groupTicketMetroLegsAppModel.b) && Intrinsics.d(this.c, groupTicketMetroLegsAppModel.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + nf1.e(this.f5862a * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbP = nf1.p(this.f5862a, "GroupTicketMetroLegsAppModel(sequenceNumber=", ", configurationId=", this.b, ", tripDetails=");
            sbP.append(this.c);
            sbP.append(")");
            return sbP.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String getB();

    /* JADX INFO: renamed from: b */
    public abstract int getF5862a();

    /* JADX INFO: renamed from: c */
    public abstract ChaloTransitMode getD();
}
