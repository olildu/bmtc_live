package app.chalo.productpurchase.passpurchase.ui.enteruserdetails;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.card.CardUISpec;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassEnterUserDetailsUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8426a;
    public final ChaloPadding b;
    public final CardUISpec c;
    public final ChaloPadding d;

    public SuperPassEnterUserDetailsUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().i, 1);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        CardUISpec cardUISpec = new CardUISpec(UIShape.f1926a, ChaloThemeHelper.a().f1916a, ChaloThemeHelper.a().f);
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding3 = new ChaloPadding(f, f, f, f);
        this.f8426a = chaloPadding;
        this.b = chaloPadding2;
        this.c = cardUISpec;
        this.d = chaloPadding3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassEnterUserDetailsUISpecs)) {
            return false;
        }
        SuperPassEnterUserDetailsUISpecs superPassEnterUserDetailsUISpecs = (SuperPassEnterUserDetailsUISpecs) obj;
        return Intrinsics.d(this.f8426a, superPassEnterUserDetailsUISpecs.f8426a) && Intrinsics.d(this.b, superPassEnterUserDetailsUISpecs.b) && Intrinsics.d(this.c, superPassEnterUserDetailsUISpecs.c) && Intrinsics.d(this.d, superPassEnterUserDetailsUISpecs.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + r30.c(this.b, this.f8426a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = pk0.m("SuperPassEnterUserDetailsUISpecs(paddingAround=", this.f8426a, ", paddingAroundItems=", this.b, ", nextBtnCardSpec=");
        sbM.append(this.c);
        sbM.append(", paddingAroundBtn=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}
