package app.chalo.features.productsync.model.app;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/productsync/model/app/HistoryResponseAppModel;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HistoryResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PropertiesAppModel f2753a;
    public final BookingHistoryDataAppModel b;
    public final String c;

    public HistoryResponseAppModel(PropertiesAppModel propertiesAppModel, BookingHistoryDataAppModel bookingHistoryDataAppModel, String userId) {
        Intrinsics.i(userId, "userId");
        this.f2753a = propertiesAppModel;
        this.b = bookingHistoryDataAppModel;
        this.c = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryResponseAppModel)) {
            return false;
        }
        HistoryResponseAppModel historyResponseAppModel = (HistoryResponseAppModel) obj;
        return Intrinsics.d(this.f2753a, historyResponseAppModel.f2753a) && Intrinsics.d(this.b, historyResponseAppModel.b) && Intrinsics.d(this.c, historyResponseAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f2753a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryResponseAppModel(properties=");
        sb.append(this.f2753a);
        sb.append(", bookingHistoryDataAppModel=");
        sb.append(this.b);
        sb.append(", userId=");
        return vo1.p(sb, this.c, ")");
    }
}
