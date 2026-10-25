package app.chalo.ncmc.ui.common;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/common/CardRechargeSuccessScreenUiData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CardRechargeSuccessScreenUiData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6316a;
    public final String b;
    public final List c;
    public final String d;
    public final Function0 e;
    public final String f;
    public final Function0 g;

    public CardRechargeSuccessScreenUiData(String title, String str, List instructions, String positiveButtonText, Function0 onPositiveButtonClick, String str2, Function0 function0) {
        Intrinsics.i(title, "title");
        Intrinsics.i(instructions, "instructions");
        Intrinsics.i(positiveButtonText, "positiveButtonText");
        Intrinsics.i(onPositiveButtonClick, "onPositiveButtonClick");
        this.f6316a = title;
        this.b = str;
        this.c = instructions;
        this.d = positiveButtonText;
        this.e = onPositiveButtonClick;
        this.f = str2;
        this.g = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardRechargeSuccessScreenUiData)) {
            return false;
        }
        CardRechargeSuccessScreenUiData cardRechargeSuccessScreenUiData = (CardRechargeSuccessScreenUiData) obj;
        return Intrinsics.d(this.f6316a, cardRechargeSuccessScreenUiData.f6316a) && Intrinsics.d(this.b, cardRechargeSuccessScreenUiData.b) && Intrinsics.d(this.c, cardRechargeSuccessScreenUiData.c) && Intrinsics.d(this.d, cardRechargeSuccessScreenUiData.d) && Intrinsics.d(this.e, cardRechargeSuccessScreenUiData.e) && Intrinsics.d(this.f, cardRechargeSuccessScreenUiData.f) && Intrinsics.d(this.g, cardRechargeSuccessScreenUiData.g);
    }

    public final int hashCode() {
        int iHashCode = this.f6316a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.e.hashCode() + nf1.e(r30.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d)) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Function0 function0 = this.g;
        return iHashCode3 + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("CardRechargeSuccessScreenUiData(title=", this.f6316a, ", subTitle=", this.b, ", instructions=");
        cb0.s(", positiveButtonText=", this.d, ", onPositiveButtonClick=", sbE, this.c);
        sbE.append(this.e);
        sbE.append(", negativeButtonText=");
        sbE.append(this.f);
        sbE.append(", onNegativeButtonClick=");
        sbE.append(this.g);
        sbE.append(")");
        return sbE.toString();
    }
}
