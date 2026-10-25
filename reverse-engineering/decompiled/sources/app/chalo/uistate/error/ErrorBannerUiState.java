package app.chalo.uistate.error;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/error/ErrorBannerUiState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ErrorBannerUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ErrorBannerUiSpec f10020a;
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;

    public ErrorBannerUiState(ErrorBannerUiSpec errorBannerUiSpec, TextUIState.ChaloTextUIState chaloTextUIState) {
        ImageUIState imageUIState = new ImageUIState(IconType.IC_ERROR_ALERT, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        this.f10020a = errorBannerUiSpec;
        this.b = chaloTextUIState;
        this.c = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorBannerUiState)) {
            return false;
        }
        ErrorBannerUiState errorBannerUiState = (ErrorBannerUiState) obj;
        return Intrinsics.d(this.f10020a, errorBannerUiState.f10020a) && Intrinsics.d(this.b, errorBannerUiState.b) && Intrinsics.d(this.c, errorBannerUiState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.f(this.b, this.f10020a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ErrorBannerUiState(specs=" + this.f10020a + ", text=" + this.b + ", icon=" + this.c + ")";
    }
}
