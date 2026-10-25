package app.chalo.premiumbus.ui.changestop;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.components.map.ChaloMapUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import defpackage.pk0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenContent;", "", "Loading", "StopList", "Result", "NoStopsAvailable", "Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenContent$Loading;", "Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenContent$NoStopsAvailable;", "Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenContent$Result;", "Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenContent$StopList;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChangeStopScreenContent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenContent$Loading;", "Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenContent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loading extends ChangeStopScreenContent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f7514a = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -2061747170;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenContent$NoStopsAvailable;", "Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenContent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoStopsAvailable extends ChangeStopScreenContent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageUIState f7515a;
        public final TextUIState.ChaloTextUIState b;
        public final ChaloMapUIState c;

        public NoStopsAvailable(ImageUIState errorImage, TextUIState.ChaloTextUIState chaloTextUIState, ChaloMapUIState chaloMapUIState) {
            Intrinsics.i(errorImage, "errorImage");
            this.f7515a = errorImage;
            this.b = chaloTextUIState;
            this.c = chaloMapUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoStopsAvailable)) {
                return false;
            }
            NoStopsAvailable noStopsAvailable = (NoStopsAvailable) obj;
            return Intrinsics.d(this.f7515a, noStopsAvailable.f7515a) && Intrinsics.d(this.b, noStopsAvailable.b) && Intrinsics.d(this.c, noStopsAvailable.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + r30.f(this.b, this.f7515a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sbN = pk0.n("NoStopsAvailable(errorImage=", this.f7515a, ", text=", this.b, ", mapUIState=");
            sbN.append(this.c);
            sbN.append(")");
            return sbN.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenContent$Result;", "Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenContent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result extends ChangeStopScreenContent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChangeStopResultScreenUIState f7516a;

        public Result(ChangeStopResultScreenUIState resultScreenUIState) {
            Intrinsics.i(resultScreenUIState, "resultScreenUIState");
            this.f7516a = resultScreenUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && Intrinsics.d(this.f7516a, ((Result) obj).f7516a);
        }

        public final int hashCode() {
            return this.f7516a.hashCode();
        }

        public final String toString() {
            return "Result(resultScreenUIState=" + this.f7516a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenContent$StopList;", "Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenContent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopList extends ChangeStopScreenContent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f7517a;
        public final TextUIState.ChaloTextUIState b;
        public final List c;
        public final ButtonUIState d;
        public final LoadingDialogUIState e;
        public final ChaloMapUIState f;

        public StopList(TextUIState.ChaloTextUIState titleText, TextUIState.ChaloTextUIState stopsHeaderText, List stops, ButtonUIState confirmBtnUIState, LoadingDialogUIState loadingDialogUIState, ChaloMapUIState mapUIState) {
            Intrinsics.i(titleText, "titleText");
            Intrinsics.i(stopsHeaderText, "stopsHeaderText");
            Intrinsics.i(stops, "stops");
            Intrinsics.i(confirmBtnUIState, "confirmBtnUIState");
            Intrinsics.i(mapUIState, "mapUIState");
            this.f7517a = titleText;
            this.b = stopsHeaderText;
            this.c = stops;
            this.d = confirmBtnUIState;
            this.e = loadingDialogUIState;
            this.f = mapUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopList)) {
                return false;
            }
            StopList stopList = (StopList) obj;
            return Intrinsics.d(this.f7517a, stopList.f7517a) && Intrinsics.d(this.b, stopList.b) && Intrinsics.d(this.c, stopList.c) && Intrinsics.d(this.d, stopList.d) && Intrinsics.d(this.e, stopList.e) && Intrinsics.d(this.f, stopList.f);
        }

        public final int hashCode() {
            int iD = r30.d(this.d, r30.b(r30.f(this.b, this.f7517a.hashCode() * 31, 31), 31, this.c), 31);
            LoadingDialogUIState loadingDialogUIState = this.e;
            return this.f.hashCode() + ((iD + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbJ = n21.j("StopList(titleText=", this.f7517a, ", stopsHeaderText=", this.b, ", stops=");
            sbJ.append(this.c);
            sbJ.append(", confirmBtnUIState=");
            sbJ.append(this.d);
            sbJ.append(", loadingDialogUIState=");
            sbJ.append(this.e);
            sbJ.append(", mapUIState=");
            sbJ.append(this.f);
            sbJ.append(")");
            return sbJ.toString();
        }
    }
}
