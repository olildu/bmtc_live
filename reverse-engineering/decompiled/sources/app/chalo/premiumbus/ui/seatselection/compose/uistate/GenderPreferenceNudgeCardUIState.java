package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import defpackage.n21;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/GenderPreferenceNudgeCardUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GenderPreferenceNudgeCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f7772a;
    public final TextUIState.ChaloTextUIState b;
    public final TextWithLeftAndRightIconUIState c;
    public final GenderPreferenceNudgeCardUISpecs d;
    public final UiEventHandler$Companion$fromLambda$1 e;

    public GenderPreferenceNudgeCardUIState(TextUIState.ChaloTextUIState titleText, TextUIState.ChaloTextUIState subtitleText, TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        GenderPreferenceNudgeCardUISpecs genderPreferenceNudgeCardUISpecs = new GenderPreferenceNudgeCardUISpecs();
        Intrinsics.i(titleText, "titleText");
        Intrinsics.i(subtitleText, "subtitleText");
        this.f7772a = titleText;
        this.b = subtitleText;
        this.c = textWithLeftAndRightIconUIState;
        this.d = genderPreferenceNudgeCardUISpecs;
        this.e = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenderPreferenceNudgeCardUIState)) {
            return false;
        }
        GenderPreferenceNudgeCardUIState genderPreferenceNudgeCardUIState = (GenderPreferenceNudgeCardUIState) obj;
        return Intrinsics.d(this.f7772a, genderPreferenceNudgeCardUIState.f7772a) && Intrinsics.d(this.b, genderPreferenceNudgeCardUIState.b) && Intrinsics.d(this.c, genderPreferenceNudgeCardUIState.c) && Intrinsics.d(this.d, genderPreferenceNudgeCardUIState.d) && Intrinsics.d(this.e, genderPreferenceNudgeCardUIState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + r30.f(this.b, this.f7772a.hashCode() * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = n21.j("GenderPreferenceNudgeCardUIState(titleText=", this.f7772a, ", subtitleText=", this.b, ", updateGenderActionText=");
        sbJ.append(this.c);
        sbJ.append(", specs=");
        sbJ.append(this.d);
        sbJ.append(", uiEventHandler=");
        return nf1.n(sbJ, this.e, ")");
    }
}
