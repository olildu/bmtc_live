package app.chalo.features.productsync.model.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/features/productsync/model/api/BookingHistoryDataApiModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BookingHistoryDataApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonObject f2745a;
    public final JsonArray b;
    public final JsonArray c;
    public final JsonArray d;
    public final JsonArray e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/features/productsync/model/api/BookingHistoryDataApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/features/productsync/model/api/BookingHistoryDataApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BookingHistoryDataApiModel> serializer() {
            return BookingHistoryDataApiModel$$serializer.f2746a;
        }
    }

    public /* synthetic */ BookingHistoryDataApiModel(int i, JsonObject jsonObject, JsonArray jsonArray, JsonArray jsonArray2, JsonArray jsonArray3, JsonArray jsonArray4) {
        if ((i & 1) == 0) {
            this.f2745a = null;
        } else {
            this.f2745a = jsonObject;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = jsonArray;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = jsonArray2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = jsonArray3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = jsonArray4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingHistoryDataApiModel)) {
            return false;
        }
        BookingHistoryDataApiModel bookingHistoryDataApiModel = (BookingHistoryDataApiModel) obj;
        return Intrinsics.d(this.f2745a, bookingHistoryDataApiModel.f2745a) && Intrinsics.d(this.b, bookingHistoryDataApiModel.b) && Intrinsics.d(this.c, bookingHistoryDataApiModel.c) && Intrinsics.d(this.d, bookingHistoryDataApiModel.d) && Intrinsics.d(this.e, bookingHistoryDataApiModel.e);
    }

    public final int hashCode() {
        JsonObject jsonObject = this.f2745a;
        int iHashCode = (jsonObject == null ? 0 : jsonObject.f18198a.hashCode()) * 31;
        JsonArray jsonArray = this.b;
        int iHashCode2 = (iHashCode + (jsonArray == null ? 0 : jsonArray.f18186a.hashCode())) * 31;
        JsonArray jsonArray2 = this.c;
        int iHashCode3 = (iHashCode2 + (jsonArray2 == null ? 0 : jsonArray2.f18186a.hashCode())) * 31;
        JsonArray jsonArray3 = this.d;
        int iHashCode4 = (iHashCode3 + (jsonArray3 == null ? 0 : jsonArray3.f18186a.hashCode())) * 31;
        JsonArray jsonArray4 = this.e;
        return iHashCode4 + (jsonArray4 != null ? jsonArray4.f18186a.hashCode() : 0);
    }

    public final String toString() {
        return "BookingHistoryDataApiModel(configuration=" + this.f2745a + ", passes=" + this.b + ", recentTransactions=" + this.c + ", rides=" + this.d + ", ticket=" + this.e + ")";
    }
}
