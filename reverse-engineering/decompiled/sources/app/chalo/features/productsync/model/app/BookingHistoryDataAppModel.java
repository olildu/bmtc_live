package app.chalo.features.productsync.model.app;

import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/productsync/model/app/BookingHistoryDataAppModel;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BookingHistoryDataAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonArray f2752a;
    public final JsonArray b;
    public final JsonArray c;
    public final JsonArray d;
    public final JsonArray e;
    public final JsonObject f;
    public final JsonArray g;
    public final JsonArray h;

    public BookingHistoryDataAppModel(JsonArray jsonArray, JsonArray jsonArray2, JsonArray jsonArray3, JsonArray jsonArray4, JsonArray jsonArray5, JsonObject jsonObject, JsonArray jsonArray6, JsonArray jsonArray7) {
        this.f2752a = jsonArray;
        this.b = jsonArray2;
        this.c = jsonArray3;
        this.d = jsonArray4;
        this.e = jsonArray5;
        this.f = jsonObject;
        this.g = jsonArray6;
        this.h = jsonArray7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingHistoryDataAppModel)) {
            return false;
        }
        BookingHistoryDataAppModel bookingHistoryDataAppModel = (BookingHistoryDataAppModel) obj;
        return Intrinsics.d(this.f2752a, bookingHistoryDataAppModel.f2752a) && Intrinsics.d(this.b, bookingHistoryDataAppModel.b) && Intrinsics.d(this.c, bookingHistoryDataAppModel.c) && Intrinsics.d(this.d, bookingHistoryDataAppModel.d) && Intrinsics.d(this.e, bookingHistoryDataAppModel.e) && Intrinsics.d(this.f, bookingHistoryDataAppModel.f) && Intrinsics.d(this.g, bookingHistoryDataAppModel.g) && Intrinsics.d(this.h, bookingHistoryDataAppModel.h);
    }

    public final int hashCode() {
        int iB = r30.b(r30.b(r30.b(r30.b(this.f2752a.f18186a.hashCode() * 31, 31, this.b.f18186a), 31, this.c.f18186a), 31, this.d.f18186a), 31, this.e.f18186a);
        JsonObject jsonObject = this.f;
        int iHashCode = (iB + (jsonObject == null ? 0 : jsonObject.f18198a.hashCode())) * 31;
        JsonArray jsonArray = this.g;
        return this.h.f18186a.hashCode() + ((iHashCode + (jsonArray != null ? jsonArray.f18186a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BookingHistoryDataAppModel(bookedPassesArray=" + this.f2752a + ", passApplicationsArray=" + this.b + ", pendingSuperPassesArray=" + this.c + ", mobileTicketsArray=" + this.d + ", bookedRidesArray=" + this.e + ", configuration=" + this.f + ", recentTransactions=" + this.g + ", singleJourneyTickets=" + this.h + ")";
    }
}
