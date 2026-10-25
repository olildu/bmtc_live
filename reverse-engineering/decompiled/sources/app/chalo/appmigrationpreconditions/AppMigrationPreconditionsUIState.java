package app.chalo.appmigrationpreconditions;

import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appmigrationpreconditions/AppMigrationPreconditionsUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AppMigrationPreconditionsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CircularProgressIndicatorUIState f958a;
    public final TextUIState b;
    public final TextUIState c;
    public final ImageUIState d;
    public final TextUIState e;
    public final TextUIState f;
    public final ButtonUIState g;
    public final ChaloPadding h;

    public AppMigrationPreconditionsUIState(CircularProgressIndicatorUIState circularProgressIndicatorUIState, TextUIState textUIState, TextUIState textUIState2, ImageUIState imageUIState, TextUIState textUIState3, TextUIState textUIState4, ButtonUIState buttonUIState) {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        this.f958a = circularProgressIndicatorUIState;
        this.b = textUIState;
        this.c = textUIState2;
        this.d = imageUIState;
        this.e = textUIState3;
        this.f = textUIState4;
        this.g = buttonUIState;
        this.h = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppMigrationPreconditionsUIState)) {
            return false;
        }
        AppMigrationPreconditionsUIState appMigrationPreconditionsUIState = (AppMigrationPreconditionsUIState) obj;
        return Intrinsics.d(this.f958a, appMigrationPreconditionsUIState.f958a) && Intrinsics.d(this.b, appMigrationPreconditionsUIState.b) && Intrinsics.d(this.c, appMigrationPreconditionsUIState.c) && Intrinsics.d(this.d, appMigrationPreconditionsUIState.d) && Intrinsics.d(this.e, appMigrationPreconditionsUIState.e) && Intrinsics.d(this.f, appMigrationPreconditionsUIState.f) && Intrinsics.d(this.g, appMigrationPreconditionsUIState.g) && Intrinsics.d(this.h, appMigrationPreconditionsUIState.h);
    }

    public final int hashCode() {
        CircularProgressIndicatorUIState circularProgressIndicatorUIState = this.f958a;
        int iHashCode = (circularProgressIndicatorUIState == null ? 0 : circularProgressIndicatorUIState.hashCode()) * 31;
        TextUIState textUIState = this.b;
        int iHashCode2 = (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
        TextUIState textUIState2 = this.c;
        int iHashCode3 = (iHashCode2 + (textUIState2 == null ? 0 : textUIState2.hashCode())) * 31;
        ImageUIState imageUIState = this.d;
        int iHashCode4 = (iHashCode3 + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        TextUIState textUIState3 = this.e;
        int iHashCode5 = (iHashCode4 + (textUIState3 == null ? 0 : textUIState3.hashCode())) * 31;
        TextUIState textUIState4 = this.f;
        int iHashCode6 = (iHashCode5 + (textUIState4 == null ? 0 : textUIState4.hashCode())) * 31;
        ButtonUIState buttonUIState = this.g;
        return this.h.hashCode() + ((iHashCode6 + (buttonUIState != null ? buttonUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AppMigrationPreconditionsUIState(loader=" + this.f958a + ", loadingTitle=" + this.b + ", loadingDesc=" + this.c + ", errorImg=" + this.d + ", errorTitle=" + this.e + ", errorDesc=" + this.f + ", retryBtn=" + this.g + ", paddingAround=" + this.h + ")";
    }
}
