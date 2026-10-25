package app.chalo.titoridedetail.data.app;

import app.chalo.models.validation.ValidationProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TitoRideDataAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TitoRideDataAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TITOValidationAppModel f9677a;
    public final TitoRouteData b;
    public final TitoVehicleAndEtaData c;

    static {
        ValidationProduct.Companion companion = ValidationProduct.INSTANCE;
    }

    public TitoRideDataAppModel(TITOValidationAppModel tITOValidationAppModel, TitoRouteData titoRouteData, TitoVehicleAndEtaData titoVehicleAndEtaData) {
        Intrinsics.i(titoRouteData, "titoRouteData");
        Intrinsics.i(titoVehicleAndEtaData, "titoVehicleAndEtaData");
        this.f9677a = tITOValidationAppModel;
        this.b = titoRouteData;
        this.c = titoVehicleAndEtaData;
    }

    public static TitoRideDataAppModel a(TitoRideDataAppModel titoRideDataAppModel, TITOValidationAppModel tITOValidationAppModel, TitoRouteData titoRouteData, TitoVehicleAndEtaData titoVehicleAndEtaData, int i) {
        if ((i & 1) != 0) {
            tITOValidationAppModel = titoRideDataAppModel.f9677a;
        }
        if ((i & 2) != 0) {
            titoRouteData = titoRideDataAppModel.b;
        }
        if ((i & 4) != 0) {
            titoVehicleAndEtaData = titoRideDataAppModel.c;
        }
        Intrinsics.i(titoRouteData, "titoRouteData");
        Intrinsics.i(titoVehicleAndEtaData, "titoVehicleAndEtaData");
        return new TitoRideDataAppModel(tITOValidationAppModel, titoRouteData, titoVehicleAndEtaData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitoRideDataAppModel)) {
            return false;
        }
        TitoRideDataAppModel titoRideDataAppModel = (TitoRideDataAppModel) obj;
        return Intrinsics.d(this.f9677a, titoRideDataAppModel.f9677a) && Intrinsics.d(this.b, titoRideDataAppModel.b) && Intrinsics.d(this.c, titoRideDataAppModel.c);
    }

    public final int hashCode() {
        TITOValidationAppModel tITOValidationAppModel = this.f9677a;
        return this.c.hashCode() + ((this.b.hashCode() + ((tITOValidationAppModel == null ? 0 : tITOValidationAppModel.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "TitoRideDataAppModel(titoValidationAppModel=" + this.f9677a + ", titoRouteData=" + this.b + ", titoVehicleAndEtaData=" + this.c + ")";
    }
}
