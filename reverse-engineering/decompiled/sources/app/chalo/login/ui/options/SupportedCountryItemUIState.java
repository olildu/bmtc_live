package app.chalo.login.ui.options;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/SupportedCountryItemUIState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SupportedCountryItemUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f5324a;
    public final ImageUIState b;
    public final SupportedCountryItemUISpec c;
    public final UiEventHandler$Companion$fromLambda$1 d;

    public SupportedCountryItemUIState(UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        SupportedCountryItemUISpec supportedCountryItemUISpec = new SupportedCountryItemUISpec();
        this.f5324a = chaloTextUIState;
        this.b = imageUIState;
        this.c = supportedCountryItemUISpec;
        this.d = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportedCountryItemUIState)) {
            return false;
        }
        SupportedCountryItemUIState supportedCountryItemUIState = (SupportedCountryItemUIState) obj;
        return Intrinsics.d(this.f5324a, supportedCountryItemUIState.f5324a) && Intrinsics.d(this.b, supportedCountryItemUIState.b) && Intrinsics.d(this.c, supportedCountryItemUIState.c) && Intrinsics.d(this.d, supportedCountryItemUIState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f5324a.hashCode() * 31;
        ImageUIState imageUIState = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "SupportedCountryItemUIState(countryInfo=" + this.f5324a + ", flagImage=" + this.b + ", spec=" + this.c + ", eventHandler=" + this.d + ")";
    }
}
