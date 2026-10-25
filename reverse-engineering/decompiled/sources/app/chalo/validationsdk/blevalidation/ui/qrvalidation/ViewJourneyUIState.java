package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/ViewJourneyUIState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ViewJourneyUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewJourneyUISpecs f10664a;
    public final UiEventHandler b;
    public final TextUIState.ChaloTextUIState c;
    public final ImageUIState d;

    public ViewJourneyUIState(UiEventHandler eventHandler, TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState) {
        ViewJourneyUISpecs viewJourneyUISpecs = new ViewJourneyUISpecs();
        Intrinsics.i(eventHandler, "eventHandler");
        this.f10664a = viewJourneyUISpecs;
        this.b = eventHandler;
        this.c = chaloTextUIState;
        this.d = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewJourneyUIState)) {
            return false;
        }
        ViewJourneyUIState viewJourneyUIState = (ViewJourneyUIState) obj;
        return Intrinsics.d(this.f10664a, viewJourneyUIState.f10664a) && Intrinsics.d(this.b, viewJourneyUIState.b) && Intrinsics.d(this.c, viewJourneyUIState.c) && Intrinsics.d(this.d, viewJourneyUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.f(this.c, (this.b.hashCode() + (this.f10664a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ViewJourneyUIState(specs=" + this.f10664a + ", eventHandler=" + this.b + ", viewJourneyTextUIState=" + this.c + ", imageUIState=" + this.d + ")";
    }
}
