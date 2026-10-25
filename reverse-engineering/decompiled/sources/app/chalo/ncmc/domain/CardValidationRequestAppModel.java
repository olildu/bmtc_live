package app.chalo.ncmc.domain;

import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/CardValidationRequestAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CardValidationRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6219a;
    public final String b;
    public final String c;
    public final int d;

    public CardValidationRequestAppModel(String cityId, String cardNumber, String agency, int i) {
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(cardNumber, "cardNumber");
        Intrinsics.i(agency, "agency");
        this.f6219a = cityId;
        this.b = cardNumber;
        this.c = agency;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardValidationRequestAppModel)) {
            return false;
        }
        CardValidationRequestAppModel cardValidationRequestAppModel = (CardValidationRequestAppModel) obj;
        return Intrinsics.d(this.f6219a, cardValidationRequestAppModel.f6219a) && Intrinsics.d(this.b, cardValidationRequestAppModel.b) && Intrinsics.d(this.c, cardValidationRequestAppModel.c) && this.d == cardValidationRequestAppModel.d;
    }

    public final int hashCode() {
        return ((nf1.e(nf1.e(this.f6219a.hashCode() * 31, 31, this.b), 31, this.c) + this.d) * 31) + 1450575459;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("CardValidationRequestAppModel(cityId=", this.f6219a, ", cardNumber=", this.b, ", agency=");
        sbE.append(this.c);
        sbE.append(", appVersion=");
        sbE.append(this.d);
        sbE.append(", deviceId=123456)");
        return sbE.toString();
    }
}
