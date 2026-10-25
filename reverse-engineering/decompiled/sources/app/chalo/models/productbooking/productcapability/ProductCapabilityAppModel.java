package app.chalo.models.productbooking.productcapability;

import defpackage.xs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/models/productbooking/productcapability/ProductCapabilityAppModel;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductCapabilityAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5677a;
    public final BookingSupportAppModel b;
    public final BookingFlowType c;
    public final ArrayList d;
    public final OperationalHoursAppModel e;

    public ProductCapabilityAppModel(boolean z, BookingSupportAppModel bookingSupportAppModel, BookingFlowType bookingFlowType, ArrayList arrayList, OperationalHoursAppModel operationalHoursAppModel) {
        this.f5677a = z;
        this.b = bookingSupportAppModel;
        this.c = bookingFlowType;
        this.d = arrayList;
        this.e = operationalHoursAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCapabilityAppModel)) {
            return false;
        }
        ProductCapabilityAppModel productCapabilityAppModel = (ProductCapabilityAppModel) obj;
        return this.f5677a == productCapabilityAppModel.f5677a && Intrinsics.d(this.b, productCapabilityAppModel.b) && this.c == productCapabilityAppModel.c && this.d.equals(productCapabilityAppModel.d) && Intrinsics.d(this.e, productCapabilityAppModel.e);
    }

    public final int hashCode() {
        int i = (this.f5677a ? 1231 : 1237) * 31;
        BookingSupportAppModel bookingSupportAppModel = this.b;
        int iHashCode = (i + (bookingSupportAppModel == null ? 0 : bookingSupportAppModel.hashCode())) * 31;
        BookingFlowType bookingFlowType = this.c;
        int iE = xs.e(this.d, (iHashCode + (bookingFlowType == null ? 0 : bookingFlowType.hashCode())) * 31, 31);
        OperationalHoursAppModel operationalHoursAppModel = this.e;
        return iE + (operationalHoursAppModel != null ? operationalHoursAppModel.hashCode() : 0);
    }

    public final String toString() {
        return "ProductCapabilityAppModel(isJourneyApplicable=" + this.f5677a + ", bookingSupportAppModel=" + this.b + ", bookingFlowType=" + this.c + ", validationTypes=" + this.d + ", operationalHoursAppModel=" + this.e + ")";
    }
}
