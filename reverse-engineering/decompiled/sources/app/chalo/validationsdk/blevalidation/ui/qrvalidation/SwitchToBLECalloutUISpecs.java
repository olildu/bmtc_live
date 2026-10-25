package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/SwitchToBLECalloutUISpecs;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SwitchToBLECalloutUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10655a;
    public final UiAlignment.Vertical b;
    public final ChaloColorToken c;
    public final UIShape d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public SwitchToBLECalloutUISpecs() {
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().e0;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f, f, f2);
        UIShape.Rectangle backgroundShape = UIShape.e;
        Intrinsics.i(backgroundShape, "backgroundShape");
        this.f10655a = chaloPadding;
        this.b = UiAlignment.Vertical.Center.f9888a;
        this.c = ChaloColorToken.LightGray.f9814a;
        this.d = backgroundShape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitchToBLECalloutUISpecs)) {
            return false;
        }
        SwitchToBLECalloutUISpecs switchToBLECalloutUISpecs = (SwitchToBLECalloutUISpecs) obj;
        return Intrinsics.d(this.f10655a, switchToBLECalloutUISpecs.f10655a) && Intrinsics.d(this.b, switchToBLECalloutUISpecs.b) && Intrinsics.d(this.c, switchToBLECalloutUISpecs.c) && Intrinsics.d(this.d, switchToBLECalloutUISpecs.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z40.b(this.c, uf0.e(this.b, this.f10655a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "SwitchToBLECalloutUISpecs(contentPadding=" + this.f10655a + ", verticalAlignment=" + this.b + ", backgroundColor=" + this.c + ", backgroundShape=" + this.d + ")";
    }
}
