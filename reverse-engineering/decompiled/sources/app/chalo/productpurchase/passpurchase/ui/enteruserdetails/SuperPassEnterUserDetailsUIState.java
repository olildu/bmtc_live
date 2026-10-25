package app.chalo.productpurchase.passpurchase.ui.enteruserdetails;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.dialog.DatePickerUIState;
import app.chalo.uistate.dialog.GenderSelectionDialogUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassEnterUserDetailsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarUIState f8427a;
    public final List b;
    public final ButtonUIState c;
    public final SuperPassEnterUserDetailsUISpecs d;
    public final GenderSelectionDialogUIState e;
    public final DatePickerUIState f;

    public SuperPassEnterUserDetailsUIState(ToolbarUIState toolbar, List fieldsSection, ButtonUIState nextBtn, GenderSelectionDialogUIState genderSelectionDialogUIState, DatePickerUIState datePickerUIState) {
        SuperPassEnterUserDetailsUISpecs superPassEnterUserDetailsUISpecs = new SuperPassEnterUserDetailsUISpecs();
        Intrinsics.i(toolbar, "toolbar");
        Intrinsics.i(fieldsSection, "fieldsSection");
        Intrinsics.i(nextBtn, "nextBtn");
        this.f8427a = toolbar;
        this.b = fieldsSection;
        this.c = nextBtn;
        this.d = superPassEnterUserDetailsUISpecs;
        this.e = genderSelectionDialogUIState;
        this.f = datePickerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassEnterUserDetailsUIState)) {
            return false;
        }
        SuperPassEnterUserDetailsUIState superPassEnterUserDetailsUIState = (SuperPassEnterUserDetailsUIState) obj;
        return Intrinsics.d(this.f8427a, superPassEnterUserDetailsUIState.f8427a) && Intrinsics.d(this.b, superPassEnterUserDetailsUIState.b) && Intrinsics.d(this.c, superPassEnterUserDetailsUIState.c) && Intrinsics.d(this.d, superPassEnterUserDetailsUIState.d) && Intrinsics.d(this.e, superPassEnterUserDetailsUIState.e) && Intrinsics.d(this.f, superPassEnterUserDetailsUIState.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + r30.d(this.c, r30.b(this.f8427a.hashCode() * 31, 31, this.b), 31)) * 31;
        GenderSelectionDialogUIState genderSelectionDialogUIState = this.e;
        int iHashCode2 = (iHashCode + (genderSelectionDialogUIState == null ? 0 : genderSelectionDialogUIState.hashCode())) * 31;
        DatePickerUIState datePickerUIState = this.f;
        return iHashCode2 + (datePickerUIState != null ? datePickerUIState.hashCode() : 0);
    }

    public final String toString() {
        return "SuperPassEnterUserDetailsUIState(toolbar=" + this.f8427a + ", fieldsSection=" + this.b + ", nextBtn=" + this.c + ", specs=" + this.d + ", genderSelectionDialog=" + this.e + ", datePickerDialog=" + this.f + ")";
    }
}
