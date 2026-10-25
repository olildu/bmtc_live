package app.chalo.validationsdk.vehiclebasedvalidation.data.models.app;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/data/models/app/VehicleValidationRequestAppModel;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VehicleValidationRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10710a;
    public final String b;

    public VehicleValidationRequestAppModel(String str, String bookingId) {
        Intrinsics.i(bookingId, "bookingId");
        this.f10710a = str;
        this.b = bookingId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VehicleValidationRequestAppModel)) {
            return false;
        }
        VehicleValidationRequestAppModel vehicleValidationRequestAppModel = (VehicleValidationRequestAppModel) obj;
        return Intrinsics.d(this.f10710a, vehicleValidationRequestAppModel.f10710a) && Intrinsics.d(this.b, vehicleValidationRequestAppModel.b);
    }

    public final int hashCode() {
        String str = this.f10710a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return vo1.o("VehicleValidationRequestAppModel(vehicleNumber=", this.f10710a, ", bookingId=", this.b, ")");
    }
}
