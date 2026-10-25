package app.chalo.uistate.textField;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/textField/TextFieldWithErrorUISpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TextFieldWithErrorUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BorderUISpec f10108a;
    public final ChaloPadding b;
    public final ChaloPadding c;

    public TextFieldWithErrorUISpec(BorderUISpec borderSpec, ChaloPadding boxPadding, ChaloPadding errorTextPadding) {
        Intrinsics.i(borderSpec, "borderSpec");
        Intrinsics.i(boxPadding, "boxPadding");
        Intrinsics.i(errorTextPadding, "errorTextPadding");
        this.f10108a = borderSpec;
        this.b = boxPadding;
        this.c = errorTextPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldWithErrorUISpec)) {
            return false;
        }
        TextFieldWithErrorUISpec textFieldWithErrorUISpec = (TextFieldWithErrorUISpec) obj;
        return Intrinsics.d(this.f10108a, textFieldWithErrorUISpec.f10108a) && Intrinsics.d(this.b, textFieldWithErrorUISpec.b) && Intrinsics.d(this.c, textFieldWithErrorUISpec.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.c(this.b, this.f10108a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFieldWithErrorUISpec(borderSpec=");
        sb.append(this.f10108a);
        sb.append(", boxPadding=");
        sb.append(this.b);
        sb.append(", errorTextPadding=");
        return py.e(sb, this.c, ")");
    }

    public TextFieldWithErrorUISpec(BorderUISpec borderUISpec, ChaloPadding chaloPadding, int i) {
        borderUISpec = (i & 1) != 0 ? new BorderUISpec(ChaloThemeHelper.a().b, ChaloColorToken.ShadyGray.f9851a, UIShape.e) : borderUISpec;
        if ((i & 2) != 0) {
            float f = ChaloThemeHelper.a().h;
            float f2 = ChaloThemeHelper.a().f;
            chaloPadding = new ChaloPadding(f2, f, f, f2);
        }
        this(borderUISpec, chaloPadding, new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 0.0f, 0.0f, 14));
    }
}
