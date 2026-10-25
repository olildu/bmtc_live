package app.chalo.premiumbus.ui.stopselection;

import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDateAndTimePickerUIState;
import defpackage.r1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType;", "", "NoOriginDestinationPairsAvailable", "NewRouteSuggestion", "NewRouteSuggestionSubmitSuccess", "MultipleOriginDestinationSelection", "NoProductFoundBottomSheet", "PremiumBusDateAndTimePickerBottomSheet", "PremiumPassSavingsFaqsBottomSheet", "Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType$MultipleOriginDestinationSelection;", "Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType$NewRouteSuggestion;", "Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType$NewRouteSuggestionSubmitSuccess;", "Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType$NoOriginDestinationPairsAvailable;", "Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType$NoProductFoundBottomSheet;", "Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType$PremiumBusDateAndTimePickerBottomSheet;", "Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType$PremiumPassSavingsFaqsBottomSheet;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PBStopSelectionScreenBottomSheetType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType$MultipleOriginDestinationSelection;", "Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultipleOriginDestinationSelection extends PBStopSelectionScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f7956a;

        public MultipleOriginDestinationSelection(List list) {
            this.f7956a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultipleOriginDestinationSelection) && Intrinsics.d(this.f7956a, ((MultipleOriginDestinationSelection) obj).f7956a);
        }

        public final int hashCode() {
            return this.f7956a.hashCode();
        }

        public final String toString() {
            return r1.d("MultipleOriginDestinationSelection(options=", ")", this.f7956a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType$NewRouteSuggestion;", "Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewRouteSuggestion extends PBStopSelectionScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBStopPlaceSelectedAppModel f7957a;
        public final PBStopPlaceSelectedAppModel b;

        public NewRouteSuggestion(PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2) {
            this.f7957a = pBStopPlaceSelectedAppModel;
            this.b = pBStopPlaceSelectedAppModel2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewRouteSuggestion)) {
                return false;
            }
            NewRouteSuggestion newRouteSuggestion = (NewRouteSuggestion) obj;
            return Intrinsics.d(this.f7957a, newRouteSuggestion.f7957a) && Intrinsics.d(this.b, newRouteSuggestion.b);
        }

        public final int hashCode() {
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = this.f7957a;
            int iHashCode = (pBStopPlaceSelectedAppModel == null ? 0 : pBStopPlaceSelectedAppModel.hashCode()) * 31;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = this.b;
            return iHashCode + (pBStopPlaceSelectedAppModel2 != null ? pBStopPlaceSelectedAppModel2.hashCode() : 0);
        }

        public final String toString() {
            return "NewRouteSuggestion(fromStop=" + this.f7957a + ", toStop=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType$NewRouteSuggestionSubmitSuccess;", "Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NewRouteSuggestionSubmitSuccess extends PBStopSelectionScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewRouteSuggestionSubmitSuccess f7958a = new NewRouteSuggestionSubmitSuccess();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType$NoOriginDestinationPairsAvailable;", "Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoOriginDestinationPairsAvailable extends PBStopSelectionScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoOriginDestinationPairsAvailable f7959a = new NoOriginDestinationPairsAvailable();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType$NoProductFoundBottomSheet;", "Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoProductFoundBottomSheet extends PBStopSelectionScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoProductFoundBottomSheet f7960a = new NoProductFoundBottomSheet();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType$PremiumBusDateAndTimePickerBottomSheet;", "Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremiumBusDateAndTimePickerBottomSheet extends PBStopSelectionScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusSlotSelectionDateAndTimePickerUIState f7961a;

        public PremiumBusDateAndTimePickerBottomSheet(PremiumBusSlotSelectionDateAndTimePickerUIState uiState) {
            Intrinsics.i(uiState, "uiState");
            this.f7961a = uiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PremiumBusDateAndTimePickerBottomSheet) && Intrinsics.d(this.f7961a, ((PremiumBusDateAndTimePickerBottomSheet) obj).f7961a);
        }

        public final int hashCode() {
            return this.f7961a.hashCode();
        }

        public final String toString() {
            return "PremiumBusDateAndTimePickerBottomSheet(uiState=" + this.f7961a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType$PremiumPassSavingsFaqsBottomSheet;", "Lapp/chalo/premiumbus/ui/stopselection/PBStopSelectionScreenBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremiumPassSavingsFaqsBottomSheet extends PBStopSelectionScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f7962a;

        public PremiumPassSavingsFaqsBottomSheet(List faqs) {
            Intrinsics.i(faqs, "faqs");
            this.f7962a = faqs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PremiumPassSavingsFaqsBottomSheet) && Intrinsics.d(this.f7962a, ((PremiumPassSavingsFaqsBottomSheet) obj).f7962a);
        }

        public final int hashCode() {
            return this.f7962a.hashCode();
        }

        public final String toString() {
            return r1.d("PremiumPassSavingsFaqsBottomSheet(faqs=", ")", this.f7962a);
        }
    }
}
