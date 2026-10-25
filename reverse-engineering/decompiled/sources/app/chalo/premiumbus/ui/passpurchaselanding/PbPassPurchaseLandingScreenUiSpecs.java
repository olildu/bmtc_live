package app.chalo.premiumbus.ui.passpurchaselanding;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.bottomsheet.BottomSheetUiSpec;
import app.chalo.uistate.divider.DividerUIState;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenUiSpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PbPassPurchaseLandingScreenUiSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7673a;
    public final ChaloPadding b;
    public final DividerUIState c;
    public final DividerUIState d;
    public final BottomSheetUiSpec e;
    public final ChaloColorToken f;

    public PbPassPurchaseLandingScreenUiSpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(f2, f2, f2, f2);
        float f3 = ChaloThemeHelper.a().f;
        ChaloColorToken.SectionDividerColor sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
        DividerUIState dividerUIState = new DividerUIState(f3, sectionDividerColor, null, 4);
        DividerUIState dividerUIState2 = new DividerUIState(ChaloThemeHelper.a().u, sectionDividerColor, null, 4);
        BottomSheetUiSpec bottomSheetUiSpec = new BottomSheetUiSpec(null, 15);
        this.f7673a = chaloPadding;
        this.b = chaloPadding2;
        this.c = dividerUIState;
        this.d = dividerUIState2;
        this.e = bottomSheetUiSpec;
        this.f = ChaloColorToken.White.f9870a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PbPassPurchaseLandingScreenUiSpecs)) {
            return false;
        }
        PbPassPurchaseLandingScreenUiSpecs pbPassPurchaseLandingScreenUiSpecs = (PbPassPurchaseLandingScreenUiSpecs) obj;
        return Intrinsics.d(this.f7673a, pbPassPurchaseLandingScreenUiSpecs.f7673a) && Intrinsics.d(this.b, pbPassPurchaseLandingScreenUiSpecs.b) && Intrinsics.d(this.c, pbPassPurchaseLandingScreenUiSpecs.c) && Intrinsics.d(this.d, pbPassPurchaseLandingScreenUiSpecs.d) && Intrinsics.d(this.e, pbPassPurchaseLandingScreenUiSpecs.e) && Intrinsics.d(this.f, pbPassPurchaseLandingScreenUiSpecs.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + py.c(this.d, py.c(this.c, r30.c(this.b, this.f7673a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = pk0.m("PbPassPurchaseLandingScreenUiSpecs(toolBarPadding=", this.f7673a, ", contentPadding=", this.b, ", dividerUiState=");
        sbM.append(this.c);
        sbM.append(", bottomDividerUiState=");
        sbM.append(this.d);
        sbM.append(", bottomSheetUIState=");
        sbM.append(this.e);
        sbM.append(", backgroundColorToken=");
        sbM.append(this.f);
        sbM.append(")");
        return sbM.toString();
    }
}
