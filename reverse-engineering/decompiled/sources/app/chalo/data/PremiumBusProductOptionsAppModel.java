package app.chalo.data;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/data/PremiumBusProductOptionsAppModel;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusProductOptionsAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumReserveTicketOptionAction f2387a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final ProductModificationSubtextColour h;
    public final PremiumBusProductModificationAdditionalInfoAppModel i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/PremiumBusProductOptionsAppModel$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public PremiumBusProductOptionsAppModel(PremiumReserveTicketOptionAction premiumReserveTicketOptionAction, String str, String actionName, String str2, boolean z, String str3, String str4, ProductModificationSubtextColour actionSubtextColour, PremiumBusProductModificationAdditionalInfoAppModel premiumBusProductModificationAdditionalInfoAppModel) {
        Intrinsics.i(actionName, "actionName");
        Intrinsics.i(actionSubtextColour, "actionSubtextColour");
        this.f2387a = premiumReserveTicketOptionAction;
        this.b = str;
        this.c = actionName;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = str4;
        this.h = actionSubtextColour;
        this.i = premiumBusProductModificationAdditionalInfoAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusProductOptionsAppModel)) {
            return false;
        }
        PremiumBusProductOptionsAppModel premiumBusProductOptionsAppModel = (PremiumBusProductOptionsAppModel) obj;
        return this.f2387a == premiumBusProductOptionsAppModel.f2387a && Intrinsics.d(this.b, premiumBusProductOptionsAppModel.b) && Intrinsics.d(this.c, premiumBusProductOptionsAppModel.c) && Intrinsics.d(this.d, premiumBusProductOptionsAppModel.d) && this.e == premiumBusProductOptionsAppModel.e && Intrinsics.d(this.f, premiumBusProductOptionsAppModel.f) && Intrinsics.d(this.g, premiumBusProductOptionsAppModel.g) && this.h == premiumBusProductOptionsAppModel.h && Intrinsics.d(this.i, premiumBusProductOptionsAppModel.i);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f2387a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (((iE + (str == null ? 0 : str.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode3 = (this.h.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        PremiumBusProductModificationAdditionalInfoAppModel premiumBusProductModificationAdditionalInfoAppModel = this.i;
        return iHashCode3 + (premiumBusProductModificationAdditionalInfoAppModel != null ? premiumBusProductModificationAdditionalInfoAppModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumBusProductOptionsAppModel(actionId=");
        sb.append(this.f2387a);
        sb.append(", iconUrl=");
        sb.append(this.b);
        sb.append(", actionName=");
        cb0.t(sb, this.c, ", actionSubText=", this.d, ", isActive=");
        pk0.x(", inactiveReason=", this.f, ", contactNumber=", sb, this.e);
        sb.append(this.g);
        sb.append(", actionSubtextColour=");
        sb.append(this.h);
        sb.append(", additionalInfo=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
