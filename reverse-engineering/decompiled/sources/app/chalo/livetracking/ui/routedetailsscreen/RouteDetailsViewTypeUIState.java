package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteDetailsBottomSheetContentUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteEtaStatusUIState;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.components.map.ChaloMapUIState;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.pk0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewTypeUIState;", "", "MainScreen", "TimeTable", "AllLiveVehicles", "StopList", "Error", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewTypeUIState$AllLiveVehicles;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewTypeUIState$Error;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewTypeUIState$MainScreen;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewTypeUIState$StopList;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewTypeUIState$TimeTable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RouteDetailsViewTypeUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouteViewTargetType f4884a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewTypeUIState$AllLiveVehicles;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewTypeUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AllLiveVehicles extends RouteDetailsViewTypeUIState {
        public final ToolbarUIState b;
        public final TextUIState c;
        public final RouteEtaStatusUIState d;
        public final AllLiveVehiclesUISpecs e;

        public AllLiveVehicles(ToolbarUIState toolbar, TextUIState currentStopForEta, RouteEtaStatusUIState routeEtaStatusUIState) {
            AllLiveVehiclesUISpecs allLiveVehiclesUISpecs = new AllLiveVehiclesUISpecs();
            Intrinsics.i(toolbar, "toolbar");
            Intrinsics.i(currentStopForEta, "currentStopForEta");
            super(RouteViewTargetType.ALL_VEHICLES);
            this.b = toolbar;
            this.c = currentStopForEta;
            this.d = routeEtaStatusUIState;
            this.e = allLiveVehiclesUISpecs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AllLiveVehicles)) {
                return false;
            }
            AllLiveVehicles allLiveVehicles = (AllLiveVehicles) obj;
            return Intrinsics.d(this.b, allLiveVehicles.b) && Intrinsics.d(this.c, allLiveVehicles.c) && Intrinsics.d(this.d, allLiveVehicles.d) && Intrinsics.d(this.e, allLiveVehicles.e);
        }

        public final int hashCode() {
            int iC = pk0.c(this.c, this.b.hashCode() * 31, 31);
            RouteEtaStatusUIState routeEtaStatusUIState = this.d;
            return this.e.hashCode() + ((iC + (routeEtaStatusUIState == null ? 0 : routeEtaStatusUIState.hashCode())) * 31);
        }

        public final String toString() {
            return "AllLiveVehicles(toolbar=" + this.b + ", currentStopForEta=" + this.c + ", etaStatus=" + this.d + ", specs=" + this.e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewTypeUIState$Error;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewTypeUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends RouteDetailsViewTypeUIState {
        public final StandardErrorScreenUIState.ErrorWithMsgAndRetry b;

        public Error(StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry) {
            super(RouteViewTargetType.ERROR);
            this.b = errorWithMsgAndRetry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.d(this.b, ((Error) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Error(errorUIState=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewTypeUIState$MainScreen;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewTypeUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MainScreen extends RouteDetailsViewTypeUIState {
        public final RouteDetailsBottomSheetContentUIState b;
        public final ButtonUIState c;
        public final IconButtonUIState d;
        public final IconButtonUIState e;
        public final ConfirmationDialogUiState f;
        public final RouteDetailsMainScreenSpec g;
        public final ChaloMapUIState h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MainScreen(RouteDetailsBottomSheetContentUIState bottomSheetContent, ButtonUIState buttonUIState, IconButtonUIState backButton, IconButtonUIState iconButtonUIState, ConfirmationDialogUiState confirmationDialogUiState, RouteDetailsMainScreenSpec routeDetailsMainScreenSpec, ChaloMapUIState chaloMapUIState) {
            super(RouteViewTargetType.MAIN_SCREEN);
            Intrinsics.i(bottomSheetContent, "bottomSheetContent");
            Intrinsics.i(backButton, "backButton");
            this.b = bottomSheetContent;
            this.c = buttonUIState;
            this.d = backButton;
            this.e = iconButtonUIState;
            this.f = confirmationDialogUiState;
            this.g = routeDetailsMainScreenSpec;
            this.h = chaloMapUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MainScreen)) {
                return false;
            }
            MainScreen mainScreen = (MainScreen) obj;
            return Intrinsics.d(this.b, mainScreen.b) && Intrinsics.d(this.c, mainScreen.c) && Intrinsics.d(this.d, mainScreen.d) && Intrinsics.d(this.e, mainScreen.e) && Intrinsics.d(this.f, mainScreen.f) && Intrinsics.d(this.g, mainScreen.g) && Intrinsics.d(this.h, mainScreen.h);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            ButtonUIState buttonUIState = this.c;
            int iHashCode2 = (this.d.hashCode() + ((iHashCode + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31)) * 31;
            IconButtonUIState iconButtonUIState = this.e;
            int iHashCode3 = (iHashCode2 + (iconButtonUIState == null ? 0 : iconButtonUIState.hashCode())) * 31;
            ConfirmationDialogUiState confirmationDialogUiState = this.f;
            return this.h.hashCode() + ((this.g.hashCode() + ((iHashCode3 + (confirmationDialogUiState != null ? confirmationDialogUiState.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            return "MainScreen(bottomSheetContent=" + this.b + ", bookingCta=" + this.c + ", backButton=" + this.d + ", showMyLocationBtn=" + this.e + ", viaConfirmationDialog=" + this.f + ", specs=" + this.g + ", map=" + this.h + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewTypeUIState$StopList;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewTypeUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopList extends RouteDetailsViewTypeUIState {
        public final ToolbarUIState b;
        public final RouteStopSearchTextFieldUIState c;
        public final RouteStopSearchResultUIState d;
        public final RouteStopListUISpec e;

        public StopList(ToolbarUIState toolbar, RouteStopSearchTextFieldUIState routeStopSearchTextFieldUIState, RouteStopSearchResultUIState routeStopSearchResultUIState) {
            RouteStopListUISpec routeStopListUISpec = new RouteStopListUISpec();
            Intrinsics.i(toolbar, "toolbar");
            super(RouteViewTargetType.STOP_LIST);
            this.b = toolbar;
            this.c = routeStopSearchTextFieldUIState;
            this.d = routeStopSearchResultUIState;
            this.e = routeStopListUISpec;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopList)) {
                return false;
            }
            StopList stopList = (StopList) obj;
            return Intrinsics.d(this.b, stopList.b) && Intrinsics.d(this.c, stopList.c) && Intrinsics.d(this.d, stopList.d) && Intrinsics.d(this.e, stopList.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "StopList(toolbar=" + this.b + ", searchField=" + this.c + ", searchResult=" + this.d + ", screenSpec=" + this.e + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewTypeUIState$TimeTable;", "Lapp/chalo/livetracking/ui/routedetailsscreen/RouteDetailsViewTypeUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeTable extends RouteDetailsViewTypeUIState {
        public final ToolbarUIState b;
        public final List c;
        public final Integer d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TimeTable(ToolbarUIState toolbarUIState, List content, Integer num) {
            super(RouteViewTargetType.TIME_TABLE);
            Intrinsics.i(content, "content");
            this.b = toolbarUIState;
            this.c = content;
            this.d = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimeTable)) {
                return false;
            }
            TimeTable timeTable = (TimeTable) obj;
            return Intrinsics.d(this.b, timeTable.b) && Intrinsics.d(this.c, timeTable.c) && Intrinsics.d(this.d, timeTable.d);
        }

        public final int hashCode() {
            int iB = r30.b(this.b.hashCode() * 31, 31, this.c);
            Integer num = this.d;
            return iB + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TimeTable(toolbar=");
            sb.append(this.b);
            sb.append(", content=");
            sb.append(this.c);
            sb.append(", initialScrollToPosition=");
            return pk0.k(sb, this.d, ")");
        }
    }

    public RouteDetailsViewTypeUIState(RouteViewTargetType routeViewTargetType) {
        this.f4884a = routeViewTargetType;
    }
}
