package app.chalo.login.ui.options;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/CountryFlagTabUIState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CountryFlagTabUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f5298a;
    public final ImageUIState b;
    public final CountryFlagTabSpec c;
    public final UiEventHandler$Companion$fromLambda$1 d;

    public CountryFlagTabUIState(ImageUIState imageUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        ImageUIState imageUIState2 = new ImageUIState(IconType.ARROW_DROP_DOWN, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        CountryFlagTabSpec countryFlagTabSpec = new CountryFlagTabSpec();
        this.f5298a = imageUIState;
        this.b = imageUIState2;
        this.c = countryFlagTabSpec;
        this.d = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountryFlagTabUIState)) {
            return false;
        }
        CountryFlagTabUIState countryFlagTabUIState = (CountryFlagTabUIState) obj;
        return Intrinsics.d(this.f5298a, countryFlagTabUIState.f5298a) && Intrinsics.d(this.b, countryFlagTabUIState.b) && Intrinsics.d(this.c, countryFlagTabUIState.c) && Intrinsics.d(this.d, countryFlagTabUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + r30.e(this.b, this.f5298a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "CountryFlagTabUIState(flagImage=" + this.f5298a + ", interactionIcon=" + this.b + ", spec=" + this.c + ", eventHandler=" + this.d + ")";
    }
}
