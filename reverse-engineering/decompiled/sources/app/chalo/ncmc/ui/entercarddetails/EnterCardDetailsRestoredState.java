package app.chalo.ncmc.ui.entercarddetails;

import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel;
import defpackage.b3;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsRestoredState;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class EnterCardDetailsRestoredState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloCardRechargeConfigAppModel f6332a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsRestoredState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsRestoredState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<EnterCardDetailsRestoredState> serializer() {
            return EnterCardDetailsRestoredState$$serializer.f6333a;
        }
    }

    public /* synthetic */ EnterCardDetailsRestoredState(int i, int i2, ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        if ((i & 1) == 0) {
            this.f6332a = null;
        } else {
            this.f6332a = chaloCardRechargeConfigAppModel;
        }
        this.b = (i & 2) == 0 ? 16 : i2;
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z2;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterCardDetailsRestoredState)) {
            return false;
        }
        EnterCardDetailsRestoredState enterCardDetailsRestoredState = (EnterCardDetailsRestoredState) obj;
        return Intrinsics.d(this.f6332a, enterCardDetailsRestoredState.f6332a) && this.b == enterCardDetailsRestoredState.b && Intrinsics.d(this.c, enterCardDetailsRestoredState.c) && Intrinsics.d(this.d, enterCardDetailsRestoredState.d) && Intrinsics.d(this.e, enterCardDetailsRestoredState.e) && this.f == enterCardDetailsRestoredState.f && this.g == enterCardDetailsRestoredState.g && Intrinsics.d(this.h, enterCardDetailsRestoredState.h) && this.i == enterCardDetailsRestoredState.i;
    }

    public final int hashCode() {
        ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel = this.f6332a;
        int iE = nf1.e(nf1.e((((chaloCardRechargeConfigAppModel == null ? 0 : chaloCardRechargeConfigAppModel.hashCode()) * 31) + this.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return nf1.e((((((iE + (str != null ? str.hashCode() : 0)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31, 31, this.h) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EnterCardDetailsRestoredState(chaloCardRechargeConfigAppModel=");
        sb.append(this.f6332a);
        sb.append(", maxDigitsAllowed=");
        sb.append(this.b);
        sb.append(", currentEnteredCardNumber=");
        cb0.t(sb, this.c, ", currentEnteredReEnterCardNumber=", this.d, ", cardNumberValidationError=");
        t10.s(this.e, ", isProceedBtnEnabled=", ", isReEnterCardNumberFieldEnabled=", sb, this.f);
        pk0.x(", cardNumberToLink=", this.h, ", showCardLinkBottomSheet=", sb, this.g);
        return b3.g(")", sb, this.i);
    }

    public EnterCardDetailsRestoredState(ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel, int i, String currentEnteredCardNumber, String currentEnteredReEnterCardNumber, String str, boolean z, boolean z2, String cardNumberToLink, boolean z3) {
        Intrinsics.i(currentEnteredCardNumber, "currentEnteredCardNumber");
        Intrinsics.i(currentEnteredReEnterCardNumber, "currentEnteredReEnterCardNumber");
        Intrinsics.i(cardNumberToLink, "cardNumberToLink");
        this.f6332a = chaloCardRechargeConfigAppModel;
        this.b = i;
        this.c = currentEnteredCardNumber;
        this.d = currentEnteredReEnterCardNumber;
        this.e = str;
        this.f = z;
        this.g = z2;
        this.h = cardNumberToLink;
        this.i = z3;
    }
}
