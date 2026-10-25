package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.card.CardUISpec;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/ValidationBottomCtaContainerSpec;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ValidationBottomCtaContainerSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10742a;
    public final CardUISpec b;
    public final ChaloColorToken c;
    public final float d;

    public ValidationBottomCtaContainerSpec() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        CardUISpec cardUISpec = new CardUISpec(null, ChaloThemeHelper.a().f1916a, ChaloThemeHelper.a().f, 1);
        float f2 = ChaloThemeHelper.a().g;
        this.f10742a = chaloPadding;
        this.b = cardUISpec;
        this.c = ChaloColorToken.White.f9870a;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidationBottomCtaContainerSpec)) {
            return false;
        }
        ValidationBottomCtaContainerSpec validationBottomCtaContainerSpec = (ValidationBottomCtaContainerSpec) obj;
        return Intrinsics.d(this.f10742a, validationBottomCtaContainerSpec.f10742a) && Intrinsics.d(this.b, validationBottomCtaContainerSpec.b) && Intrinsics.d(this.c, validationBottomCtaContainerSpec.c) && Dp.m7283equalsimpl0(this.d, validationBottomCtaContainerSpec.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + z40.b(this.c, (this.b.hashCode() + (this.f10742a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ValidationBottomCtaContainerSpec(contentPadding=" + this.f10742a + ", cardSpec=" + this.b + ", backgroundColor=" + this.c + ", validationNoteAndButtonSpacing=" + Dp.m7289toStringimpl(this.d) + ")";
    }
}
