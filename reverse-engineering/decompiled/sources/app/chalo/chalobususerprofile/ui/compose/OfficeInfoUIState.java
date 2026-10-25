package app.chalo.chalobususerprofile.ui.compose;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/OfficeInfoUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OfficeInfoUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f1230a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final List f;
    public final UiEventHandler$Companion$fromLambda$1 g;
    public final OfficeInfoComponentSpecs h;

    public OfficeInfoUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState titleUIState, TextUIState textUIState, TextUIState.ChaloTextUIState placeHolderUIState, TextUIState.ChaloTextUIState variabilityTitleUIState, List variabilityOptions, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        OfficeInfoComponentSpecs officeInfoComponentSpecs = new OfficeInfoComponentSpecs();
        Intrinsics.i(titleUIState, "titleUIState");
        Intrinsics.i(placeHolderUIState, "placeHolderUIState");
        Intrinsics.i(variabilityTitleUIState, "variabilityTitleUIState");
        Intrinsics.i(variabilityOptions, "variabilityOptions");
        this.f1230a = imageUIState;
        this.b = titleUIState;
        this.c = textUIState;
        this.d = placeHolderUIState;
        this.e = variabilityTitleUIState;
        this.f = variabilityOptions;
        this.g = uiEventHandler$Companion$fromLambda$1;
        this.h = officeInfoComponentSpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfficeInfoUIState)) {
            return false;
        }
        OfficeInfoUIState officeInfoUIState = (OfficeInfoUIState) obj;
        return Intrinsics.d(this.f1230a, officeInfoUIState.f1230a) && Intrinsics.d(this.b, officeInfoUIState.b) && Intrinsics.d(this.c, officeInfoUIState.c) && Intrinsics.d(this.d, officeInfoUIState.d) && Intrinsics.d(this.e, officeInfoUIState.e) && Intrinsics.d(this.f, officeInfoUIState.f) && Intrinsics.d(this.g, officeInfoUIState.g) && Intrinsics.d(this.h, officeInfoUIState.h);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f1230a.hashCode() * 31, 31);
        TextUIState textUIState = this.c;
        int iB = r30.b(r30.f(this.e, r30.f(this.d, (iF + (textUIState == null ? 0 : textUIState.hashCode())) * 31, 31), 31), 31, this.f);
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = this.g;
        return this.h.hashCode() + ((iB + (uiEventHandler$Companion$fromLambda$1 != null ? uiEventHandler$Companion$fromLambda$1.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = pk0.n("OfficeInfoUIState(icon=", this.f1230a, ", titleUIState=", this.b, ", timeTextUIState=");
        sbN.append(this.c);
        sbN.append(", placeHolderUIState=");
        sbN.append(this.d);
        sbN.append(", variabilityTitleUIState=");
        sbN.append(this.e);
        sbN.append(", variabilityOptions=");
        sbN.append(this.f);
        sbN.append(", timeFieldClickHandler=");
        sbN.append(this.g);
        sbN.append(", specs=");
        sbN.append(this.h);
        sbN.append(")");
        return sbN.toString();
    }
}
