package app.chalo.data;

import defpackage.dd;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/PremiumBusProductModificationAdditionalInfoAppModel;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusProductModificationAdditionalInfoAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2384a;
    public final String b;
    public final String c;
    public final PremiumProductionModificationAdditionalInfoCtaActionType d;
    public final String e;
    public final String f;

    public PremiumBusProductModificationAdditionalInfoAppModel(String str, String str2, String str3, PremiumProductionModificationAdditionalInfoCtaActionType premiumProductionModificationAdditionalInfoCtaActionType, String str4, String str5) {
        this.f2384a = str;
        this.b = str2;
        this.c = str3;
        this.d = premiumProductionModificationAdditionalInfoCtaActionType;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusProductModificationAdditionalInfoAppModel)) {
            return false;
        }
        PremiumBusProductModificationAdditionalInfoAppModel premiumBusProductModificationAdditionalInfoAppModel = (PremiumBusProductModificationAdditionalInfoAppModel) obj;
        return Intrinsics.d(this.f2384a, premiumBusProductModificationAdditionalInfoAppModel.f2384a) && Intrinsics.d(this.b, premiumBusProductModificationAdditionalInfoAppModel.b) && Intrinsics.d(this.c, premiumBusProductModificationAdditionalInfoAppModel.c) && this.d == premiumBusProductModificationAdditionalInfoAppModel.d && Intrinsics.d(this.e, premiumBusProductModificationAdditionalInfoAppModel.e) && Intrinsics.d(this.f, premiumBusProductModificationAdditionalInfoAppModel.f);
    }

    public final int hashCode() {
        String str = this.f2384a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PremiumProductionModificationAdditionalInfoCtaActionType premiumProductionModificationAdditionalInfoCtaActionType = this.d;
        int iHashCode4 = (iHashCode3 + (premiumProductionModificationAdditionalInfoCtaActionType == null ? 0 : premiumProductionModificationAdditionalInfoCtaActionType.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumBusProductModificationAdditionalInfoAppModel(actionHeader=", this.f2384a, ", text=", this.b, ", ctaText=");
        sbE.append(this.c);
        sbE.append(", ctaActionType=");
        sbE.append(this.d);
        sbE.append(", contactNumber=");
        return r30.i(sbE, this.e, ", actionConfirmationMessage=", this.f, ")");
    }
}
