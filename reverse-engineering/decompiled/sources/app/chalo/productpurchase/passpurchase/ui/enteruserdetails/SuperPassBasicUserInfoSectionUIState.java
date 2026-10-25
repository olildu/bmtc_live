package app.chalo.productpurchase.passpurchase.ui.enteruserdetails;

import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassBasicUserInfoSectionUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassBasicUserInfoSectionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState f8411a;
    public final TextUIState b;
    public final List c;
    public final DividerUIState d;
    public final SuperPassBasicUserInfoSectionUISpec e;

    public SuperPassBasicUserInfoSectionUIState(TextUIState textUIState, TextUIState textUIState2, List fields, DividerUIState dividerUIState, int i) {
        dividerUIState = (i & 16) != 0 ? null : dividerUIState;
        SuperPassBasicUserInfoSectionUISpec superPassBasicUserInfoSectionUISpec = new SuperPassBasicUserInfoSectionUISpec();
        Intrinsics.i(fields, "fields");
        this.f8411a = textUIState;
        this.b = textUIState2;
        this.c = fields;
        this.d = dividerUIState;
        this.e = superPassBasicUserInfoSectionUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassBasicUserInfoSectionUIState)) {
            return false;
        }
        SuperPassBasicUserInfoSectionUIState superPassBasicUserInfoSectionUIState = (SuperPassBasicUserInfoSectionUIState) obj;
        return Intrinsics.d(this.f8411a, superPassBasicUserInfoSectionUIState.f8411a) && Intrinsics.d(this.b, superPassBasicUserInfoSectionUIState.b) && Intrinsics.d(this.c, superPassBasicUserInfoSectionUIState.c) && Intrinsics.d(this.d, superPassBasicUserInfoSectionUIState.d) && Intrinsics.d(this.e, superPassBasicUserInfoSectionUIState.e);
    }

    public final int hashCode() {
        TextUIState textUIState = this.f8411a;
        int iHashCode = (textUIState == null ? 0 : textUIState.hashCode()) * 31;
        TextUIState textUIState2 = this.b;
        int iB = r30.b((iHashCode + (textUIState2 == null ? 0 : textUIState2.hashCode())) * 961, 31, this.c);
        DividerUIState dividerUIState = this.d;
        return this.e.hashCode() + ((iB + (dividerUIState != null ? dividerUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SuperPassBasicUserInfoSectionUIState(header=" + this.f8411a + ", description=" + this.b + ", detailsNote=null, fields=" + this.c + ", sectionEndDivider=" + this.d + ", spec=" + this.e + ")";
    }
}
