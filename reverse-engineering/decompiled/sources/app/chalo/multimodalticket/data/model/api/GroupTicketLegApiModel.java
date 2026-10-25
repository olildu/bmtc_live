package app.chalo.multimodalticket.data.model.api;

import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegApiModel;", "", "Companion", "GroupTicketBusLegApiModel", "GroupTicketMetroLegApiModel", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegApiModel$GroupTicketBusLegApiModel;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegApiModel$GroupTicketMetroLegApiModel;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable(with = GroupTicketLegApiModelSerializer.class)
public abstract class GroupTicketLegApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GroupTicketLegApiModel> serializer() {
            return GroupTicketLegApiModelSerializer.c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegApiModel$GroupTicketBusLegApiModel;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegApiModel;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class GroupTicketBusLegApiModel extends GroupTicketLegApiModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5822a;
        public final String b;
        public final String c;
        public final GroupTicketBusTripDetailsApiModel d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegApiModel$GroupTicketBusLegApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegApiModel$GroupTicketBusLegApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<GroupTicketBusLegApiModel> serializer() {
                return GroupTicketLegApiModel$GroupTicketBusLegApiModel$$serializer.f5823a;
            }
        }

        public GroupTicketBusLegApiModel(int i, int i2, String str, String str2, GroupTicketBusTripDetailsApiModel groupTicketBusTripDetailsApiModel) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.b(GroupTicketLegApiModel$GroupTicketBusLegApiModel$$serializer.f5823a.getDescriptor(), i, 15);
                throw null;
            }
            this.f5822a = i2;
            this.b = str;
            this.c = str2;
            this.d = groupTicketBusTripDetailsApiModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupTicketBusLegApiModel)) {
                return false;
            }
            GroupTicketBusLegApiModel groupTicketBusLegApiModel = (GroupTicketBusLegApiModel) obj;
            return this.f5822a == groupTicketBusLegApiModel.f5822a && Intrinsics.d(this.b, groupTicketBusLegApiModel.b) && Intrinsics.d(this.c, groupTicketBusLegApiModel.c) && Intrinsics.d(this.d, groupTicketBusLegApiModel.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + nf1.e(nf1.e(this.f5822a * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbP = nf1.p(this.f5822a, "GroupTicketBusLegApiModel(sequence=", ", configurationId=", this.b, ", transportMode=");
            sbP.append(this.c);
            sbP.append(", tripDetail=");
            sbP.append(this.d);
            sbP.append(")");
            return sbP.toString();
        }

        public GroupTicketBusLegApiModel(int i, String str, String transportMode, GroupTicketBusTripDetailsApiModel groupTicketBusTripDetailsApiModel) {
            Intrinsics.i(transportMode, "transportMode");
            this.f5822a = i;
            this.b = str;
            this.c = transportMode;
            this.d = groupTicketBusTripDetailsApiModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegApiModel$GroupTicketMetroLegApiModel;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegApiModel;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class GroupTicketMetroLegApiModel extends GroupTicketLegApiModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5824a;
        public final String b;
        public final String c;
        public final GroupTicketMetroTripDetailsApiModel d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegApiModel$GroupTicketMetroLegApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/multimodalticket/data/model/api/GroupTicketLegApiModel$GroupTicketMetroLegApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<GroupTicketMetroLegApiModel> serializer() {
                return GroupTicketLegApiModel$GroupTicketMetroLegApiModel$$serializer.f5825a;
            }
        }

        public GroupTicketMetroLegApiModel(int i, int i2, String str, String str2, GroupTicketMetroTripDetailsApiModel groupTicketMetroTripDetailsApiModel) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.b(GroupTicketLegApiModel$GroupTicketMetroLegApiModel$$serializer.f5825a.getDescriptor(), i, 15);
                throw null;
            }
            this.f5824a = i2;
            this.b = str;
            this.c = str2;
            this.d = groupTicketMetroTripDetailsApiModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupTicketMetroLegApiModel)) {
                return false;
            }
            GroupTicketMetroLegApiModel groupTicketMetroLegApiModel = (GroupTicketMetroLegApiModel) obj;
            return this.f5824a == groupTicketMetroLegApiModel.f5824a && Intrinsics.d(this.b, groupTicketMetroLegApiModel.b) && Intrinsics.d(this.c, groupTicketMetroLegApiModel.c) && Intrinsics.d(this.d, groupTicketMetroLegApiModel.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + nf1.e(nf1.e(this.f5824a * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbP = nf1.p(this.f5824a, "GroupTicketMetroLegApiModel(sequence=", ", configurationId=", this.b, ", transportMode=");
            sbP.append(this.c);
            sbP.append(", tripDetail=");
            sbP.append(this.d);
            sbP.append(")");
            return sbP.toString();
        }

        public GroupTicketMetroLegApiModel(int i, String str, String transportMode, GroupTicketMetroTripDetailsApiModel groupTicketMetroTripDetailsApiModel) {
            Intrinsics.i(transportMode, "transportMode");
            this.f5824a = i;
            this.b = str;
            this.c = transportMode;
            this.d = groupTicketMetroTripDetailsApiModel;
        }
    }
}
