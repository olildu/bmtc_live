package app.chalo.multimodalticket.data.model.app;

import app.chalo.data.ProductBookingBranding;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/GroupTicketSelectableStepAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketSelectableStepAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5864a;
    public final int b;
    public final GroupTicketSelectableStepLegDetails c;
    public final ProductBookingBranding d;

    static {
        ProductBookingBranding.Companion companion = ProductBookingBranding.INSTANCE;
    }

    public GroupTicketSelectableStepAppModel(int i, int i2, GroupTicketSelectableStepLegDetails legDetails, ProductBookingBranding brandingType) {
        Intrinsics.i(legDetails, "legDetails");
        Intrinsics.i(brandingType, "brandingType");
        this.f5864a = i;
        this.b = i2;
        this.c = legDetails;
        this.d = brandingType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketSelectableStepAppModel)) {
            return false;
        }
        GroupTicketSelectableStepAppModel groupTicketSelectableStepAppModel = (GroupTicketSelectableStepAppModel) obj;
        return this.f5864a == groupTicketSelectableStepAppModel.f5864a && this.b == groupTicketSelectableStepAppModel.b && Intrinsics.d(this.c, groupTicketSelectableStepAppModel.c) && Intrinsics.d(this.d, groupTicketSelectableStepAppModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (((this.f5864a * 31) + this.b) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbS = uf0.s(this.f5864a, this.b, "GroupTicketSelectableStepAppModel(stepSequence=", ", displayIndex=", ", legDetails=");
        sbS.append(this.c);
        sbS.append(", brandingType=");
        sbS.append(this.d);
        sbS.append(")");
        return sbS.toString();
    }

    public /* synthetic */ GroupTicketSelectableStepAppModel(int i, int i2, GroupTicketSelectableStepLegDetails groupTicketSelectableStepLegDetails) {
        this(i, i2, groupTicketSelectableStepLegDetails, ProductBookingBranding.None.INSTANCE);
    }
}
