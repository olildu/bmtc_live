package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ClickableTextUiState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoContentState;", "", "Loading", "Content", "FullScreenError", "Empty", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoContentState$Content;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoContentState$Empty;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoContentState$FullScreenError;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoContentState$Loading;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloBusRouteInfoContentState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoContentState$Content;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoContentState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content extends ChaloBusRouteInfoContentState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f3312a;
        public final List b;
        public final List c;
        public final ChaloBusRouteSuggestionCardUiState d;

        public Content(List scheduleBlockTabs, List filters, List corridorsUIState, ChaloBusRouteSuggestionCardUiState chaloBusRouteSuggestionCardUiState) {
            Intrinsics.i(scheduleBlockTabs, "scheduleBlockTabs");
            Intrinsics.i(filters, "filters");
            Intrinsics.i(corridorsUIState, "corridorsUIState");
            this.f3312a = scheduleBlockTabs;
            this.b = filters;
            this.c = corridorsUIState;
            this.d = chaloBusRouteSuggestionCardUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.d(this.f3312a, content.f3312a) && Intrinsics.d(this.b, content.b) && Intrinsics.d(this.c, content.c) && Intrinsics.d(this.d, content.d);
        }

        public final int hashCode() {
            int iB = r30.b(r30.b(this.f3312a.hashCode() * 31, 31, this.b), 31, this.c);
            ChaloBusRouteSuggestionCardUiState chaloBusRouteSuggestionCardUiState = this.d;
            return iB + (chaloBusRouteSuggestionCardUiState == null ? 0 : chaloBusRouteSuggestionCardUiState.hashCode());
        }

        public final String toString() {
            return "Content(scheduleBlockTabs=" + this.f3312a + ", filters=" + this.b + ", corridorsUIState=" + this.c + ", routeSuggestionCard=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoContentState$Empty;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoContentState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Empty extends ChaloBusRouteInfoContentState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f3313a;
        public final List b;
        public final ImageUIState c;
        public final TextUIState.ChaloTextUIState d;
        public final TextUIState.ChaloTextUIState e;
        public final ClickableTextUiState f;
        public final ChaloBusRouteErrorScreenUISpec g;

        public Empty(List scheduleBlockTabs, List filters, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ClickableTextUiState clickableTextUiState) {
            ImageUIState imageUIState = new ImageUIState(IconType.IC_ERROR_IMAGE, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().b0), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            ChaloBusRouteErrorScreenUISpec chaloBusRouteErrorScreenUISpec = new ChaloBusRouteErrorScreenUISpec();
            Intrinsics.i(scheduleBlockTabs, "scheduleBlockTabs");
            Intrinsics.i(filters, "filters");
            this.f3313a = scheduleBlockTabs;
            this.b = filters;
            this.c = imageUIState;
            this.d = chaloTextUIState;
            this.e = chaloTextUIState2;
            this.f = clickableTextUiState;
            this.g = chaloBusRouteErrorScreenUISpec;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) obj;
            return Intrinsics.d(this.f3313a, empty.f3313a) && Intrinsics.d(this.b, empty.b) && Intrinsics.d(this.c, empty.c) && Intrinsics.d(this.d, empty.d) && Intrinsics.d(this.e, empty.e) && Intrinsics.d(this.f, empty.f) && Intrinsics.d(this.g, empty.g);
        }

        public final int hashCode() {
            int iF = r30.f(this.e, r30.f(this.d, r30.e(this.c, r30.b(this.f3313a.hashCode() * 31, 31, this.b), 31), 31), 31);
            ClickableTextUiState clickableTextUiState = this.f;
            return this.g.hashCode() + ((iF + (clickableTextUiState == null ? 0 : clickableTextUiState.hashCode())) * 31);
        }

        public final String toString() {
            return "Empty(scheduleBlockTabs=" + this.f3313a + ", filters=" + this.b + ", image=" + this.c + ", title=" + this.d + ", subtitle=" + this.e + ", resetFilterCta=" + this.f + ", specs=" + this.g + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoContentState$FullScreenError;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoContentState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FullScreenError extends ChaloBusRouteInfoContentState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageUIState f3314a;
        public final TextUIState.ChaloTextUIState b;
        public final TextUIState.ChaloTextUIState c;
        public final ButtonUIState d;
        public final ChaloBusRouteErrorScreenUISpec e;

        public FullScreenError(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ButtonUIState buttonUIState, int i) {
            ImageUIState imageUIState = new ImageUIState(IconType.IC_ERROR_IMAGE, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().b0), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            buttonUIState = (i & 8) != 0 ? null : buttonUIState;
            ChaloBusRouteErrorScreenUISpec chaloBusRouteErrorScreenUISpec = new ChaloBusRouteErrorScreenUISpec();
            this.f3314a = imageUIState;
            this.b = chaloTextUIState;
            this.c = chaloTextUIState2;
            this.d = buttonUIState;
            this.e = chaloBusRouteErrorScreenUISpec;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FullScreenError)) {
                return false;
            }
            FullScreenError fullScreenError = (FullScreenError) obj;
            return Intrinsics.d(this.f3314a, fullScreenError.f3314a) && Intrinsics.d(this.b, fullScreenError.b) && Intrinsics.d(this.c, fullScreenError.c) && Intrinsics.d(this.d, fullScreenError.d) && Intrinsics.d(this.e, fullScreenError.e);
        }

        public final int hashCode() {
            int iF = r30.f(this.c, r30.f(this.b, this.f3314a.hashCode() * 31, 31), 31);
            ButtonUIState buttonUIState = this.d;
            return this.e.hashCode() + ((iF + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbN = pk0.n("FullScreenError(image=", this.f3314a, ", title=", this.b, ", subtitle=");
            sbN.append(this.c);
            sbN.append(", retryButton=");
            sbN.append(this.d);
            sbN.append(", specs=");
            sbN.append(this.e);
            sbN.append(")");
            return sbN.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoContentState$Loading;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoContentState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loading extends ChaloBusRouteInfoContentState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloBusRouteInfoShimmerUIState f3315a;
        public final ChaloBusRouteInfoLoadingUISpec b;
        public final DividerUIState c;

        public Loading() {
            ChaloBusRouteInfoShimmerUIState chaloBusRouteInfoShimmerUIState = new ChaloBusRouteInfoShimmerUIState();
            ChaloBusRouteInfoLoadingUISpec chaloBusRouteInfoLoadingUISpec = new ChaloBusRouteInfoLoadingUISpec();
            DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().f, ChaloColorToken.LightGrey.f9815a, null, 4);
            this.f3315a = chaloBusRouteInfoShimmerUIState;
            this.b = chaloBusRouteInfoLoadingUISpec;
            this.c = dividerUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return Intrinsics.d(this.f3315a, loading.f3315a) && Intrinsics.d(this.b, loading.b) && Intrinsics.d(this.c, loading.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f3315a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Loading(loadingShimmerUIState=" + this.f3315a + ", specs=" + this.b + ", dividerUIState=" + this.c + ")";
        }
    }
}
