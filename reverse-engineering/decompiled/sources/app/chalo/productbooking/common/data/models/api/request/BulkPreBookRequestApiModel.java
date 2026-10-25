package app.chalo.productbooking.common.data.models.api.request;

import defpackage.b3;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.wb;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/request/BulkPreBookRequestApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BulkPreBookRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8100a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final boolean g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/request/BulkPreBookRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/request/BulkPreBookRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BulkPreBookRequestApiModel> serializer() {
            return BulkPreBookRequestApiModel$$serializer.f8101a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new Lazy[]{null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new wb(22)), LazyKt.a(lazyThreadSafetyMode, new wb(23)), null};
    }

    public /* synthetic */ BulkPreBookRequestApiModel(int i, String str, String str2, String str3, String str4, List list, List list2, boolean z) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(BulkPreBookRequestApiModel$$serializer.f8101a.getDescriptor(), i, 127);
            throw null;
        }
        this.f8100a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = list2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulkPreBookRequestApiModel)) {
            return false;
        }
        BulkPreBookRequestApiModel bulkPreBookRequestApiModel = (BulkPreBookRequestApiModel) obj;
        return Intrinsics.d(this.f8100a, bulkPreBookRequestApiModel.f8100a) && Intrinsics.d(this.b, bulkPreBookRequestApiModel.b) && Intrinsics.d(this.c, bulkPreBookRequestApiModel.c) && Intrinsics.d(this.d, bulkPreBookRequestApiModel.d) && Intrinsics.d(this.e, bulkPreBookRequestApiModel.e) && Intrinsics.d(this.f, bulkPreBookRequestApiModel.f) && this.g == bulkPreBookRequestApiModel.g;
    }

    public final int hashCode() {
        return r30.b(r30.b(nf1.e(nf1.e(nf1.e(this.f8100a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("BulkPreBookRequestApiModel(city=", this.f8100a, ", passId=", this.b, ", endStopId=");
        cb0.t(sbE, this.c, ", startStopId=", this.d, ", requestedTripIds=");
        dd.o(sbE, this.e, ", seatPreference=", this.f, ", autoAssignForWomenReservation=");
        return b3.g(")", sbE, this.g);
    }

    public BulkPreBookRequestApiModel(String str, String passId, String endStopId, String startStopId, List requestedTripIds, ArrayList arrayList, boolean z) {
        Intrinsics.i(passId, "passId");
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(startStopId, "startStopId");
        Intrinsics.i(requestedTripIds, "requestedTripIds");
        this.f8100a = str;
        this.b = passId;
        this.c = endStopId;
        this.d = startStopId;
        this.e = requestedTripIds;
        this.f = arrayList;
        this.g = z;
    }
}
