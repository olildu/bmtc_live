package app.chalo.superpass.data.models;

import defpackage.yv;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/superpass/data/models/DigitalTripReceiptRemoteApiRequestModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class DigitalTripReceiptRemoteApiRequestModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9525a;
    public final List b;
    public final List c;
    public final PassInfoApiRequestModel d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/superpass/data/models/DigitalTripReceiptRemoteApiRequestModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/superpass/data/models/DigitalTripReceiptRemoteApiRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<DigitalTripReceiptRemoteApiRequestModel> serializer() {
            return DigitalTripReceiptRemoteApiRequestModel$$serializer.f9526a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new yv(11)), LazyKt.a(lazyThreadSafetyMode, new yv(12)), null};
    }

    public /* synthetic */ DigitalTripReceiptRemoteApiRequestModel(int i, int i2, List list, List list2, PassInfoApiRequestModel passInfoApiRequestModel) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.b(DigitalTripReceiptRemoteApiRequestModel$$serializer.f9526a.getDescriptor(), i, 1);
            throw null;
        }
        this.f9525a = i2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = passInfoApiRequestModel;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DigitalTripReceiptRemoteApiRequestModel)) {
            return false;
        }
        DigitalTripReceiptRemoteApiRequestModel digitalTripReceiptRemoteApiRequestModel = (DigitalTripReceiptRemoteApiRequestModel) obj;
        return this.f9525a == digitalTripReceiptRemoteApiRequestModel.f9525a && Intrinsics.d(this.b, digitalTripReceiptRemoteApiRequestModel.b) && Intrinsics.d(this.c, digitalTripReceiptRemoteApiRequestModel.c) && Intrinsics.d(this.d, digitalTripReceiptRemoteApiRequestModel.d);
    }

    public final int hashCode() {
        int i = this.f9525a * 31;
        List list = this.b;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        PassInfoApiRequestModel passInfoApiRequestModel = this.d;
        return iHashCode2 + (passInfoApiRequestModel != null ? passInfoApiRequestModel.hashCode() : 0);
    }

    public final String toString() {
        return "DigitalTripReceiptRemoteApiRequestModel(appVer=" + this.f9525a + ", passActivations=" + this.b + ", ticketActivations=" + this.c + ", passInfo=" + this.d + ")";
    }

    public DigitalTripReceiptRemoteApiRequestModel(int i, ArrayList arrayList, ArrayList arrayList2, PassInfoApiRequestModel passInfoApiRequestModel) {
        this.f9525a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = passInfoApiRequestModel;
    }
}
