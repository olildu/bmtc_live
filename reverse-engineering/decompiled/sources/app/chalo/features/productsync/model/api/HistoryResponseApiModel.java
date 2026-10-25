package app.chalo.features.productsync.model.api;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/features/productsync/model/api/HistoryResponseApiModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class HistoryResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PropertiesApiModel f2748a;
    public final BookingHistoryDataApiModel b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/features/productsync/model/api/HistoryResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/features/productsync/model/api/HistoryResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<HistoryResponseApiModel> serializer() {
            return HistoryResponseApiModel$$serializer.f2749a;
        }
    }

    public /* synthetic */ HistoryResponseApiModel(int i, PropertiesApiModel propertiesApiModel, BookingHistoryDataApiModel bookingHistoryDataApiModel, String str) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(HistoryResponseApiModel$$serializer.f2749a.getDescriptor(), i, 3);
            throw null;
        }
        this.f2748a = propertiesApiModel;
        this.b = bookingHistoryDataApiModel;
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryResponseApiModel)) {
            return false;
        }
        HistoryResponseApiModel historyResponseApiModel = (HistoryResponseApiModel) obj;
        return Intrinsics.d(this.f2748a, historyResponseApiModel.f2748a) && Intrinsics.d(this.b, historyResponseApiModel.b) && Intrinsics.d(this.c, historyResponseApiModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f2748a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryResponseApiModel(properties=");
        sb.append(this.f2748a);
        sb.append(", responseData=");
        sb.append(this.b);
        sb.append(", userId=");
        return vo1.p(sb, this.c, ")");
    }
}
