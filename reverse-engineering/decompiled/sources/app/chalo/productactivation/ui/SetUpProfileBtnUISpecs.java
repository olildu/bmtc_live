package app.chalo.productactivation.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/SetUpProfileBtnUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SetUpProfileBtnUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8046a;
    public final ChaloColorToken b;
    public final UIShape c;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public SetUpProfileBtnUISpecs() {
        float f = ChaloThemeHelper.a().d;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        UIShape.Rectangle backgroundShape = UIShape.c;
        Intrinsics.i(backgroundShape, "backgroundShape");
        this.f8046a = chaloPadding;
        this.b = ChaloColorToken.OrangePrimary.f9835a;
        this.c = backgroundShape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetUpProfileBtnUISpecs)) {
            return false;
        }
        SetUpProfileBtnUISpecs setUpProfileBtnUISpecs = (SetUpProfileBtnUISpecs) obj;
        return Intrinsics.d(this.f8046a, setUpProfileBtnUISpecs.f8046a) && Intrinsics.d(this.b, setUpProfileBtnUISpecs.b) && Intrinsics.d(this.c, setUpProfileBtnUISpecs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z40.b(this.b, this.f8046a.hashCode() * 31, 31);
    }

    public final String toString() {
        return gf.j(gf.l(this.f8046a, this.b, "SetUpProfileBtnUISpecs(contentPadding=", ", backgroundColor=", ", backgroundShape="), this.c, ")");
    }
}
