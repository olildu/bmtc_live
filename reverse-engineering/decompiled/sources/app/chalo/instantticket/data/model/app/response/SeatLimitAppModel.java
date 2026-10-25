package app.chalo.instantticket.data.model.app.response;

import defpackage.pk0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/model/app/response/SeatLimitAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SeatLimitAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3893a;
    public final int b;

    public SeatLimitAppModel(int i, int i2) {
        this.f3893a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeatLimitAppModel)) {
            return false;
        }
        SeatLimitAppModel seatLimitAppModel = (SeatLimitAppModel) obj;
        return this.f3893a == seatLimitAppModel.f3893a && this.b == seatLimitAppModel.b;
    }

    public final int hashCode() {
        return (this.f3893a * 31) + this.b;
    }

    public final String toString() {
        return pk0.f(this.f3893a, this.b, "SeatLimitAppModel(minCount=", ", maxCount=", ")");
    }
}
