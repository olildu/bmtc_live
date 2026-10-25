package app.chalo.appsupport.uistate;

import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/appsupport/uistate/BookingHelpBottomSheetUIStateType;", "", "Generic", "None", "Lapp/chalo/appsupport/uistate/BookingHelpBottomSheetUIStateType$Generic;", "Lapp/chalo/appsupport/uistate/BookingHelpBottomSheetUIStateType$None;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BookingHelpBottomSheetUIStateType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomSheetUiState f988a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/uistate/BookingHelpBottomSheetUIStateType$Generic;", "Lapp/chalo/appsupport/uistate/BookingHelpBottomSheetUIStateType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Generic extends BookingHelpBottomSheetUIStateType {
        public final BottomSheetStandardContentUiState b;

        public Generic(BottomSheetStandardContentUiState bottomSheetStandardContentUiState) {
            super(bottomSheetStandardContentUiState.f9904a);
            this.b = bottomSheetStandardContentUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Generic) && Intrinsics.d(this.b, ((Generic) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Generic(uiState=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/uistate/BookingHelpBottomSheetUIStateType$None;", "Lapp/chalo/appsupport/uistate/BookingHelpBottomSheetUIStateType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class None extends BookingHelpBottomSheetUIStateType {
        public static final None b = new None(new BottomSheetUiState((BottomSheetEventHandler) null, 3));
    }

    public BookingHelpBottomSheetUIStateType(BottomSheetUiState bottomSheetUiState) {
        this.f988a = bottomSheetUiState;
    }
}
