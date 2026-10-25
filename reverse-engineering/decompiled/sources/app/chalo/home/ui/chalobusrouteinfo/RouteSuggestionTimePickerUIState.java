package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.ab;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/RouteSuggestionTimePickerUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteSuggestionTimePickerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouteSuggestionTimePickerUISpec f3373a;
    public final int b;
    public final int c;
    public final String d;
    public final TextUIState.ChaloTextUIState e;
    public final ImageUIState f;
    public final ButtonUIState g;
    public final ButtonUIState h;
    public final ab i;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public RouteSuggestionTimePickerUIState(int i, int i2, String initialSelectedAmOrPm, TextUIState.ChaloTextUIState title, ImageUIState cancelIcon, ButtonUIState buttonUIState, ButtonUIState cancelBtn, ab abVar) {
        RouteSuggestionTimePickerUISpec routeSuggestionTimePickerUISpec = new RouteSuggestionTimePickerUISpec();
        Intrinsics.i(initialSelectedAmOrPm, "initialSelectedAmOrPm");
        Intrinsics.i(title, "title");
        Intrinsics.i(cancelIcon, "cancelIcon");
        Intrinsics.i(cancelBtn, "cancelBtn");
        this.f3373a = routeSuggestionTimePickerUISpec;
        this.b = i;
        this.c = i2;
        this.d = initialSelectedAmOrPm;
        this.e = title;
        this.f = cancelIcon;
        this.g = buttonUIState;
        this.h = cancelBtn;
        this.i = abVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteSuggestionTimePickerUIState)) {
            return false;
        }
        RouteSuggestionTimePickerUIState routeSuggestionTimePickerUIState = (RouteSuggestionTimePickerUIState) obj;
        return Intrinsics.d(this.f3373a, routeSuggestionTimePickerUIState.f3373a) && this.b == routeSuggestionTimePickerUIState.b && this.c == routeSuggestionTimePickerUIState.c && Intrinsics.d(this.d, routeSuggestionTimePickerUIState.d) && Intrinsics.d(this.e, routeSuggestionTimePickerUIState.e) && Intrinsics.d(this.f, routeSuggestionTimePickerUIState.f) && Intrinsics.d(this.g, routeSuggestionTimePickerUIState.g) && Intrinsics.d(this.h, routeSuggestionTimePickerUIState.h) && Intrinsics.d(this.i, routeSuggestionTimePickerUIState.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + r30.d(this.h, r30.d(this.g, r30.e(this.f, r30.f(this.e, nf1.e(((((this.f3373a.hashCode() * 31) + this.b) * 31) + this.c) * 31, 31, this.d), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteSuggestionTimePickerUIState(specs=");
        sb.append(this.f3373a);
        sb.append(", initialSelectedHour=");
        sb.append(this.b);
        sb.append(", initialSelectedMinute=");
        pk0.t(this.c, ", initialSelectedAmOrPm=", this.d, ", title=", sb);
        sb.append(this.e);
        sb.append(", cancelIcon=");
        sb.append(this.f);
        sb.append(", continueBtn=");
        sb.append(this.g);
        sb.append(", cancelBtn=");
        sb.append(this.h);
        sb.append(", onTimeSelected=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
